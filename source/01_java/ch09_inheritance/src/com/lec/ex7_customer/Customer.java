package com.lec.ex7_customer;
// 출력 양식 ㅣ Customer c = new Customer("홍", "010-9999-9999", "서울", "12-12")
//			 c.buy(1200) : 구매 :: buy라는 메소드 만들기
// sysout(c.infoString()) >> override 하기
public class Customer extends Person {
	private String address;
	private int sum;		// 구매금액 누적
	private int point;		// 포인트 (구매금액의 1%)	// 상수로 빼기
	private String date;	// String을 다음주부터는 Date형(날짜)으로
	private boolean vip;	// true면 vip고객, false면 일반고객
	
	public Customer(String name, String tel, String address, String date) {	// 생성자 함수
		super(name, tel);
		this.address = address;
		this.date = date;
		point = 1000;		// 가입시 무조건 할당
		System.out.println(name + " 님 가입 감사 포인트 무려 1000점 드렸습니다.");
	}
	
	public void buy(int price) {
		sum += price;		// 구매금액 누적			// 상수로 빼기
		if(vip==false && sum>= Constant.VIPLIMMIT) {
			vip = true;
			System.out.println(getName() + " 님 VIP로 업그레이드 되셨습니다.");	
		}
		int thisPoint = (int)(price * Constant.POINTRATE);	// (int로 형변환) 금번 포인트
		point += thisPoint;	// 포인트 누적
		System.out.println(getName() + " 님 감사. 구매액 : " + price);
		System.out.println("금번 포인트 : " + thisPoint);
		System.out.println("누적 포인트 : " + point);
		System.out.println("누적금액 : " + sum);
	}
	@Override
	public String infoString() {
		String result = super.infoString() + " [포인트]" + point + " [구매누적]" + sum;
		result += (vip) ? "VIP 고객이십니다." : " ";
		return result;
	}
	
	
}












