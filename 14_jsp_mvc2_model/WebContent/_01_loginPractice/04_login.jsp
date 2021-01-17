<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html >
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>
	<h2>로그인</h2>
	<form align="center" action="_05_LoginAction2" method="post">
		<label>아이디</label><input type="text" id="id" name="id" autofocus><br>
		<label>패스워드</label><input type="password" id="pw" name="pw"><br>
		<input type="submit" value="로그인">
		<input type="reset" value="다시쓰기">
	</form>
</body>
</html>