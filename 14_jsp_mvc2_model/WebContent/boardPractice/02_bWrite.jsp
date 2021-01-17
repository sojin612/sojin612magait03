<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<script>
	function formValidationCheck(){
		var writer= document.f.writer;
		if(writer.value.length==0){
			alert('작성자를 입력하세요');
			writer.focus();
			return false;
		}
		var subject = document.f.subject;
		if (subject.value.length == 0){
			alert("제목을 입력하세요.");
			subject.focus();
			return false;
		}
		
		var password = document.f.password;
		if (password.value.length == 0){
			alert("비밀번호를 입력하세요.");
			password.focus();
			return false;
		}
		
		var email = document.f.email;
		if (email.value.length == 0){
			alert("이메일을 입력하세요.");
			email.focus();
			return false;
		}	
		
		return true;	
	}
</script>

	<form action="_03_bWriteAction2" method="post" onsubmit="return formValidationCheck()">
		<table boarder="1">
			<tr>
				<td>작성자</td>
				<td><input type="text" name="writer"></td>
			</tr>
			<tr>
				<td>제목</td>
				<td><input type="text" name="subject"></td>
			</tr>
			<tr>
				<td>패스워드</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td>이메일</td>
				<td><input type="email" name="email"></td>
			</tr>
			<tr>
				<td>글내용</td>
				<td><textarea name="content"></textarea></td>
			</tr>
			<tr>
				<td><input type="submit" value="글작성"></td>
				<td><input type="reset" value="다시쓰기"></td>
				<td><input type="button" value="전체게시글보기" onclick="location.href='_04_bList2'"></td>
			</tr>
		</table>
	</form>
</body>
</html>