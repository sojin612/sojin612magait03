<%@page import="step2_00_loginEx.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
	
	//로그인 dao가 필요할 듯!!
	boolean isValidMember=MemberDAO.getInstance().memberCheck(id,passwd);
	
	
	if(isValidMember){
		session.setAttribute("id", id);
		session.setMaxInactiveInterval(60*10); //연결상태 유지 10분으로 설정(기본값: 30분)(60초*10)
		response.sendRedirect("00_main.jsp");//sendRedirect("이동경로"):해당경로 페이지로 이동 jsp에서 하는 방법
	
	}
	
	else{
		%>
		<script>
			alert("check your id and password");
			history.go(-1);
		</script>
		<% 
	}


%>
</body>
</html>