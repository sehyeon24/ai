/*
let funVar = function(){
    console.log('매개변수 없는 일반 함수 호출');
    console.log('TEST');
};
*/

funVar = () => {
    console.log('1.매개변수 없는 구현이 2줄 이상인 화살표 함수 호출');
    console.log('TEST');
};
funVar();

// 매개변수 없는 1줄 구현일 때 {} 생략 가능
funVar = () => console.log('2. 매개변수 없는 구현이 1줄인 화살표 함수 호출');
funVar();

// 매개변수 1개일 때 () 생략 가능
funVar = i => {
    console.log('3. 매개변수 1개이고, 구현이 2줄 이상인 화살표 함수 호출 : ' + i);
    console.log('TEST');
};
funVar(10);

// 매개변수 1개 (), 구현 1줄일 때 {} 생략 가능
funVar = i => console.log('4. 매개변수 1개이고, 구현이 1줄인 화살표 함수 호출 : ' + i);
funVar(20);

// 매개변수 2개, 구현 1줄
funVar = (i, j) => console.log('5. 매개변수 2개 이상인 화살표 함수 호출 : ' + i + ', ' + j)   // funVar = function(i, j) => 와 같음
funVar(10, 20);

// 아래를 화살표 함수로 만들기
/* funVar = function(i, j) {
    return i*10 + j;
}                           */
funVar = (i, j) => i*10 + j;    // 위 함수표현식과 동일(★중요)
console.log('6. 매개변수 1개인 return이 있는 구현이 1줄인 화살표 함수 호출 : ' + funVar(1, 2));

// 아래를 화살표 함수로 만들기
/* funVar = function(x) {
    return x*x;
};                         */
funVar = x => x*x;
console.log('7. 매개변수 1개인 return이 있는 구현이 1줄인 화살표 함수 호출 : ' + funVar(5));
