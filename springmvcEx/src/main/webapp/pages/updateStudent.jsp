<%@ page contentType="text/html;charset=UTF-8" 
language="java" isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
    <title>Update Student</title>

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
            width: 450px;
            background: white;
            padding: 35px;
            border-radius: 15px;
            box-shadow: 0px 4px 15px rgba(0,0,0,0.2);
        }

        h1{
            text-align: center;
            margin-bottom: 25px;
            color: #333;
        }

        .form-group{
            margin-bottom: 18px;
        }

        label{
            display: block;
            margin-bottom: 6px;
            font-weight: bold;
            color: #444;
        }

        input{
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 8px;
            outline: none;
        }

        input:focus{
            border-color: #6c63ff;
            box-shadow: 0 0 5px rgba(108,99,255,0.5);
        }

        .disabled-field{
            background: #e9ecef;
            cursor: not-allowed;
        }

        .btn{
            width: 100%;
            padding: 12px;
            background: #2196F3;
            color: white;
            border: none;
            border-radius: 8px;
            font-size: 16px;
            cursor: pointer;
            transition: 0.3s;
        }

        .btn:hover{
            background: #1976D2;
        }

        .back-btn{
            display: block;
            text-align: center;
            margin-top: 15px;
            text-decoration: none;
            color: #555;
        }

        .back-btn:hover{
            color: #000;
        }

    </style>
</head>

<body>

<div class="container">

    <h1>✏ Update Student</h1>

    <form action="<%=request.getContextPath()%>/updateStudentProcess" method="post">

        <input type="hidden" name="id" value="${student.id}" />

        <div class="form-group">

            <label>Student ID</label>

            <input type="text"
                   value="${student.id}"
                   disabled
                   class="disabled-field">

        </div>

        <div class="form-group">

            <label>Student Name</label>

            <input type="text"
                   name="name"
                   value="${student.name}"
                   required>

        </div>

        <div class="form-group">

            <label>Email</label>

            <input type="email"
                   name="email"
                   value="${student.email}"
                   required>

        </div>

        <div class="form-group">

            <label>Course</label>

            <input type="text"
                   name="course"
                   value="${student.course}"
                   required>

        </div>

        <button type="submit" class="btn">
            Update Student
        </button>

    </form>

    <a href="<%=request.getContextPath()%>/viewStudent" class="back-btn">
       ⬅ Back to Student List

    </a>

</div>

</body>
</html>