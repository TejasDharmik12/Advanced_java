<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%-- <%
	String s = (String)request.getAttribute("name");
	int i = (int)request.getAttribute("id");
%> --%>

	<%-- <h1>My name is <%=s %></h1>
<h1>My roll is <%=i %></h1> --%>

	<h1>My name is ${name}</h1>

</body>
</html>