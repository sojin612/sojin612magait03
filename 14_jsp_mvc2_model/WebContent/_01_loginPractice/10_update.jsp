<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보수정</title>
</head>
<body>
	<c:choose>
		<c:when test="${isFirstApply eq true }">
			<script>
				alert('아직 입사지원을 하지 않았습니다');
				history.go(-1);
			</script>
		</c:when>
		<c:otherwise>
			<form align="center" action="_11_UpdateAction2" method="post">
				아이디<input type="text" id="id" name="id" value="${mdto.id }"><br>
				패스워드<input type="password" id="pw" name="pw" value="${mdto.pw }"><br>
				이름<input type="text" id="name" name="name" value="${mdto.name }"><br>
				전화번호<input type="tel" id="tel" name="tel" value="${mdto.tel }"><br>
				이메일<input type="email" id="email" name="email" value="${mdto.email }"><br>
				<p>지원분야</p>
				<input type="radio" id="field" name="field" value="publisher"
					<c:if test="${mdto.field eq 'publisher' }">checked</c:if>>웹 퍼블리싱
				<input type="radio" id="field" name="field" value="frontend"
					<c:if test="${mdto.field eq 'frontend' }">checked</c:if>>프론트앤드
				<input type="radio" id="field" name="field" value="backend"
					<c:if test="${mdto.field eq 'backend' }">checked</c:if>>백앤드
				<p>기술</p>
				<input type="checkbox" id="skill" name="skill" value="html"
					<c:if test="${html eq true }">checked</c:if>>HTML
				<input type="checkbox" id="skill" name="skill" value="css"
					<c:if test="${css eq true }">checked</c:if>>CSS
				<input type="checkbox" id="skill" name="skill" value="javascript"
					<c:if test="${javascript eq true }">checked</c:if>>JAVASCRIPT
				<p>전공</p>
				<select id="major" name="major">
					<option value="computer"<c:if test="${mdto.major eq 'computer' }">selected</c:if>>컴퓨터공학</option>
					<option value="english"<c:if test="${mdto.major eq 'english' }">selected</c:if>>영어</option>
					<option value="music"<c:if test="${mdto.major eq 'music' }">selected</c:if>>음악</option>
				</select>
				<br><br>				
				<input type="submit" value="수정"	>
				<input type="reset" value="다시쓰기">		
			</form>
		</c:otherwise>
	</c:choose>
</body>
</html>