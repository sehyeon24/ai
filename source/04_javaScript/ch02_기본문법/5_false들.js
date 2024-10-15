// false로 해석되는 값 : 0, ''(스페이스 없이 빈 스트링), undefined, NaN, null   // -9999, '  ' 제외
// 터미널로 실행(html이 아님) : 터미널 > node 5_+tab > enter
var i;  // 할당하지 않았으므로 undefined
if(i) {
    console.log('true');
}else {
    console.log('false');
}
console.log(Boolean(i));
console.log(Boolean(0));
console.log(Boolean(''));
console.log(Boolean(NaN));
console.log(Boolean(null));
console.log();  // 개행
console.log(Boolean(-999)); // true
console.log();  // 개행
console.log('빈스트링 === false의 결과 : ' + ('' === false));
console.log('빈스트링 == false의 결과 : ' + ('' == false));
