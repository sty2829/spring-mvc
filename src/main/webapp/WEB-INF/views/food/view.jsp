<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<c:if test="${result ne null}">
	<script>
		if(${result} == 1) {
			alert('삭제 완료');
			location.href= '/foods';
		}else{
			alert('삭제시 오류가 발생!');
		}
	</script>
</c:if>
<body>
	<table border="1">
		<tr>
			<th>번호</th>
			<td>${foodInfo.fiNum }</td>
		</tr>
		<tr>
			<th>메뉴</th>
			<td>${foodInfo.fiName }</td>
		</tr>
		<tr>
			<th>가격</th>
			<td>${foodInfo.fiPrice }</td>
		</tr>
		<tr>
			<th>종류</th>
			<td>${foodInfo.fiType }</td>
		</tr>
		<tr>
			<th>등록일</th>
			<td>${foodInfo.fiCredat }</td>
		</tr>
		<tr>
			<th>등록시간</th>
			<td>${foodInfo.fiCretim }</td>
		</tr>
		<tr>
			<th colspan="2">
			<button onclick="goUpdate()">수정</button>  
			<button onclick="doDelete()">삭제</button>
			</th>
		</tr>
	</table>
	<form method="post" action="/food/delete" id="deleteFrom"> 
		<input type="hidden" value="${foodInfo.fiNum }" name="fiNum">
	</form>
	<script>
		function goUpdate(){
			location.href = '/food/update?fiNum=' + ${foodInfo.fiNum}; 
		}
		function doDelete(){
			document.querySelector('#deleteFrom').submit();
		}
	</script>
</body>
</html>