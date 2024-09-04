package com.lec.quiz;

import java.util.Scanner;

// 국어, 영어, 수학 점수를 사용자에게 입력받아, 각 점수를 출력하고 총점, 평균(소수점2자리까지) 출력하는 프로그램을 구현 하시오
public class Quiz2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("국어 : ");
		int kor = scanner.nextInt();
		System.out.print("영어 : ");
		int eng = scanner.nextInt();
		System.out.print("수학 : ");
		int mat = scanner.nextInt();
		int sum = kor + eng + mat;
		double avg = sum/3.;
		System.out.printf("국어 : %d, 영어 : %d, 수학 : %d\n", kor, eng, mat);
		System.out.printf("총점 = %d, 평균 = %.2f\n", sum, avg);
//		int kor = 100, eng = 100, mat = 90;
//		int tot = kor + eng + mat;
////		int avg = tot ㅠㅠ
//		System.out.println("국어 : " + kor + "\t 영어 : " + eng + "\t 수학 : " + mat);
//		System.out.println("총점 : " + tot);
////		System.out.println("평균 : " + avg);
	}
}
