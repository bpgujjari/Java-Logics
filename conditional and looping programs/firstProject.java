Final project

Below I will paste all the source codes of the file create a new project and create all servlet and java files in the java/resources folder and all the html and jsp files in the webapp folder. Create a table in the database first before running the application. Copy all the required jars in lib folder total of 5 files

create table login
(
email varchar2(50),
username varchar2(50),
password varchar2(50),
mobileNo varchar2(50),
totalQual varchar2(50),
gender varchar2(10),
totalTech varchar2(50),
country varchar2(50),
totalAddrs varchar2(100),
review varchar2(100)
);


#homepage
<!DOCTYPE html>
<html>
<head>
<title>Main page</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<style>
    center{
        height: 1000;
        width: 700;
        background: rgb(146, 242, 210);
        
    }
p{background: rgb(146, 242, 210);
        color: black;
        margin:0px;}
div {
	margin-top: 40px;
}

.c1 {
	margin: 40px;
	border-radius: 50px;
	border: 1px solid black;
	background-color: rgb(255, 128, 128);
	color: rgb(0, 128, 255);
	padding: 10px 15px;
	text-decoration: none;
	display: table; 
	margin: 0 auto;
	display: table-cell;
}
.c2{background-color: rgb(255, 128, 128);
	color: rgb(0, 128, 255);
	text-decoration: none;
	display: table; 
	margin: 0 auto;
	display: table-cell;
	border:none;
	font-weight: bold;
}

.c1:hover {
	background-color: #00e6e6;
	color: white;
}
.c2:hover{
	background-color: #00e6e6;
	color: white;
}

h2 {
	font-size: 70px;
	font-family: sans-serif;
	font-style: oblique;
	font-style: bold;
	color: #ff00bf;
	text-shadow: 1px 1px 2px skyblue, 0 0 25px blue, 0 0 5px green;
}

.footer {
    background: rgb(146, 242, 210);
	color:red;
	text-align: center;
	direction: right;
}


#bg {
	background-size: 1500px 700px;
	background-repeat: no-repeat;
	background-position: top;
	background-attachment: fixed;
}
body{
background: rgb(146, 242, 210);}

</style>
<body>
	<center>
		<center>
			<b><h2>Sathya Technology</h2></b>
		</center>
		<div class="container">
			<div>
				<b><a class="c1" href="Home.html">Home</a></b>
				 <b><a class="c1" href='registration.html'>Registration</a></b> 
					<b><a class="c1" href="login.html">Sign/Login</a></b>
				<b><a class="c1" href="seach.html">Search</a></b> <b>
				<a class="c1" href="resetpassword.html">Reset Password</a></b>
				<b><form class="c1" action="./ViewServlet" method="POST">
					<b> <input class="c2" type="submit" value="View"></b> 
					</form></b> 
			</div>
		</div>
		<div>
<p>Welcome to Sathya Technology, your one-stop destination for full-stack development training courses 
in Java and .NET!</p>
<p>At Sathya Technology, we understand the importance of keeping up with the ever-changing landscape of
 technology. That's why we're dedicated to providing comprehensive training courses that cover all the 
 related skills required to become a successful full-stack developer. Whether you're just starting out 
 or looking to upgrade your skills, our courses are designed to help you take your career to the next 
 level.</p>
<p>Our courses are taught by experienced professionals who have real-world experience in the industry. 
With their guidance, you'll learn the ins and outs of full-stack development, including the latest 
trends and best practices. Our classes are held throughout the day, giving you the flexibility to 
choose a schedule that works for you.</p>
<p>Our Java and .NET courses cover all the fundamental concepts of full-stack development, including 
HTML, CSS, JavaScript, jQuery, AngularJS, ReactJS, Spring, Hibernate, and ASP.NET. You'll learn how to 
design and develop full-stack web applications from scratch, using the latest tools and technologies.</p>
		</div>
	</center>
	<footer class="footer">
		<marquee vspace="25" hspace="30">
			<h1>Welcome To Sathya Technology</h1>
		</marquee>
	</footer>

</body>
</html>


#registration page

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<center>
	<h1>Registration Page</h1>
</center>
</head>
<style>
    div{
        background-color: aquamarine;
    }
form {
	margin-top: 10px;
	background-color: rgb(238, 144, 219);
	padding: 20px;
	margin-left: 380px;
	width: 400px;
	border-radius: 50px;
	border: 3px blue solid;
}

body {
	background-image: url("sp4.jpg");
	background-color: skyblue;
}

h1 {
	text-align: center;
	font-size: 40px;
	font-family: bold;
	color: #ff1a75;
}

a {
	font-size: 20px;
}

body {
	background-color: rgb(69, 7, 40);
}

