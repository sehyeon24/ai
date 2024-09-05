package com.lec.quiz;
// HourlyEmployee : name(상속), hoursWorked, moneyPerHour, computePay(),computeIncentive()(상속)
public class HourlyEmployee extends Employee {
	//데이터
	private int hoursWorked;
	private int moneyPerHour;
	
	//생성자 : Source->
	public HourlyEmployee(String name, int hoursWorked, int moneyPerHour) {
		super(name);
		this.hoursWorked = hoursWorked;
		this.moneyPerHour = moneyPerHour;
	}

	//메소드
	@Override
	public int computePay() {
		return hoursWorked*moneyPerHour;
	}

}
