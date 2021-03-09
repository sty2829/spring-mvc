<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
			alert('영화 등록에 성공하였습니다');
			location.href = '/movies';
		}else{
			alert('영화 등록에 실패하였습니다');
		}
	</script>
</c:if>
<h2>무비 등록</h2>
<form method="POST" action="/movie/insert">
	<input type="text" name="miName" placeholder="영화명"><br>
	<input type="text" name="miGenre" placeholder="장르"><br>
	<input type="text" name="miProducer" placeholder="제작사"><br>
	<input type="text" name="miDirector" placeholder="감독"><br>
	<input type="text" name="miReleaseDate" placeholder="개봉일"><br>
	<textarea rows="5" cols="30" name="miDesc" placeholder="영화설명"></textarea><br>
	<button>등록</button>
</form>
</body>
</html>