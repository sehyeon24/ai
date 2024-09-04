package com.lec.ex5_person;

public class PersonInfoTestMain {
	public static void main(String[] args) {
		int i = 10;
		int[] scores = {i, 100, 95};	// 기초데이터 배열
		
		PersonInfo p1 = new PersonInfo("홍길동", 33, 'm');	// 객체 배열 : 생성자함수 호출
		PersonInfo p2 = new PersonInfo("홍길순", 32, 'f', "2001-12-01");
		PersonInfo [] person = {p1, p2};	// person : 배열이름
		p1.print();
		p2.print();
		
		for(int idx=0 ; idx<person.length ; idx++)	{		// 일반for문
			//person[idx].print(); 	: 아래랑 둘 중 하나
			System.out.println(person[idx].infoString());
		}
		for(PersonInfo p : person) {						//확장for문
			System.out.println(p.infoString());
		}
	}
}
