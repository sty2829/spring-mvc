<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
	<thead>
		<tr>
			<th>번호</th>		
			<th>메뉴</th>		
			<th>종류</th>		
			<th>가격</th>		
			<th>만든날짜</th>		
			<th>만든시간</th>		
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${foodList}" var="food">
			<tr onclick="location.href='/food/view?fiNum=${food.fiNum }'" style="cursor:pointer">
				<td>${food.fiNum}</td>	
				<td>${food.fiName}</td>	
				<td>${food.fiType}</td>	
				<td>${food.fiPrice}</td>	
				<td>${food.fiCretim}</td>	
				<td>${food.fiCredat}</td>
			</tr>	
		</c:forEach>
			<tr>
				<td colspan="6" align="right"><button onclick="goInsert()">메뉴등록</button></td>
			</tr>
	</tbody>
</table>
<script>
	function goInsert(){
		location.href = "/food/insert";
	}

</script>
</body>
</html>