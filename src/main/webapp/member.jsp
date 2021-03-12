<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>멤버</title>
</head>
<body>
<h2>멤버리스트</h2>
<table border="1">
	<thead>
		<tr>
			<th>번호</th>
			<th>이름</th>
			<th>폰번호</th>
		</tr>
	</thead>
	<tbody>
<%
Class.forName("oracle.jdbc.OracleDriver");
String url = "jdbc:oracle:thin:@localhost:1521/xe";
String id = "jtest";
String pwd = "ezen1234";
Connection con = DriverManager.getConnection(url, id, pwd);
String sql = "select * from member_tbl_02 order by custno";
PreparedStatement ps = con.prepareStatement(sql);
ResultSet rs = ps.executeQuery();
while(rs.next()){
%>
		<tr>
			<td><%= rs.getString("custno") %></td>
			<td><%= rs.getString("custname") %></td>
			<td><%= rs.getString("phone") %></td>
		</tr>
<%
}
%>
	</tbody>
</table>
</body>
</html>