input {
	font-size: 12px;
	font-family: "Arial Black";
	color: rgb(26, 35, 151);
}

label {
	font-size: 15px;
	font-family: "Arial Black";
	color:dimgray;
}

a {
	text-align: center;
}
</style>
<body>

	<div align="CENTER">
		<table>
			<form method="post" action="./RegistrationServlet">
				<tr>
					<td><label>Email:</label></td>
					<td><input type="text" placeholder="Enter Email" name="email"></td>
				</tr>
				<tr>
					<td><label>User name:</label></td>
					<td><input type="text" placeholder="Enter Username"
						name="username"></td>
				</tr>
				<tr>
					<td><label>Password:</label></td>
					<td><input type="password" placeholder="Enter Password"
						name="password"></td>
				</tr>
				<tr>
					<td><label>Number:</label></td>
					<td><input type="text" placeholder="Enter Mobile Number"
						name="number"></td>
				</tr>
				<tr>
					<td><label>Qualification:</label></td>
					<td><input type="checkbox" name="qualification" value="BSC">
						<label>BSC</label> <input type="checkbox" name="qualification"
						value="MSC"> <label>MSC</label> <input type="checkbox"
						name="qualification" value="B.tech"> <label>B.tech</label>
						<input type="checkbox" name="qualification" value="M.tech">
						<label>M.tech</label> <input type="checkbox" name="qualification"
						value="B.com"> <label>B.com</label> <input type="checkbox"
						name="qualification" value="M.com"> <label>M.com</label> <input
						type="checkbox" name="qualification" value="BCA"> <label>BCA</label>
						
				</tr>

			</form>
<input type="checkbox" name="qualification" value="MCA"> <label>MCA</label>
				</tr>
				<tr>
					<td><label>Gender:</label></td>
					<td><input type="radio" name="gender" value="Male"> <label>Male</label>
						<input type="radio" name="gender" value="Female"> <label>Female</label></td>
				</tr>
				<tr>
					<td><label>Technologies:</label></td>
					<td><select name="technologies" size="3" multiple>
							<option value="C">C</option>
							<option value="C++">C++</option>
							<option value="python">python</option>
							<option value="java">java</option>
							<option value=".net">.net</option>
							<option value="spring">spring</option>
							<option value="springboot">springboot+</option>
							<option value="microservices">microservices</option>
							<option value="mongodb">mongodb</option>
							<option value="datastructure">datastructure</option>
					</select></td>
				</tr>
				<tr>
					<td><label>Country:</label></td>
					<td><select name="country">
							<option value="India">India</option>
							<option value="Australia">Australia</option>
							<option value="Afganistan">Afganistan</option>
							<option value="Africa">Africa</option>
							<option value="Pakistan">Pakistan</option>
							<option value="Bhutan">Bhutan</option>
							<option value="USA">USA</option>
							<option value="China">China</option>
							<option value="London">London</option>
							<option value="Germany">Germany</option>
					</select></td>
				</tr>
				<tr>
					<td><label>Address:</label></td>
				</tr>
				<tr>
					<td><label>Door No.:</label></td>
					<td><input type="text" placeholder="Enter door no."
						name="address"></td>
				</tr>
				<tr>
					<td><label>Street:</label></td>
					<td><input type="text" placeholder="Enter Street"
						name="address"></td>
				</tr>
				<tr>
					<td><label>State:</label></td>
					<td><input type="text" placeholder="Enter State"
						name="address"></td>
				</tr>
				<tr>
					<td><label>Pincode:</label></td>
					<td><input type="text" placeholder="Enter Pincode"
						name="address"></td>
				</tr>
				<tr>
					<td><label>Comment:</label></td>
					<td><textarea name="review" rows="4" cols="50"></textarea></td>
				</tr>
				<tr>
					<center>
						<td><a href="Home.html"><input type="button" value="Home"></a></td>
					</center>
					<td><input type="submit" value="Register" class=" btn-success"></td>



		</table>

	</div>

</body>
</html>


Edit/deltete jsp file

<html><%@page language="java" contentType="text/html" import="java.util.*" import ="com.main.registration.servlets.User" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>View Page</title>
</head>
<style>
th, td {
	padding: 10px 20px;
	text-align: center;
	color: blue;
}

h1 {
	font-size: 50px;
	color: red;
	text-align: center;
}
h2 {
	font-size: 30px;
	color: green;
	text-align: center;
}

#bg {
	background-size: 1300px 700px;
	background-repeat: no-repeat;
	background-position: top;
	background-attachment: fixed;
}

