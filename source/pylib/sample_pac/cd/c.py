# sample_pac/cd/c.py - ab/a.py을 참조
from ..ab import a
# c.py만 import해도 ..상위폴더로 가서 ab폴더의 a를 import
# .. 상위폴더
# . 현재폴더

def nice():
    print('sample_pac/cd안의 c모듈 안의 nice')
    a.hello()