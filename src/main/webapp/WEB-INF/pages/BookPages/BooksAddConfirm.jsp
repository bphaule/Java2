<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Books: Add</title>
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
</body>
</html>