a {
	font-size: 20px;
	font-family: "Arial Black";
	color: gold;
}
</style>
<body style="background-color: white;">
<%List<User> users = (List<User>)request.getAttribute("listUser");
	request.setAttribute("users", users);
	String msg = (String)request.getAttribute("msg");
	request.setAttribute("ms", msg);%>
	<h2><c:out value="${ms}" /></h2>
	<h1>Registered Person</h1>
		<div align="center">
			<table border=2px>
				<tr>
					<th>Email</th>
					<th>Username</th>
					<th>Password</th>
					<th>Number</th>
					<th>Qualification</th>
					<th>Gender</th>
					<th>Technologies</th>
					<th>Country</th>
					<th>Address</th>
					<th>Review</th>
					<th>Action</th>
				</tr>
				<c:forEach items = "${users}" var="user">
				<tr>
					<td><c:out value="${user.email}" /></td>
					<td><c:out value="${user.getUsername()}" /></td>
					<td><c:out value="${user.getPassword()}" /></td>
					<td><c:out value="${user.getMobileNo()}" /></td>
					<td><c:out value="${user.getTotalQual()}" /></td>
					<td><c:out value="${user.gender}" /></td>
					<td><c:out value="${user.totalTech}" /></td>
					<td><c:out value="${user.country}" /></td>
					<td><c:out value="${user.totalAddrs}" /></td>
					<td><c:out value="${user.review}" /></td>
					<td><a href="edit.jsp?username=<c:out value='${user.username}'/>">Edit</a>
					&nbsp;&nbsp;&nbsp;&nbsp;
					<a href="DeleteServlet?username=
					<c:out value='${user.username}' />">Delete</a></td>
				</tr>
				</c:forEach>
			</table>
			<center>
			<a
				href="Home.html"><input type="button" value="Home"></a>
			</center>
		</div>
</body>
</html>


#Login page

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
</head>
<style>
h1 {
	text-align: center;
	font-size: 40px;
	font-family: bold;
	color: #ff1a75;
    border: 1px solid rgb(69, 7, 40);
    background-color:rgb(69, 7, 40);
    height: 60px;
    
}

form {
    background-color:aquamarine;
	
	padding: 20px;
	border-radius: 20px;
	margin-top: 7%;
	width: 50%;
}

center {
	font-size: 15px;
	font-family: "Arial Black";
	color: blue;
}

body {
	background-image: url("sp2.jpg");
	background:aquamarine;
}
</style>
<body bgcolor="pink">
<center>
	<h1>Login Page</h1>
	<form method="post" action="./LoginServlet">
		User name : <input type="text" name="username" /> <br>
		<br> Password : <input type="password" name="password" /> <br>
		<br> <input type="submit" value="login" class=" btn-success">
		<input type="reset" value="clear" class=" btn-danger">
		&nbsp;&nbsp;<a
			href="Home.html"><input type="button" value="Home"></a> <br>
		<br>
	</form>
	<br>
	<br>
	</center>
</body>
</html>

#Registration Succesfull page jsp

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<style>
    center{
        height: 1000;
        width: 700;
       
        color: black;
    }
div {
	margin-top: 40px;
}

.c1 {
	margin: 40px;
	border-radius: 50px;
	border: 1px solid black;
	background-color: rgb(255, 128, 128);
	color: rgb(0, 128, 255);
	padding: 10px 15px;
	text-decoration: none;
	display: table; 
	margin: 0 auto;
	display: table-cell;
}
.c2{background-color: rgb(255, 128, 128);
	color: rgb(0, 128, 255);
	text-decoration: none;
	display: table; 
	margin: 0 auto;
	display: table-cell;
	border:none;
	font-weight: bold;
}

.c1:hover {
	background-color: #00e6e6;
	color: white;
}
.c2:hover{
	background-color: #00e6e6;
	color: white;
}

h2 {
	font-size: 70px;
	font-family: sans-serif;
	font-style: oblique;
	font-style: bold;
	color: #ff00bf;
	text-shadow: 1px 1px 2px skyblue, 0 0 25px blue, 0 0 5px green;
}

.footer {
    background:rgb(242, 62, 92) ;
	color:palegoldenrod;
	text-align: center;
	direction: right;
	margin-top: 200px;
}


#bg {
	background-size: 1500px 700px;
	background-repeat: no-repeat;
	background-position: top;
	background-attachment: fixed;
}
h1 {
	font-size: 60px;
	color: lightgreen;
	text-align: center;
	text-shadow: 2px 2px white;
}

