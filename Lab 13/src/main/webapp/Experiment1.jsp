<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
Class.forName("com.mysql.jdbc.Driver");
String connectionUrl = "jdbc:mysql://localhost:3306/Lab13";
String userid = "root";
String password = "aniruddh13";
String query="select * from students";
Connection conn = DriverManager.getConnection(connectionUrl, userid, password);
Statement stmt = conn.createStatement();
ResultSet rs = stmt.executeQuery(query);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Experiment 1</title>
</head>
<body>
<h1>Retrieve data from database in jsp</h1>
<table border="1">
	<tr>
		<th>Roll No.</th>
		<th>Name</th>
		<th>Class</th>
		<th>Age</th>
		<th>Gender</th>
	</tr>
	<%while (rs.next()){ %>
	<tr>
		<td style="padding: 10px"><%=rs.getString("id") %></td>
		<td style="padding: 10px"><%=rs.getString("name") %></td>
		<td style="padding: 10px"><%=rs.getString("class") %></td>
		<td style="padding: 10px"><%=rs.getString("age") %>yrs</td>
		<td style="padding: 10px"><%=rs.getString("sex") %></td>
	</tr>
	<% } %>
</table>
</body>
</html>