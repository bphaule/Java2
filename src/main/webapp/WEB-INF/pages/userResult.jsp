<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri = "http://www.springframework.org/tags/form" prefix="mvc" %>
   <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Books</title>
</head>
<body>
<h2>Books Added Result</h2>
    <table>
        <tr>
            <td>Name</td>
            <td>${u.name}</td>
        </tr>
        <tr>
            <td>Author</td>
            <td>${u.author}</td>
        </tr>
        <tr>
            <td>Detail</td>
            <td>${u.detail}</td>
        </tr>
        <tr>
            <td>Copyright Year</td>
            <td>${u.copyrightyear}</td>
        </tr>
        <tr>
            <td>ISBN</td>
            <td>${u.isbn}</td>
        </tr>
        <tr>
            <td>Country</td>
            <td>${u.country}</td>
        </tr>
   </table>
<a href = "viewAll.mvc">View all Users</a>
</body>
</html>