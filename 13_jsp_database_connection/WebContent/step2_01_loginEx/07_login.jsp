<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
</head>
<body>
	<h2>login</h2>
	<form action="08_loginpro.jsp" method="post">
		<fieldset>
			<p><label for="id">id</label><input type="text" id="id" name="id"></p>
			<p><label for="passwd">password</label><input type="password" id="passwd" name="passwd"></p>
			<p><input type="submit" value="login"></p>
		</fieldset>
	</form>
</body>
</html>