<%@page import="board.BoardDAO2"%>
<%@page import="board.BoardDTO2"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
 int num= Integer.parseInt(request.getParameter("num"));
BoardDTO2 bean=BoardDAO2.getInstance().getOneUpdateBoard(num);
%>
<form method="post" action="09_bDeletePro.jsp">
	<table>
		<tr>
			<td>작성자</td>
			<td><%=bean.getWriter() %></td>
		</tr>
		<tr>
			<td>작성일</td>
			<td><%=bean.getRegDate() %></td>
		</tr>
		<tr>
			<td>글제목</td>
			<td><%=bean.getSubject() %></td>
		</tr>
		<tr>
			<td>패스워드</td>
			<td><input type="password" name="password"></td>
		</tr>
		<tr>
			<td><input type="hidden" name="num" value="<%=bean.getNum() %>"></td>
			<td><input type="submit" value="글삭제"></td>
			<td><input type="button" value="전체글보기" onclick="location.href='04_bList.jsp'"></td>
		</tr>
	</table>
</form>
</body>
</html>