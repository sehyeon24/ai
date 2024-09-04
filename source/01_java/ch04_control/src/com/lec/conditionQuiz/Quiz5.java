package com.lec.conditionQuiz;

import java.util.Scanner;

public class Quiz5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("월을 입력하세요 >\n");
		int month = sc.nextInt();
		if( 3 <= month && month < 6 ) {
			System.out.println("봄");
		}else if( 6 <= month && month < 9 ) {
			System.out.println("여름");
		}else if( 9 <= month && month < 12 ) {
			System.out.println("가을");
		}else if( 1==month && month ==2 ) {
			System.out.print("겨울");
		}else if( month==12 ) {
				System.out.print("겨울");
		}else {
			System.out.println("오류");
		}
	}
}
// switch 깃 강의안 보기
// 문자 입력시 오류 발생 : 예외!