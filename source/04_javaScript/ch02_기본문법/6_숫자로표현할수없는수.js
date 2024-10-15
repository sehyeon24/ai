// console은 ,로도 연결 가능(, 사용시 spacebar 기능)(+ 사용시 space 없음)
i = parseInt("");
console.log("i타입 : ", typeof(i), ", 값 : " + i);
a = 10/3;
console.log("a타입 : ", typeof(a), ", 값 : " + a);
a = 10/0;   // 10/0.00000000...
console.log("a타입 : ", typeof(a), ", 값 : " + a);  // Infinity(무한대)로 출력됨
console.log('i가 NaN인지 여부 : ', isNaN(i));          // true
console.log('a가 NaN인지 여부 : ', isNaN(a));          // false
console.log('a가 유한한 수인지 여부 : ', isFinite(a));  // false