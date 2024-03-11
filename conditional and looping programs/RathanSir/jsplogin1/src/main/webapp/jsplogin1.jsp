<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
String user;
String password;
%>
<%
user=request.getParameter("user");
password=request.getParameter("password");
if(user.equalsIgnoreCase("bhavnai")&& password.equals("bhvani@123"))
response.sendRedirect("http//:www.google.com");	
else
response.sendError(90,"overDose");
	

%>
</body>
</html>