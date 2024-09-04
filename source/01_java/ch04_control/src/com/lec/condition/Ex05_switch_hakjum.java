package com.lec.condition;

import java.util.Scanner;

// 점수(0~100)를 입력받아 학점 출력하기
public class Ex05_switch_hakjum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // 사용자에게 입력 받을 때
		System.out.print("점수는?");
		int score = scanner.nextInt();
		int temp = (score==100)? (score-1) : score; // temp에는 score가 100일 때만 99할당, 그 외엔 score에 동일 값 할당
				// score가 100이야? Y 입력값에서-1 : N 입력값 그대로
		switch(temp/10) {
		case 9: // 100점 만점이므로 나누기 했을 때 90점까지 떨어지는 값이므로 9로 설정
			System.out.println("A학점"); break;
		case 8:
			System.out.println("B학점"); break;
		case 7:
			System.out.println("C학점"); break;
		case 6:
			System.out.println("D학점"); break;
		case 5: case 4: case 3: case 2: case 1: case 0:
			System.out.println("F학점"); break;
		default:
			System.out.println("유효하지 않은 점수입니다");
		
		}
		scanner.close();
	}
}
