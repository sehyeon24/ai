package com.lec.ex3_exceptions;
// 2000년대 생이면 100 입력
import java.util.Date;

public class Ex02_FriendMain {
	public static void main(String[] args) {
		Friend friend1 = new Friend("홍길동", "010-9999-9999", new Date(98, 8, 10));	// = new Date(new GregorianCalendar(1998, 8, 10).getTimeInMillis()));
		System.out.println(friend1);
		Friend friend2 = new Friend("홍길동", "010-9999-9999", new Date(98, 8, 9));
		System.out.println(friend2);
		Friend friend3 = new Friend("김길동");
		System.out.println(friend3);
		Friend friend4 = new Friend("박길동", "010-7894-4564");
		System.out.println(friend4);
	}
}
