package com.lec.method;
// 1.sum(10,100): 1부터 10까지 2.sum(10): 자동으로 1부터 10까지 = 함수 오버로딩 / 3.evenOdd(10): 짝홀 판별 / 4.abs(-9): 절대값 return
public class Arithmetic {
	public static int abs(int value) {	// value의 절대값을 return
		int result = (value>=0) ? value : -value;	//	삼항연산자
		return result;
	}
	// >> static이 있는 것은 할당 없이 바로 사용 가능
	
	public int sum(int from, int to ) {	// from 부터 to 까지 누적합 return / 매개변수 2개
		int sum = 0;	// 누적변수
		for(int i=from ; i<=to ; i++) {
			sum += i;	// sum = sum+i;
		}
		return sum;
	}
	
	public int sum(int to) { // 1부터 to까지 누적합 return / 매개변수 1개
		int result = 0;
		for(int i=1 ; i<=to ; i++)	{
			result += i;
		}
		return result;
	}
	
	public String evenOdd(int value) {	// value가 짝수인지 홀수인지를 return
		String result = (value%2==0) ? "짝수입니다" : "홀수입니다" ;	// 삼항연산자
		return result;
//		if (value%2==0) {
//			return "짝수입니다";
//		}else {
//			return "홀수입니다";
//		}
	}
}
