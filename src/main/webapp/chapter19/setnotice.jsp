<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>お知らせ登録</title>
</head>
<body>
	<h2>お知らせの設定</h2>
	
	<%
	 String msg = (String) request.getAttribute("message");
	if (msg != null) {
        %>
            <p style="color: green; font-weight: bold;"><%= msg %></p>
        <% } %>
	
	<form action="${pageContext.request.contextPath}/chapter19/set-notice" method="post">
	<input type="text" name="noticeContent">
	<input type="submit" value="設定">
	</form>
	
	<a href="${pageContext.request.contextPath}/chapter19/shownotice.jsp">お知らせを確認</a>
	

</body>
</html>