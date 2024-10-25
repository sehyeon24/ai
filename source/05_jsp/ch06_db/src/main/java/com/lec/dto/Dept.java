package com.lec.dto;
// dto
public class Dept {
	private int deptno;
	private String dname;
	
	public Dept() {	}	// 매개변수 없는 생성자함수
	
	public Dept(int deptno, String dname) {	// 매개변수 있는 생성자함수
		this.deptno = deptno;
		this.dname = dname;
	}
	
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}

	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", dname=" + dname + "]";
	}
	
	
}
