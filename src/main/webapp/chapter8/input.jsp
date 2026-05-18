<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action= "output.jsp" method= "post">
	<label for= "username">ユーザー名：</label>
	<input type= "text" id = "username" name= "username"><br>
	<label for= "age">年齢：</label>
	<input type= "text" id= "age" name= "age">
	<input type= "submit" value= "送信">
	</form>

</body>
</html>