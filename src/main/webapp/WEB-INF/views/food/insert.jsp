<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>신규 메뉴 등록</h2>
<form method="POST" action="/food/insert">
	<input type="text" name="fiName" placeholder="메뉴명"><br>
	<input type="text" name="fiType" placeholder="종류(한식,중식..)"><br>
	<input type="number" name="fiPrice" placeholder="가격"><br>
	<button>등록</button>
</form>
</body>
</html>