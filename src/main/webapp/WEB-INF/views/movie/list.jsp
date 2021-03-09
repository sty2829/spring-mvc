<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!--
JSTL function fmt 잘씀
 -->
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
			<th>개봉일</th>
		</tr>
	</thead>
	<tbody>
	<c:forEach items="${movieList}" var="movie">
		<fmt:parseDate value="${movie.miReleaseDate }" var="mrd" pattern="yyyyMMdd"/>
		<fmt:formatDate value="${mrd}" pattern="yyyy-MM-dd" var="miReleaseDate"/>
		<tr onclick="goView(${movie.miNum})" style="cursor:pointer">
			<td>${movie.miNum }</td>
			<td>${movie.miName }</td>
			<td>${movie.miGenre }</td>
			<td>${movie.miProducer }</td>
			<td>${movie.miDirector }</td>
			<td>${miReleaseDate }</td>
		</tr>	
	</c:forEach>
		<tr>
			<td colspan="6" align="right"><button onclick="goInsert()">등록</button></td>
		</tr>
	</tbody>
</table>
<script>
	function goInsert(){
		location.href="/movie/insert";
	}
	function goView(miNum){
		location.href="/movie/view?miNum=" + miNum;
	}

</script>
</body>
</html>