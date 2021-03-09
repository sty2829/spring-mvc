<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:if test="${result ne null }">
	<script>
		if(${result} == 1){
			alert('영화삭제에 성공하였습니다');
			location.href = '/movies';
		}else{
			alert('영화삭제에 실패하였습니다');
			location.href = '/movie/view?miNum=' + ${miNum};
		}	
	</script>
</c:if>
<h2>영화 정보</h2>
		<table border="1">
			<tr>
				<th>번호</th>
				<td>${movieInfo.miNum }</td>
			</tr>
			<tr>
				<th>영화명</th>
				<td>${movieInfo.miName }</td>
			</tr>
			<tr>
				<th>장르</th>
				<td>${movieInfo.miGenre }</td>
			</tr>
			<tr>
				<th>제작사</th>
				<td>${movieInfo.miProducer }</td>
			</tr>
			<tr>
				<th>감독</th>
				<td>${movieInfo.miDirector }</td>
			</tr>
			<tr>
				<th>개봉일</th>
				<td>${movieInfo.miReleaseDate }</td>
			</tr>
			<tr>
				<th>등록일</th>
				<td>${movieInfo.miCredat }</td>
			</tr>
			<tr>
				<th>설명</th>
				<td>${movieInfo.miDesc }</td>
			</tr>
			<tr>
				<th colspan="2"><button onclick="goUpdate()">수정</button>  <button onclick="doDelete()">삭제</button></th>
			</tr>
		</table>
		<form method="POST" action="/movie/delete" id="deleteFrom">
			<input type="hidden" name="miNum" value="${movieInfo.miNum }">
		</form>
	<script>
		function goUpdate(){
			location.href = '/movie/update?miNum=' + ${movieInfo.miNum};
		}
		function doDelete(){
			document.querySelector('#deleteFrom').submit();
		}
	
	</script>
</body>
</html>