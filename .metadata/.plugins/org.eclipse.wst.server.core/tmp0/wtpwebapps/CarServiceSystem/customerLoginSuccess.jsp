<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Login Success</title>
<style>
body {
    background-image: url("./images/car-auto-repair.png");
    background-size: 100%;
}
</style>
</head>
<body>
	Dear <%out.print(session.getAttribute("cname"));%>, You have successfully logged in<br>
	<a href="/CarServiceSystem/updateCarDetails.html">Update Car Details</a><br>
	<a href="/CarServiceSystem/serviceRequest.html">Service Request</a><br>
	<a href="/CarServiceSystem/CheckUpdate">Check for an update</a>
</body>
</html>