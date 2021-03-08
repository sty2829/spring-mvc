<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>무비리스트</h2>
<table border="1">
	<thead>
		<tr>
			<th>번호</th>
			<th>영화명</th>
			<th>장르</th>
			<th>제작사</th>
			<th>감독</th>
		</tr>
	</thead>
	<tbody>
	<c:forEach items="${movieList}" var="movie">
		<tr>
			<td>${movie.miNum }</td>
			<td>${movie.miName }</td>
			<td>${movie.miGenre }</td>
			<td>${movie.miProducer }</td>
			<td>${movie.miDirector }</td>
		</tr>	
	</c:forEach>
		<tr>
			<td colspan="5" align="right"><button onclick="goInsert()">등록</button></td>
		</tr>
	</tbody>
</table>
<script>
	function goInsert(){
		location.href="/movie/insert"
	}

</script>
</body>
</html>