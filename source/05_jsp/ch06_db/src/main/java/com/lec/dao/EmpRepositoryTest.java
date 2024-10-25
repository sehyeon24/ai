package com.lec.dao;

import java.util.ArrayList;

import com.lec.dto.Emp;

public class EmpRepositoryTest {
	public static void main(String[] args) {
		EmpRepository empRepository = EmpRepository.getInstance();
		ArrayList<Emp> empList = empRepository.empList();
		System.out.println("empList() 결과 : " + empList.size() + "행");
		// 확장for문
		for(Emp emp : empList) {
			System.out.println(emp);
		}
		
		empList = empRepository.empListByDeptno(null);	// null이어도 빈 스트링("")과 똑같이 수행함
		System.out.println("empListByDeptno(null) 결과 : " + empList.size() + "행");
		if(empList.isEmpty()) {
			System.out.println("해당 부서번호의 사원이 없습니다");
		}else {
			for(Emp emp : empList) {
				System.out.println(emp);
			}
		}
		empList = empRepository.empListByDeptno("40");	// null이어도 빈 스트링("")과 똑같이 수행함
		System.out.println("empListByDeptno(\"40\") 결과 : " + empList.size() + "행");
		if(empList.isEmpty()) {
			System.out.println("해당 부서번호의 사원이 없습니다");
		}else {
			for(Emp emp : empList) {
				System.out.println(emp);
			}
		}
		empList = empRepository.empListBySchName("      ");
		System.out.println("empListBySchName(\"      \") 결과 : " + empList.size() + "행");
		if(empList.size() != 0) {
			for(Emp emp : empList) {
				System.out.println(emp);
			} // for
		}else {
			System.out.println("해당 알파벳이 포함된 사원명이 없습니다");
		}
	}
}