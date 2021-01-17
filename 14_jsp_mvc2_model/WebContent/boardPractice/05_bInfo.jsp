<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
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
			<td>
			<input type="button" value="수정" onclick="location.href='_06_bUpdate2?num=${bdto.num}'">
			<input type="button" value="삭제" onclick="location.href='_08_bDelete2?num=${bdto.num}'">
			<input type="button" value="전체글목록" onclick="location.href='_04_bList2'">
			</td>
		</tr>
	</table>
</body>
</html>