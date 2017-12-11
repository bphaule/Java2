<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri = "http://www.springframework.org/tags/form" prefix="mvc" %>
   <%@ page isELIgnored="false" %>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Checked Out Books</title>
<style type="text/css">
    <%@include file="../mystyle.css" %>
</style>
</head>
<body>
	
	<h1 style="text-align: center;">List Of Borrowed Books</h1>
	
	<c:forEach items="${all}" var="item">
		<table>
			<tr>
				<td>Book ID:</td>
				<td>${item.BookID}</td>
			</tr>
			<tr>
				<td>Borrower ID:</td>
				<td>${item.BorrowerID}</td>
			</tr>
			<tr>
				<td>Checkout Time:</td>
				<td>${item.CheckedOut}</td>
			</tr>
		</table>
		<br />
		<hr style="text-align: left; margin-left: 0; width: 25%">
		<br />
	</c:forEach>
	
</body>
</html>