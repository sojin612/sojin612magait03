<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="_07_bUpdateAction2">
		<table border="1">
			<tr>
				<td>글번호</td>
				<td>${bdto.num }</td>
			</tr>
			<tr>
				<td>제목</td>
				<td><input type="text" name="subject" value="${bdto.subject }"></td>
			</tr>
			<tr>
				<td>이메일</td>
				<td>${bdto.email }</td>
			</tr>
			<tr>
				<td>패스워드</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td>글내용</td>
				<td><textarea row="200" cols="200" name="content">${bdto.content }</textarea></td>
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
				<td>
					<input type="submit" value="수정하기">
					<input type="reset" value="다시쓰기">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>