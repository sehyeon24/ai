<%@page import="java.sql.Date"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%String conPath = request.getContextPath();%>   
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<link href="<%=conPath %>/css/ex.css" rel="stylesheet" type="text/css">
</head>
<%!	// 선언부
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url    = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	String uid    = "scott";
	String upw    = "tiger";	
%>
<body>
	<table>
	<%
	Connection 		   conn  = null;
	PreparedStatement  pstmt = null;	// SQL문에 ? 사용시
	ResultSet  		   rs	 = null;
	String	   		   sql   = "SELECT E.*, DNAME " + 
									"FROM EMP E, DEPT D " + 
									"WHERE E.DEPTNO LIKE '%'||? AND E.DEPTNO = D.DEPTNO";		
	String deptno = request.getParameter("deptno");	// 채워야 할 ? 물음표
	try {
		Class.forName(driver);
		conn  = DriverManager.getConnection(url, uid, upw);
		pstmt = conn.prepareStatement(sql);
		// stmt = conn.createStatement();
		pstmt.setString(1, deptno);	// 첫 번째 물음표에 deptno를 넣음
		rs = pstmt.executeQuery();
		// rs = stmt.executeQuery(sql);
		out.print("<tr><th>사번</th><th>이름</th><th>직책</th><th>상사사번</th>");
		out.print("	   <th>입사일</th><th>급여</th><th>상여</th><th>부서번호</th></tr>");
		if(rs.next()) {	// 해당 부서번호의 직원이 있는 경우
			do {
				// rs 내용 출력
				int	      empno    = rs.getInt("empno");
				String    ename    = rs.getString("ename");
				String    job 	   = rs.getString("job");
				String    mgr 	   = rs.getString("mgr");	// String:DB에 null값은 null로 받음. int:null값을 0으로 받음
				Date   	  hiredate = rs.getDate("hiredate");	// 날짜만 받음(시간은 받지 않음)
				int		  sal	   = rs.getInt("sal");
				int		  comm     = rs.getInt("comm");
				int		  dno	   = rs.getInt("deptno");
				out.print("<tr><td>" + empno + "</td>");
				out.print("	   <td>" + ename + "</td>");
				out.print("	   <td>" + job + "</td>");
				out.print("	   <td>" + (mgr == null ? "CEO" : mgr) + "</td>");
				out.print("	   <td>" + hiredate + "</td>");
				out.print("	   <td>" + sal + "</td>");
				out.print("	   <td>" + comm + "</td>");
				out.print("	   <td>" + dno + "</td></tr>");
			}while(rs.next());
		}else {	// 해당 부서번호의 직원이 없는 경우
			out.print("<tr><td colspan='8'>해당부서의 사원이 없습니다</td></tr>");	// colspan:가로병합
		}
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}finally {
		
	}
	%>
	</table>
</body>
</html>


















