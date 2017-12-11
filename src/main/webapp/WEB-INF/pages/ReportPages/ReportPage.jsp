<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri = "http://www.springframework.org/tags/form" prefix="mvc" %>
   <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Report Book Information</title>

<style type="text/css">
    <%@include file="../mystyle.css" %>
    
    nav a {
    	
    	padding: 1%;
    	
    }
    
</style>
</head>
<body>
	
	<h1 style="text-align: center;">Please Choose What Books You Want To View</h1>
	<div style="margin: 1% auto; border: medium solid black;">
		
		<nav style="margin: 0 auto; text-align: center;">
			<a href="ReportAll.mvc" title="View All Books" alt="View All Books">List Of All Library Books</a>
			<a href="ReportOut.mvc" title="View Checked Out Books" alt="View Checked Out Books">View Checked Out Books</a>
			<a href="ReportPrint.mvc" title="Display Borrowers" alt="Display Borrowers">View Borrowers</a>
		</nav>
		
	</div>
</body>
</html>