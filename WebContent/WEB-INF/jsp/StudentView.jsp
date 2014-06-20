<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student</title>
<style type="text/css">@import url("<c:url value="/css/main.css"/>");</style>
</head>
<body>

<form:form commandName="student" action="addStudent" method="post">
	<fieldset>
	<legend> Add A Student</legend>
	<p>
		<label for="firstName"> First Name: </label>
		<form:input id="firstName" path="firstName"/>
	</p>
	<p>
		<label for="lastName"> Last Name: </label>
		<form:input id="lastName" path="lastName"/>
	</p>
	<p>
		<label for="grade1"> Grade 1: </label>
		<form:input id="grade1" path="grade1"/>
	</p>
	<p>
		<label for="grade2"> Grade 2: </label>
		<form:input id="grade2" path="grade2"/>
	</p>
	<p>
		<label for="grade3"> Grade 3: </label>
		<form:input id="grade3" path="grade3"/>
	</p>
	<p>
		<label for="grade4"> Grade 4: </label>
		<form:input id="grade4" path="grade4"/>
	</p>
	<p>
		<label for="grade5"> Grade 5: </label>
		<form:input id="grade5" path="grade5"/>
	</p>
	<p id="buttons">
		<input id="reset" type="reset" />
		<input id="submit" type="submit" value="Add Student"/>
	</fieldset>
</form:form>


</body>
</html>