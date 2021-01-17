<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<script>
	function formValidationCheck(){
		
		var id= document.getElementById("id");
		if(id.value.length==0){
			alert("아이디를 입력해주세요");
			id.focus();
			return false;
		}
		
		var pw= document.getElementById("pw");
		if(pw.value.length==0){
			alert("패스워드를 입력해주세요");
			pw.focus();
			return false;
		}
		
		var name= document.getElementById("name");
		if(name.value.length==0){
			alert("이름을 입력해주세요");
			name.focus();
			return false;
		}
		
		var tel= document.getElementById("tel");
		if(tel.value.length==0){
			alert("전화번호를 입력해주세요");
			tel.focus();
			return false;
		}
		
		var email= document.getElementById("email");
		if(email.value.length==0){
			alert("이메일을 입력해주세요");
			email.focus();
			return false;	
		}
		
		return true;
	}
</script>	
</head>
<body>
<h2>회원가입</h2>
	<form align="center" action="_03_JoinAction2" method="post" onsubmit="return formValidationCheck()">
		<label>아이디</label><input type="text" id="id" name="id" actofocus ><br>
		<label>패스워드</label><input type="password" id="pw" name="pw"><br>
		<label>이름</label><input type="text" id="name" name="name" placeholder="공백없이 입력하세요"><br>
		<label>전화번호</label><input type="tel" id="tel" name="tel" placeholder="000-0000-0000"><br>
		<label>이메일</label><input type="email" id="email" name="email"><br>
		<input type="submit" value="회원가입">
		<input type="reset" value="다시쓰기">
	</form>
</body>
</html>