<%@ page language="java" contentType="text/html"%>
<html>
<%!
String username;
String password;
%>

<%
username=request.getParameter("username");
password=request.getParameter("password");

if(username.equalsIgnoreCase("gujjari")&&password.equals("password"))
{
out.println("login success ful");	

}	
else
{
out.println("Failed.........");	
}
%>
</body>
</html>