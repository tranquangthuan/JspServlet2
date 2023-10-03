<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
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
		<h1>Products Management</h1>
		<h2>
			<a href="${pageContext.request.contextPath}/product-add">Add New
				Products</a>
		</h2>
	</div>
	<div align="center">
		<table>
			<thead>
				<tr>
					<td>Order</td>
					<td>Name</td>
					<td>Color</td>
					<td>Quantity</td>
					<td>Status</td>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="product" items="${products}" varStatus="loop">
					<tr>
						<td>${loop.count}</td>
						<td>${product.name}</td>
						<td>${product.color }</td>
						<td>${product.quantity }</td>
						<td>
						<c:if test="${product.quantity > 0 }">
						    Con Hang
						</c:if>
						<c:if test="${product.quantity <= 0}">
						    Het Hang
						</c:if>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>