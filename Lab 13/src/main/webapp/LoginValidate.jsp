<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Validation</title>
</head>
<body>
Validation<br/><br/>
<% String n = request.getParameter("username");
	String p = request.getParameter("password");%>
<% if(n.equals(p)){%>
	Welcome <%=n %><br/>
<% }else{%>
	Username and Password combination do not match<br/>
<% }%>
<a href="Experiment2.jsp">Go Back</a>
</body>
</html>