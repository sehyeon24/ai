package com.lec.dao;

import java.io.IOException;
import java.util.ArrayList;

import com.lec.dto.Emp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/empDaoTest")	// 프로젝트 내에서 유일해야 하는 url
public class EmpRepositoryTest extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
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