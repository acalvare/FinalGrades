<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student</title>
</head>
<body>
	This is a list of the students:

	<table>
		<tr>
			<th> First Name </th>
			<th> Last Name </th>
			<th> Percentage </th>
			<th> Final Grade </th>
			<th> Lowest Grade </th>
			<th> Second Lowest Grade </th>
			<th> Middle Grade </th>
			<th> Second Highest Grade </th>
			<th> Highest Grade </th>
		</tr>
		<c:forEach items="${students}" var="student">
		<tr>
			<td>${student.firstName}</td>
			<td>${student.lastName}</td>
			<td>(${student.percent}%)</td>
			<td>(${student.finalGrade})</td>
			<td>${student.sortedGrades["0"]}</td>
			<td>${student.sortedGrades["1"]}</td>
			<td>${student.sortedGrades["2"]}</td>
			<td>${student.sortedGrades["3"]}</td>
			<td>${student.sortedGrades["4"]}</td>
		</tr>

		</c:forEach>
	</table>
 <a href="/FinalGrades" > Back </a>

</body>
</html>