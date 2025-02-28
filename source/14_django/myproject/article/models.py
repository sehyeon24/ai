import os.path

from django.shortcuts import get_object_or_404
from myproject import settings
from django.conf import settings
from django.db import models
import time
from datetime import datetime
from django.urls import reverse

# Create your models here.

STATUS_CHOICES = (
    ('d', 'Draft'),     # 초안
    ('p', 'Published'), # 공표
    ('w', 'Withdrawn'), # 철회
)
def article_photo_path(instance, filename):
  now = datetime.now()
  timestamp = int(time.time() * 1000)  # 밀리초 단위 타임스탬프 생성
  return f"article/{now.strftime('%Y%m%d')}/{timestamp}_{filename}"

class Article(models.Model):
    title  = models.CharField(verbose_name='기사 제목', max_length=100) # blank=False 기본값
    body   = models.TextField(verbose_name='기사 본문')
    status = models.CharField(verbose_name='기사 단계', max_length=1, choices=STATUS_CHOICES)
    # photo  = models.ImageField(blank=True, null=True, upload_to='article/%Y/%m/%d')
    # pip install pillow
    photo  = models.ImageField(blank=True, null=True, upload_to=article_photo_path)

    def __str__(self):
        return self.title

    def get_absolute_url(self):
        # return reverse('article:list')
        return reverse('article:detail', args=[self.id])

    def delete(self, *args, **kwargs):
        if self.photo: # 파일 첨부 시
            file_path = os.path.join(settings.MEDIA_ROOT, str(self.photo))
            print(file_path, '파일 삭제')
            if os.path.exists(file_path):
                os.remove(file_path)
        super().delete(args, kwargs)

    def save(self, *args, **kwargs):
        if self.pk:  # 저장된 내용 수정하는지 여부
            old_instance = get_object_or_404(Article, pk=self.pk)
            if old_instance.photo and old_instance.photo != self.photo:
                old_file_path = os.path.join(settings.MEDIA_ROOT, str(old_instance.photo))
                if os.path.exists(old_file_path):
                  os.remove(old_file_path)
        super().save(*args, **kwargs)