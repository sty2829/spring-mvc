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
<button onclick="post()">전송</button>
<script>
function search() {
	var objs = document.querySelectorAll('input[type=text],input[type=checkbox]:checked');
	var param = '';
	for(var i=0; i<objs.length; i++){
		var obj = objs[i];
		var key = (obj.name) ? obj.name : obj.id;
		param += key + '=' + obj.value + '&';
	}
	console.log(param);
	var xhr = new XMLHttpRequest();
	xhr.open('GET', '/ajax/check1?'+ param);
	xhr.onreadystatechange = function() {
		if(xhr.readyState == 4 && xhr.status == 200){
			console.log(xhr.responseText);
		}
	}
	xhr.send();
}
function post(){
	var xhr = new XMLHttpRequest();
	xhr.open('POST', '/ajax/check');
	xhr.onreadystatechange = function() {
		if(xhr.readyState == 4 && xhr.status == 200){
			console.log(xhr.responseText);
		}
	}
	var objs = document.querySelectorAll('input[type=text],input[type=checkbox]:checked');
	var param = {};
	for(var i=0; i<objs.length; i++){
		var obj = objs[i];
		var key = (obj.name) ? obj.name : obj.id;
		if(param[key]){
			if(Array.isArray(param[key])){
				param[key].push(obj.value);				
			}else{
				var tmp = param[key];
				param[key] = [];
				param[key].push(tmp);
				param[key].push(obj.value);	
			}
		}else{
			param[key] = obj.value;
		}
	}
	
	xhr.setRequestHeader('content-type', 'application/json;charset=UTF-8');
	xhr.send(JSON.stringify(param));
}
</script>
</body>
</html>