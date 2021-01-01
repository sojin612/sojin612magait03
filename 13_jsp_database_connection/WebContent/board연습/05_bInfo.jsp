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
	int num=Integer.parseInt(request.getParameter("num"));
	BoardDTO2 bean=BoardDAO2.getInstance().getOneBoard(num);
%>
<h1>게시글 보기</h1>
	<br>

	<table class="table table-hover">
		
		<tr class="table-primary"  align="center">
			<td>번호</td>
			<td><%=bean.getNum() %></td>
			<td>작성자</td>
			<td><%=bean.getWriter() %></td>
			<td>작성일</td>
			<td><%=bean.getRegDate() %></td>
			<td>이메일</td>
			<td><%=bean.getEmail() %></td>
			<td>제목</td>
			<td><%=bean.getSubject() %></td>
			<td>글내용</td>
			<td><%=bean.getContent() %></td>
			<td>조회수</td>
			<td><%=bean.getReadCount() %></td>
		</tr>
		
	<tr>
		<td colspan="2">
			<input type="button" value="수정하기" onclick="location.href='06_bUpdate.jsp?num=<%=bean.getNum()%>'">
			<input type="button" value="삭제하기" onclick="location.href='08_bDelete.jsp?num=<%=bean.getNum()%>'">
			<input type="button" value="목록보기" onclick="location.href='04_bList.jsp'">
		</td>
	</tr>
	</table>
</body>
</html>