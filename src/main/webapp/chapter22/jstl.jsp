<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%@taglib prefix="c" uri="jakarta.tags.core" %>

<c:set var="total" value="0" />

<c:forEach var="p" items="${list}" >
	${p.id}:${p.name}:${p.price}<br>
		<c:set var="total" value="${total + p.price}" />
</c:forEach>

<br>
<b>合計金額：${total}円</b>


</body>
</html>