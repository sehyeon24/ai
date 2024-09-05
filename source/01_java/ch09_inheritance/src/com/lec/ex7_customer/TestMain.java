package com.lec.ex7_customer;

public class TestMain {
	public static void main(String[] args) {
		//Customer 클래스 public Customer 호출
		Customer customer = new Customer("홍길동", "010-9999-9999", "서울", "01-01");
		customer.buy(500000);	// VIP 안됨
		System.out.println("-----------------------");	// 구분선
		customer.buy(500000);
		Staff staff = new Staff("홍사원", "010-8888-8888", "개발부서");
		Person[] person = {customer, staff};
		for(Person p : person) {	// 확장for문
			System.out.println(p.infoString());
		}
		
	}
}
