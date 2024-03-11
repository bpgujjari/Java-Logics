<%@ page language="java" contentType="text/html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<html>
<body>
<sql:setDataSource 
driver="oracle.jdbc.driver.OracleDriver"
url="jdbc:oracle:thin:@localhost:1521:xe"
user="gujjari"
password="bhavani"/>
<sql:update var="result" sql="insert into stu values(300,'chimtu','909099090')" />
data inserted successfully......${result}
</body>
</html>