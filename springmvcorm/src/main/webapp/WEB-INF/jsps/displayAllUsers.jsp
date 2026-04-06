<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="com.spring.springcore.springmvcorm.user.entity.User, java.util.List"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% List<User> user = (List<User>) request.getAttribute("users");
		for(User e: user){
			out.println(e.getId());
			out.println(e.getName());
			out.println(e.getEmail());
		}
	%>
</body>
</html>