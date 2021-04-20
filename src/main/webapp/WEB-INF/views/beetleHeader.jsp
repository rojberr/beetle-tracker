<%@ page import="com.beetletracker.beetle.user.UserService" %>
<%@ page import="com.beetletracker.beetle.user.User" %>
<%@ page import="org.springframework.web.context.WebApplicationContext" %>
<%@ page import="org.springframework.security.core.context.SecurityContextHolder" %>
<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String name = SecurityContextHolder.getContext().getAuthentication().getName();
    if(!name.equals("anonymousUser")) {
        WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(application);
        UserService userService = context.getBean(UserService.class);
        User currentUser = userService.findByEmail(name);
        pageContext.setAttribute("currentUser", currentUser);
    }
%>



<nav class="navbar navbar-expand-lg bg-secondary text-uppercase fixed-top" id="mainNav">
    <div class="container">
        <a class="navbar-brand js-scroll-trigger" href="<c:url value="/#page-top"/>">Beetle Tracker</a>
        <button class="navbar-toggler navbar-toggler-right text-uppercase font-weight-bold bg-primary text-white rounded" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
            Menu
            <i class="fas fa-bars"></i>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
            <ul class="navbar-nav ml-auto">

                <sec:authorize access="!isAuthenticated()">
                    <li class="nav-item mx-0 mx-lg-1"><a class="nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger" href="#portfolio">Login</a></li>
                </sec:authorize>

                <li class="nav-item mx-0 mx-lg-1"><a class="nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger" href="<c:url value="/#about"/>">Demo</a></li>
                <li class="nav-item mx-0 mx-lg-1"><a class="nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger" href="<c:url value="/#contact"/>">Contact us</a></li>

                <sec:authorize access="isAuthenticated()">
                    <li class="nav-item mx-0 mx-lg-1"><a class="nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger" href="<c:url value="/app/home"/>">Home</a></li>
                    <li class="dropdown mx-0 mx-lg-1">
                        <a href="#" class="dropdown-toggle nav-link py-3 px-0 px-lg-3 rounded" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><span class="glyphicon glyphicon-user" aria-hidden="true"></span>
                            ${currentUser.firstName} ${currentUser.lastName}
                            <span class="caret"></span></a>
                        <ul class="dropdown-menu p-3">
                            <li><a href="#"><span class="glyphicon glyphicon-cog" aria-hidden="true"></span> User Settings</a></li>
                            <li><a href="/logout"><span class="glyphicon glyphicon-log-out" aria-hidden="true"></span> Logout</a></li>
                        </ul>
                    </li>
                </sec:authorize>

            </ul>
        </div>
    </div>
</nav>
