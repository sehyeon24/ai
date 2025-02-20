from django.test import TestCase
import re

# Create your tests here.

# 38.5,127.4125 / 38,127
# value = input('경도,위도는?')  # \d:숫자, +:1번이상, \.?:.이 올수도 안 올수도 있음 *:0번 이상
# re_result = re.match(r'(\d+\.?\d*),(\d+\.?\d*)', value)
# if not re_result:
#     print('경도,위도 포맷으로 입력하지 않았습니다.')

value = input('경도,위도는?')
if not re.match(r'(\d+\.?\d*),(\d+\.?\d*)', value):
    print('경도,위도 포맷으로 입력하지 않았습니다.')