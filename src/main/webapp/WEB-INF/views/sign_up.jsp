<%--This jsp is for sign up web page. It has sign up form --%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign Up Page</title>

<style type="text/css">

input[type=text] {
  width: 10%;
  padding: 10px 18px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
  
}

input[type=password] {
  width: 10%;
  padding: 10px 18px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
  
}

input[type=submit] {
  width: 10%;
  background-color: DodgerBlue;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: Blue;
}

body {
  
background-image: url('https://www.incimages.com/uploaded_files/image/1920x1080/getty_470493341_20001333200092800_398689.jpg');
}
</style>
</head>
<body>
<!--  style="background-color:lightBlue;" -->
<h1 style="color:blue;text-align:center;">Welcome to Learning Coop!</h1>
  <h2 style="color:blue;text-align:center;">We offer standard and customized courses!</h2>
   <h2 style="color:blue;text-align:center;">Come in and learn more about our outstanding courses! </h2>


<form:form action="register" method="POST" modelAttribute="user">
<div>
<label style="color:blue"><b>Username:</b></label>
<form:input path="username"/>
<form:errors path="username"/>
</div>
<div>
<label style="color:blue"><b>Password:</b></label>
<form:input type="password" path="password"/>
<form:errors path="password"/>
</div>
<div>
<input type="submit" value="Sign Up"/>
</div>
</form:form>

<a style="color:blue; font-size: 20px" href="./login"><b>SIGN IN</b></a>
</body>
</html>