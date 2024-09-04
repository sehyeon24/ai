package com.lec.conditionQuiz;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 > ");
		int num = sc.nextInt();
		if(num>=0) {								// 답안
			System.out.printf("입력하신 수의 절대값은 %d\n", num);
		}else {
			System.out.printf("입력하신 수의 절대값 : %d\n", -num); // num*-1도 가능
		}
		sc.close();
		
//		int num = sc.nextInt();
//		switch (num) {								// switch 사용
//		case 0: 
//			System.out.println("공"); break;
//		case 1: 
//			System.out.println("하나"); break;
//		case 2: 
//			System.out.println("둘"); break;
//		default :
//			System.out.println("오류");
//		}
		
//		if (num==0) {								// if 사용
//			System.out.println("공");
//		}else if (num==1) {
//			System.out.println("하나");
//		}else if (num==2) {
//		System.out.println("둘");
//		}else {
//			System.out.println("오류");
//		}
//		}
	}
}
