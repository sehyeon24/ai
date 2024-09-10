package com.lec.ex4_account;
// 데이터(인스턴스변수) : accountNo(String), ownerName(String), balance(long)
// 생성자 new Account("010-777-77", "홍길동") : 홍길동 잔액 0원(매개변수2), new Account("010-777-77", "홍길동", 100) : 홍길동 잔액 100원(매개변수3)
// 기능(메소드) : deposit(예금), withdraw(인출), infoPrint(정보출력): void, infoString(정보문자열 반환): return
public class Account {
	//데이터
	private String accountNo;	// 계좌번호
	private String ownerName;	// 예금주
	private long balance;		// 예금 잔액
	
	//생성자 없으면 JVM이 디폴트 생성자 함수 자동 생성
	//public Account() {}			// 디폴트 생성자 함수
	public Account(String accountNo, String ownerName) {	// 생성자함수
		this.accountNo = accountNo;
		this.ownerName = ownerName;
	}
	public Account(String accountNo, String ownerName, long balance) {	// 생성자함수
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	//기능(메소드)
	public void deposit(long money)	{	// 무조건 예금하기
		balance += money;	//balance = balance + money;
		System.out.println(money + "원 예금하여 잔액 : " + balance);
	}
	public void withdraw(long money) throws Exception {	// 잔액이 있을 경우만 인출하기 가능: 무조건 인출 안되므로 if사용
		if(balance >= money)	{	// 이 조건이 만족해야 인출
			balance -= money;	//balance = balance - money;
			System.out.println(money + "원 인출하여 잔액 : " + balance);
		}else {	// 예외 : if조건이 만족하지 않을 시
			// ch14에서는 강제 예외 발생
			throw new Exception("예외메세지 : " + money + "원 인출하기엔 잔액(" + balance + ")이 부족합니다");
			// System.out.println("잔액이 부족하여 인출 불가합니다."); >> ch07_class
		}	// if
	}	// withdraw
	public void infoPrint()	{
		// 100-1 "홍길동"님 잔액 : 100 을 출력하기	: String 안에 " 같은 문자 입력시 \사용
		//System.out.println(accountNo + " \"" + ownerName + "\" 님 잔액 : " + balance);
		//System.out.printf("100-1 \"홍길동\"님 잔액 : 100");
		System.out.printf("%s \"%s\"님 잔액 : %d\n", accountNo, ownerName, balance);	//"" 안에 복붙하면 자동으로 생성되므로 %d와 같은 형식으로만 바꿔주기
	}
	public String infoString()	{
		// 100-1 "홍길동"님 잔액 : 100 을 return
		//return accountNo + " \"" + ownerName + "\"님 잔액 : " + balance;
		return String.format("%s \"%s\"님 잔액 : %d", accountNo, ownerName, balance);
	}
	
	//setter & getter
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
}























