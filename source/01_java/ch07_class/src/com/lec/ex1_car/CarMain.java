package com.lec.ex1_car;

public class CarMain {
	public static void main(String[] args) {
		Car myPorsche = new Car();	// 객체변수
//		myPorsche.color = "빨강";  : setter&getter 없을 때
		myPorsche.setColor("빨강");	// setColor("빨강")이 String c에 들어감: ctrl+setColor 클릭
//		myPorsche.cc = 2400;
		myPorsche.setCc(2400);	// setter사용
		System.out.println(myPorsche.getColor() + "색차량 배기량은 " +	// getter사용
				myPorsche.getCc() + ", 속도는 " + myPorsche.getSpeed());
		myPorsche.drive();
		myPorsche.park();
		myPorsche.race();
		System.out.println(myPorsche.getColor() + "색차량 배기량은 " +
				myPorsche.getCc() + ", 속도는 " + myPorsche.getSpeed());
		Car yourPorsche = new Car();	// 객체변수
//		yourPorsche.color = "gray";
		yourPorsche.setColor("gray");	// setter사용
		yourPorsche.drive();
		System.out.println(myPorsche.getColor() + "색차량 배기량은 " +
				myPorsche.getCc() + ", 속도는 " + myPorsche.getSpeed());
		System.out.println(yourPorsche.getColor() + "색차량 배기량은 " +
				yourPorsche.getCc() + ", 속도는 " + yourPorsche.getSpeed());
	}
}
