package com.lec.ex1_list;
// new Friend("홍길동", "010-7894-7894")
public class Friend {
	// 데이터 선언
	private String name;
	private String tel;
	
	// Source - ~Using Field
	public Friend(String name, String tel) {
		super();
		this.name = name;
		this.tel = tel;
	}
	
	// Source - toString
	@Override
	public String toString() {
		return "[name=" + name + ", tel=" + tel + "]";
	}
	
	// Source - getter
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
	
	
	
	
}
