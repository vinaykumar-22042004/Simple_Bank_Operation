<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
	p{
	font-style:bold;
	}
</style>
<body>
	<p>Creating a new account</p>
	<form action="AddServlet" method="post">
	Enter the account number :<input type="text" name="accno">
	Enter the account Holder name: <input type="text" name="name">
	<input type="submit">
	</form>	
</body>
</html>