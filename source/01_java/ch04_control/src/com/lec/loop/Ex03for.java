package com.lec.loop;
// 15 16 17 18 19
// 20 21 22 23 24 로 표시되게끔 개행 출력하기
public class Ex03for {
	public static void main(String[] args) {
		for(int i=15 ; i<=50 ; i++) {
			System.out.print(i + "\t"); // ln을 쓰면 개행하게 되므로 사용X
			if(i%5==4) { // i를 5로 나눈 값이 4일 때 : 끝자리가 5나 4로 끝날 때마다
				System.out.println(); // println : 개행한다는 뜻
			}
		}
	}
}
