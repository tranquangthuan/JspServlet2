<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Random"%>
<html>
<body>
	<h2>Hello World!</h2>
	<%
		Random random = new Random();
		int randomInt = random.nextInt(5);
		List<String> arrayList = new ArrayList<>();
		arrayList.add("1");
		arrayList.add("2");
		arrayList.add("3");
	%>
	<%
		for (String item : arrayList) {
	%>
	Item =<%=item%>
	<a href="<%=item%>"></a>
	</br>
	<%
		}
	%>
	<h2>
		Random value =
		<%=randomInt%>
	</h2>
	JSP Implicit Objects
	<br>
	<%
		String serverName = request.getServerName();
		out.println("<h1>Now is " + serverName + "</h1>");
		String contextPatch = request.getContextPath();
		out.println("Context patch = " + contextPatch);
		//response.sendRedirect("http://google.com");
		//response.sendError(403, "ban khong co quyen truy cap");
		String name = request.getParameter("name");
		out.println("</br>");
		out.println("name get from url = " + name);
	%>

	<h3>STOCK INFORMATION</h3>
	<form action="ViewStock.jsp" method="post">
		<table cellspacing="5px">
			<tr>
				<td>Stock Code:</td>
				<td><input type="text" size="20px" name="stockCode"></td>
			</tr>
			<tr>
				<td>Stock Name:</td>
				<td><input type="text" size="20px" name="stockName"></td>
			</tr>
			<tr>
				<td>Description:</td>
				<td><textarea rows="3px" cols="30" name="des"></textarea></td>
			</tr>
			<tr>
				<td>San:</td>
				<td><input type="checkbox" name="san" value="HOSE">
					Hose <input type="checkbox" name="san" value="HNX"> HNX</td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="Submit" style="border-radius: 10px; width: 80px"> <input
					type="reset" value="Clean" style="border-radius: 10px; width: 80px">
				</td>
			</tr>
		</table>
	</form>

	<br>
</body>
</html>
