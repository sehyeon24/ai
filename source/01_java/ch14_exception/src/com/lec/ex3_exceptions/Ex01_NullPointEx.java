package com.lec.ex3_exceptions;

public class Ex01_NullPointEx {
	public static void main(String[] args) {
		String greeting = "Hello";
		System.out.println(greeting.substring(2));
		greeting = null;		// 하는 순간 "Hello"는 사라짐
		System.out.println(greeting.substring(2));
	}
}
