from django.db import models
# https://github.com/django/django/blob/main/django/contrib/auth/models.py
from django.contrib.auth.models import User

# Create your models here.

class Profile(models.Model):
    user         = models.OneToOneField(User, on_delete=models.CASCADE)
    phone_number = models.CharField(verbose_name='전화', max_length=20)
    address      = models.CharField(verbose_name='주소', max_length=50)
    def __str__(self):
        return '{}({}-{})'.format(self.user.username, self.phone_number, self.address)

# 이벤트 처리 : 회원가입 완료(user.save() 성공) 후 가입 인사 메일 전송
from django.db.models.signals import post_save
from django.conf.global_settings import AUTH_USER_MODEL
from django.core.mail import send_mail

def on_send_mail(sender, **kwargs):
    if kwargs['created']:
        user = kwargs['instance']
        title = user.username + '님 가입을 환영합니다.'
        body  = user.username + '님 가입 감사합니다.'
        bodyhtml = '<h1>{}님 가입 환영합니다.</h1><h2>가입완료</h2>'.format(user.username)
        # settings.py에 stmp 설정되어 있어야 함
        send_mail(subject=title,
                  message=body,
                  from_email='sehyeon_24@naver.com',
                  recipient_list=[user.email],
                  fail_silently=False,  # 메일 전송 실패 시 아무 일도 하지 않음
                  html_message=bodyhtml)
post_save.connect(on_send_mail, sender=AUTH_USER_MODEL)