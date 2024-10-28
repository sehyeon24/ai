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
		String name = request.getParameter("name");
		// String pets = request.getParameter("pets");	// 최초의 한 개만 받음
		String[] pets = request.getParameterValues("pets");	// 배열로 받음
		if(pets == null) {
			
		}
	%>
	<h3>이름 ${param.name }</h3>
	<%-- <h3>키우는 동물 ${param.pets }</h3> 최초의 한 개만 받음--%>
	<h3>
		키우는 동물
		${paramValues.pets[0] } <!-- 배열로 받음. 0방에 동물이 선택되면 출력되고 안 되면 null로 빈 스트링으로 출력됨 -->
		${paramValues.pets[1] }
		${paramValues.pets[2] }
		${paramValues.pets[3] }
		${empty paramValues.pets ? "없습니다" : "" }
	</h3>
</body>
</html>