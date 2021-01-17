<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
	<c:if test="${isJoin eq true}">
		<script>
			alert('회원가입을 축하합니다!');
			location.href='index.do';
		</script>
	</c:if>
	<c:if test="${isJoin eq false}">
		<script>
			alert('아이디가 중복됩니다!');
			history.go(-1);
		</script>
	</c:if>
</body>
</html>