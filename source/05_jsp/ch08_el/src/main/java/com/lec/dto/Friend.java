package com.lec.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor	// 매개변수 없는 생성자함수
@AllArgsConstructor	// 매개변수 있는 생성자함수
@Data				// getter&setter, toString()
public class Friend {
	private int no;
	private String name;
	private String tel;
}
