<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>FILE UPLOAD</h1>
	
	<h2>단일 파일 전송 - 동기 방식</h2>
	<form action="${pathContext.request.contextPath}/file/upload" method="post" enctype="multipart/form-data">
		 <input type="file" name="file">
		 <input type="submit" value="단일파일전송">
	</form>
	
	
</body>
</html>