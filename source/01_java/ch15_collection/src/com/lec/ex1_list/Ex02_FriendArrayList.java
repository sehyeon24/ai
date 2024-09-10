package com.lec.ex1_list;

import java.util.ArrayList;

public class Ex02_FriendArrayList {
	public static void main(String[] args) {
		// 배열 사용
//		Friend[] fs = new Friend[2];	// 0방, 1방
//		fs[0] = new Friend("홍길동", "010-7894-7894");
//		fs[1] = new Friend("신길동", "010-8888-8888");
		
		//arrayList 사용(import해야 함)
		ArrayList<Friend> friends = new ArrayList<Friend>();
		friends.add(new Friend("홍길동", "010-7894-7894"));	// 0 인덱스
		friends.add(new Friend("신길동", "010-8888-8888"));	// 1 인덱스
		friends.add(new Friend("박길동", "010-4564-4564"));	// 2 인덱스
		
		for(int i=0 ; i<friends.size() ; i++) {		// 일반for문
			System.out.println(friends.get(i));
		}	// for
		
		System.out.println();
		
		for(Friend friend : friends) {				// 확장for문
			System.out.println(friend);
		}	// for
		
		System.out.println();
		
		for(Friend friend : friends) {
			System.out.println(friend.getName() + "\t" + friend.getTel());
		}	// for
		friends.clear(); 	// firends 모든 인덱스 데이터 제거
		System.out.println();
		
		if(friends.isEmpty()) {
			System.out.println("friends 데이터가 없습니다");
		}else {
			for(int idx=0 ; idx<friends.size() ; idx++) {
				System.out.println(friends.get(idx).getName() + "\t" + friends.get(idx).getTel());
			}	// for
		}	// if
	}
}
