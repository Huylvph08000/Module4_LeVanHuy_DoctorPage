<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>User Management Application</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>

	<header>
		<nav class="navbar navbar-expand-md navbar-dark"
			style="background-color: blue">
			<div>
				<a href="https://www.xadmin.net" class="navbar-brand"> User Management Application </a>
			</div>

			<ul class="navbar-nav">
				<li><a href="<%=request.getContextPath()%>/list"
					class="nav-link">Users</a></li>
			</ul>
		</nav>
	</header>
	<br>
	<div class="container col-md-5">
		<p><c:out value="${user.doctor_id}" /></p>
		<p><c:out value="${user.doctor_name}" /></p>
		<p><c:out value="${user.sex}" /></p>
		<p><c:out value="${user.nationality}" /></p>
		<p><c:out value="${user.adress}" /></p>
		<p><c:out value="${user.phonenumber}" /></p>
		<p><c:out value="${user.work}" /></p>	
        <p><c:out value="${user.title}" /></p>
	    <p><c:out value="${user.hospital_name}" /></p>				
	</div>
</body>
</html>