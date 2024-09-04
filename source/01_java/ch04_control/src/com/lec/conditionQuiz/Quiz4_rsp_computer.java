package com.lec.conditionQuiz;

import java.util.Scanner;

// 사용자에게 가위(0). 바위(1), 보(2)를 입력받는다
//	1. 0~2사이 이외의 수를 입력했을 경우 : 프로그램 강제 종료
// 	2. 0~2사이의 수를 입력했을 경우 : (if, switch, 삼항연산자 모두 사용 가능)
//		1). 컴퓨터가 0~2사이의 난수를 발생
//		2). 사용자와 컴퓨터가 낸 가위바위보 출력 : 사용자>>가위, 컴퓨터>>바위 출력
//		3). 가위바위보 결과 출력 : 사용자가 졌습니다.
public class Quiz4_rsp_computer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("가위(0), 바위(1), 보(2) 입력 : ");
		int you = sc.nextInt();
		if( you<0 || you>2 ) {
			System.out.println("떼끼");
			System.exit(0); // 프로그램 정상 강제 종료
		}
		
		String youStr = (you==0) ? "가위" : (you==1)	? "바위"	: "보";		// 삼항연산자 사용방법
		
//		if(you==0) {													// if 사용방법
//			youStr = "가위";
//		}else if(you==1) {
//			youStr = "바위";
//		}else {
//			youStr = "보";
//	}
		
//		String youStr; // 가위나 바위나 보를 저장
//		switch(you) {													// string 사용방법
//		case 0: youStr="가위"; break;
//		case 1: youStr="바위"; break;
//		default : youStr="보"; break;
//		}
				
		// 컴퓨터도 0~2사이의 난수 0 <= (int)(Math.random()*3) < 1*3 : 3 미만의 정수 난수가 필요함으로
		//// 이 이하로 깃 확인하기
		int com = 1; // 0~2사이의 정수 난수;
		String comStr = com==0 ? "가위" : com==1 ? "바위" : "보";
		System.out.println("당신은 " + youStr + ", 컴퓨터는 " + comStr);
		
		// if문이나 switch문을 이용해 가위바위보 결과 출력
		
		
		
		
	}
}
