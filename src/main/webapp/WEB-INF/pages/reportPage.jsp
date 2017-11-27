<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri = "http://www.springframework.org/tags/form" prefix="mvc" %>
   <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Report Book Information</title>

<style type="text/css">
	
	a {
		
		margin: 1%;
		
	}
	
</style>
</head>
<body>
	
	<h1 style="text-align: center;">Please Choose What Books You Want To View</h1>
	<div style="margin: 1% auto; border: medium solid black;">
		
		<nav style="margin: 0 auto; text-align: center;">
			<a href="availableBooks.mvc" title="View Available Books" alt="View Available Books">List Of Available Library Books</a>
			<a href="outBooks.mvc" title="View Checked Out Books" alt="View Checked Out Books">View Checked Out Books</a>
			<a href="printBooks.mvc" title="Print List Of Books" alt="Print A List Of All Books">Print List Of Books</a>
		</nav>
		
	</div>
</body>
</html>