<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>
	<c:choose>
		<c:when test="${ isLogin eq true }"> <!-- el코드를 써서 get을 안써도 됨 -->
			<script>
				alert("${sessionScope.memId}님, 환영합니다!");
				location.href='index.do';
			</script>
		</c:when>
		<c:otherwise>
			<script>
				alert('아이디와 패스워드를 확인해주세요!');
				history.go(-1);
			</script>
		</c:otherwise>
	</c:choose>
</body>
</html>