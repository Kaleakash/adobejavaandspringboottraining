<%@page import="com.bean.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="emp.jsp"></jsp:include>
<table border="2" cellpadding="10">
	<tr>
		<th>Id</th>
		<th>Name</th>
		<th>Salary</th>
	</tr>
	<core:forEach items="${requestScope.listOfRec}" var="rec">
		<tr>
			<td><core:out value="${rec.id}"></core:out></td>
			<td><core:out value="${rec.name}"></core:out></td>
			<td><core:out value="${rec.salary}"></core:out></td>
		</tr>
	</core:forEach>
</table>
</body>
</html>