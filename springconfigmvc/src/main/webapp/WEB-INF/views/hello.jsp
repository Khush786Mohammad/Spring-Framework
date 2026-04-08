<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="UTF-8">
<title>Hello</title>
</head>
<body>
	<h1>Welcome to Spring to Spring MVC</h1>
	<%
	Object id = (Object) request.getAttribute("id");
	String name = (String) request.getAttribute("name");
	Object age = (Object) request.getAttribute("age");

	out.println("ID: " + id);
	out.println("Name: " + name);
	out.println("Age is: " + age);
	%>
	<div>
		<ul>
			<li>${id}</li>
			<li>${name}</li>
			<li>${age}</li>
		</ul>
	</div>
</body>
</html>