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
	
	boolean isUpdate=MemberDAO2.getInstance().updateMember(new MemberDTO2(id,passwd,name));
	
	if(isUpdate){
		%>
		<script>
			alert("회원정보수정완료");
			location.href="00_main.jsp";
		</script>
		<% 
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