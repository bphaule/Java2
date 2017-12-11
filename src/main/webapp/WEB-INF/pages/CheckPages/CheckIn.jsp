<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri = "http://www.springframework.org/tags/form" prefix="mvc" %>
   <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Check Books In</title>
<style type="text/css">
    <%@include file="../mystyle.css" %>
</style>
</head>
<body>
	
	<h1 style="text-align: center;">Check Books In</h1>
	
	<mvc:form modelAttribute="BorrowedBooks" action="CheckInResult.mvc">
		<label for="borrowerID">Enter Borrower ID:</label>
		<input type="text" name="borrowerID" id="borrowerID"/>
		<label for="bookID">Enter Book ID:</label>
		<input type="text" name="bookID" id="bookID"/>
		<input type="submit" id="submit" name="submit" value="Submit"/>
	</mvc:form>
	
</body>
</html>