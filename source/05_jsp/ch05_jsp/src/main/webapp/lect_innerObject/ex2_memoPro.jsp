<%@page import="java.sql.Timestamp"%>	<%-- Timestamp -> java.sql --%>
<%@page import="java.sql.Date"%>		<%-- Date -> java.sql --%>
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
<body>
	<!-- request 객체 -->
	<% // writer, memo파라미터 받고, ip주소, 날짜까지 생성
		String writer = request.getParameter("writer");
		String memo	  = request.getParameter("memo");
		String ip     = request.getRemoteAddr();	// 요청한 클라이언트의 ip주소
		Date date	  = new Date(System.currentTimeMillis());	// 요청한 날짜(현재기준)
		Timestamp now = new Timestamp(System.currentTimeMillis());	// 요청한 날짜와 시간
	%>
	<h3>글쓴이 : <%=writer %></h3>
	<h3>한줄메모 : <%=memo %></h3>
	<h3>글쓴이 ip : <%=ip %></h3>
	<h3>글쓴날짜 : <%=date %></h3>
	<h3>글쓴시점 : <%=now %></h3>
</body>
</html>