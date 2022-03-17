<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<html>
<body>
	<%@include file="header.jsp"%>
	</br>
	<h2>Hello World!22222</h2>
	</br>
	<%@include file="footer.jsp"%>
	<a href="${pageContext.request.contextPath}/products">Products</a>
	<a href="${pageContext.request.contextPath}/login">Login</a>
	<a href="${pageContext.request.contextPath}/profile">Profile</a>
	<a href="${pageContext.request.contextPath}/logout">Logout</a>
</body>
</html>
