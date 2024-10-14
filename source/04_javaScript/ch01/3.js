/* 변수 선언시 var(전역변수:모든 html에서 수행됨), let(지역변수:해당 script 안에서만 수행됨), const(상수) : 작성하지 않으면 var로 인식 */
const pi = 3.14;
// pi = 3.141592; const(상수)는 바꿀 수 없는 상수이므로 초기화 후 할당 불가
let sum = 0;    // sum이라는 변수 안에 0을 넣음
for(var i = 0; i <= 10; i++) {
    // for(let i = 0; i <= 10; i++) {   // let은 수행되지 않음 
    sum += i;   // sum = sum + i;
    console.log('i = ', i, '일때까지 누적된 합은 ', sum);
}
console.log('for문 끝');
console.log('for문 후 i값은 ', i);  // var를 사용했으므로 for문을 빠져나와도 수행함
console.log(pi);