input {
	font-size: 12px;
	font-family: "Arial Black";
	color: black;
	align-self: auto;
}
</style>
<body>
	<h1>Registration Successful...</h1>
	<center>
		<b><h2>Sathya Technology</h2></b>
	<div class="container">
		<div>
			<b><a class="c1" href="Home.html">Home</a></b>
				 <b><a class="c1" href='registration.html'>Registration</a></b> 
					<b><a class="c1" href="login.html">Sign/Login</a></b>
				<b><a class="c1" href="seach.html">Search</a></b> <b>
				<a class="c1" href="resetpassword.html">Reset Password</a></b>
				 <b><form class="c1" action="ViewServlet" method="post">
					<b> <input class="c2" type="submit" value="View"></b> 
					</form></b>
		</div>
	</div>
	</center>
	<footer class="footer">
		<marquee>
			<h1>Welcome To Sathya Technology</h1>
		</marquee>
	</footer>
</body>
</html>

#Search page

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<center>
	<h1>Search Page</h1>
</center>
</head>
<style>
h1 {
	text-align: center;
	font-size: 40px;
	font-family: bold;
	color: #ff1a75;
    border: 1px solid rgb(69, 7, 40);
    background-color:rgb(69, 7, 40);
    height: 60px;
    
}

form {
    background-color:aquamarine;
	
	padding: 20px;
	border-radius: 20px;
	margin-top: 7%;
	width: 50%;
}

center {
	font-size: 15px;
	font-family: "Arial Black";
	color: blue;
}

body {
	background-image: url("sp2.jpg");
	background:aquamarine;
}
</style>
<body background="g.jpg">
<center>
	<form method="post" action="./SearchServlet">
			Mobilenum: <input type="text" name="number"><br>
			<br> Password : <input type="text" name="password"><br>
			<br> <input type="submit" value="Search" class=" btn-success">
			<input type="reset" value="clear" class=" btn-danger"> <a
				href="Home.html"><input type="button" value="Home"></a>
	</form>
	</center>
</body>
</html>

#View page

<%@page language="java" contentType="text/html" import="java.util.*" import ="com.main.registration.servlets.User" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>View Page</title>
</head>
<style>
th, td {
	padding: 10px 20px;
	text-align: center;
	color: blue;
}

h1 {
	font-size: 50px;
	color: red;
	text-align: center;
}

#bg {
	background-size: 1300px 700px;
	background-repeat: no-repeat;
	background-position: top;
	background-attachment: fixed;
}

a {
	font-size: 20px;
	font-family: "Arial Black";
	color: gold;
}
</style>
<body style="background-color: white;">
<%List<User> users = (List<User>)request.getAttribute("listUser");
	request.setAttribute("users", users);%>
	<h1>Registered Person</h1>
		<div align="center">
			<table border=2px>
				<tr>
					<th>Email</th>
					<th>Username</th>
					<th>Password</th>
					<th>Number</th>
					<th>Qualification</th>
					<th>Gender</th>
					<th>Technologies</th>
					<th>Country</th>
					<th>Address</th>
					<th>Review</th>
					<th>Action</th>
				</tr>
				<c:forEach items = "${users}" var="user">
				<tr>
					<td><c:out value="${user.email}" /></td>
					<td><c:out value="${user.getUsername()}" /></td>
					<td><c:out value="${user.getPassword()}" /></td>
					<td><c:out value="${user.getMobileNo()}" /></td>
					<td><c:out value="${user.getTotalQual()}" /></td>
					<td><c:out value="${user.gender}" /></td>
					<td><c:out value="${user.totalTech}" /></td>
					<td><c:out value="${user.country}" /></td>
					<td><c:out value="${user.totalAddrs}" /></td>
					<td><c:out value="${user.review}" /></td>
					<td><a href="edit.jsp?username=<c:out value='${user.username}'/>">Edit</a>
					&nbsp;&nbsp;&nbsp;&nbsp;
					<a href="DeleteServlet?username=
					<c:out value='${user.username}' />">Delete</a></td>
				</tr>
				</c:forEach>
			</table>
			<center>
			<a
				href="Home.html"><input type="button" value="Home"></a>
			</center>
		</div>
</body>
</html>

# reset password page

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<center>
	<h1>Reset your Password</h1>
</center>
</head>
<style>
h1 {
	text-align: center;
	font-size: 40px;
	font-family: bold;
	color: #ff1a75;
    border: 1px solid rgb(69, 7, 40);
    background-color:rgb(69, 7, 40);
    height: 60px;
    
}

form {
    background-color:aquamarine;
	
	padding: 20px;
	border-radius: 20px;
	margin-top: 7%;
	width: 50%;
}

center {
	font-size: 15px;
	font-family: "Arial Black";
	color: blue;
}

