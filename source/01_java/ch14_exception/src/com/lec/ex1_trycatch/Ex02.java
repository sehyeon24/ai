package com.lec.ex1_trycatch;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째 정수는 ");
		int i = scanner.nextInt();					// InputMismatchException : 예외 타입 (문자 입력시)
		System.out.println("두번째 정수는 ");			// InputMismatchException : 예외 타입 (문자 입력시)
		int j = scanner.nextInt();
		try {										// 예외가 발생하면 시도 안 함 >> 예외가 발생할 수도 있는 부분을 try로 감쌈
			System.out.println("i/j = " + (i/j));	// ArithmeticException : 예외 타입(0 입력시)
		}catch(ArithmeticException e) {				// 예외가 발생하면 catch를 실행 >> 예외가 발생하면 예외 객체가 자동 생성됨 : e라는 변수가 생김
			System.out.println(e.getMessage());
		}
		System.out.println("i*j = " + (i*j));
		System.out.println("i+j = " + (i+j));
		System.out.println("i-j = " + (i-j));
		scanner.close();
		
		
	}
}
