<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page errorPage= "error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
request.setCharacterEncoding("UTF-8");

String username = request.getParameter("username");
String ageStr = request.getParameter("age");

if(username == null || username.trim().isEmpty()){
	throw new IllegalArgumentException();
}

if(ageStr == null || ageStr.trim().isEmpty()){
	throw new IllegalArgumentException();
}

int age = Integer.parseInt(ageStr);
%>

<p>ユーザー名：<%= username %></p>
<p>年齢：<%= age %></p>

</body>
</html>