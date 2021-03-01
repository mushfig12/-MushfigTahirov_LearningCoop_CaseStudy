<%--This jsp is for edit course web page. It has edit course form --%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Course</title>

<style type="text/css">

input[type=text] {
  width: 25%;
  padding: 10px 18px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
  
}

input[type=submit] {
  width: 25%;
  background-color: DodgerBlue;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: DodgerBlue;
}


</style>
</head>
<body style="background-color:lightBlue;">
<h1 style="color:blue;text-align:center;">Edit Course here</h1>

<%@ include file="navbar.html"%>

<form:form action="editCourse" method="POST" modelAttribute="course">
		<div>
			<form:input type="hidden" path="id" value="${course.id}" />
			<label>Course Name:</label><br>
			<form:input path="courseName" value="${course.courseName}" />
			<form:errors path="courseName" />
		</div>
		<div>
			<label>Instructor Name:</label><br>
			<form:input path="instructorName" value="${course.instructorName}" />
			<form:errors path="instructorName" />
		</div>
		<div>
			<label>Course Description:</label><br>
			<form:input path="courseDescription" value="${course.courseDescription}" />
			<form:errors path="courseDescription" />
		</div>
		<div>
			<input type="submit" value="Submit">
		</div>
	</form:form>

</body>
</html>