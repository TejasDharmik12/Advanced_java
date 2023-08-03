<%@page
	import="jakarta.security.auth.message.callback.PrivateKeyCallback.Request"%>
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
	String myname = (String) request.getAttribute("name_key");
	%>
	<h1>
		Welcome :
		<%=myname%>
	</h1>
</body>
</html>
