'''
피보나치 수열 관련 함수 (테스트 : python fibonacci.py 100)
'''
def fibo_print(n):
    'n미만의 피보나치 수열을 콘솔창에 print (ex)0, 1, 1, 2, 3, 5, 8, 13,...)'
    a, b = 0, 1
    while a < n:  # a가 n을 만나 n전까지
        print(a, end=' ')
        a, b = b, a+b
    print()  # 개행

def fibo_return(n):
    'n미만의 피보나치 수열의 list를 return'
    a, b = 0, 1
    result = []
    while a < n:
        result.append(a)
        a, b = b, a+b
    return result


if __name__ == '__main__':  # import 할 때는 실행되지 않음
    import sys
    # sys.argv : 명령행 인수
    if len(sys.argv) > 1:
        print('1. print_test :', end=' ')
        fibo_print(int(sys.argv[1]))
        lst = fibo_return(int(sys.argv[1]))
        print('2. return된 list test :', lst)
    else:
        print('1. print_test :', end=' ')
        fibo_print(int(100))
        lst = fibo_return(100)
        print('2. return된 list test :', lst)