<%@page import="login.MemberDAO2"%>
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
	request.setCharacterEncoding("utf-8");
	String id= request.getParameter("id");
	String passwd= request.getParameter("passwd");
	
	boolean isLogin=MemberDAO2.getInstance().memberCheck(id,passwd);
	if(isLogin){
		session.setAttribute("id", id);
		session.setMaxInactiveInterval(60*10);
		response.sendRedirect("00_main.jsp");
	}
	else{
		%>
		<script>
			alert("아이디와 비밀번호를 확인해주세요");
			history.go(-1);
		</script>
		<% 
	}



%>
</body>
</html>