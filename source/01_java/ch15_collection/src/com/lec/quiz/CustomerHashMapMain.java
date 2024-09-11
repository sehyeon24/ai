package com.lec.quiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class CustomerHashMapMain {
	public static void main(String[] args) {
		HashMap<String, Customer> customers = new HashMap<String, Customer>();
		Scanner scanner = new Scanner(System.in);
		String answer = null, name, tel, address;
		do {	// 밑에 while(true);안 쓰고 do 자리에 while(true)넣어도 같음
			System.out.println("회원가입을 진행하시겠습니까 (Y/N)");
			answer = scanner.next();
			if(answer.equalsIgnoreCase("y")) {	// 대소문자 구분하여 비교 않음
				Customer newCustomer = new Customer();	// 빈 객체 생성
				System.out.println("가입하실 회원님 이름은?");
				newCustomer.setName(scanner.next());
				System.out.println("가입하실 회원님 전화번호는?");
				newCustomer.setTel(scanner.next());
				System.out.println("가입하실 회원님 주소는?");
				scanner.nextLine();	// 버퍼 지우는 용도 : 키보드로 입력한 값들이 저장된 장소
				newCustomer.setAddress(scanner.nextLine());
				customers.put(newCustomer.getTel(), newCustomer);
			}
				
//				System.out.print("가입하실 회원님 이름은?");
//				name = scanner.next();
//				System.out.print("가입하실 회원님 전화번호는 ?");
//				tel = scanner.next();
//				System.out.print("가입하실 회원님 주소는 ?");
//				scanner.nextLine(); // 버퍼지우는 용도
//				address = scanner.nextLine();
//				customers.put(tel, new Customer(name, tel, address));
//			}else if(answer.equalsIgnoreCase("n")){
//				break;
//			}
//		}while(true);		
//		scanner.close();
				
		}while(!answer.equalsIgnoreCase("n"));
		scanner.close();
		// N(n)을 입력할 경우 회원정보 출력
//		if(customers.isEmpty()) {
		if(customers.size()==0) {
			System.out.println("가입한 회원 목록이 없습니다.");
		}else {
			System.out.println("가입한 회원 목록입니다.");
			Iterator<String> iterator = customers.keySet().iterator();
			while(iterator.hasNext()) {
				String key = iterator.next();
				System.out.println(customers.get(key));
		   // = System.out.println(customers.get(key).getTel() + "\t" + customers.get(key).getAddress());
			}//for
		}//if
	}//main
}
