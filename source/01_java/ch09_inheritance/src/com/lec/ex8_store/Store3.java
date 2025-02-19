package com.lec.ex8_store;
// 김치찌개-9,000(v)  부대찌개-10,000(v)  비빔밥-10,000(v) 얼큰순대국-9,000(v)  공기밥-1,000원
public class Store3 extends HeadQuarterStore {

	public Store3(String storeName) {
		super(storeName);
	}
	
	@Override
	public void kimchi() {
		System.out.println("김치찌개 : 9,000원");
	}
	@Override
	public void bude() {
		System.out.println("부대찌개 : 10,000원");
	}
	@Override
	public void bibim() {
		System.out.println("비빔밥 : 10,000원");
	}
	@Override
	public void sunde() {
		System.out.println("얼큰순대국 : 9,000원");
	}
	
	@Override
	public String toString() {
		return "☆" + getStoreName() + "☆";
	}
}
