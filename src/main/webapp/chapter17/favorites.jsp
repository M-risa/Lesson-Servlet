<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="beans.Favorite" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>お気に入り登録</h1>

<form action="favorite-servlet" method="post">
名前：<input type="text" name="name">
URL：<input type="text" name="url">
<input type="submit" value="追加">
</form>
<hr>

<h2>登録一覧</h2>
	<%
	List<Favorite> favList = (List<Favorite>)session.getAttribute("favoriteList");

    if (favList != null&& favList.size() > 0) { 
    %>
    <ul>
    <% for (Favorite fav : favList) { %>
        <li>
            <a href="<%= fav.getUrl() %>" target="_blank">
                <%= fav.getName() %>
            </a>
        </li>
    <% } %>
    </ul>
<%
    } else {
%>
    <p>まだ登録されていません。</p>
<%
    }
%>

</ul>

<form action="clear-servlet" method="post">
<input type="submit" value="クリア">
</form>

</body>
</html>