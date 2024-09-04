package com.lec.loopQuiz;
// 2*1=2 3*1=3 ... 9*1=9 (결과값은 두자리)
// ...
// 2*9=18 3*9=27 ... 9*9=81
public class Quiz4_gugudan {
	public static void main(String[] args) {
		for(int j=1 ; j<=9 ; j++ ) {
			for(int i=2 ; i<=9; i++) {
				System.out.printf( "%d * %d = %2d\t", i, j, i*j);	// "%d*%d=%d\t" : 출력할 형식 / =%2d : 두 자리 표시
			} //for-i
			System.out.println(); // 개행만
		} //for-j
	} //main
} //class

