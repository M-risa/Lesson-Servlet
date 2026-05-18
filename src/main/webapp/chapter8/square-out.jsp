<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@page errorPage= "square-error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
request.setCharacterEncoding("UTF-8");
int num= Integer.parseInt(request.getParameter("num"));
int result = num * num;
%>

<p>入力した数値：<%= num %></p>
<p>結果：<%= result %></p>

</body>
</html>