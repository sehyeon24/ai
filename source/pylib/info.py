'''
Cal obj = new Cal(10, 20)
class Cal{
    private int num1;
    private int num2;
    public Cal(int num1, int num2){  # 생성자함수
        this.num1 = num1;
        this.num2 = num2;
    }
    public int add(){
    return num1+num2;
    }
    public int sub(){
    return num1-num2;
    }
}
'''
PI = 3.141592  # 변수
class Cal:
    '''
    이 클래스는..
    '''
    def __init__(self, num1=1, num2=1):  # 생성자함수
        self.num1 = num1
        self.num2 = num2
    # def __init__(self):  # 매개변수 없는 생성자함수(매개변수 없어도 self)
        # self.num1 = 1
        # self.num2 = 1  # 오버로딩 불가로 위 함수는 사라지고 이 함수로 덮어씀
    def add(self):
        return self.num1 + self.num2
    def sub(self):
        return self.num1 - self.num2
    
def main():  # 위 함수 테스트용
    print('Cal 객체 생성 test입니다')
    obj = Cal(10, 20)
    print('obj.num1 :', obj.num1)
    print('obj.num2 :', obj.num2)
    print('add test :', obj.add())
    print('sub test :', obj.sub())

if __name__ == '__main__':
    main()