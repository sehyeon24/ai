<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% String conPath = request.getContextPath(); %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<link href="<%=conPath %>/css/ex.css" rel="stylesheet">
</head>
<body>
	<h2>표현식 태그</h2>
	<p>산술연산 <%=10+1 %></p>
	<p>산술연산 <%=10/0.0 %></p> <!-- 0으로 나누면 에러. 0.0으로 나누면 0에 가까운 수로 나눔 -->
	<p>관계연산 1 == 2 ? <%=1 == 2 %></p>
	<p>관계연산 1 != 2 ? <%=1 != 2 %></p>
	<p>조건연산 : <%=(1 > 2) ? "1이 더 큽니다" : "2가 더 큽니다" %></p>
	<p>name 파라미터 값 : <%=request.getParameter("name") %></p> <!-- null -->
	<p>name 파라미터 여부 : <%=request.getParameter("name") == null ? "안 받음" : "받음" %></p>
	<%-- <p>name 파라미터 대문자로 : <%=request.getParameter("name").toUpperCase() %></p> --%>
	
	<hr>
	
	<h2>el 표기법(표현식 안에 쓸 수 있는 연산자는 전부 사용 가능)</h2>
	<p>산술연산 ${10+1 }</p>
	<p>산술연산 ${10/0 }</p>	<!-- 0으로 나누면 0에 가까운 수로 나눔 -->
	<p>관계연산 1 == 2 ? ${1 eq 2 }</p>
	<p>관계연산 1 != 2 ? ${1 != 2 } 또는 ${not(1 eq 2) }</p>
	<p>조건연산자는 그대로 : ${(1 > 2) ? "1이 더 큽니다" : "2가 더 큽니다" }</p>
	<p>name 파라미터 값 : ${param.name }</p>	<!-- null이면 보이지 않음 -->
	<p>name 파라미터 여부 : ${empty param.name ? "안 받음" : "받음"}</p>
	<p>name 파라미터 대문자로 : ${param.name.toUpperCase() }</p> <!-- 파라미터가 있으면 실행. 없으면 null값이므로 빈 스트링 -->
	
	
</body>
</html>