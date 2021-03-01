<%--This jsp is for student registration web page. It has student registration form --%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration Page</title>

<link rel="stylesheet" type="text/css" href="/cssandjs/style.css">
</head>
<body style="background-color: lightBlue;">

	<h1 style="color: blue; text-align: center;">Student Registration</h1>
	
	 <h4 style="color:blue; text-align:left;">Welcome ${currentPrincipal}!</h4>
	<%@ include file="navbar.html"%>
	<br>
	<br>
	<div class="flex-container">
		<div>
			<form:form action="StudentRegistration" method="POST"
				modelAttribute="student">
				<div>
					<label>First Name:</label>
					<form:input path="firstname" />
					<form:errors path="firstname" />
				</div>

				<div>
					<label>Last Name:</label><br>
					<form:input path="lastname" />
					<form:errors path="lastname" />
				</div>

				<div>
					<label>Email Address:</label>
					<form:input path="studentEmail" />
					<form:errors path="studentEmail" />
				</div>

				<div>
					<label>Desired Course:</label>
					<form:input path="course" />
					<form:errors path="course" />
				</div>

				<div>
					<input type="submit" value="Register as a Student" />
				</div>
			</form:form>

			<div>
				<form>
					<label>Enter a number of sessions:</label> 
					<input type="text" id="square1" required /> 
					<input type="submit" onclick="compute()" id="course-price" value="Calculate" />
				</form>
				<script type="text/javascript" src="/cssandjs/script1.js"></script>
				<script>
					document.getElementById("course-price");
				</script>

			</div>
		</div>

		<div>
			<h1>The GRE prep everyone is talking about!</h1>
			<h4>Study anywhere, anytime on desktop or mobile Email
				assistance whenever you get stuck Fully supported on PC, Mac,
				Android, and iOS</h4>
			<h4>Students score an average of 6 points higher in each
				section than all other GRE takers Top-quality study materials
				continually updated based on millions</h4>
			<h4>Smart feedback and progress tracking to turn your weaknesses
				into strengths</h4>

			<h1>The MATH prep second to none!</h1>
			<h4>Test Prep is the leader in computerized test
				preparation, offering you a one-stop destination for test prep,
				admissions.</h4>
			<h4>you achieve your goals through books,software, online and
				center-based courses. Planning to go to law, business, grad, or
				medical school? Visit Kaptest.com for admissions tips, test
				strategies, school spotlights, and more!</h4>

			<h1>The JAVA prep gradually building from buttom to top!</h1>
			<h4>Java is a high-level programming language originally
				developed by Sun Microsystems and</h4>
			<h4>released in 1995. Java runs on a variety of platforms, such
				as Windows, Mac OS, and the various versions of UNIX. This reference
				will take you through simple and practical approaches while learning
				Java Programming language.</h4>
			<h3 style="color: dodgerblue;">Course price is based on a number
				of sessions.</h3>
			<h3 style="color: dodgerblue;">Each session lasts for 3 hours.</h3>
		</div>

	</div>



</body>
</html>