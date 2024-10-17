//  replaceAll('안녕00방가00하이', '00', 'x') : 모든 00을 x로 교체해 '안녕xx방가xx하이'를 return

const replaceAll = (str, oldStr, newStr) => {
    // var splitStr = str.split(oldStr);
    // var result = splite.join(newStr);
    // return result;
    return str.split(oldStr).join(newStr);
};
console.log(replaceAll('테스트<br>합니다<br>진짜로', '<br>', 'x'));
console.log(replaceAll('테스트합니다 진짜로 테스트', ' ', ''));


// var str = '안녕00방가00하이';
// console.log('원본', str);
// var splitStr = str.split('00'); // 00을 기준으로 분리하여 배열처럼 만듦
// console.log(splitStr);
// var result = splitStr.join('x');
// console.log(result);
