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
	

%>
	<h2><%=id %>님 회원탈퇴</h2>
	<form method="post" action="06_deletepro.jsp">
		아이디: <input type="text" id="id" name="id"><br>
		비밀번호: <input type="password" id="passwd" name="passwd"><br>
		<input type="submit" value="입력완료">
		<input type="reset" value="다시쓰기">
	</form>
</body>
</html>