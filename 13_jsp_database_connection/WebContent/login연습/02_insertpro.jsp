<%@page import="login.MemberDTO2"%>
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
	String name= request.getParameter("name");
	
	boolean isFirstMember=MemberDAO2.getInstance().insertMember(new MemberDTO2(id,passwd,name));
	
	if(isFirstMember){
		%>
		<script>
			alert("회원가입완료");
			location.href="00_main.jsp";
		</script>
		<% 
	}
	else{
		%>
		<script>
			alert("이미 있는 아이디입니다");
			history.go(-1);
		</script>
		<% 
	}




%>
</body>
</html>