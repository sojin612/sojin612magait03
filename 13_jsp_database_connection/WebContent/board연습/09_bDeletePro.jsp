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
	boolean isDelete=BoardDAO2.getInstance().deleteBoard(BoardDTO2);
//에러메세지:The method deleteBoard(BoardDTO2) in the type BoardDAO2 is not applicable for the arguments (BoardDAO2)
	if(isDelete){
%>
	<script>
		alert("글삭제완료");
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