package com.lec.ex;
// 실수는 double을 쓰자. 
public class VarEx03 {
	public static void main(String[] args) {
		float f = 3.14159265359F; // float : 4byte이므로 값 뒤에 F를 넣어줌
		double d = 3.14159265359; // 8byte
		System.out.println("f = " + f);
		System.out.println("d = " + d);
		if (f == d) {
			System.out.println("f와 d값은 같다");
		}else {
			System.out.println("f와 d값은 다르다");
		}
		f = 10.1F;
		d = 10.1;
		System.out.println("f = " + f);
		System.out.println("d = " + d);
		if (f == d) {
			System.out.println("f와 d값은 같다");
		}else {
			System.out.println("f와 d값은 다르다");
		}
	}
}
