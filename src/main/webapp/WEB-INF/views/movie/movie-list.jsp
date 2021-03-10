<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	<tbody id="tBody">
	</tbody>
</table>
<script>
window.onload = function(){
	var xhr = new XMLHttpRequest()
	xhr.open('GET', '/movies');
	xhr.onreadystatechange = function() {
		if(xhr.readyState == 4 && xhr.status == 200){
			var res = JSON.parse(xhr.responseText);
			var html = '';
			for(var i=0; i<res.length; i++){
				var movie = res[i];
				html += '<tr>';
				html += '<td>' + movie.miNum + '</td>';
				html += '<td>' + movie.miName + '</td>';
				html += '<td>' + movie.miGenre + '</td>';
				html += '<td>' + movie.miProducer + '</td>';
				html += '<td>' + movie.miDirector + '</td>';
				html += '<td>' + movie.miReleaseDate + '</td>';
				html += '</tr>';
			}
			document.querySelector('#tBody').innerHTML = html;
		}
	}
	xhr.send();
}
</script>
</body>
</html>