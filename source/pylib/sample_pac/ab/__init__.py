'''
sample_pac/ab/__init__.py
ab 패키지를 import할 때 자동 실행되는 파일
"from sample_pac.ab import *"를 수행 시 a모듈만 자동 import 되도록 하기 위해 __all__ 변수 셋팅
'''
__all__ = ['a']  # ab패키지만 import해도 a.py가 로드되도록
print('sample_pac 패키지 안의 ab 패키지가 로드되었습니다')