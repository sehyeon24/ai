package com.lec.ex5delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteDept {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Scanner scanner = new Scanner(System.in);
		Connection conn = null;
		Statement  stmt = null;
		System.out.println("삭제할 부서번호는 >");
		int deptno = scanner.nextInt();
		String confirmSql = "DELETE FROM DEPT WHERE DEPTNO = " + deptno;
		try {
			conn = DriverManager.getConnection(url, "scott", "tiger");
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(confirmSql);
			if(result > 0) {
				System.out.println(deptno + "번 부서를 삭제하였습니다.");
			} else {
				System.out.println(deptno + "번 부서는 유효한 부서번호가 아니므로 삭제 불가합니다.");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			} catch (Exception e)	{
				System.out.println(e.getMessage());
			}
		}
				
	}
}