body {
	background-image: url("sp2.jpg");
	background:aquamarine;
}
</style>
<body bgcolor='#b3d9ff'>
<center>
	<form method="post" action="./ResetPassword">
			<table>
				<tr>
					<td><label>Email:</label></td>
					<td><input type="text" placeholder="Enter Email" name="email"></td>
				</tr>
				<tr>
					<td><label> Password:</label></td>
					<td><input type="text" placeholder="Enter new password"
						name="password"></td>
				</tr>
				<tr>
					<td><label>Confirm:</label>
					<td><input type="password" placeholder="Confirm password"
						name="confirmpassword"></td>
				</tr>
				<tr>
					<td><input type="submit" value="Submit" class=" btn-success">
					<td><input type="reset" value="clear" class=" btn-danger">
						<a href="Home.html"><input type="button" value="Home"></a>
			</table>
		
	</form>
	</center>

</body>
</html>

#Login Successful Page

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<style>
div {
	margin-top: 40px;
}

.c1 {
	margin: 40px;
	border-radius: 50px;
	border: 1px solid black;
	background-color: rgb(255, 128, 128);
	color: rgb(0, 128, 255);
	padding: 10px 15px;
	text-decoration: none;
	display: table; 
	margin: 0 auto;
	display: table-cell;
}
.c2{background-color: rgb(255, 128, 128);
	color: rgb(0, 128, 255);
	text-decoration: none;
	display: table; 
	margin: 0 auto;
	display: table-cell;
	border:none;
	font-weight: bold;
}

.c1:hover {
	background-color: #00e6e6;
	color: white;
}
.c2:hover{
	background-color: #00e6e6;
	color: white;
}

h2 {
	font-size: 70px;
	font-family: sans-serif;
	font-style: oblique;
	font-style: bold;
	color: #ff00bf;
	text-shadow: 1px 1px 2px skyblue, 0 0 25px blue, 0 0 5px green;
}
h1 {
	font-size: 60px;
	color: lightgreen;
	text-align: center;
	text-shadow: 2px 2px white;
	}

.footer {
	margin-top: 0px;
	color: #00ffff;
	text-align: center;
	direction: right;
}

#bg {
	background-size: 1500px 700px;
	background-repeat: no-repeat;
	background-position: top;
	background-attachment: fixed;
}

input {
	font-size: 12px;
	font-family: "Arial Black";
	color: black;
	align-self: auto;
}
</style>
<body>
	<h1>Login Successful...</h1>
	<center>
		<b><h2>Sathya Technology</h2></b>
	<div class="container">
		<div>
			<b><a class="c1" href="Home.html">Home</a></b>
				 <b><a class="c1" href='registration.html'>Registration</a></b> 
					<b><a class="c1" href="login.html">Sign/Login</a></b>
				<b><a class="c1" href="seach.html">Search</a></b> <b>
				<a class="c1" href="resetpassword.html">Reset Password</a></b>
				 <b><form class="c1" action="ViewServlet" method="post">
					<b> <input class="c2" type="submit" value="View"></b> 
					</form></b> 
		</div>
	</div>
<iframe src="https://sathyatech.com/our-courses" height="400px" width="100%"></iframe>
	</center>
	<footer class="footer">
		<marquee>
			<h1>Welcome To Sathya Technology</h1>
		</marquee>
	</footer>
</body>
</html>

#Edit file -jsp
<%@page language="java" contentType="text/html" import="java.util.*" import ="com.main.registration.servlets.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Edit User</title>
<style>
form {
	margin-top: 7%;
	background-color: aquamarine;
	padding: 20px;
	width: 50%;
	border-radius: 20px;
	border: 3px blue solid;
}
center{
	font-size: 15px;
	font-family: "Arial Black";
	color: blue;
}
body {
	background-image: url("sp4.jpg");
	background-color: aquamarine;
}
h1 {
	text-align: center;
	font-size: 40px;
	font-family: bold;
	color: #ff1a75;
    border: 1px solid rgb(69, 7, 40);
    background-color:rgb(69, 7, 40);
    height: 60px;
}
input {
	font-size: 12px;
	font-family: "Arial Black";
	color: black;
}
label {
	font-size: 15px;
	font-family: "Arial Black";
	color: blue;
}
</style>
</head>
<body>
	<%
		String username = request.getParameter("username");

	%>
	<center>
	<h1>Edit User: <%= username %></h1>
	<form action="./UpdateServlet" method="GET">
		<table>
				<tr>
					<td><label>Current Username:</label></td>
					<td><input type="text" placeholder="<%= username %>" name="uname" value="<%= username %>" readonly="readonly"></td>
				</tr>
				<tr>
					<td><label>Email:</label></td>
					<td><input type="text" placeholder="Enter Email" name="email"></td>
				</tr>
				<tr>
					<td><label>New Username:</label></td>
					<td><input type="text" placeholder="Enter Username"
						name="username"></td>
				</tr>
				<tr>
					<td><label>Password:</label></td>
					<td><input type="password" placeholder="Enter Password"
						name="password"></td>
				</tr>
				<tr>
					<td><label>Number:</label></td>
					<td><input type="text" placeholder="Enter Mobile Number"
						name="number"></td>
				</tr>
		</table>
		<input type="submit" value="Save">
	</form>
	</center>
