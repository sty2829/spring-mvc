<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<input type="text" placeholder="빵 이름"><br>
<input type="text" placeholder="가격 "><br>
<button>검색</button>
<table border="1">
	<thead>
		<tr>
			<th>빵</th>
			<th>가격</th>
		</tr>
	</thead>
	<tbody id="tBody">
	</tbody>
</table>
<script>
window.onload = function() {
	getList();
}
function getList() {
var xhr = new XMLHttpRequest();
xhr.open('GET', '/ajax/list');
xhr.onreadystatechange = function() {
	if(xhr.readyState == 4 && xhr.status == 200){
		var res = JSON.parse(xhr.responseText);
		var html = '';
		for(var i=0; i<res.length; i++){
			var bread = res[i];
			html += '<tr>';
			html += '<td>' + bread.name + '</td>';
			html += '<td>' + bread.price + '</td>';
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