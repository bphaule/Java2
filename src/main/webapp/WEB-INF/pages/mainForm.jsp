<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri = "http://www.springframework.org/tags/form" prefix="mvc" %>
   <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Main Menu</title>
<style type="text/css">
/*
body {
	
	background-color: #c5d4e8;
	
}

h1, h2 {
	
	text-align: center;
	
}
*/
</style>
<link href="../layout.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<h2>Books Menu</h2>
	<ul><p><span style="font-size: 1.3em; font-weight: bold;">Options:</span></p>
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