<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${isUpdate eq true }">
		<script>
			alert('수정완료');
			location.href='_04_bList2';
		</script>
	</c:if>
	<c:if test="${isUpdate eq false }">
		<script>
			alert('패스워드가 일치하지 않습니다');
			history.go(-1);
		</script>
	</c:if>
</body>
</html>