<%@ page language="java" contentType="text/html"%>
<html>
<body>
<%
String cid= request.getParameter("cid");
String cname = request.getParameter("cname");
String branch= request.getParameter("branch");
session.setAttribute("cid", cid);
session.setAttribute("cname", cname);
session.setAttribute("branch", branch);
%>
your success.............
<a href="success.jsp">click here to seee</a>
</body>
</html>