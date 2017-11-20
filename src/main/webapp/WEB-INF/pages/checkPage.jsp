<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri = "http://www.springframework.org/tags/form" prefix="mvc" %>
   <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Check Books In</title>
</head>
<body>

<mvc:form modelAttribute="books" action="checkin.mvc">
	<h1 style="text-align: center;">Check Books In</h1>
	<label for="in">Enter Book Isbn</label>
	<input type="text" name="in" id="in"/>
	<input type="submit" value="submit"/>
</mvc:form>

</body>
</html>