</body>
</html>

# property file

username = gorang
password = welcome
driver =oracle.jdbc.driver.OracleDriver
url = jdbc:oracle:thin:@Localhost:1521:xe

#Login fail 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<style>
div {
	margin-top: 40px;
}

.c1 {
	margin: 40px;
	border-radius: 50px;
	border: 1px solid black;
	background-color: rgb(255, 128, 128);
	color: rgb(0, 128, 255);
	padding: 10px 15px;
	text-decoration: none;
	display: table; 
	margin: 0 auto;
	display: table-cell;
}
.c2{background-color: rgb(255, 128, 128);
	color: rgb(0, 128, 255);
	text-decoration: none;
	display: table; 
	margin: 0 auto;
	display: table-cell;
	border:none;
	font-weight: bold;
}

.c1:hover {
	background-color: #00e6e6;
	color: white;
}
.c2:hover{
	background-color: #00e6e6;
	color: white;
}

h2 {
	font-size: 70px;
	font-family: sans-serif;
	font-style: oblique;
	font-style: bold;
	color: #ff00bf;
	text-shadow: 1px 1px 2px skyblue, 0 0 25px blue, 0 0 5px green;
}
h1 {
	font-size: 60px;
	color: lightgreen;
	text-align: center;
	text-shadow: 2px 2px white;
	}

.footer {
	margin-top: 100px;
	color: #00ffff;
	text-align: center;
	direction: right;
}

#bg {
	background-size: 1500px 700px;
	background-repeat: no-repeat;
	background-position: top;
	background-attachment: fixed;
}

input {
	font-size: 12px;
	font-family: "Arial Black";
	color: black;
	align-self: auto;
}
</style>
<body>
	<h1>You Entered Wrong Credentials</h1>
	<center>
		<b><h2>Sathya Technology</h2></b>
	<div class="container">
		<div>
			<b><a class="c1" href="Home.html">Home</a></b>
				 <b><a class="c1" href='registration.html'>Registration</a></b> 
					<b><a class="c1" href="login.html">Sign/Login</a></b>
				<b><a class="c1" href="seach.html">Search</a></b> <b>
				<a class="c1" href="resetpassword.html">Reset Password</a></b>
				 <b><form class="c1" action="ViewServlet" method="post">
					<b> <input class="c2" type="submit" value="View"></b> 
					</form></b>
		</div>
	</div>
	</center>
	<footer class="footer">
		<marquee>
			<h1>Welcome To Sathya Technology</h1>
		</marquee>
	</footer>
</body>
</html>

-----> Create all above files in webapp folder of the project.......

#Delete Servlet
package com.main.registration.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public DeleteServlet() {
        super();
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		boolean status=UserDAO.delete(username);
		if(status) {
			request.setAttribute("message", "Deleted Successfully");
			RequestDispatcher dispatcher = request.getRequestDispatcher("ViewServlet");
			dispatcher.forward(request, response);
    }
    }

}

# login Servlet
package com.main.registration.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public LoginServlet() {
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		
		String username=request.getParameter("username");
		String password =request.getParameter("password");
		
		boolean status=UserDAO.loginCheck(username, password);
		if(status) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("log.html");
	 	      dispatcher.include(request, response);
		}
		else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("log1.html");
	 	      dispatcher.include(request, response);
		
		}	
	}

}

#Registration sevlet

package com.main.registration.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public RegistrationServlet() {
    	super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");
		 PrintWriter writer=response.getWriter();
		  
		 String email=request.getParameter("email");
		 String username=request.getParameter("username");
		 String password=request.getParameter("password");
		 String mobileNo=request.getParameter("number");
		 String [] qualification=request.getParameterValues("qualification");
		 String gender=request.getParameter("gender");
		 String [] technologies=request.getParameterValues("technologies");
		 String  country=request.getParameter("country");
		 String [] address=request.getParameterValues("address");
	     String review = request.getParameter("review");
	     
	     	String totalQual = String.join(",", qualification);
			String totalTech = String.join(",", technologies);
			String totalAddrs = String.join(",", address);
         
       int count=UserDAO.save(email,username,password,mobileNo,totalQual,gender,totalTech,country,totalAddrs,review);
       if(count==1) {
    	   RequestDispatcher dispatcher = request.getRequestDispatcher("regsuccess.jsp");
 	      dispatcher.forward(request, response);
        	}
        	else {
        		RequestDispatcher dispatcher = request.getRequestDispatcher("registration.html");
      	      dispatcher.forward(request, response);
        	}
         
	}

}

