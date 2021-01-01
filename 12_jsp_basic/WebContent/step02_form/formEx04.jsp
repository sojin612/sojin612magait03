<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>연습문제</title>


<script>
	function formValidationCheck(){
		
		var name=document.getElementById("name");
		
		if(name.value.length==0){
			alert("이름을 입력하세요");
			name.focus();
			return false;
		}
		
		var phone=document.getElementById("phone");
		
		if(phone.value.length==0){
			alert("연락처를 입력하세요");
			phone.focus();
			return false;
		}
		
		var email= document.getElementById("email");
		
		if(email.value.length==0){
			alert("이메일을 입력하세요");
			email.focus();
			return false;
		}
		var allow=document.getElementById("allow");
		
		if(!allow.checked){
			alert("개인정보수집에 동의하셔야 합니다");
			return false;
		}
		
	}





</script>
</head>
<body>

<form method="post" action="formEx04pro.jsp" onsubmit="return formValidationCheck()" >
	<fieldset>
	<legend>비회원주문정보</legend>
	<img src="../img/notebook.PNG">
	<p>합리적인 비용의 강력한 비즈니스 성능
ThinkPad L13 노트북은 10세대 인텔®코어™프로세서,
SSD, DDR4 메모리 그리고 초고속 WiFi 6를 탑재하여 강력한 고성능을 발휘합니다.
슬림하고 가벼운 무게의 이 33.78cm (13.3형) 비즈니스 노트북을 블랙 혹은 실버 색상으로 만나보세요.
빈틈없는 보안과 프라이버시 보호 기능, 고속 충전 기술까지 비즈니스에 필요한 모든 요소를 갖추었습니다.
	</p>
	<hr>
	<p><label for="name"><span style="color:red" >*</span>이름</label><input type="text" id="name" name="name"></p>
	<p><label for="phone"><span style="color:red" >*</span>연락처</label><input type="tel" id="phone" name="phone" pattern="[0-9]{3}-[0-9]{4}-[0-9]{4}" title="###-####-####" placeholder="-를 붙여서 입력하시오"></p>
	<p><label for="email"><span style="color:red" >*</span>이메일</label><input type="email" id="email" name="email">이메일주소가 틀리면 배송관련정보를 받을실 수 없습니다</p>
	<p>
	<label>주문모델
	<select id="models" name="models">
		<option value="ipad" selected>ipad</option>
		<option value="samsung">samsung</option>
		<option value="lg">lg</option>
	</select>
	</label>
	<p>
	<p>구매수량<input type="radio" id="count" name="count" value="1" checked>1개</p>
	<p>구매수량<input type="radio" id="count" name="count" value="2">2개</p>
	<p>구매수량<input type="radio" id="count" name="count" value="3">3개</p>
	<p>구매수량<input type="radio" id="count" name="count" value="4">4개</p>
	<p><input type="checkbox" id="service" name="service">안심케어서비스</p>
	<p>주문시 요청사항</p>
	<p><textarea name="ps" col="200" row="200"></textarea></p>
	<p><input type="checkbox" id="allow" name="allow">개인정보수집동의<span style="color:red">*</span></p>
	<input type="submit" value="구매하기">
	<input type="reset" value="다시쓰기">
	
	</fieldset>
	

</form>
</body>
</html>