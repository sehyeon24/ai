package com.lec.condition;

import java.util.Scanner;

// 입력받은 수가 홀수인지 짝수인지 출력하기(if, switch, 삼항연산자 사용하기)
public class Ex07 {
	public static void main(String[] args) {
//		String name = new String ("Hong"); // new String 자체 생략
//		System.out.println(name.toLowerCase());
		Scanner scanner = new Scanner(System.in); // System.in : 키보드버퍼
		System.out.print("정수를 입력하세요 > ");
		int num = scanner.nextInt();
		
//방법1	if(num%2==0) {
//			System.out.println("짝수");
//		}else {
//			System.out.println("홀수");
//			
//방법2	System.out.println( num%2==0 ? "짝수" : "홀수" );
			
		switch(num%2) { // 괄호 안에 정수, 문자, 문자열 들어갈 수 있음 // -1 0 1 //방법3
		case 0:
			System.out.println("짝수"); break;
		default :
			System.out.println("홀수");
		
		}
	}

}