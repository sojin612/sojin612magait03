<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키 생성</title>
</head>
<body>

	<%
	request.setCharacterEncoding("utf-8");
	
	String id= request.getParameter("id");
	String pwd= request.getParameter("pwd");
	String makeCookie= request.getParameter("makeCookie");
	
	if(makeCookie !=null && makeCookie.equals("y")){
		//1.쿠키생성
		Cookie cookie= new Cookie("id",id);
		
		//2.쿠키 관련 정보 설정(필수는 아님)
		cookie.setMaxAge(60*60*24); //생성된 쿠키에 대한 기간 설정
		cookie.setPath("/"); //생성된 쿠키에 적용가능한 path설정
		
		//3.생성된 쿠키를 클라이언트에게 전송
		response.addCookie(cookie);
	}
	%>
	id:<%=id %><br>
	pwd:<%=pwd %><br>
	<a href="cookieEx01_03.jsp">다음페이지로 이동</a>

</body>
</html>