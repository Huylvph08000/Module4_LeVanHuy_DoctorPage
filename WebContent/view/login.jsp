<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Login Page - Doctor Management</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="/doctorManagement/WebContent/templates/main.css">
</head>
<body>
	<h1> Login to Doctor Management page</h1>
	<%
		String err = request.getParameter("err");
		if ("1".equals(err)) {
			out.print("<h4 style=\"color: red;\">Login failed, please try again!</h4>");
		}
	%>
    <form action="<%=request.getContextPath()%>/login" method="post">
        <label> Username: </label>
        <input type="text" name="username"> <br>
        <label> Password: </label>
        <input type="password" name="password"> <br>
        <label>&nbsp; </label>
        <input type="submit" value="Login" name="submit">
    </form>
</body>
</html>