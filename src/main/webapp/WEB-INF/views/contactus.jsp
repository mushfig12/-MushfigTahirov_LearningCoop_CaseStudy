<%--This jsp is for contact us web page. It has contact us form --%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact Us Page</title>

<link rel="stylesheet" type="text/css" href="/cssandjs/style.css">
</head>
<body style="background-color:lightBlue;">
<h1 style="color:blue;text-align:center;">Contact Us</h1>
 <h4 style="color:blue; text-align:left;">Welcome ${currentPrincipal}!</h4>
<%@ include file="navbar.html" %>


<div class="flex-container">

  <div>
 
  <form:form action="contactUs" method="POST" modelAttribute="contactUs">
<div>
    <label>First Name:</label>
    <form:input path="firstname"/>
    <form:errors path="firstname"/>
</div>
<div>
    <label>Last Name:</label>
    <form:input path="lastname"/>
    <form:errors path="lastname"/>
</div>
<div>
    <label>Education:</label>
    <form:input path="education"/>
    <form:errors path="education"/>
</div>
<div>
    <label>Your Message:</label>
    <form:textarea path="message" style="height:200px"/>
    <form:errors path="message"/>
</div>
<div>
    <input type="submit" value="Submit">
</div>
  </form:form>
  
  </div>
 
  <div> 
   <h1>The GRE prep everyone is talking about!</h1>
  <h4>Study anywhere, anytime on desktop or mobile
Email assistance whenever you get stuck
Fully supported on PC, Mac, Android, and iOS</h4>
<h4>Magoosh students score an average of 6 points higher in each section than all other GRE takers
Top-quality study materials continually updated based on millions</h4>
<h4>Smart feedback and progress tracking to turn your weaknesses into strengths</h4>

<h1>The MATH prep second to none!</h1>
<h4>Kaplan Test Prep is the leader in computerized test preparation, offering you a one-stop destination 
for test prep, admissions.</h4><h4> you achieve your goals 
through books,software, online and center-based courses. Planning to go to law, business, grad, or medical 
school? 
Visit Kaptest.com for admissions tips, test strategies, school spotlights, and more!</h4>

<h1>The JAVA prep gradually building from buttom to top!</h1>
<h4>Java is a high-level programming language originally developed by Sun Microsystems and</h4>
<h4> released in 1995. Java runs on a variety of platforms, such as Windows, Mac OS, and the various versions of UNIX. 
 This reference will take you through simple and practical approaches while 
learning Java Programming language.</h4>
  
  </div>
  
</div>






</body>
</html>