<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<br>
<br>
<br>
<br>
<h2>Hello</h2>
<sec:authorize access="isAuthenticated()">
	<sec:authorize access="hasRole('ROLE_ADMIN')">
		<a class="btn btn-primary" href="/admin">admin</a>
	</sec:authorize>
<form:form action="/logout" method="POST">
	<button type="submit" class="btn btn-danger">Logout</button>
	<a class="btn btn-primary" href="/basket">Basket</a>
</form:form>
</sec:authorize>
<sec:authorize access="!isAuthenticated()">
	<a href="/login">Login</a>
	<a href="/registration">Registration</a>
</sec:authorize>