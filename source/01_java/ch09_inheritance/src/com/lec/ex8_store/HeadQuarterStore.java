package com.lec.ex8_store;
// 본사 지침 : 김치찌개-8,000  부대찌개-9,000  비빔밥-9,000 순대국-8,000  공기밥-1,000원
// 메소드가 같으니 상속받으면 됨
// main함수에서 >> new HeadQuarterStore("본사") new Store1("1호점") : store이름을 변수로
public class HeadQuarterStore extends Object {	// extends Object : 자체 생략
	// 변수
	private String storeName;					

	public HeadQuarterStore(String storeName) {	// 매개변수 있는 생성자 함수 자동완성, Source->~using filed
//		super();								// 생략 가능
		this.storeName = storeName;
	}
	
	// 메소드
	public void kimchi() {						
		System.out.println("김치찌개 : 8,000원");
	}
	public void bude() {
		System.out.println("부대찌개 : 9,000원");
	}
	public void bibim() {
		System.out.println("비빔밥 : 9,000원");
	}
	public void sunde() {
		System.out.println("순대국 : 8,000원");
	}
	public void gongi() {
		System.out.println("공기밥 : 1,000원");
	}

	public String getStoreName() {				// 변수를 private로 만들었으므로 access 하려면 getter 필요
		return storeName;
	}
	
	@Override	// getStoreName 대신 사용 가능
		public String toString() {
			return "★" + storeName + "★";
		}
	
}
