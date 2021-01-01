<%@page import="java.util.Random"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		
		String strDate= sdf.format(now);
	
	
	%>
	<%= strDate%>
	<hr>
	
	<%
		Random ran= new Random();
		String[] languages ={"jsp","java","html5","css3","javascript"};
		int r = ran.nextInt(5);
	
	
	%>
	<%=languages[r] %>가 재미있다.

</body>
</html>