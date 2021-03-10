<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	<tbody id="tBody">
	</tbody>
</table>
<script>
window.onload = function() {
	var xhr = new XMLHttpRequest();
	xhr.open('GET', '/foods');
	xhr.onreadystatechange = function() {
		if(xhr.readyState == 4 && xhr.status == 200){
			var res = JSON.parse(xhr.responseText);
			var html = '';
			for(var i=0; i<res.length; i++){
				var food = res[i];
				html += '<tr>';
				html += '<td>' + food.fiNum + '</td>';
				html += '<td>' + food.fiName + '</td>';
				html += '<td>' + food.fiType + '</td>';
				html += '<td>' + food.fiPrice + '</td>';
				html += '<td>' + food.fiCredat + '</td>';
				html += '<td>' + food.fiCretim + '</td>';
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