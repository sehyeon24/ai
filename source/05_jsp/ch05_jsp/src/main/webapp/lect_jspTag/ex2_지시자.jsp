<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <%String conPath = request.getContextPath();%> //지시자의 include 오류 때문에 지워야 함 --%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<%-- <link href="<%=conPath %>/css/ex.css" rel="stylesheet" type="text/css"> //지시자의 include 오류 때문에 지워야 함 --%>
</head>
<body>
	<%-- 지시자(<%@ ~ %>) : page, include, taglib(9장에서) --%>
	<%
		int[] arr = {1, 2, 3};
		out.print(Arrays.toString(arr));
	%>
	<hr>
	<%-- JSP 표준 액션 태그에서의 include : jsp를 실행한 결과 html을 include // jsp:(jsp파일에서만 사용 가능한 표준태그) --%>
	<jsp:include page="../main/footer.jsp"/>
	<%-- <jsp:include page="../main/footer.jsp"></jsp:include> --%>
	<hr>
	
	<%-- 지시자의 include : jsp를 include --%>
	<%@ include file="../main/footer.jsp" %>
	<hr>
	다시 ex2_지시자로 이동 - 끝 -
</body>
</html>