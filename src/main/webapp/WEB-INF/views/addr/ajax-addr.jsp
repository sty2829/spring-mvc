<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset= "UTF-8">
<title>Insert title here</title>
</head>
<body>
시도 : <select id="sido" onchange="changeSido(this)">
		<option>시도선택</option>
	  </select>
구군 : <select id="gugun">
		<option>구군선택</option>
	  </select>
<script>
	function getSido(){
		var xhr = new XMLHttpRequest();
		xhr.open('GET', '/ajax/addr/sidos');
		xhr.onreadystatechange = function(){
			if(xhr.readyState == 4 && xhr.status == 200){
				var res = JSON.parse(xhr.responseText);
				var html = '<option>시도선택</option>';
				for(var i=0; i<res.length; i++) {
					var sido = res[i];
					html += '<option value="' + sido.siNum + '">' + sido.siName + '</option>';
				}
				document.querySelector('#sido').innerHTML = html;
			}
		}
		xhr.send();
	}

	function changeSido(obj){
		var html = '<option>구군선택</option>';
		if(obj.value != '시도선택'){
			var xhr = new XMLHttpRequest();
			xhr.open('GET', '/ajax/addr/guguns?siNum=' + obj.value);
			xhr.onreadystatechange = function() {
				if(xhr.readyState == 4 && xhr.status == 200){
					var res = JSON.parse(xhr.responseText);
					for(var i=0; i<res.length; i++){
						var gugun = res[i];
						html += '<option value="' + gugun.guNum + '">' + gugun.guName + '</option>';	
					}
					document.querySelector('#gugun').innerHTML = html;
				}
			}
			xhr.send();
		}
		document.querySelector('#gugun').innerHTML = html;
	}
	window.onload = function() {
		getSido();		
	}
</script>
</body>
</html>