package com.lec.quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerArrayListMain_Me {
	public static void main(String[] args) {
		ArrayList<Customer> customers = new ArrayList<Customer>();
		Scanner scanner = new Scanner(System.in);
		customers.add(new Customer("홍길동", "010-9999-9999", "서울시 관악구 신림동"));
		customers.add(new Customer("김마동", "010-8888-8888", "서울시 구로구 구로동"));
		
		System.out.println("이름을 입력하세요.");
		String searchName = scanner.next();
			System.out.println("전화번호를 입력하세요.");
		String searchTel = scanner.next();
			System.out.println("주소를 입력하세요.");
		String searchAddress = scanner.next();
		
		if(customers.isEmpty()) {
			System.out.println("가입한 회원 목록이 없습니다.");
		}else {
			
			}
	}
}