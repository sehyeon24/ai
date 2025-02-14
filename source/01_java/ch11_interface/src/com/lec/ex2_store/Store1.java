package com.lec.ex2_store;
// public HeadQuarterStore(String storeName) { : 부모클래스에서 매개변수 없는 생성자함수를 안 만들어서 Store1에서 에러남
// 김치찌개-8,000  부대찌개-8,000(v)  비빔밥-9,000 순대국-안팔아(v)  공기밥-1,000원
public class Store1 implements HeadQuarterStore {
	//데이터
	private String storeName;
	//생성자
	public Store1(String storeName) {
		this.storeName = storeName;
	}
	//메소드
	@Override
	public void kimchi() {System.out.println("김치찌개 8,000원");}
	@Override
	public void bude() {System.out.println("부대찌개 8,000원");}
	@Override
	public void bibim() {System.out.println("비빔밥 9,000원");}
	@Override
	public void sunde() {System.out.println("순대국 안 팔아");}
	@Override
	public void gongi() {System.out.println("공기밥 1,000원");}
	
	//toString()사용을 위해서 getter 사용 x
	@Override
	public String toString() {
		return "☆" + storeName + "☆";
	}
	
}
