<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>메뉴 수정</h2>
<form method="POST" action="/food/update">
	<input type="text" name="fiNum" value="${foodInfo.fiNum }" readonly><br>
	<input type="text" name="fiName" placeholder="메뉴명" value="${foodInfo.fiName }"><br>
	<input type="text" name="fiType" placeholder="종류(한식,중식..)" value="${foodInfo.fiType}"><br>
	<input type="number" name="fiPrice" placeholder="가격" value="${foodInfo.fiPrice }"><br>
	<button>수정</button>
</form>
</body>
</html>