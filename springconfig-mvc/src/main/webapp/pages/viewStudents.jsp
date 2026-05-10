<%@ page contentType="text/html;charset=UTF-8" language="java"%>

<%@ page import="java.util.List"%>
<%@ page import="com.spring.springcore.springconfigmvc.entity.Student"%>

<!DOCTYPE html>
<html>
<head>
<title>View Students</title>

<style>
body {
	font-family: Arial, sans-serif;
	background: linear-gradient(135deg, #74ebd5, #9face6);
	margin: 0;
	padding: 40px;
}

.container {
	width: 90%;
	margin: auto;
	background: white;
	padding: 30px;
	border-radius: 12px;
	box-shadow: 0px 4px 12px rgba(0, 0, 0, 0.2);
}

h1 {
	text-align: center;
	margin-bottom: 30px;
	color: #333;
}

table {
	width: 100%;
	border-collapse: collapse;
}

table th {
	background: #6c63ff;
	color: white;
	padding: 14px;
}

table td {
	padding: 12px;
	text-align: center;
	border-bottom: 1px solid #ddd;
}

tr:hover {
	background: #f5f5f5;
}

.btn {
	display: inline-block;
	margin-top: 20px;
	padding: 12px 20px;
	background: #6c63ff;
	color: white;
	text-decoration: none;
	border-radius: 8px;
}

.btn:hover {
	background: #574bdb;
}

.delete-btn{
    background: crimson;
    color: white;
    padding: 8px 12px;
    text-decoration: none;
    border-radius: 6px;
    margin-right: 8px;
}

.update-btn{
    background: #2196F3;
    color: white;
    padding: 8px 12px;
    text-decoration: none;
    border-radius: 6px;
}
</style>
</head>

<body>

	<div class="container">

		<h1>📋 Student Records</h1>

		<table>

			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Email</th>
				<th>Course</th>
				<th>Actions</th>
			</tr>

			<%
			List<Student> students = (List<Student>) request.getAttribute("students");

			for (Student student : students) {
			%>

			<tr>
				<td><%=student.getId()%></td>
				<td><%=student.getName()%></td>
				<td><%=student.getEmail()%></td>
				<td><%=student.getCourse()%></td>
				<td>
					<a href="deleteStudent/<%=student.getId() %>" class="delete-btn">Delete</a>
					<a href="updateStudent/<%=student.getId() %>" class="update-btn">Update</a>
				</td>
			</tr>

			<%
			}
			%>

		</table>

		<a href="home" class="btn">🏠 Back to Home</a>

	</div>

</body>
</html>