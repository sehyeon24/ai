<%@page import="com.lec.dao.FriendRepository"%>
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
	<%
		// 파라미터 받기
		String name = request.getParameter("name");
		String tel	= request.getParameter("tel");
		
		// 함수(dao) 호출
		FriendRepository dao = FriendRepository.getInstance();
		int result = dao.insertFriend(name, tel);
		
		// 전화번호 중복체크
		if(result == FriendRepository.SUCCESS) {
	%>
			<script>
				alert("친구 추가 성공");
				location.href = "friendInputList.jsp"
			</script>	
	<%}else {%>
			<script>
				alert("친구 추가 실패");
				history.back();	// 이전 페이지로 (방금 입력한 값이 그대로 보여짐)
			</script>	
	<%}%>
</body>
</html>