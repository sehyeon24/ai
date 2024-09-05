package com.lec.ex7_customer;
// Customer와 Staff의 공통점을 super단에 올리기
public class Person {
	private String name;
	private String tel;	// 0이 날라가니까 String으로!
	
	public Person(String name, String tel) {	// 생성자 함수(우클릭 Source 사용)
		this.name = name;
		this.tel = tel;
	}
	
	public String infoString() {
		return "[이름]" + name + "	[전화]" + tel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
}
