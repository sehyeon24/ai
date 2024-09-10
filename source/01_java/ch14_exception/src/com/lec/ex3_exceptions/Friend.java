package com.lec.ex3_exceptions;
// 데이터 : 이름, 전화번호, 생년월일(Date)
// Friend f = new Friend("홍길동", "010-9999-9999", new Date(98, 8, 10): 9월 생이면 8로 입력) // 모르면 감추기
// sysout(f) => [이름]홍길* [전화]***-****-9999 [생일]9월10일 ♬ 생일축하 ♬ : 처럼 출력

import java.text.SimpleDateFormat;
import java.util.Date;

public class Friend {
	private String name;
	private String tel;
	private Date birthday;
	// Source-~Using filed
	public Friend(String name) {								// 이름만 알 때
		this.name = name;
	}

	public Friend(String name, String tel) {					// 이름, 전화번호만 알 때
		this.name = name;
		this.tel = tel;
	}

	public Friend(String name, String tel, Date birthday) {		// 이름, 전화번호, 생일 다 알때
		super();
		this.name = name;
		this.tel = tel;
		this.birthday = birthday;
	}

	@Override
	public String toString() {	// [이름]홍길* [전화]***-****-9999 [생일]9월10일 ♬ 생일축하 ♬
		String result = "";
		
		// 이름
		String nameOut = name.substring(0, name.length()-1) + "*";	// 0번째 부터 2번째 앞까지
		result += "[이름]" + nameOut;
		
		// 전화
		if(tel != null) {		// tel이 null이 아닐 때만
			String telOut = tel.substring(tel.lastIndexOf("-")+1);
			result += " [전화]***-****-" + telOut;
		}
		
		// 생일
		if(birthday != null) {
			SimpleDateFormat sdf = new SimpleDateFormat("M월 d일");
			String birthOut = sdf.format(birthday);
			result += " [생일]" + birthOut;
			
			// 오늘이 생일인지 아닌지
			String today = sdf.format(new Date());	// "9월 10일" : 스트링 형태로 들어감
			if(today.equals(birthOut)) {			// 스트링과 스트링 비교시 equals()사용
				result += " ♬ 생일축하 ♬";
			}
		}
		
		return result;
//		return "Friend [name=" + name + ", tel=" + tel + ", birthday=" + birthday + "]";
		
		
	}
	
	
	
	
	
}
