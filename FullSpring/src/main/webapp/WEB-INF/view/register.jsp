<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>REGISTER PAGE</title>
</head>
<body>
<form  id="regForm" action="RegisterProcess" method="post">
<p>firstname:<input type="text" name="fname"   placeholder="Enter your firstname"></p>
<p>lastname:<input type="text" name="lname"    placeholder="Enter your lastname"></p>
<p>Username:<input type="text" name="uname"   placeholder="Enter your username"></p>
<p>password:<input type="text" name="password"  placeholder="Enter your password"></p>

<p>email:<input type="text"   name="email"      placeholder="Enter your email"></p>
<p>address:<input type="text"  name="address"   placeholder="Enter your address"></p>
<p>phone:<input type="text"     name="phone"   placeholder="Enter your phone"></p>
<button type="submit" >REGISTER</button>

</form>
</body>
</html>