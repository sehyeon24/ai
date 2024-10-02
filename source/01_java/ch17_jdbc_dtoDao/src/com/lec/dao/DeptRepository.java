package com.lec.dao;
// 메소드 삽입 > 객체 생성 > 호출
// ctrl + shift + o : 필요한 import 추가나 삭제
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.lec.dto.Dept;

public class DeptRepository {
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	public	final static int SUCCESS = 1;	// 결과가 1이면 SUCCESS
	public	final static int FAIL	 = 0;	// 결과가 0이면 FAIL
	private	static DeptRepository INSTANCE = new DeptRepository();	// INSTANCE(변수), new DeptRepository(객체 생성(싱글톤패턴))
	public 	static DeptRepository getInstance() {
		return INSTANCE;	// DeptRepository 객체의 주소를 return
	}
	private DeptRepository() {	// 매개변수 없는 생성자 함수
		try {					// 생성자함수
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	// SQLDeveloper 함수 만들기
	// -- (1) 부서 정보들 가져오는 함수 : getDeptList // ArrayList
	public ArrayList<Dept> getDeptList() {
		ArrayList<Dept> dtos = new ArrayList<Dept>();
		// SQL수행한 결과를 dtos에 추가하기
		Connection		   conn	 = null;
		PreparedStatement  pstmt = null;
		ResultSet  		   rs	 = null;
		String sql = "SELECT * FROM DEPT";
		try {
			conn  = DriverManager.getConnection(url, "scott", "tiger");
			pstmt = conn.prepareStatement(sql);	// 물음표 없으니 물음표 채우는 소스 X
			rs	  = pstmt.executeQuery();
			while(rs.next()) {	// while문 수행하지 않으면 return으로 떨어짐
				int	   deptno = rs.getInt("deptno");
				String dname  = rs.getString("dname");
				String loc	  = rs.getString("loc");
				dtos.add(new Dept(deptno, dname, loc));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if(rs 	 != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn	 != null) conn.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			} // close()
		} // try-catch-finally
		return dtos;
	}
	// -- (2) deptno로 부서정보 가져오는 함수 : getDept(매개변수 : 10)
	public Dept getDept(int deptno) {		// Dept를 return
		Dept dto = null;	// 초기값(찾지 못함)
		// query 수행 결과를 dto에 할당
		Connection		  conn = null;
		PreparedStatement pstmt = null;
		ResultSet		  rs	= null;
		String sql = "SELECT * FROM DEPT WHERE DEPTNO = ?";
		try {
			conn  = DriverManager.getConnection(url, "scott", "tiger");
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, deptno);	// ?채우기 : setInt는 public Dept getDept(int deptno) {} 에 int이므로 맞춰서
			rs	  = pstmt.executeQuery();
			if(rs.next()) {		// 결과가 한 줄이므로 while대신 if문 사용
				String dname = rs.getString("dname");
				String loc	 = rs.getString("loc");
				dto = new Dept(deptno, dname, loc);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if(rs 	 != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn	 != null) conn.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			} // close()
		} // try-catch-finally
		return dto;
	}
	// -- (3) dname으로 부서정보 가져오는 함수 : getDept(매개변수: "sales")
	public Dept getDept(String dname) {
		Dept dto = null;
		Connection 		  conn 	= null;
		PreparedStatement pstmt = null;
		ResultSet 		  rs 	= null;
		String sql = "SELECT * FROM DEPT WHERE UPPER(DNAME) = UPPER(?)";
		try {
			conn  = DriverManager.getConnection(url, "scott", "tiger");
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dname);
			rs	  = pstmt.executeQuery();
			if(rs.next()) {
				int deptno = rs.getInt("deptno");
				dname = rs.getString("dname");		// 물음표 채우기
				String loc = rs.getString("loc");
				dto = new Dept(deptno, dname, loc);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if(rs 	 != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn	 != null) conn.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			} // close()
		} // try-catch finally
		return dto;
	}
	// -- (4) insertDept(매객변수) // SUCCESS/FAIL
	// --	  insertDept(new Dept(10, "it", "seoul")) // SUCCESS/FAIL
	// --	  insertDept(10, "it", "seoul") 		  // SUCCESS/FAIL
	public int insertDept(int deptno, String dname, String loc) {
		int result = FAIL;	// 초기화
		// insert
		Connection		  conn = null;
		PreparedStatement pstmt = null;	// SELECT문 없으므로 rs 불필요
		String sql = "INSERT INTO DEPT VALUES (?, UPPER(?), UPPER(?))";
		try {
			conn  = DriverManager.getConnection(url, "scott", "tiger");
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, deptno);	// 물음표 채우기
			pstmt.setString(2, dname);
			pstmt.setString(3, loc);
			result = pstmt.executeUpdate();
			System.out.println(result == SUCCESS ? "입력성공" : "입력실패");
		} catch (SQLException e) {
			System.out.println(e.getMessage() + deptno + dname + loc);
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn	 != null) conn.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			} // close()
		} // try-catch finally
		return result;	// insert결과를 result로 출력
	}
	// -- (5) updateDept(매개변수) // SUCCESS/FAIL
	public int updateDept(int deptno, String dname, String loc) {
		int result = FAIL;	
		// insert
		Connection		  conn = null;
		PreparedStatement pstmt = null;	// SELECT문 없으므로 rs 불필요
		String sql = "UPDATE DEPT "
				+ "    SET DNAME = UPPER(?),"
				+ "        LOC   = UPPER(?)"
				+ "    WHERE DEPTNO = ?";
		try {
			conn  = DriverManager.getConnection(url, "scott", "tiger");
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dname);	// 물음표 채우기
			pstmt.setString(2, loc);
			pstmt.setInt(3, deptno);
			result = pstmt.executeUpdate();
			System.out.println(result == SUCCESS ? "수정성공" : "부서번호가 유효하지 않아 수정실패");	// 수정실패 : 0행 업데이트 되었습니다.
		} catch (SQLException e) {
			System.out.println(e.getMessage() + deptno + dname + loc);
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn	 != null) conn.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			} // close()
		} // try-catch finally
		return result;	// insert결과를 result로 출력
	}
	// -- (6) deleteDept(매개변수) // SUCCESS/FAIL
	public int deleteDept(int deptno) {
		int result = FAIL;	
		// insert
		Connection		  conn = null;
		PreparedStatement pstmt = null;	// SELECT문 없으므로 rs 불필요
		String sql = "DELETE FROM DEPT WHERE DEPTNO = ?";
		try {
			conn  = DriverManager.getConnection(url, "scott", "tiger");
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, deptno);	// 물음표 채우기
			result = pstmt.executeUpdate();
			if(result == SUCCESS) {
				System.out.println(deptno + "번 부서 삭제하였습니다.");
			} else {
				System.out.println(deptno + "번 부서번호는 유효하지 않아 삭제불가합니다.");
			}
			// System.out.println(result == SUCCESS ? deptno +  "번 부서 삭제성공" : "부서번호가 유효하지 않아 삭제실패");	// 삭제실패 : 0행 삭제 되었습니다. 위 if문과 동일
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn	 != null) conn.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			} // close()
		} // try-catch finally
		return result;	// insert결과를 result로 출력
	}
}

































