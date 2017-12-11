<%@page import="org.apache.taglibs.standard.tag.common.xml.ForEachTag"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="mvc"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Result</title>
<style>
table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

td, th {
    border: 1px solid #dddddd;
    text-align: left;
    padding: 8px;
}
<%@include file="../mystyle.css" %>
</style>
</head>
<body>

	<table title="Search Results" style="border: thin; table-layout: auto;">
		<thead title="Search Results"></thead>
		<caption>Search Results</caption>
		<tbody>
			<tr>
				<th>Title</th>
				<th>Author</th>
				<th>ISBN</th>
				<th>Copyright year</th>
				<th>Check out</th>
				
			</tr>
			<!-- Loop statment to go through all the 
			data returned to the database that matches the condition -->
			
				
					<c:forEach var="listValue" items="${bookList}">
						
							<tr>
								<td>${listValue.name}</td>
								<td>${listValue.author}</td>
								<td>${listValue.isbn}</td>
								<td>${listValue.copyrightyear}</td>
							</tr>
						
						
					</c:forEach>
		</tbody>
	</table>
</body>
</html>