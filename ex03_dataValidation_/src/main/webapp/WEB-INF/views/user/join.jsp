<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="text-align:center;">
		<h1>회원가입</h1>
		<form action="${pageContext.request.contextPath}/user/join" method="post">
			<div>
				<label>ID  : </label> <span>${userid}</span><br>
				<input name="userid">
			</div>
			<div>
				<label>Password : </label> <span>${password}</span><br>
				<input type="password" name="password">
			</div>
			<div>
				<label>Password 확인 : </label> <span>${repassword}</span><br>
				<input type="password" name="repassword">
			</div>
			<div>
				<label>이름 : </label> <span>${username}</span><br>
				<input name="username">
			</div>
			<div>
				<label>전화번호 : </label> <span>${phone}</span><br>
				<input name="phone">
			</div>
			<div>
				<label>우편번호 : </label> <span>${zipcode}</span><br>
				<input name="zipcode">
			</div>
			<div>
				<label>기본주소 : </label> <span>${addr1}</span><br>
				<input name="addr1">
			</div>
			<div>
				<label>상세주소 : </label> <span>${addr2}</span><br>
				<input name="addr2">
			</div>
		 	
		 	<div>
				<label>생년월일 : </label> <span></span><br>
				<input type="text" name="birthday" placeHolder="yyyy~MM~dd">
			</div>
			
			<br>
			<div>
				<input type="submit" value="회원가입" style="width:100px;height:40px;">
			</div>
			
		</form>
</body>
</html>