#Reset password

package com.main.registration.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ResetPassword")
public class ResetPassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
        public ResetPassword() {
        super();
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String confirmpassword=request.getParameter("confirmpassword");

		if(password.equals(confirmpassword)) {
		   boolean status= UserDAO.resetPassword(email,password);
		   if(status) {
				request.getRequestDispatcher("resetpassword.html").include(request, response);
				   writer.println("<html><body><p style='color:red'><center>your password reset/change  successfully</p></center></body></html>");

		   }
		   else {
			   
				request.getRequestDispatcher("resetpassword.html").include(request, response);
				   writer.println("<html><body><p style='color:red'><center>you entered wrong  email address</center></p></body></html>");

		   }
		    
		    
		}
		else {
			request.getRequestDispatcher("resetpassword.html").include(request, response);
			   writer.println("<html><body><p style='color:red'><center>you entered wrong detail please valid  detail</center></p></body></html>");

		}
	}

}

#Search Servlet

package com.main.registration.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L; 
    public SearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
        String mobileNo = request.getParameter("number");
        String password = request.getParameter("password");
		String[] data = UserDAO.search(mobileNo,password);
		writer.println("<html><body><center>");
        writer.println("<table border=\"2px\"><tr>"
        		+ "<th>Email</th>"
        		+ "<th>Username</th>"
        		+ "<th>Password</th>"
        		+ "<th>Number</th>"
        		+ "<th>Qualification</th>"
        		+ "<th>Gender</th>"
        		+ "<th>Technologies</th>"
        		+ "<th>Country</th>"
        		+ "<th>Address</th>"
        		+ "<th>Review</th>"
        		+ "</tr><tr>");
		for(String d:data)
		{	writer.println("<td>");
			writer.println(d);
			writer.println("</td>");
		}
		writer.println("</tr></table>");
		writer.print("<a href='login.html'>Click here to goto login page</a></center>");
		writer.println("</body></html>");
	}

}

# JDBC connection file

package com.main.registration.servlets;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class TestConn {
	public static Connection createConnection() {
		Connection connection = null;
		try {
			Properties properties = new Properties();
			properties.load(new FileInputStream("D:\\Adv java\\Registration\\src\\main\\webapp\\abc.properties"));

			Class.forName(properties.getProperty("driver"));
			connection = DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("username"),
					properties.getProperty("password"));
		} catch (IOException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
}

# Update Servlet

package com.main.registration.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public UpdateServlet() {
        super();
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String uname=request.getParameter("uname");
		String email=request.getParameter("email");
		String username=request.getParameter("username");
		 String password=request.getParameter("password");
		 String mobileNo=request.getParameter("number");
		 UserDAO.updateProfile(uname, email, username, password, mobileNo);
		 request.setAttribute("message", "Updated Successfully");
		 RequestDispatcher dispatcher = request.getRequestDispatcher("ViewServlet");
		 dispatcher.forward(request, response);
    }

}
#Dao File

