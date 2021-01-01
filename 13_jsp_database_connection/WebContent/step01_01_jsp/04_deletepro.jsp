<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
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
	
	String id= request.getParameter("id");
	String passwd= request.getParameter("passwd");
	
	Connection conn = null;
	
	PreparedStatement pstmt=null;
	ResultSet rs= null;
	
	try{
		String jdbcUrl="jdbc:mysql://localhost:3306/login_ex?serverTimezone=UTC";
		String dbId ="root";
		String dbPass="1234";
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection(jdbcUrl, dbId, dbPass);
		
		String sql="select id,passwd from member where id=?";
		
		pstmt= conn.prepareStatement(sql);
		pstmt.setString(1,id);
		
		rs=pstmt.executeQuery();
		
		if(rs.next()) {//rs.next()반환된 결과물이 있으면
			String returnId=rs.getString("id");
			String returnPasswd=rs.getString("passwd");
			
			//파라메타로 넘어온 id와 db에 있는 id비교
			//파라메타로 넘어온 pw와 db에 있는 pw비료
			if(id.equals(returnId)&&passwd.equals(returnPasswd)){//아이디와 비밀번호가 일치한 경우
				sql ="delete from member where id=?";
				pstmt= conn.prepareStatement(sql);
				pstmt.setString(1,id);
				pstmt.executeUpdate();
			}
			else{
				//아이디와 비밀번호가 틀린경우
			}
		}
		else{
			//id가 없는 경우
		}
		
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		pstmt.close();
		conn.close();
	}

%>




</body>
</html>