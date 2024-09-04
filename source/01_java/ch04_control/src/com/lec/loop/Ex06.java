package com.lec.loop;
// 반복문(loop문)을 작성할 대는 무한반복문(loop)에 빠지지 않도록 주의
public class Ex06 {
	public static void main(String[] args) {
		for(int i=1 ; ; i++) {		// ;와 ; 사이엔 공백이어도 true가 존재함
			System.out.println(i + ", 안녕");			// 무한반복됨
			//if(i==10) break;
		}
		 //System.out.println("실행 안 됨");
	}
}
