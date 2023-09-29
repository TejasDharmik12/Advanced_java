<!DOCTYPE html>
<html>
<body>
<h2>Hello World!</h2>
<h2>I am home</h2>

<%
	String s = (String)request.getAttribute("name");
	int id = (int)request.getAttribute("id");
%>

<h1>Hello <%=s %></h1>
<h1>my id is <%=id %></h1>
</body>
</html>
