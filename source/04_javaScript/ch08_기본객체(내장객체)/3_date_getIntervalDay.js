// prototype에 함수 추가시 화살표함수 사용 불가

Date.prototype.getIntervalDay = function(otherDay) {    // getIntervalDay의 function은 Date타입에서 전부 사용 가능
    // now.getIntervalDay(limitDay) => now가 this, limitDay가 otherDay
    // if(otherDay > this) {
    //     var intervalMilliSec = otherDay.getTime() - this.getTime();  // otherDay.getTime() : otherDay의 millisecond를 반환
    // }else {
    //     var intervalMilliSec = this.getTime() - otherDay.getTime();
    // }
    var intervalMilliSec = Math.abs(this.getTime() - otherDay.getTime());  // 절대값 함수
    return Math.trunc(intervalMilliSec / (1000*60*60*24));   // 소숫점 내림 / 초*분*시간*일...
}

/*
테스트
var today = new Date();
var thatDay = new Date(2024, 9, 11, 14, 0, 0);  // 2024년 10월 11일 14시 0분 0초
console.log(today.getIntervalDay(thatDay));
console.log(thatDay.getIntervalDay(today));
*/