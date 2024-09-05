package com.lec.ex2_store;
// 추상 클래스 : HeadQuarterStore를 상속 받은 측에서 반드시 강제로 override 하게끔
//			: 추상메소드가 1개 이상 있어야 함
//			: 추상메소드 때문에 객체 만들 수 없음
// 본사 : 김치찌개-0     부대찌개-0     비빔밥-0     순대국-0      공기밥-0
public interface HeadQuarterStore {	// extends Object : 자체 생략
	//추상메소드 : 메소드 선언만 있고, 구현은 없는 메소드(구현은 상속받은 측에서)
	public abstract void kimchi();
	public abstract void bude();
	public abstract void bibim();
	public abstract void sunde();
	public abstract void gongi();
}
