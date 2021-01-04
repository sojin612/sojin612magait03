<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>forward2</title>
</head>
<body>
	<jsp:forward page="forwardEx02_target.jsp">
		<jsp:param value='<%=URLEncoder.encode("팀버너스리","utf-8") %>' name="sampleData1"/>
		<jsp:param value="timothy john berners lee" name="sampleData2"/>
	</jsp:forward>
	
	<%
	//	String sampleData1=URLEncoder.encode("팀버너스리","utf-8");
	//	String sampleData2= "Timothy John Berners Lee";
		
	//	response.sendRedirect("forwardEx02_target.jsp?sampleData1(변수)=" + sampleData1(값) + "&sampleData2=" + sampleData2);

	%>
</body>
</html>