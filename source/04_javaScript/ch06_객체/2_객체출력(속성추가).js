// 배열 : 일반for문, for-in, for-of, forEach() 가능 / index
let arr = ['홍길동', 22];
for(let idx in arr ){
    console.log(idx + ' : ' + arr[idx]);
}

console.log();  // 개행

// 객체 : for-in, for-of 가능 / 객체
let obj = {'name' : '홍길동', 'age' : 22};
for(let key in obj ){
    console.log(key + ' : ' + obj[key]);
}

console.log();  // 개행

// 객체의 속성을 추가
obj.address = '서울시 관악구';
obj.hobby = '수업 복습';
for(let key in obj) {
    console.log(key + ' : ' + obj[key]);
}

console.log();  // 개행

// 객체의 속성 제거
delete(obj.hobby);
console.log('속성 제거 후');
for(let key in obj) {
    console.log(key + ' : ' + obj[key]);
}
