<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Home</title>

    <style>
        body {
            margin: 0;
            font-family: Arial, sans-serif;
            background: linear-gradient(120deg, #74ebd5, #9face6);
            height: 100vh;
        }

        .container {
            text-align: center;
            padding-top: 100px;
        }

        h1 {
            color: #fff;
            font-size: 40px;
            margin-bottom: 20px;
        }

        p {
            color: #f1f1f1;
            font-size: 18px;
            margin-bottom: 40px;
        }

        .btn {
            display: inline-block;
            padding: 12px 25px;
            margin: 10px;
            font-size: 16px;
            color: white;
            background: #333;
            border: none;
            border-radius: 25px;
            text-decoration: none;
            transition: 0.3s;
        }

        .btn:hover {
            background: #555;
            transform: scale(1.05);
        }

        .footer {
            position: absolute;
            bottom: 20px;
            width: 100%;
            text-align: center;
            color: #fff;
            font-size: 14px;
        }
    </style>
</head>

<body>

<div class="container">
    <h1>Welcome to Student Management System</h1>
    <p>Manage your students easily with Spring MVC</p>

    <a href="<%=request.getContextPath()%>/add-student" class="btn">➕ Add Student</a>
    <a href="<%=request.getContextPath()%>/viewStudent" class="btn">📋 View Students</a>
</div>

<div class="footer">
    <p>© 2026 Spring MVC Demo Project</p>
</div>

</body>
</html>