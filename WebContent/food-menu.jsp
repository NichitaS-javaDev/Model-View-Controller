<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Menu</title>
</head>
<body>
	<h2 align="center">MENU</h2>
	<table align="center" border="3" cellpadding="30">
	<c:forEach var="items" items="${foodItems}">
		<tr>
		<td>${items.id}</td>
		<td>${items.item}</td>
		<td>${items.price}</td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>