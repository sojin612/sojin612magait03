<%@page import="java.util.Vector"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>04_bList</title>
</head>
<body>
	<div align="center" style="padding-top: 100px">
		<h1>게시글 보기</h1>
		<br>
		<table border="1">
			<colgroup>
				<col width="10%">
				<col width="40%">
				<col width="20%">
				<col width="20%">
				<col width="10%">
			</colgroup>
			<tr align="center">
				<td>번호</td>
				<td>제목</td>
				<td>작성자</td>
				<td>작성일</td>
				<td>조회수</td>
			</tr>
			<c:forEach var="board" items="${boardList}"> 
				<c:set var="idx" value="${idx+1 }" />  <!-- idx가 필요한 이유 만약 삭제되는 글이 있을경우 1,3,4,순으로 나오기때문에 idx가 필요함 idx는 자바문법이기 때문에 el를 씀 -->
				<tr align="center">
					<td><c:out value="${idx}"/></td>
					<td><a href="boardInfo.do?num=${board.num}">${board.subject}</a></td>
					<td>${board.writer}</td>
					<td>${board.regDate}</td>
					<td>${board.readCount}</td>
				</tr>
			</c:forEach>
			<tr align="right">
				<td colspan="5">
					<input type="button" style="float: right" value="글쓰기" onclick="location.href='boardWrite.do'">
				</td>
			</tr>
		</table>
	</div>					
</html>