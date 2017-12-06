<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri = "http://www.springframework.org/tags/form" prefix="mvc" %>
   <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Borrower Addition</title>
</head>
<body>
<h2>Borrower - Add</h2>
<mvc:form modelAttribute="borrowedbooks" action="BorrowerAdd.mvc">
	<table>
	    <tr>
	        <td><mvc:label path="borrowerID">ID</mvc:label></td>
	        <td><mvc:input path="borrowerID" /></td>
	    </tr>
	    <tr>
	        <td><mvc:label path="firstname">First Name</mvc:label></td>
	        <td><mvc:input path="firstname" /></td>
	    </tr>
	    <tr>
	        <td><mvc:label path="lastname">Last Name</mvc:label></td>
	        <td><mvc:textarea path="lastname" /></td>
	    </tr>
		<tr>
            <td><mvc:label path="email">Email</mvc:label></td>
            <td><mvc:input path="email" /></td>
        </tr>
        <tr>
            <td><mvc:label path="phone1">Phone #1</mvc:label></td>
            <td><mvc:input path="phone1" /></td>
        </tr>
        <tr>
            <td><mvc:label path="phone2">Phone #2</mvc:label></td>
            <td><mvc:select path="phone2" /></td>
        </tr>
        <tr>
            <td><mvc:label path="address1">Address Line 1</mvc:label></td>
            <td><mvc:select path="address1" /></td>
        </tr>
        <tr>
            <td><mvc:label path="address2">Address Line 2</mvc:label></td>
            <td><mvc:select path="address2" /></td>
        </tr>
        <tr>
            <td><mvc:label path="city">City</mvc:label></td>
            <td><mvc:select path="city" /></td>
        </tr>
        <tr>
            <td><mvc:label path="state">State</mvc:label></td>
            <td><mvc:select path="state" /></td>
        </tr>
        <tr>
            <td><mvc:label path="zip">Zip Code</mvc:label></td>
            <td><mvc:select path="zip" /></td>
        </tr>
        <tr>
	        <td colspan="2">
                <input type="submit" value="Submit" />
	        </td>
	    </tr>
	</table>  
</mvc:form>
</body>
</html>