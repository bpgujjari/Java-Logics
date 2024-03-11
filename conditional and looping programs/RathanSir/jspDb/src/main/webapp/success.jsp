<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html"%>
<html>
<body>
<%
String clgid=(String)session.getAttribute("clgid");
String clgname=(String)session.getAttribute("clgname");
String clgloc=(String)session.getAttribute("clgloc");
String cid=(String)session.getAttribute("cid");
String cname=(String)session.getAttribute("cname");
String branch=(String)session.getAttribute("branch");
out.print(clgid);
out.print("<br><br>");
out.print(clgname);
out.print("<br><br>");
out.print(clgloc);
out.print("<br><br>");
out.print(cid);
out.print("<br><br>");
out.print(cname);
out.print("<br><br>");
out.print(branch);
out.print("<br><br>");
%>
</body>
</html>