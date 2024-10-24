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
	<!-- 성인인증 예제(19세 이상, 미만으로 구분하여 다른 페이지로 전송 -->
	<!-- ../ex3_agePro, /ch05_jsp/ex3_agePro -->
	<form action="<%=conPath %>/ex3_agePro" method="post">
		나이 <input type="text" name="age" min="0" required="required">
		<input type="submit" value="인증">
	</form>
</body>
</html>