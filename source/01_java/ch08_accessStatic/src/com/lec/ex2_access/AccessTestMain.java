package com.lec.ex2_access;

public class AccessTestMain {
	public static void main(String[] args) {
		AccessTest obj = new AccessTest();	// class Access가 들어옴
		//System.out.println(obj.privateMember);
		System.out.println(obj.defaultMember);
		System.out.println(obj.protectedMember);
		System.out.println(obj.publicMember);
		//obj.privateMethod();
		obj.defaultMethod();
		obj.protectedMethod();
		obj.publicMethod();
	}
}
