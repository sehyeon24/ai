<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		// http://localhost:8090/ch02_semiJSP/ex4_gugudanOut.jsp?su=2 를 전달받음
		// String suStr = request.getParameter("su");	// su파라미터값(string) 받는 함수
		// int su = 0;
		// if(suStr != null && !suStr.trim().equals("")){
		//	su = Integer.parseInt(suStr);	// String("2")을 int형(2)으로 변환			
		// }
		int su = Integer.parseInt(request.getParameter("su"));
	%>
		<h2><%=su %>단 구구단</h2>
		<%for(int i = 1; i <= 9; i++){%>
			<p><%=su %> * <%=i %> = <%=su*i %></p>
		<%}%>
</body>
</html>