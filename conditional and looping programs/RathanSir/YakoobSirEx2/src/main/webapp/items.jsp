<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="ItemsServlet" method="post">
<input type="text"  name="id" placeholder="item NO:"> <br><br>
<input type="text" name="iname" placeholder="enter item name"><br><br>
<input type="number" name="icost" placeholder="enter item cost"><br><br>
<input type="number" name="iquan" placeholder="enter item quantity"><br><br>
<input type="submit" value="Enter...">
</form>
</body>
</html>