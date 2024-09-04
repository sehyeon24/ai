package com.lec.ex;
// 변수 선언 방법
// ctrl + / : 주석처리 및 비활성화 동시 조작 가능 단축키
public class VarEx04 {
	public static void main(String[] args) {
		// 1. 자료형 변수명; - 변수 선언과 할당을 분리 (변수 선언만)
		int num1; // 변수 선언만(공간만 형성됨)
		num1 = 10; // 할당
		// 2. 자료형 변수명 = (초기)값; - 변수 선언과 동시에 값이 초기화
//		System.out.printf("num1=%d\n", num2);
		int num2 = 20; // 선언과 할당 동시
		System.out.printf("num1=%d, num2=%d\n", num1, num2);
		// 3. 자료형 변수1, 변수2 ... ; 동일 자료형의 변수를 다수 선언
		int num3, num4, num5;
		num3 = 3; num4 = 40; num5=50;
		System.out.printf("num3=%d, num4=%d, num5=%d", num3, num4, num5);
		// 4. 자료형 변수1=값1, 변수2=값2, ...; 동일 자료형 변수를 다수 선언과 초기화를 동시에
		int num6=60, num7=70;
		System.out.printf("num6=%d, num7=%d", num6, num7);
	}
}
