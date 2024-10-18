// 객체배열 sort / class or 생성자함수
function Student(name, kor, mat) {  // 생성자함수
    this.name = name;
    this.kor = kor;
    this.mat = mat;
}

// 공통영역 prototype 생성
Student.prototype.getSum = function(){
    return this.kor + this.mat;
};
Student.prototype.toString = function(){
    return this.name + ' (' + this.kor + ', ' + this.mat + ', ' + this.getSum() + ')';
};
/*
test
var test = new Student('홍', 70, 80);
console.log(test.toString());
*/

var students = [new Student('홍', 70, 90),
                new Student('김', 88, 78),
                new Student('이', 99, 76),
                new Student('박', 100, 99)
];
var studentsCopy = [...students];   // 깊은복사

studentsCopy.sort(function(left, right){
    return right.getSum() - left.getSum();  // 총점 기준으로 내림차순 정렬
});

console.log('원본');
students.forEach((data, idx) => {
    console.log(idx + ', ' + data.toString());
});

console.log();

console.log('정렬된 복사본');
studentsCopy.forEach((data, idx) => {
    console.log(idx + ', ' + data.toString());
});