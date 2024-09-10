package com.lec.ex1_trycatch;

import java.util.Scanner;

// 사용자로부터 두 수를 입력받은 후 계산
public class Ex01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째 정수는 ");
		int i = scanner.nextInt();
		System.out.println("두번째 정수는 ");
		int j = scanner.nextInt();
		System.out.println("i/j = " + (i/j));	// ArithmeticException : 예외 타입(0 입력시)
		System.out.println("i*j = " + (i*j));
		System.out.println("i+j = " + (i+j));
		System.out.println("i-j = " + (i-j));
		scanner.close();
		
		
	}
}
