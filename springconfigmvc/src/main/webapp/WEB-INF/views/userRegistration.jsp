<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="registerUser" method="post" style="display:flex; flex-direction:column">
		<label for="id">Id:</label>
		<input type="text" id="id" name="id"/>
		
		<label for="name">Name:</label>
		<input type="text" id="name" name="name"/>
		
		<label for="e-mail">Email:</label>
		<input type="text" id="e-mail" name="email"/>
		
		<input type="submit" name="register" />
	</form>
</body>
</html>