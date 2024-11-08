def test():
    '''
    독스트링 테스트 문장
    한 문장일 때는 ''만으로도 사용 가능
    함수의 도움말
    '''
    print('모듈(*.py파일) 테스트입니다')
    print('주말 잘 보내세요')

if __name__ == '__main__':  # 위 함수 호출 시 출력될 문장
    test()
# else:  # import 시 출력될 문장
#     print('__name__={}'.format(__name__))