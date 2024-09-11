package com.lec.ex2_map;
// 전화번호 : String
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import com.lec.ex1_list.Friend;

public class Ex02_FriendHashMap {
	public static void main(String[] args) {
		Friend[] farr = new Friend[5];
		ArrayList<Friend> fs = new ArrayList<Friend>();
		
		HashMap<String, Friend> friends = new HashMap<String, Friend>();	// Friend : import 해야 함
		Friend newFirend = new Friend("김길동", "010-8888-9999");		// 아래랑 같이 방식 1
		friends.put(newFirend.getTel(), newFirend);
		friends.put("010-9999-9999", new Friend("홍길동", "010-9999-9999"));	// 방식 2
		friends.put("010-7777-7777", new Friend("신길동", "010-7777-7777"));
		Iterator<String> iterator = friends.keySet().iterator();		// 반복자 : key값을 가져오므로 key변수 이름 입력
		while(iterator.hasNext()) {
			String key = iterator.next();
			System.out.println(friends.get(key).getName() + "\t" + friends.get(key).getTel());	// toString 출력
		}
		// 위 while문이 한 바퀴 돌고 다시 돌게 하려면 iterator를 다시 써줘야 함
		// ArrayList는 for문 두 번 돌리면 됨
		iterator = friends.keySet().iterator();		// 반복자 : key값을 가져오므로 key변수 이름 입력
		while(iterator.hasNext()) {
			String key = iterator.next();
			System.out.println(friends.get(key));
		}
	}
}
