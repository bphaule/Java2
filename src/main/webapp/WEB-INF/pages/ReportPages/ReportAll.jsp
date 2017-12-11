<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri = "http://www.springframework.org/tags/form" prefix="mvc" %>
   <%@ page isELIgnored="false" %>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All Library Books</title>
<style type="text/css">
    <%@include file="../mystyle.css" %>
</style>
</head>
<body>
	
	<h1 style="text-align: center;">List Of All Books In The Library</h1>
	
	<c:forEach items="${all}" var="item">
		<table>
			<tr>
				<td>Book ID</td>
				<td>${item.id}</td>
			</tr>
			<tr>
				<td>Name</td>
				<td>${item.name}</td>
			</tr>
			<tr>
				<td>Author</td>
				<td>${item.author}</td>
			</tr>
			<tr>
				<td>Detail</td>
				<td>${item.detail}</td>
			</tr>
			<tr>
				<td>Copyright Year</td>
				<td>${item.copyrightyear}</td>
			</tr>
			<tr>
				<td>ISBN</td>
				<td>${item.isbn}</td>
			</tr>
			<tr>
				<td>Country</td>
				<td>${item.country}</td>
			</tr>
			<tr>
				<td>Number Available</td>
				<td>${item.numAvailable}</td>
			</tr>
		</table>
		<br />
		<hr style="text-align: left; margin-left: 0; width: 25%">
		<br />
	</c:forEach>
	
</body>
</html>