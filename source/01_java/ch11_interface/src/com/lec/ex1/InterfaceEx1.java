package com.lec.ex1;
// (일반메소드X) 추상메소드(new 사용X), final변수(상수)만 가능
public interface InterfaceEx1 {
	public /* static final */ int CONSTANT_NUM = 10;	// static만 올 수 있음, 상수 이름은 대문자만 가능	
	public /* abstract */ void method1();	// 선언만 있고 구현은 없음, method1은 추상메소드이므로 override해서 사용해야함

}
