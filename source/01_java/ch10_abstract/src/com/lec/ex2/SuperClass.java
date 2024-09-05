package com.lec.ex2;
// method1(추상), method2, method3(일반-static) 으로 만들자
// abstract class(추상클래스)는 객체 만들지 못함, 변수 타입으로 가능
public abstract class SuperClass {
		public abstract void method1();		//	추상메소드 : {를 사용해서 구현하지 않고 ;를 사용해서 선언만
		public void method2() {
			System.out.println("SuperClass의 method2");
		}
		public void method3() {
			System.out.println("SuperClass의 method3");
		}
		
		
}
