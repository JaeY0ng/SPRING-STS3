<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>LOGIN PAGE</h1>
	<form action="${pageContext.request.contextPath}/login" method="post">
		<div>
			<label for="">USERNAME : </label> <input type="text" name="username" />
		</div>
		<div>
			<label for="">PASSWORD : </label> <input type="text" name="password" />
		</div>
		<div>
			<input type="submit" value="LOGIN" />
		</div>
		<input type="hidden" name="_csrf" value="${_csrf.token}" />
	</form>
</body>
</html>