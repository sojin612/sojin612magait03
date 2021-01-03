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
boolean isUpdate =BoardDAO2.getInstance().updateBoard(BoardDTO2);
if(isUpdate){
%>
<script>
alert("글수정완료");
location.href="04_bList.jsp";
</script>
<%
}
else{
%>
<script>
alert("패스워드가 일치하지 않습니다");
history.go(-1);
</script>
<%
}
%>
</body>
</html>