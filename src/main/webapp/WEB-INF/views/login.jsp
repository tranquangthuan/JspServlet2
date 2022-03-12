<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Login Form</h3>
	<form action="login" method="post">
		<table cellspacing="5px">
			<tr>
				<td>User name</td>
				<td><input type="text" size="20px" name="userName"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" size="20px" name="password"></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="Submit" style="border-radius: 10px; width: 80px"> <input
					type="reset" value="Clean" style="border-radius: 10px; width: 80px">
				</td>
			</tr>
		</table>
	</form>

</body>
</html>