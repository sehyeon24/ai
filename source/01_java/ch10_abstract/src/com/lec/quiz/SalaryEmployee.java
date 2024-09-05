package com.lec.quiz;
// SalaryEmployee : name(상속), annualSalary, computePay(abstract),computeIncentive(final)(상속)
public class SalaryEmployee extends Employee {
	//데이터
	private int annualSalary;

	//생성자
	public SalaryEmployee(String name, int annualSalary) {
		super(name);
		this.annualSalary = annualSalary;
	}

	//메소드 : 월급계산
	@Override
	public int computePay() {
		// TODO Auto-generated method stub
		return annualSalary / 14 ;
	}
	

}
