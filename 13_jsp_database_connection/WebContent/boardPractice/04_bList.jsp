<%@page import="board.BoardDAO2"%>
<%@page import="board.BoardDTO2"%>
<%@page import="java.util.Vector"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h1>게시글 보기</h1>
	<br>

	<table class="table table-hover">
		
		<tr class="table-primary"  align="center">
			<td>번호</td>
			<td>제목</td>
			<td>작성자</td>
			<td>작성일</td>
			<td>조회수</td>
		</tr>
	<%
	Vector<BoardDTO2> vec= BoardDAO2.getInstance().getAllBoard();
	for(int i=0; i<vec.size(); i++){
		BoardDTO2 bean=vec.get(i);
		%>
		<tr>
			<td><%=i+1 %></td>
			<td><a href="05_bInfo.jsp?num=<%=bean.getNum() %>"><%=bean.getSubject() %></a></td>
			<td><%=bean.getWriter() %></td>
			<td><%=bean.getRegDate() %></td>
			<td><%=bean.getReadCount() %></td>
			
		</tr>
		<% 
	}
	
	%>	
	<tr>
		<td>
			<input type="button" value="글쓰기" onclick="location.href='02_bWrite.jsp'">
		</td>
	</tr>
	<form action="10_search.jsp">
		<tr>
			<td>
				<select name="search">
					<option value="allsearch" name="allsearch">전체검색</option>
					<option value="writer" name="writer">작성자</option>
					<option value="subject" name="subject">제목</option>
				</select>
			</td>
			<td>
				<input type="text" name="text">
			</td>
			<td>
				<input type="submit" value="검색">
			</td>
		</tr>
	</form>
	</table>
</body>
</html>