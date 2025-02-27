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