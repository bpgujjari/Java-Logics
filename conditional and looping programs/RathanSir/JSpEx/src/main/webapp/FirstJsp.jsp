<%@ page language="java" contentType="text/html" import="java.sql.Date" %>
<html>
<body>
<%!

String username;
String password;
%>



<%
username=request.getParameter("username");
password=request.getParameter("password");

if(username.equalsIgnoreCase("gujjari")&&password.equals("password"))
{
out.println("login success ful"+ new Date(1));	

}	
else
{
out.println("Failed.........");	
}
%>
</body>
</html>