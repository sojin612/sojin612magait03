<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
	request.setCharacterEncoding("utf-8");
	
	String name=request.getParameter("name");
	String phone=request.getParameter("phone");
	String email=request.getParameter("email");
	String models=request.getParameter("models");
	
	
	String service=request.getParameter("service");
	String ps=request.getParameter("ps");
	String allow=request.getParameter("allow");

%>	

<p><%=name %></p>
<p><%=phone %></p>
<p><%=email %></p>
<p><%=models %></p>
<p><%=service %></p>
<p><%=ps %></p>
<p><%=allow %></p>
<% 
System.out.println("name "+name);
System.out.println("phone "+phone);
System.out.println("email "+email);
System.out.println("models "+models);
System.out.println("service "+service);
System.out.println("ps "+ps);
System.out.println("allow "+allow);
%>

</body>
</html>