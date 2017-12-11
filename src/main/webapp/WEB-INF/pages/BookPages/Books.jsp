<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri = "http://www.springframework.org/tags/form" prefix="mvc" %>
   <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book Maintenance</title>
<style type="text/css">
    <%@include file="../mystyle.css" %>
</style>
</head>
<body>
<h2>Books Maintenance</h2>
	<ul>
		<li><a href = "BooksAdd.mvc">Add a Book</a></li>
		<li><a href = "BooksModify.mvc">Modify Book Entry</a></li>
		<li><a href = "BooksDelete.mvc">Delete Book</a></li>
	</ul>
</body>
</html>