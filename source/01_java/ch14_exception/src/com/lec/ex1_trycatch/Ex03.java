package com.lec.ex1_trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;
// 첫 번째 정수를 제대로 입력할 때까지 입력받기
// 두 번째 정수를 제대로 입력하지 않으면 1로 할당받고, 곱셈, 덧셈, 뺄셈을 출력
public class Ex03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i=0 ,j=1;
		
		do {										// 한 번은 정수를 받음(정수를 입력 받을 때까지 실행)
			try {
			System.out.print("첫번째 정수는 ");
			i = scanner.nextInt();					// InputMismatchException : 예외 타입 (문자 입력시)
			break;									// 정수를 입력했으면 try절 멈추고 두 번째 정수를 받음
													// 정수가 아닌 것을 입력하면 catch절로 떨어져 오류메시지를 나타냄
			}catch (InputMismatchException e) {
				System.out.println(e.getMessage());
				scanner.nextLine();					// 버퍼 지우는 목적
			}
		}while(true);
		
		System.out.print("두번째 정수는 ");		
		try {										// 예외 발생할 수도 안 할수도 있는 두 절
			j = scanner.nextInt();					// InputMismatchException : 예외 타입 (문자 입력시)
			System.out.println("i/j = " + (i/j));	// ArithmeticException : 예외 타입(0 입력시)
		}catch (ArithmeticException e) {
			System.out.println("0으로 나눌수는 없습니다 : " + e.getMessage() );
		}catch (InputMismatchException e) {			// 그냥 Exception 해도 됨, 단 순서를 지켜야 함(예외가 발생하면 위에 catch에서 끝남. 절대 밑으로 떨어지지 않음) : 상속관계이기 때문에
			System.out.println("두 번째 정수를 잘못 입력하셔서 1로 처리합니다");
		}
		
		System.out.println("i*j = " + (i*j));
		System.out.println("i+j = " + (i+j));
		System.out.println("i-j = " + (i-j));
		scanner.close();
	}
}
