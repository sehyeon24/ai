package com.lec.ex8_store;
// public HeadQuarterStore(String storeName) { : 부모클래스에서 매개변수 없는 생성자함수를 안 만들어서 Store1에서 에러남
// 김치찌개-8,000  부대찌개-8,000(v)  비빔밥-9,000 순대국-안팔아(v)  공기밥-1,000원
public class Store1 extends HeadQuarterStore {
	
	public Store1(String storeName) {
		super(storeName);
		
	}
	@Override
	public void bude() {
		System.out.println("부대찌개 : 8,000원");
	}
	@Override
	public void sunde() {
		System.out.println("순대국은 안 팔아요");
	}
	
	@Override
	public String toString() {
		return "☆" + getStoreName() + "☆";
	}
	
}
