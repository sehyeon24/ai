package com.lec.ex1_trycatch;

public class Ex04_finally {
	public static void main(String[] args) {
		int[] arr = {0,1,2};	// 배열
		for(int i=0 ; i<=arr.length ; i++) {	// 일반for문 : <=를 안 쓰는 이유는 i가 3이되면 예외가 발생하기 때문
			try {
				System.out.println("arr[" + i + "] = " + arr[i]);
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("예외 메세지 : " + e.getMessage());
			}finally {
				System.out.println("try절 실행 후에도, catch절 실행 후에도 실행되는 절\n");
			}
		}
	}
}
