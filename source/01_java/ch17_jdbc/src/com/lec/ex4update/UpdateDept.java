package com.lec.ex4update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

// 수정할 부서번호, 부서명, 부서위치를 받아 update
public class UpdateDept {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Scanner scanner = new Scanner(System.in);
		Connection conn = null;
		Statement  stmt = null;
		System.out.println("수정할 부서번호는 > ");
		int deptno = scanner.nextInt();
		// 부서번호 존재 여부 confirm 필요
		System.out.println("수정할 부서이름은 > ");
		int dname = scanner.nextInt();
		System.out.println("수정할 부서위치는 > ");
		int loc = scanner.nextInt();
		String sql = String.format("UPDATE DEPT "
				+ "    SET DNAME = UPPER('%s'),"
				+ "        LOC 	 = UPPER('%s')"
				+ "    WHERE DEPTNO = %d", dname, loc, deptno);
		try {
			conn = DriverManager.getConnection(url, "scott", "tiger");
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);
			System.out.println(result > 0 ? "수정성공" : "해당부서가 없어서 수정 불가");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			try {							// 7. 연결해제
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} // try-catch-finally

	} // main
} // class








