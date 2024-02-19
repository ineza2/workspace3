<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee registration</title>
</head>
<body>
<form action="EmployeeController" method="post">
<div><label for="name">Firstname</label><input type="text" name="fname" id="name"></div>
<div><label for="name">lastname</label><input type="text" name="lname" id="ln"></div>
<div><label for="name">email</label><input type="text" name="email" id="email"></div>
<div><label for="name">position</label><input type="text" name="position" id="position"></div>
<div><label for="name">mobile</label><input type="text" name="mobile" id="mobile"></div>
<div><input type="submit" value="Register"></div>


</form>

<h2>Registered Employees</h2>
<table>
<tr>
<th>ID</th>
<th>fname</th>
<th>lname</th>
<th>email</th>
<th>position</th>
<th>mobile</th>

</tr>
<c:forEach var="emp" items="${employees}">
<tr>
<td><c:out value="${emp.id}"/></td>
<td><c:out value="${emp.firstname}"/></td>
<td><c:out value="${emp.lastname}"/></td>
<td><c:out value="${emp.email}"/></td>
<td><c:out value="${emp.position}"/></td>
<td><c:out value="${emp.mobile}"/></td>
</tr>
</c:forEach>
</table>
</body>
</html>