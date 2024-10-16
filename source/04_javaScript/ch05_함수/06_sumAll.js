function sumAll() {
    // 매개변수가 0개 : -999 return
    // 매개변수가 1개 이상 : 매개변수들 누적합 return
    var result = 0;
    if(arguments.length == 0) {
        result = -999;
    }else if(arguments.length >= 1) {
        for(var idx = 0; idx < arguments.length; idx++) {
            // result = result + arguments[idx];
            result += arguments[idx];
        }
    }
    return result;
};
console.log('sumAll() = ', sumAll());
console.log('sumAll(1, 2, 3) = ', sumAll(1, 2, 3));
console.log('sumAll(1, 2, 3, 4, 5) = ', sumAll(1, 2, 3, 4, 5));