package com.main.registration.servlets;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    private static final String SELECT_ALL_USERS = "SELECT * FROM login";

    public static int save(String email, String username, String password, String mobileNo, String totalQual,
            String gender, String totalTech, String country, String totalAddrs, String review) {
        int rowCount = 0;
        try(Connection connection = TestConn.createConnection();) {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("INSERT INTO login VALUES(?,?,?,?,?,?,?,?,?,?)");
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, username);
            preparedStatement.setString(3, password);
            preparedStatement.setString(4, mobileNo);
            preparedStatement.setString(5, totalQual);
            preparedStatement.setString(6, gender);
            preparedStatement.setString(7, totalTech);
            preparedStatement.setString(8, country);
            preparedStatement.setString(9, totalAddrs);
            preparedStatement.setString(10, review);
            rowCount = preparedStatement.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return rowCount;
    }

    public static List<User> selectAllUsers() {

        // using try-with-resources to avoid closing resources (boiler plate code)
        List<User> users = new ArrayList<>();
        // Step 1: Establishing a Connection
        try (Connection connection = getConnection();
                // Step 2:Create a statement using connection object
                PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_USERS);) {
            // System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                String email = rs.getString(1);
                String username = rs.getString(2);
                String password = rs.getString(3);
                String mobileNo = rs.getString(4);
                String totalQual = rs.getString(5);
                String gender = rs.getString(6);
                String totalTech = rs.getString(7);
                String country = rs.getString(8);
                String totalAddrs = rs.getString(9);
                String review = rs.getString(10);
                users.add(new User(email, username, password, mobileNo, totalQual, gender, totalTech, country,
                        totalAddrs, review));
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return users;
    }

    private static void printSQLException(SQLException e) {
        e.printStackTrace();
    }

    private static Connection getConnection() {
    	Connection connection = TestConn.createConnection();
    	return connection;
    }

    public static boolean loginCheck(String username, String password) {

        try(Connection connection = TestConn.createConnection();) {
            Statement statement = connection.createStatement();
            ResultSet set = statement.executeQuery("SELECT * FROM login");

            while (set.next()) {
                String uname = set.getString(2);
                String pword = set.getString(3);				
				if (uname.equals(username) && pword.equals(password)) {
					
					return true;
				} 
			}
		

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return false;

	}

	public static String[] search(String mobileNo, String password) {
		String[] data = null; 
		try(Connection connection = TestConn.createConnection();) {			
			Statement statement = connection.createStatement();
			ResultSet set = statement.executeQuery("select * from login where mobileNo='"+mobileNo+"'and password='"+password+"'");
						
			set.next();
			
			data = new String[set.getMetaData().getColumnCount()];
			
			for(int i=1;i<=data.length;i++)
			{	data[i-1] = set.getString(i);
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}		
		return data;		
	}

	public static boolean delete(String username) {
		int count=0;
		try(Connection connection = TestConn.createConnection();) {
			Statement statement=connection.createStatement();
			 count=statement.executeUpdate("delete from login where username='"+username+"'");
			
			 if(count!=0) {
				 return true;
			 }
		} catch (Exception e) {
           e.printStackTrace();
		}
		return false;
	}

	public static boolean resetPassword(String email, String password) {
		int count=0;
		try(Connection connection = TestConn.createConnection();) {
		Statement statement=connection.createStatement();
		 count=statement.executeUpdate("update  login set password='"+password+"' where email='"+email+"'");		 
		 if(count!=0) {
			 return true;
				
			}
		}
		
		catch (Exception e) {
            e.printStackTrace();
		}
		return false;
	}

	public static String[] view1() {
		// TODO Auto-generated method stub
		return null;
	}

	public static String[] view11() {
		// TODO Auto-generated method stub
		return null;
	}
	public static User editUser(String uname) {

        // using try-with-resources to avoid closing resources (boiler plate code)
		User user=null;
        // Step 1: Establishing a Connection
        try (Connection connection = getConnection();
                // Step 2:Create a statement using connection object
                PreparedStatement preparedStatement = connection.prepareStatement("select * from login where username='"+uname+"'");) {
            // System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                String email = rs.getString(1);
                String username = rs.getString(2);
                String password = rs.getString(3);
                String mobileNo = rs.getString(4);
                String totalQual = rs.getString(5);
                String gender = rs.getString(6);
                String totalTech = rs.getString(7);
                String country = rs.getString(8);
                String totalAddrs = rs.getString(9);
                String review = rs.getString(10);
                user=new User(email, username, password, mobileNo, totalQual, gender, totalTech, country,
                        totalAddrs, review);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return user;
    }
	public static boolean updateProfile(String uname, String email,String username,String password,String number) {
		int count=0;
		try(Connection connection = TestConn.createConnection();Statement statement=connection.createStatement();) {
		 count=statement.executeUpdate("UPDATE login "
		 		+ "SET email ='"+email+"',"
		 		+ "username ='"+username+"',"
		 		+ "password ='"+password+"',"
		 		+ "mobileNo ='"+number+"'"
		 		+ "WHERE username='"+uname+"'");
		 System.out.println(uname);
		 System.out.println(count);
		 if(count!=0) {
			 return true;
				
			}
		}
		
		catch (Exception e) {
            e.printStackTrace();
		}
		return false;
	}
	}

#View Servlet
package com.main.registration.servlets;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ViewServlet")
public class ViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public ViewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	List<User> listUser = null;
    	String msg = (String) request.getAttribute("message");
		try {
			listUser = UserDAO.selectAllUsers();
		} catch (Exception e) {
			e.printStackTrace();
		}
		request.setAttribute("listUser", listUser);
		request.setAttribute("msg", msg);
		RequestDispatcher dispatcher = request.getRequestDispatcher("dlt.jsp");
		dispatcher.forward(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	List<User> listUser = null;
		try {
			listUser = UserDAO.selectAllUsers();
		} catch (Exception e) {
			e.printStackTrace();
		}
		request.setAttribute("listUser", listUser);
		RequestDispatcher dispatcher = request.getRequestDispatcher("view.jsp");
		dispatcher.forward(request, response);
		
    }
}




