/*
array 함수 : 
매개변수 0개 : length가 0인 배열을 return
매개변수 1개 : 매개변수만큼의 크기(length)를 가진 배열을 return
매개변수 2개 이상 : 매개변수로 배열을 생성하여 배열을 return
*/
// const array  = () => {} 이 형식은 가변인자함수를 만들지 못함

/*
function array(){
    // arguments(매개변수 배열)라는 배열 자동 생성 : 에 실행시 매개변수가 들어옴
    // arguments(매개변수 배열)라는 배열 자동 생성 : 에 실행시 매개변수가 들어옴
    console.log('arguments 배열 내용');
    for(var i = 0; i < arguments.length; i++){
        console.log(i + '번 째 인자(인수, 매개변수) : ' + arguments[i]);
    };
};
array(1, 2, 3);
array(1);
array();    // 매개변수가 없으면 빈 배열이 잡히고 for문은 돌아가지 않음
*/

function array(){
    // arguments(매개변수 배열)라는 배열 자동 생성 : 에 실행시 매개변수가 들어옴
    let result = [];    // 빈 배열 선언
    if(arguments.length == 1) {     // array(4) : 배열을 길이 4개 모두 null이 들어가도록
        // ex. array(4) : 매개변수(4) 만큼 result.push(null);
        for(var cnt = 0; cnt < arguments[0]; cnt++) {
            result.push(null);  
        }
    }else if(arguments.length >= 2) {
        // ex. array(1, 2, 3) : 매개변수와 같은 배열을 result([1, 2, 3])로 만듦
        for(var idx = 0; idx < arguments.length; idx++) {
            result.push(arguments[idx]);
        }
        // 시스템이 자동생성한 배열 arguments는 forEach() 사용불가 / (일반for문, for-in, for-of 사용)
    }
    return result;
};
console.log('array() = ', array());                 // 매개변수 0개
console.log('array(5) = ', array(5));               // 매개변수 1개
console.log('array(1, 2, 13) = ', array(1, 2, 13)); // 매개변수 2개 이상
console.log('array(1, 2, 3, "Hello") = ', array(1, 2, 3, "Hello"));