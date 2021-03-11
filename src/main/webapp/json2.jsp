<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
제품명 : <input type="text" id="name"><br>
가격 : <input type="text" id="price"><br>
관심사 : 
<label for="f1">건강</label>
<input type="checkbox" id="f1" name="interest" value="건강">
<label for="f2">반려동물</label>
<input type="checkbox" id="f2" name="interest" value="반려동물">
<label for="f3">주식</label>
<input type="checkbox" id="f3" name="interest" value="주식">
<br>
<button onclick="search()">검색</button>
<script>
function search() {
	var objs = document.querySelectorAll('[name=interest]:checked');
	if(!objs.length){
		alert('관심사 1개 이상 선택해주세요');
		return;
	}
	var value = '';
	for(var i=0; i<objs.length; i++){
		var obj = objs[i];
		value += obj.name + '=' + obj.value + '&';
	}
	var name = document.querySelector('#name');
	if(name.value){
		value += name.id + '=' + name.value + '&';
	}
	var price = document.querySelector('#price');
	if(price.value){
		value += price.id + '=' + price.value + '&';
	}
	
	var xhr = new XMLHttpRequest();
	xhr.open('GET', '/ajax/check?'+ value);
	xhr.onreadystatechange = function() {
		if(xhr.readyState == 4 && xhr.status == 200){
			console.log(xhr.responseText);
		}
	}
	xhr.send();
}
</script>
</body>
</html>