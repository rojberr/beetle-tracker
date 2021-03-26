<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <title>Login</title>
</head>
<body>

<form method="post">
    Email: <input type="email" name="username"/><br>
    Password: <input type="password" name="password"/><br>
    <input type="submit" value="Log in">
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    <a href="/register">Create Account</a>
</form>


</body>
</html>
