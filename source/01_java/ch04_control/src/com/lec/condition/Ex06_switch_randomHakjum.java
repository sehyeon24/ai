package com.lec.condition;
// 실행할 때마다 컴퓨터가 난수(random) 점수를 발생하여 학점 출력 : 랜덤 숫자를 컴퓨터에서 제시해줌
public class Ex06_switch_randomHakjum {
	public static void main(String[] args) {
		// 0이상 <= Math.random() < 1미만 : 실수인 난수
		// 0 <= Math.random()*51 < 51 : 실수인 난수
		// 50 <= Math.random()*51+50 < 101 : 실수인 난수
		// 50 <= (int)(Math.random()*51+50) < 101 : 정수인 난수 (50~100)

		// 0*101 <= Math.random()*101 < 101 : 실수인 난수
		// 0 <= (int)(Math.random()*101) < 101 : 정수인 난수 (0~100) (0이상<=  <101미만 인 정수인 난수를 원할 때 : 명시적 형변환 필요)
		// 0 <= Math.random()*45 < 45 : 0~45 미만인 실수인 난수 출력
		// 1 <= Math.random()*45+1 < 46 : 1~46 미만인 정수인 난수 출력
		int score = (int)(Math.random()*101);
		System.out.print( "점수는 " + score + " - "); // println을 사용하면 개행됨
		switch(score/10) {
		case 10:
		case 9:
			System.out.println("A학점 "); break; // break : 제어문 탈출
		case 8:
			System.out.println("B학점 "); break;
		case 7:
			System.out.println("C학점 "); break;
		case 6:
			System.out.println("D학점 "); break;
		default:
			System.out.println("F학점 ");
		}
	}
}
