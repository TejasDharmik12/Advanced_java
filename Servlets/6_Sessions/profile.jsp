<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String myname = (String)session.getAttribute("name_key");
	%>
	<h3>Welcome:<%=myname %></h3> 
	<a href="home.jsp">Home</a>
	<a href="about.jsp">About</a>
	<a href="logout">Logout</a>
</body>
</html>
