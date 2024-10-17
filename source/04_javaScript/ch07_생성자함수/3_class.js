// class : ECMA script 6에서 나오는 새로운 문법
// caniuse.com를 이용해서 지원 브라우저를 확인

class Person {  // class이름은 대문자로 시작
    constructor(name, first, second){   // class 내에서만 무조건 생성자함수 이름은 constructor
        console.log('생성자 함수 호출');
        this.name = name;
        this.first = first;
        this.second = second;
    };  // constructor
    sum() {
        return this.first + this.second;
    }   // sum
};  // class
var hong = new Person('홍길동', 100, 99);   // {'name' : '홍길동', 'first' : 100, 'second' : 99};와 같음
console.log(hong.name, hong.first, hong.second);
console.log('합계 : ' + hong.sum());
console.log(hong);