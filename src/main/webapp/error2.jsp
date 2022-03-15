<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@page isErrorPage="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Error Page</title>
</head>
<body>
	<h3> Due to following reasons an error has occurred</h3>
	<ul>
		<li>${pageContext.exception}</li>
		<li>${pageContext.exception.message}</li>
	</ul>
</body>
</html>