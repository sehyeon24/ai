package com.lec.ex;

public class Ex01 {
	public static void main(String[] args) {
		
		int i = 10; // 변수의 선언과 초기화(할당)를 한 번에
		// 1. 배열 변수 선언과 초기화를 한 번에
		int[] iArr = {10, 20, 30, 40, 50};
		iArr[2] = 333;	// 배열값의 접근은 index(0부터 시작)ㄴ
		for(int idx=0 ; idx<iArr.length ; idx++) {	// iArr.length : iArr방의 갯수
			System.out.println(idx + "번째는 " + iArr[idx]);
		}	// for
//		int[] iArr = {10, 20, 30, 40, 50};			// 위와 같은 방법
//		iArr[2] = 333;
//		System.out.println("0번째는 " + iArr[0]);
//		System.out.println("1번째는 " + iArr[1]);
//		System.out.println("2번째는 " + iArr[2]);
//		System.out.println("3번째는 " + iArr[3]);
//		System.out.println("4번째는 " + iArr[4]);
		
		System.out.println();	// 개행
		
		// 2. 배열 변수 선언과 배열 메모리 공간 확보
		int[] iArr2 = new int[5];	// 배열 공간만 확보 = 배열 메모리 공간 확보
		for(int idx=0 ; idx<iArr2.length ; idx++) {	 								// 일반for문
			System.out.println("iArr2[" + idx + "] = " + iArr2[idx]);
		}
		
		System.out.println();	// 개행

		// 3. 배열 변수 선언
		int[] arr;
		arr = new int[3];
		for(int a : arr) {	 														// 확장for문
			System.out.println(a);
		}
		
	}	// main
}	// class


