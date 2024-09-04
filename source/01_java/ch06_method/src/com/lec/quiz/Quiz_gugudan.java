package com.lec.quiz;

import java.util.Scanner;

// 사용자로부터 구구단 수를 입력받아 gugudanOut(입력받은 수) 호출 -> 호출한 메소드에서 해당 구구단 출력
public class Quiz_gugudan {
	private static void gugudanOut(int value) {			// 사용자로부터 입력받은 수로부터 구구단을 출력 : method는 main 밖에!
		for(int i=1 ; i<=9 ; i++) {
			// System.out.println(value + "*" + i + "=" + value*i);
			System.out.printf("%d X %d = %d\n", value, i, value*i	);
		}
	}
	public static void main(String[] args) {			// 사용자로부터 입력받을 수 대기
		Scanner scanner = new Scanner(System.in);
		System.out.print("출력하고자 하는 구구단 수는 > ");
		int dansu = scanner.nextInt();
		System.out.println("입력하신 구구단 수는 " + dansu);
		gugudanOut(dansu);	// 구구단 수를 호출하는 함수
		
	}	// main
}	// class
