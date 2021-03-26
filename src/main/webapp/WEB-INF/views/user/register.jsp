<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
<h1>Register</h1>

<form:form method="post" modelAttribute="user">
    First Name: <form:input path="firstName"/><br>
    Last Name: <form:input path="lastName"/><br>
    Email: <form:input path="email" type="email"/><br>
    Password: <form:input path="password"/><br>
    <input type="submit" value="Register">
</form:form>

</body>
</html>
