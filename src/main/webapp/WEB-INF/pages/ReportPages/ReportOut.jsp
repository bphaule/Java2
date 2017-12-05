<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="mvc"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Checked Out Books</title>
<link href="../layout.css" rel="stylesheet" type="text/css"/>
</head>
<body>
	
	<h1 style="text-align: center;">List Of Checked Out Books</h1>
	
	<c:forEach items="${all}" var="item">
		<table>
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
		</table>
		<br />
		<hr style="text-align: left; margin-left: 0; width: 25%">
		<br />
	</c:forEach>
	
</body>
</html>