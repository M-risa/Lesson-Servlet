<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="jakarta.servlet.ServletContext" %>
<%@ page import="java.util.List" %>
<%
    ServletContext context = request.getServletContext();
    List<String> noticeList = (List<String>) context.getAttribute("appNoticeList");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>お知らせ表示</title>
</head>
<body>


<h1>現在のお知らせ</h1>
            
<%

	if (noticeList == null || noticeList.isEmpty()) {
%>
	<p>現在お知らせはありません</p>
<%
	} else {
		for (String notice : noticeList) {
%>
		<p>・ <%= notice %></p>
<%
			}
	}
%>
            

<a href="${pageContext.request.contextPath}/chapter19/setnotice.jsp">お知らせを設定する</a>

</body>
</html>