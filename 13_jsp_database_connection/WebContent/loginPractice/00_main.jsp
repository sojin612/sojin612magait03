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
	String id=(String)session.getAttribute("id");
	if(id==null){
%>
	<h1>join!</h1>
	<p><a href="01_insert.jsp">회원가입</a></p>
	<p><a href="07_login.jsp">로그인</a></p>
<%
	}
	else{
%>	
	<h1>welcome!<%=id %></h1>
	<p><a href="03_update.jsp">회원정보수정</a></p>
	<p><a href="05_delete.jsp">회원탈퇴</a></p>
	<p><a href="09_logout.jsp">로그아웃</a></p>
	
<%
	}
%>	
	
</body>
</html>