<%--This jsp is for welcome/about web page It contains all courses table and forms for searching based on name, name containing, instructor,
instructor containing --%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>About Page</title>

<link rel="stylesheet" type="text/css" href="/cssandjs/style.css">
</head>
<body style="background-color:lightBlue;">

    <h1 style="color:blue;text-align:center;">Welcome to Learning Coop!</h1>
    <h4 style="color:blue; text-align:left;">Welcome ${currentPrincipal}!</h4>
	 <%@ include file="navbar.html"%>
<div class="flex-container">
  <div>

	<form action="about" method="GET">
<!--  		<input name=instructorName placeholder="Instructor Name"/> -->
		<input type="submit" value="Show All Courses" />
	</form>
	<table id="courseList">
		<tr>
			<td>Course Name</td>
			<td>Instructor</td>
			<td>Description</td>
		</tr>
		
		<c:forEach items="${allCourses}" var="course">
			<tr>
				<td>${course.courseName}</td>
				<td>${course.instructorName}</td>
				<td>${course.courseDescription}</td>
				

			</tr>
		</c:forEach>
	</table>
	
	   <p>Search by Name</p>
	<form action="searchByName" method="GET">
		<input type="text" name=courseName placeholder="Course Name"/>
		<input type="submit" value="Search" />
	</form>
	<p>Search by Name Contains</p>
	<form action="searchByNameContains" method="GET">
		<input type="text" name=courseNameSubstring placeholder="Course Name Contains"/>
		<input type="submit" value="Search" />
	</form>

	<p>Search by Instructor</p>
	<form action="searchByInstructor" method="GET">
		<input type="text" name=instructorName placeholder="Instructor Name"/>
		<input type="submit" value="Search" />
	</form>
	<p>Search by Instructor Contains</p>
	<form action="searchByInstructorContains" method="GET">
		<input type="text" name=instructorNameSubstring placeholder="Instructor Contains"/>
		<input type="submit" value="Search" />
	</form>
	
  </div>
 
  <div> <h1>The GRE prep everyone is talking about!</h1>
  <h4>Study anywhere, anytime on desktop or mobile
Email assistance whenever you get stuck
Fully supported on PC, Mac, Android, and iOS</h4>
<h4>Magoosh students score an average of 6 points higher in each section
Top-quality study materials continually updated based on millions</h4>
<h4>Smart feedback and progress tracking to turn your weaknesses into strengths</h4>

<h1>The MATH prep second to none!</h1>
<h4>Kaplan Test Prep is the leader in computerized test preparation,
for test prep, admissions.</h4><h4> you achieve your goals 
through books,software, online and center-based courses. Planning to g
school? 
Visit Kaptest.com for admissions tips, test strategies, school spotlights, and more!</h4>

<h1>The JAVA prep gradually building from buttom to top!</h1>
<h4>Java is a high-level programming language originally developed by Sun Microsystems and</h4>
<h4> released in 1995. Java runs on a variety of platforms, such as Windows, Mac OS, a
 This reference will take you through simple and practical approaches while 
learning Java Programming language.</h4>
  </div>
  
</div>

</body>
</html>