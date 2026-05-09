<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>Registration Success</title>

    <style>

        *{
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        body{
            font-family: Arial, sans-serif;
            background: linear-gradient(135deg, #74ebd5, #9face6);
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
        }

        .container{
            width: 500px;
            background: white;
            padding: 35px;
            border-radius: 15px;
            box-shadow: 0px 4px 15px rgba(0,0,0,0.2);
        }

        h1{
            text-align: center;
            color: green;
            margin-bottom: 25px;
        }

        .student-details{
            margin-top: 20px;
        }

        .detail{
            padding: 12px;
            margin-bottom: 12px;
            background: #f5f5f5;
            border-radius: 8px;
            font-size: 17px;
        }

        .label{
            font-weight: bold;
            color: #333;
        }

        .btn{
            display: block;
            text-align: center;
            margin-top: 25px;
            padding: 12px;
            background: #6c63ff;
            color: white;
            text-decoration: none;
            border-radius: 8px;
            transition: 0.3s;
        }

        .btn:hover{
            background: #574bdb;
        }

    </style>
</head>

<body>

<div class="container">

    <h1>✅ Student Updated Successfully</h1>

    <div class="student-details">

        <div class="detail">
            <span class="label">Student ID:</span>
            ${student.id}
        </div>

        <div class="detail">
            <span class="label">Student Name:</span>
            ${student.name}
        </div>

        <div class="detail">
            <span class="label">Email:</span>
            ${student.email}
        </div>

        <div class="detail">
            <span class="label">Course:</span>
            ${student.course}
        </div>

    </div>

    <a href="home" class="btn">🏠 Back to Home</a>

</div>

</body>
</html>