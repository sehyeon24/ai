package com.lec.dto;
// new Dept(10, "acc", "new~") 
public class Dept {
	private	int		deptno;		// 데이터
	private String	dname;
	private String	loc;
	public Dept(int deptno, String dname, String loc) {	// 생성자함수 우클릭>Source>Generate Constructor using Fields
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}
	@Override
	public String toString() {	// 우클릭>Source>Generate toString()
		return deptno + "\t" + dname + "\t" + loc;
	}
	public int getDeptno() {	// 우클릭>Source>Generate Getters and Setters
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
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
}
