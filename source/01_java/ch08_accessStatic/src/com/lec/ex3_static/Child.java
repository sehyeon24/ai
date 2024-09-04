package com.lec.ex3_static;
// Child 클래스
// Child child1 = new Child("첫째");
// child.takeMoney(1000);
public class Child {
	private String name;
	static Mom mom = new Mom();	// Mom 객체	// static을 붙여야 한 Mom에게서 돈이 나갈 수 있음
	public Child(String name) {
		this.name = name;
	}
	public static void method() {
		System.out.println("method");
	}
	public void takeMoney(int money) {
		if(mom.money >= money) {
			mom.money -= money;	//mom.money = mom.money - money
			System.out.println(name + "가 " + money + "원 가져가서 엄마 지갑엔 " + mom.money);
		}else {
			System.out.println(name + "가 돈 못 받음. 현재 엄마 지갑엔 " +  mom.money);
		}
	}
}
