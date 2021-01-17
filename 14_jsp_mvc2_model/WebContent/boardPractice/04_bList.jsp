<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.Vector"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>게시글보기</h1>
	<table boarder="1">
		<tr>
			<th>번호</th>
			<th>작성자</th>
			<th>제목</th>
			<th>작성일</th>
			<th>조회수</th>
		</tr>
		<c:forEach var="board" items="${boardList }">
			<c:set var="idx" value="${idx+1 }"/>
				<tr>
					<td><c:out value="${idx }"></c:out></td>
					<td>${boardList.writer }</td>
					<td><a href="_05_bInfo2?num=${boardList.num }">${boardList.subject }</a></td>
					<td>${boardList.regDate }</td>
					<td>${boardList.readCount }</td>
				</tr>
		</c:forEach>
		<tr>
			<td><input type="button" value="글쓰기" onclick="location.href='_02_bWrite2'"></td>
		</tr>
	</table>
</body>
</html>