package com.lec.ex1_car;
// 클래스 : 속성(데이터=인스턴스 변수)과 메소드(기능)를 입력 : 속성은 무조건 private 붙이기//setter&getter 필요
// Car myCar = new Car();
// myCar.method명() 호출 가능
public class Car {
	
	// ↓ 속성(데이터)
	private String color; // 색상				// 앞에 private가 붙으면 외부 class에서 데이터 지정 불가
	// 데이터 세팅할 함수, 데이터 가져다 쓸 함수 두 개가 필요함
	private int    cc;	// 배기량 ex). 1500, 2000 등
	private int    speed;
	
	// ↓생성자 함수 없으면 디폴트 생성자 함수를 JVM이 자동 생성함
	public Car() {}
	
	// ↓ method
	public void park()	{
		speed = 0;
		System.out.println(color + "색 주차함. 지금 속도 : " + speed);
	}
	public void drive()	{
		speed = 60;
		System.out.println(color + "색 차 드라이브 함. 지금 속도 : " + speed);
	}
	public void race()	{
		speed = 120;
		System.out.println(color + "색 차 레이싱 중. 지금 속도 : " + speed);
	}
	
	// method 추가
	// 1.color (setter&getter) : 변수 하나당 함수 두 개 필요
	public void setColor(String color)	{
		this.color = color;
		// this. : 내 객체의
		// 객체의 인스턴스변수와 매개변수(지역변수)의 우선순위는 지역변수가 높음
		//	↑ 위와 같은 값을 나타내지만 다른 방법
		//	public void setColor(String c)	{
		//	color = c;
	}
	public String getColor()	{
		return color;
	}
	
	// 2.cc (setter&getter)
	public void setCc(int cc)	{
		this.cc = cc;
	}
	public int getCc()	{
		return cc;
	}
	
	// 3.speed (setter&getter)
	public void setSpeed(int speed)	{
		this.speed = speed;
	}
	public int getSpeed()	{
		return speed;
	}
	
}














