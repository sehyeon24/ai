package com.lec.loop;
// 10. 9. 8. ... 1까지 출력하기
public class Ex07while {
	public static void main(String[] args) {
		int i=10;
		while(i>0) {
			System.out.print(i + "\t");
			i--; // 증감식 반드시 기재해야 함
		}
//		for(int i=10 ; i>0 ; i--) {					// for 사용
//			System.out.print(i + "\t");
//		}
	}
}
