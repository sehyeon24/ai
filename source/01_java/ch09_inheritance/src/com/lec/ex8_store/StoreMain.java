package com.lec.ex8_store;

public class StoreMain {
	public static void main(String[] args) {
		HeadQuarterStore[] stores = {					//배열과 할당을 동시에
				new HeadQuarterStore("= = 본사 = ="),
				new Store1("= = 주택가 1호점 = ="),
				new Store2("= = 대학가 2호점 = ="),
				new Store3("= = 증권가 3호점 = =")
		};
// 방법=	HeadQuarterStore head = new HeadQuarterStore("= = 본사 = =");
//		Store1 st1 = new Store1("= = 주택가 1호점 = =");
//		Store2 st2 = new Store2("= = 대학가 2호점 = =");
//		Store3 st3 = new Store3("= = 증권가 3호점 = =");
//		HeadQuarterStore[] stores = {head, st1, st2, st3};	// 배열
		
		for(int idx=0 ; idx<stores.length ; idx++) {	//일반for문
			System.out.println(stores[idx].getStoreName());
			System.out.println(stores[idx].toString());
			stores[idx].kimchi();
			stores[idx].bude();
			stores[idx].bibim();
			stores[idx].sunde();
			stores[idx].gongi();
		}
		
		for(HeadQuarterStore store : stores) {			 //확장for문
			System.out.println(store);
			store.kimchi();
			store.bude();
			store.bibim();
			store.sunde();
			store.gongi();
		}
		
		
		
		
	}
}
