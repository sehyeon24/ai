package com.lec.condition;
// 조건문 : if문, switch문(가독성이 좋음)
public class Ex01_if {
	public static void main(String[] args) {
		int score = 65;
		if(score >= 90) {
			System.out.println("참 잘했어요");
		}else if(score >= 70) {
			System.out.println("괜찮아요");
		}else {
			System.out.println("분발하세요");
		} // if
		System.out.println("프로그램 끝");
	} // main
} // class
