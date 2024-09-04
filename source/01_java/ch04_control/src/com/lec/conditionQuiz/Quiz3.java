package com.lec.conditionQuiz;

import java.util.Scanner;

// 
public class Quiz3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력하세요");
		int srp = sc.nextInt();
		
//		String youStr = you==0 ? "가위" : you==1 ? "바위" : you==2 ? "보" : "유효하지 않은 값";			// 깃 확인
//			System.out.println("당신은 " + );
		
//		switch (srp) {								// switch 사용
//		case 0: 
//			System.out.println("가위"); break;
//		case 1: 
//			System.out.println("바위"); break;
//		case 2: 
//		System.out.println("보"); break;
//		default :
//			System.out.println("오류");
//		}
		
		if (srp==0) {								// if 사용
			System.out.println("가위");
		}else if (srp==1) {
			System.out.println("바위");
		}else if (srp==2) {
			System.out.println("보");
		}else {
			System.out.println("오류");
		}
		}
	}
