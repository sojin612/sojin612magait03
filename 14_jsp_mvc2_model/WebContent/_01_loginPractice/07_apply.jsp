<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자바 개발자 지원서</title>
</head>
<body>
<c:choose>
	<c:when test="${sessionScope.memId ne null }">
		<form align="center" action="_08_ApplyAction2" method="post">
			이름<input type="text" id="name" name="name" value="${mdto.name }"><br>
			연락처<input type="tel" id="tel" name="tel" value="${mdto.tel }"><br>
			이메일<input type="email" id="email" name="email" value="${mdto.email }"><br>
			<p>지원분야</p>
			<input type="radio" id="field" name="field" value="publisher">웹퍼블리셔<br>
			<input type="radio" id="field" name="field" value="frontend">프론트앤드<br>
			<input type="radio" id="field" name="field" value="backend">백앤드<br>
			<p>기술</p>
			<input type="checkbox" id="skill" name="skill" value="html">html<br>
			<input type="checkbox" id="skill" name="skill" value="css">css<br>
			<input type="checkbox" id="skill" name="skill" value="javascript">javascript<br>
			<P>전공</P>
			<select id="major" name="major">
				<option value="computer">컴퓨터공학</option>
				<option value="english">영어</option>
				<option value="music">음악</option>
			</select>
			<br><br>
			<input type="submit" value="지원하기">
			<input type="reset" value="다시쓰기">
		</form>
	</c:when>
	<c:otherwise>
		<script>
			alert('입사지원은 로그인후 이용가능합니다');
			location.href='_01_Index2';
		</script>
	</c:otherwise>
</c:choose>
</body>
</html>