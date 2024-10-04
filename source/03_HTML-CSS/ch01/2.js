// 2.js
// 다른이름으로 저장(utf-8 인코딩방법으로 저장)
/* 동적인 부분(JavaScript */
name = prompt("이름은 ?", "홍길동");  // 취소를 클릭하면 'null'이 return 됨
if (name != "null" && name != "") {
    document.write(name + "님 반갑습니다.<br>");
}
