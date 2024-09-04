package com.lec.ex5_final;

import constant.Constant;	// package.constant_Constant를 import함 

// final 변수(변수 앞에 final) : 수정 불가 
public class FinalTestMain {
	public static void main(String[] args) {
		final double PI = 3.141592;	// final변수는 대문자
		double r = 3;				// 3.0 원의 반지름
		r = 5;
//		PI = 3.1415926535;			// final변수 초기값 할당 후엔 수정 불가
		double area = r * r * Constant.PI;	// 원의 넓이
		System.out.println(area);
	}
}
