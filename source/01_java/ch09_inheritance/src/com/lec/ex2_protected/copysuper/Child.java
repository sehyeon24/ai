package com.lec.ex2_protected.copysuper;
// private(i, j) / public setter&getter
// new Child(), new Child(1, 10),
public class Child extends SuperIJ {	// SuperIJ까지 전부 Child 객체임 : 상속받았으니까
	private int total;
	
	public Child() {
		System.out.println("매개변수 없는 Child 생성자");
	}
	public Child(int i, int j) {
		super(i, j);
		System.out.println("매개변수 있는 Child 생성자");
	}
	
	public void sum() {
//		total = getI() + getJ();	// getter를 이용해야 함
		total = i + j;	// int i, int j를 protected로 변경해서 가능함
		System.out.println("i = " + getI() + "j = " + getJ() + "total = " + total);
		// protected를 사용해서 this.i = 를 쓰면 getI()형식 사용하지 않고 i만 사용가능
	}
}
