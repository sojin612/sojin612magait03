<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="_09_bDeleteAction2" method="post">
		<table>
			<tr>
				<td>글번호</td>
				<td>${bdto.num }</td>
			</tr>
			<tr>
				<td>제목</td>
				<td>${bdto.subject }</td>
			</tr>
			<tr>
				<td>이메일</td>
				<td>${bdto.email }</td>
			</tr>
			<tr>
				<td>글내용</td>
				<td>${bdto.content }</td>
			</tr>
			<tr>
				<td>작성일</td>
				<td>${bdto.regDate }</td>
			</tr>
			<tr>
				<td>조회수</td>
				<td>${bdto.readCount }</td>
			</tr>
			<tr>
				<td>패스워드</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td><input type="submit" value="삭제하기"></td>
			</tr>
		</table>
	</form>
</body>
</html>