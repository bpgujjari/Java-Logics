<%@page import="java.util.Date"%>
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
String fname;
String lname;
String mail;
String number;
String password;

%>
<%
fname=request.getParameter("fname");
lname=request.getParameter("lname");
mail=request.getParameter("mail");
number=request.getParameter("number");
password=request.getParameter("password");
if(mail.contains("@gmail.com")&&number.length()==10)
	out.println("Regestration success........."+new Date());
else
	out.println("Regestration failed..........");
%>
</body>
</html>