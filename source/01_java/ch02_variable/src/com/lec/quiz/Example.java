package com.lec.quiz;
// 국어, 영어, 수학 점수를 할당하고, 각 점수와 총점을 출력
public class Example {
	public static void main(String[] args) {
		int kor = 100, eng = 90, mat = 100; // 국어, 영어, 수학
//		1번 int kor = 100, eng = 90, mat = 100; // 국어, 영어, 수학
//		2번 int kor = 100; // 국어
//			int eng = 100; // 영어
//			int mat = 90; // 수학
		int tot = kor + eng + mat; // tot = 290;
		System.out.println("국어 : " + kor + "\t 영어 : " + eng + "\t 수학 : " + mat);
		System.out.println("총점 : " + tot);
	}
}
