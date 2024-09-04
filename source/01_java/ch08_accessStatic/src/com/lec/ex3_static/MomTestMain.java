package com.lec.ex3_static;
// Mom 클래스와 Child 클래스를 가지고 child1 만들기
public class MomTestMain {
	public static void main(String[] args) {
		//static method를 만들었을 때 아래처럼 바로 사용 가능
		Child.method();
		System.out.println(Child.mom.money);
		//아닐 때
		//static method를 만들면 각 객체변수 안에 mom이 만들어지는게 아니라 new Child와 Child 클래스 안의 mom이 한 객체로 묶임(공유함)
		Child child1 = new Child("첫째 길동이");	// static method 없을 때 : 객체변수1 >> name:길동이, mom=2000	
		Child child2 = new Child("둘째 개똥이");	// 						 객체변수2 >> name:개똥이, mom=2000
		Child child3 = new Child("셋째 똘순이");	// 						 객체변수3 >> name:똘순이, mom=2000
		System.out.println("첫째 엄마 지갑 : " + Child.mom.money);		// Child.mom이든 child1.mom이든 관계없음. : static으로 공유되어있기 때문에
		child1.takeMoney(1000);
		child2.takeMoney(1000);
		child3.takeMoney(1000);
		System.out.println("첫째 엄마 지갑 : " + child1.mom.money);
		System.out.println("둘째 엄마 지갑 : " + child2.mom.money);
		System.out.println("셋째 엄마 지갑 : " + child3.mom.money);
		System.out.println("엄마 지갑 : " + Child.mom.money);			// Child.mom이든 child1.mom이든 관계없음. : static으로 공유되어있기 때문에
	}
}
