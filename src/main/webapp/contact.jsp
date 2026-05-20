<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action= "contact" method= "post">
	
	氏<input type= "text" name= "firstname">
	名<input type= "text" name= "lastname">
	会社名<input type= "text" name= "comname">
	メールアドレス<input type= "text" name= "mail">
	
	<p>お問い合わせ内容</p>
	<p><textarea name= "review"rows="5" cols="30"></textarea></p>
	
	<p>メールマガジン配信を受け取りますか
	<input type= "checkbox" name= "jobmail">総合案内
	<input type= "checkbox" name= "jobmail">セミナー案内
	<input type= "checkbox" name= "jobmail">求人採用情報
	</p>
	
	<p>資料請求を希望する
	<input type= "radio" name= "yesno" value= "yes">yes
	<input type= "radio" name= "yesno" value= "no">no
	</p>
	
	<input type= "submit" value= "送信">
	
	</form>

</body>
</html>