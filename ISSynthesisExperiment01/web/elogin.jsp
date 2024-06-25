<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 2024/6/20
  Time: 19:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Journal Submission System</title>
    <script>
        function updateLink() {
            var email = document.getElementById('emailInput').value;
            var password = document.getElementById('passwordInput').value;
            var link = document.getElementById('articleLink');
            link.href = 'editor/getArticleAll';
        }
    </script>
    <style type="text/css">
        /* 整体样式 */
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        /* 表单容器样式 */
        div.d1 {
            background-color: #ffffff;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.15);
            width: 300px;
        }

        /* 标签样式 */
        label {
            display: block;
            margin-bottom: 5px;
        }

        /* 输入框样式 */
        input[type="text"],
        input[type="password"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 3px;
        }

        /* 链接样式（这里用作登录按钮） */
        a.login-button {
            display: inline-block;
            padding: 10px 20px;
            background-color: #4CAF50;
            color: white;
            text-decoration: none;
            border-radius: 3px;
            transition: background-color 0.3s ease;
        }

        /* 鼠标悬停链接（登录按钮）时的样式 */
        a.login-button:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
<div class="d1">
<label for="emailInput">email:</label>
<input type="text" id="emailInput" oninput="updateLink()"><br>
<label for="passwordInput">密码:</label>
<input type="password" id="passwordInput" oninput="updateLink()"><br>
<a id="articleLink" href="#">登录</a>
</div>
</body>
</html>
