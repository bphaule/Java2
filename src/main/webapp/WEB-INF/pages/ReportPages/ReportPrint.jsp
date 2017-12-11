<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri = "http://www.springframework.org/tags/form" prefix="mvc" %>
   <%@ page isELIgnored="false" %>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All Borrowers</title>
<style type="text/css">
    <%@include file="../mystyle.css" %>
</style>
</head>
<body>
	
	<h1 style="text-align: center;">Print Book Information</h1>
	
	<c:forEach items="${all}" var="item">
		<table>
			<tr>
				<td>Borrower ID</td>
				<td>${item.idborrowers}</td>
			</tr>
			<tr>
				<td>First Name</td>
				<td>${item.firstname}</td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td>${item.lastname}</td>
			</tr>
			<tr>
				<td>Email</td>
				<td>${item.email}</td>
			</tr>
			<tr>
				<td>Phone 1</td>
				<td>${item.phone1}</td>
			</tr>
			<tr>
				<td>Phone 2</td>
				<td>${item.phone2}</td>
			</tr>
			<tr>
				<td>Address 1</td>
				<td>${item.address1}</td>
			</tr>
			<tr>
				<td>Address 2</td>
				<td>${item.address2}</td>
			</tr>
			<tr>
				<td>City</td>
				<td>${item.city}</td>
			</tr>
			<tr>
				<td>State</td>
				<td>${item.state}</td>
			</tr>
			<tr>
				<td>Zip</td>
				<td>${item.zip}</td>
			</tr>
		</table>
		<br />
		<hr style="text-align: left; margin-left: 0; width: 25%">
		<br />
	</c:forEach>
	
</body>
</html>