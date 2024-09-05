package com.lec.ex6_final;
// final을 변수 앞 : 변수 수정 불가
// final을 메소드 앞 : override 불가
// final을 class 앞 : 상속 금지
public final class Rabbit extends Animal {
	@Override
	public void running() {
		speed += 30;
		System.out.println("토끼가 마구 뛰어요. 현재 속도 : " + speed);
	}
	
}
