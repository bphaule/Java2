<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri = "http://www.springframework.org/tags/form" prefix="mvc" %>
   <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Check Books Out</title>
<style type="text/css">
    <%@include file="../mystyle.css" %>
</style>
</head>
<body>

<mvc:form modelAttribute="books" action="CheckOut.mvc">
	<h1 style="text-align: center;">Check Books Out</h1>
	<label for="out">Enter Book Isbn</label>
	<input type="text" name="out" id="out"/>
	<label for="borrowerid">Borrower ID</label>
	<input type="text" name="borrowerid" id="borrowerid"/>
	<input type="submit" value="submit"/>
</mvc:form>

</body>
</html>