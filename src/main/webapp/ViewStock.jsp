<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Enumeration"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Collections"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String stockCode = request.getParameter("stockCode");
		String stockName = request.getParameter("stockName");
		String description = request.getParameter("des");
		String[] sans = request.getParameterValues("san");
		out.println("Stock Code = " + stockCode + "</br>");
		out.println("Stock Name = " + stockName + "</br>");
		out.println("Stock Description = " + description + "</br>");
		for(String san : sans) {
			out.println("San = " + san + "</br>");
		}
		ArrayList<String> parameterNamesList = Collections.list(request.getParameterNames());
		for (String e : parameterNamesList) {
			out.println("Paramerter = " + e.toString() + "</br>");
		}
	%>
</body>
</html>