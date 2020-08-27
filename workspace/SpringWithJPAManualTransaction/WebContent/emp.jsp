<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="spring"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${requestScope.msg}<br>
<h2>Spring MVC with JPA </h2>
<spring:form action="store.spring" commandName="emp">
Id:<spring:input path="id"/><br>
Name:<spring:input path="name"/><br>
Salary:<spring:input path="salary"/><br>
<input type="submit">
</spring:form>
</body>
</html>