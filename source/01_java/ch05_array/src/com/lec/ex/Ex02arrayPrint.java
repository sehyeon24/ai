package com.lec.ex;
// 출력시 : 확장for문, 변경시 : 일반for문
public class Ex02arrayPrint {
	public static void main(String[] args) {
		int[] arr = {0, 0, 0};
		// ↓ 확장for문을 이용한 값 출력시
		for(int a : arr) {		// arr은 변동없음, a를 변동시키는 것
			System.out.println(a);
		}
		// ↓ 일반for문을 이용한 배열값 변동시
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] = 99;
		}
		System.out.println("일반 for문을 이용한 배열값 변경");
		for(int a : arr) {		
			System.out.println(a);
		}
		// 확장for문을 이용한 배열값 변경
		for(int temp : arr) {
			temp = 55;
		}
		System.out.println("확장 for문을 이용한 배열값 변경은 무효");
		for(int a : arr) {		
			System.out.println(a);		
		}
	}
}
