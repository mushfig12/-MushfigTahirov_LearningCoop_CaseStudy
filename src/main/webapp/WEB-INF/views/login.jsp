<%--This jsp is for login web page and has login form --%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign In Page</title>
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


<form action="login" method="post">
<div>
<label style="color:blue"><b>Username:</b></label>
<input type="text" name="username"/> 
</div>
<div>
<label style="color:blue"><b>Password:</b></label>
<input type="password" name="password"/> 
</div>
<div>
<input type="submit" value="Sign In"/>
</div>
</form>
<a style="color:blue; font-size:20px" href="./register"><b>SIGN UP</b></a>

</body>
</html>