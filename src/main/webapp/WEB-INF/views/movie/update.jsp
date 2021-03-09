<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
input{
	width: 500px;
}
</style>
</head>
<body>
<c:if test="${result ne null}">
	<script>
		if(${result} == 1){
			alert('업데이트에 성공하였습니다.');
			location.href = '/movie/view?miNum=' + ${miNum};
		}else{
			alert('업데이트에 실패하였습니다.');
			location.href = '/movie/update?miNum=' + ${miNum};
		}
	</script>
</c:if>
<h2>무비 수정</h2>
<div>
	<form method="POST" action="/movie/update">
		<input type="hidden" name="miNum" value="${movieInfo.miNum }">
		<input type="text" name="miName" placeholder="영화명" value="${movieInfo.miName }"><br>
		<input type="text" name="miGenre" placeholder="장르" value="${movieInfo.miGenre }"><br>
		<input type="text" name="miProducer" placeholder="제작사" value="${movieInfo.miProducer }"><br>
		<input type="text" name="miDirector" placeholder="감독" value="${movieInfo.miDirector }"><br>
		<input type="text" name="miReleaseDate" placeholder="개봉일" value="${movieInfo.miReleaseDate }"><br>
		<input type="text" name="miDesc" placeholder="설명" value="${movieInfo.miDesc}"><br>
		<button>수정</button>
	</form>
</div>
</body>
</html>