<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
</style>
</head>
<body>
	<div id="rDiv">
		<h2>EMP 리스트</h2>
		<table border="1">
		<thead>
			<tr>
				<th>번호</th>		
				<th>이름</th>		
				<th>월급</th>		
			</tr>
		</thead>
		<tbody id="tBody">
		</tbody>
		</table>
	</div>
<script>
window.onload = function(){
	getList();
}
	
function getList() {
	var xhr = new XMLHttpRequest();
	xhr.open('GET', '/emps');
	xhr.onreadystatechange = function() {
		if(xhr.readyState == 4 && xhr.status == 200){
			console.log(xhr.responseText);
			var res = JSON.parse(xhr.responseText);
			var html = '';
			for(var i=0; i<res.length; i++){
				var emp = res[i];
				html += '<tr onclick="goView('+ emp.empno +')" style="cursor:pointer">';
				html += '<td>' + emp.empno + '</td>';
				html += '<td>' + emp.name + '</td>';
				html += '<td>' + emp.sal + '</td>';
				html += '</tr>';
			}
			html += '<tr>';
			html += '<td colspan="3" align="right"><button onclick="goInsert()">등록</button></td>';
			html += '</tr>';
			document.querySelector('#tBody').innerHTML = html;
		}
	}
	xhr.send();
}
function goInsert(){
	location.href = '/views/emp/insert';
}
function goView(empno){
	location.href = '/views/emp/view?empno=' + empno;
}
</script>
</body>
</html>