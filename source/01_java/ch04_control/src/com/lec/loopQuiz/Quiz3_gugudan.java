package com.lec.loopQuiz;

import java.util.Scanner;

// 사용자로부터 원하는 구구단 수를 입력받아 해당 구구단을 출력하기
public class Quiz3_gugudan {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("몇단 구구단을 출력할까요 > ");
		int dansu= scanner.nextInt();
		for(int i=1 ; i<=9 ; i++) {
			System.out.println(dansu + "*" + i + "=" + dansu*i);
			
		}
		scanner.close(); // 데이터베이스 연동시에는 반드시 작성해야 함
	}
}
