package com.lec.ex;
// return 값이 없는 method의 타입은 void로
public class Ex04_void {
	public static void main(String[] args) {
		printLine(30); // int
		System.out.println("Hello, World!");
		printLine("="); // String
		System.out.println("Hello, Java");
		printLine(30, "~"); // 매개변수 두 개짜리
		System.out.println("Hello, World!");
		printLine();
	}
	private static void printLine(int cnt, String ch) {	//	매개변수 두 개짜리
		for(int i=0 ; i<cnt ; i++) {
			System.out.print(ch);
		}
		System.out.println(); // 개행
	}
	private static void printLine(String ch) {	//	매개변수 문자
		for(int i=0 ; i<20 ; i++) {
			System.out.print(ch);
		}
		System.out.println(); // 개행
	}
	private static void printLine(int cnt) {	//	매개변수가 int인 것
		for(int i=0 ; i<cnt ; i++) {
			System.out.print('-');
		}
		System.out.println(); // 개행
	}
	private static void printLine() {	//	매개변수 없는 것
		for(int i=0 ; i<20 ; i++) {
			System.out.print('-');
		}
		System.out.println(); // 개행
	}
}
