<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri = "http://www.springframework.org/tags/form" prefix="mvc" %>
   <%@ page isELIgnored="false" %>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Main Menu</title>
<style type="text/css">
    <%@include file="mystyle.css" %>
</style>
</head>
<body>
<h2>Books Menu</h2>
	<ul>
		<li><a href = "BookSearch.mvc">Search and Borrow</a></li>
		<li><a href = "CheckIn.mvc">Check Books Back In</a></li>
		<li><a href = "CheckPages.mvc">Check Books Out</a></li>
		<li><a href = "Books.mvc">Book Menu</a></li>
		<li><a href = "BorrowerMenu.mvc">Borrowers Menu</a></li>
		<li><a href = "ReportPage.mvc">Reports</a></li>
        <!--  <li><a href = "viewAll.mvc">View All Users</a></li>  -->
	</ul>
</body>
</html>