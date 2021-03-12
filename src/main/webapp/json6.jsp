<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<script>
var map = {};
var foodList = [
	{
		name: '육회탕탕이',
		price: '28000',
		etc: '맛있었드랬다'
	},
	{
		name: '고기순대',
		price: '10000',
		etc: '주인아줌마한테 당한듯..'
	}
];
var pcList = [
	{
		cpu: 'I7',
		ram: '16G',
		price: '1500000',
		
	},
	{
		cpu: 'I5',
		ram: '8G',
		price: '1000000',
		
	}
];

map.foodList = foodList;
map.pcList = pcList;

console.log(map);
console.log(map.foodList);
console.log(map.pcList);
for(var i=0; i<map.foodList.length; i++){
	var food = map.foodList[i];
	document.write(food.name + " ," + food.price + " , " + food.etc + '<br>');
}
for(var i=0; i<map.pcList.length; i++){
	var pc = map.pcList[i];
	document.write(pc.cpu + " ," + pc.ram + " , " + pc.price + '<br>');
}
</script>
</body>
</html>