package com.lec.quiz;
// Employee : name, int computePay(추상메소드) : 월급을 return하는 메소드
// int computeIncentive(월급이 300이상인 사람만 월급의 5%를 incentive)
public abstract class Employee {
	//private final double RATE = 0.05;
	//데이터
	private String name;
	
	//매개변수 있는 생성자
	public Employee(String name) {
		this.name = name;
	}
	
	//추상메소드(반드시 오버라이드)
	public abstract int computePay();
	//final메소드(오버라이드 금지)
	public final int computeIncentive() {	// 수정 불가
		int pay = 	computePay();	// 월급 : 계산시 임시변수 사용
		if(pay >= 3000000) {
			return (int)(pay*0.05);	// 상여금 : 계산시 int로 형변환	//return (int)(pay*RATE);(맨위)
		}
		return 0;	// if문 끝나면 상여금 0원으로 떨어짐
	}

	public String getName() {
		return name;
	}
	
} //class
