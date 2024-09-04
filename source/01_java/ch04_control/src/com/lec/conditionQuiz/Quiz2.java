package com.lec.conditionQuiz;

// 최대값 출력하기
public class Quiz2 {
	public static void main(String[] args) {
		int num1 = 27;
		int num2 = 32;
		// 방법1 ▼ if블럭 안의 max변수를 if블럭 전에 선언
		// int max;
//		int max;
//		if(num1>num2){
//			max = num1;
//		} else {
//			max = num2;
//		}

		// 방법2 ▼ if블럭 안에 선언한 max변수를 if안에서 출력
		if (num1 > num2) {
			int max = num1;
			System.out.println(max); // alt+방향키↑,↓ : 소스 한 줄씩 이동
		} else {
			int max = num2;
			System.out.println(max); // ctrl+alt+방향키↑,↓ : 소스 한 줄 복사
		}
	} // main
} // class
