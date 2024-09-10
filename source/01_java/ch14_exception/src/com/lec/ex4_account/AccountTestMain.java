package com.lec.ex4_account;

public class AccountTestMain {
	public static void main(String[] args) {
		Account hong = new Account("100-1", "홍길동");	// 생성자함수 호출
		hong.deposit(100);	// 예금하기 : int = ? 처럼 할당이 아니므로 return이 없어서 void 사용
		try {
			hong.withdraw(150);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	// 인출하기
		hong.infoPrint();
		System.out.println(hong.infoString());
		Account hong1 = new Account("010-2", "홍길순", 2200000000L);
		try {
			hong1.withdraw(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(hong1.infoString());
	}
}
