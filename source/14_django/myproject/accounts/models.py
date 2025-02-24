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