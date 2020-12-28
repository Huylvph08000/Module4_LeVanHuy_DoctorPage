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
				<a href="#" class="navbar-brand"> User
					Management Application </a>
			</div>

			<ul class="navbar-nav">
				<li><a href="<%=request.getContextPath()%>/list"
					class="nav-link">Users</a></li>
			</ul>
		</nav>
	</header>
	<br>
	<form>
	<div class="form-inline">
	  <div class="input-group mb-3">
  <input type="text" class="form-control" placeholder="Tìm kiếm theo tên" aria-label="Name" aria-describedby="basic-addon1">
</div>
	  <select name="department">
	  <optgroup label="Tìm kiếm theo quốc tịch">
          <c:forEach var="itemct" items="${listNationality}">
            <option value="${itemct.id}">${itemct.country}</option>
          </c:forEach>
          </optgroup>
        </select>
	  <select>
	  <optgroup label="Tìm kiếm theo chuyên ngành">
          <c:forEach var="itemmj" items="${listMajor}">
            <option value="${itemmj.id}">${itemmj.major}</option>
          </c:forEach>
          </optgroup>
        </select>
	</div>
	
     <div class="form-inline">
     <select name="department">
	  <optgroup>    
            <option>Nam</option>
            <option>Nữ</option>
          </optgroup>
        </select>
        <select name="department">
	  <optgroup label="Tìm kiếm theo học vấn">
          <c:forEach var="itemhv" items="${listEducation}">
            <option value="${itemhv.id}">${itemhv.education}</option>
          </c:forEach>
          </optgroup>
        </select>
        <select name="department">
	  <optgroup label="TÌm kiếm theo bệnh viện">
          <c:forEach var="itembv" items="${listHospital}">
            <option value="${itembv.id}">${itembv.hospital}</option>
          </c:forEach>
          </optgroup>
        </select>
        <button type="button" class="btn btn-secondary">Search</button>
     </div>
     </form>
	<div class="row">
		<div class="container">
			<h3 class="text-center">List of Doctor</h3>
			<hr>
			<br>
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>ID</th>
						<th>Name</th>
						<th>PhoneNumber</th>
						<th>Major</th>
						<th>Actions</th>
					</tr>
				</thead>
				<tbody>
				
					<c:forEach var="user" items="${listDoctor}">

						<tr>
							<td><c:out value="${user.doctor_id}" /></td>
							<td><c:out value="${user.doctor_name}" /></td>
							<td><c:out value="${user.phonenumber}" /></td>
							<td><c:out value="${user.major_name}" /></td>
							<td><a href="edit?id=<c:out value='${user.doctor_id}' />">Detail</a>
								&nbsp;&nbsp;&nbsp;&nbsp;
						</tr>
					</c:forEach>
		
				</tbody>

			</table>
		</div>
	</div>
</body>
</html>