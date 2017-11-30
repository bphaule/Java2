<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri = "http://www.springframework.org/tags/form" prefix="mvc" %>
   <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Borrowers Main Menu</title>
</head>
<body>
<h2>Borrowers Menu</h2>
	<ul>
		<li><a href = "BorrowerAdd.mvc">Add a Borrower</a></li>
		<li><a href = "BorrowerModify.mvc">Modify a Borrower</a></li>
		<li><a href = "BorrowerDelete.mvc">Remove a Borrower</a></li>
	</ul>
</body>
</html>