<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
    <title>Show All Users</title>
</head>
<body>
<table  border="2">
    <col width="40">
    <col width="130">
    <col width="130">
    <col width="130">
    <thead>
    <tr>
        <th>User Id</th>
        <th>Name</th>
        <th>City</th>
        <th>age</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${users}" var="user">
        <tr>
            <td><c:out value="${user.id}" /></td>
            <td><c:out value="${user.name}" /></td>
            <td><c:out value="${user.city}" /></td>
            <td><c:out value="${user.age}" /></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<p></p>



<form action="create" method="GET">
        Create new user:
        <input type="text" name="username">
        <input type="text" name="city">
        <input type="text" name="age">
        <input type="submit" value="create" />
</form>
<p></p>
<form action="delete" method="GET">
        Delete user by id:
        <input type="text" name="id">
        <input type="submit" name = "" value="delete" />
</form>
<p></p>
<form action="update" method="GET">
    Update user by id:
    <input type="text" name="id">
    <input type="text" name="username">
    <input type="text" name="city">
    <input type="text" name="age">
    <input type="submit" name="" value="update" />
</form>



</body>
</html>