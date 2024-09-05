package com.lec.ex7_customer;
// new staff("홍길동", "010", "개발부")
public class Staff extends Person {
	private String department;	// 부서

	public Staff(String name, String tel, String department) {	// 생성자 함수
		super(name, tel);
		this.department = department;
	}
	
	@Override
	public String infoString() {
		return super.infoString() + " [부서]" + department;
	}
}
