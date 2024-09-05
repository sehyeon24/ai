package com.lec.ex3_abc;

public class ABCTestMain {
	public static void main(String[] args) {
		S sobj = new S();	// 생성자 1개 실행
		//A aobj = new A();	// 생성자 2개 실행 (S -> A)
		S aobj = new A();	
		B bobj = new B();
		C cobj = new C();	// C cobj = new C(); 가능
		S[] arr = {sobj, aobj, bobj, cobj, new A()};	// 배열	{}안에 , new A()추가도 가능
		for(S temp : arr) {
			System.out.println(temp.s);
		}
	}
}
