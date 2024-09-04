package com.lec.loop;
/*
 * *
 * * *
 * * * *
 * * * * */ // for문 안에 for문 적용하기
public class Ex04for {
	public static void main(String[] args) {
		for(int i=1 ; i<=5 ; i++ ) { 			// i<=5 : 몇 줄 반복할지
			for(int j=1 ; j<=i ; j++) {			// j<=i : i 번째 줄에서 j를 몇 번 반복할지
				System.out.print('*');
			} // for-j
			System.out.println(); // 개행만 >> 개행이후 끝날 때까지 반복
		} // for-i
	} // main
} // class
			
//		for(int i=1 ; i<=5 ; i++ ) {			//	*****씩 다섯줄 만들기
//			for(int j=1 ; j<=5 ; j++) {
//				System.out.print('*');
//			} // for-j
//			System.out.println(); // 개행만
//		} // for-i
//	} // main
//} // class

