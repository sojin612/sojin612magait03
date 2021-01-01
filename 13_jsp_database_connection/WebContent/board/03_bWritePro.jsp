<%@page import="board.BoardDAO2"%>
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
	request.setCharacterEncoding("utf-8");
%>
	<jsp:useBean id="BoardDTO2" class="board.BoardDTO2">
		<jsp:setProperty name="BoardDTO2" property="*"/>
	</jsp:useBean>
	<%
		BoardDAO2.getInstance().insertBoard(BoardDTO2);
	%>
	<script>
		alert("등록완료");
		location.href="04_bList.jsp";
	</script>
</body>
</html>