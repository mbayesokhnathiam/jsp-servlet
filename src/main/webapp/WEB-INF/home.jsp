<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Home jsp file</h1>

<p>
<%
	String mymessage = (String) request.getAttribute("variable");
	out.println(mymessage);
%>
</p>

<p>
<%
	for(int i=0; i<10; i++)
	{
		out.println("java enterprise edition </br>");
	}
%>
</p>
</body>
</html>