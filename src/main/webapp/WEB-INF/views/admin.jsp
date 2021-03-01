<%--This jsp is for admin web page. It has form for creation of new course, delete and edit course --%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin</title>

<link rel="stylesheet" type="text/css" href="/cssandjs/style.css">
</head>
<body style="background-color:lightBlue;">
	<h1 style="color:blue;text-align:center;">Admin</h1>
 
	<%@ include file="navbar.html"%>

<div class="flex-container">
  <div>
 <p><b>Enter a New Course</b></p>
	<form:form action="createCourse" modelAttribute="course">
		<div>
			<label>Course Name: </label><br>
			<form:input path="courseName" />
			<form:errors path="courseName" />
		</div>
		<div>
			<label>Instructor Name: </label>
			<form:input path="instructorName" />
			<form:errors path="instructorName" />
		</div>
		<div>
			<label>Course Description: </label>
			<form:input path="courseDescription" />
			<form:errors path="courseDescription" />
		</div>
		<div>
			<input type="submit" value="Submit">
		</div>
	</form:form>
<br>

	

<br>
	<table id="courseList">
		<tr>
			<td>Course Name</td>
			<td>Instructor Name</td>
			<td>Course Description</td>
		</tr>
		<c:forEach items="${allCourses}" var="course">
			<tr>
				<td>${course.courseName}</td>
				<td>${course.instructorName}</td>
				<td>${course.courseDescription}</td>
				<td><a href="editCourse?id=${course.id}">Edit</a></td>
				<td><a href="delete/${course.id}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
  
  </div>
 
  <div>  <h1>The GRE prep everyone is talking about!</h1>
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