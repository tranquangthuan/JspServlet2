<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<style>
table, th, td {
	border: 1px solid;
	border-collapse: collapse;
	padding: 10px;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h1>Add new Product</h1>
	</div>
	<div align="center">
		<form action="product-add" method="post">
			<table>
				<tr>
					<td>Name</td>
					<td><input type="text" name="name" /></td>
				</tr>
				<tr>
					<td>Color</td>
					<td><input type="text" name="color" /></td>
				</tr>
				<tr>
					<td>Quantity</td>
					<td><input type="text" name="quantity" /></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Add" /></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>