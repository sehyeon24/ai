package com.lec.quiz;

import java.util.Scanner;

// 입력한 수가 짝수인지 홀수인지 출력
public class Quiz1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("뭐?");
		int n1=sc.nextInt();
		int result;
		if (n1%2==0) {
			System.out.println("n1은 짝수입니다");
		}else {
			System.out.println("n1은 홀수입니다");
		}
	}
}

