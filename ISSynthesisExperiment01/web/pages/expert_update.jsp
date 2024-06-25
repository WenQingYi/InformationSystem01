<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 2024/6/20
  Time: 19:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>期刊投稿管理系统</title>
    <style>
        /* 基本样式重置 */
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
        }

        /* 整体容器样式 */
        .d1 {
            max-width: 400px;
            margin: 50px auto;
            padding: 20px;
            background-color: #ffffff;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        /* 标题样式 */
        .d1 h1 {
            margin-top: 0;
            text-align: center;
            color: #333;
        }

        /* 段落样式 */
        .d1 p {
            margin-bottom: 15px;
            font-size: 0.9em;
            color: #666;
        }

        /* 表单输入样式 */
        .d1 input[type="text"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }

        /* 提交按钮样式 */
        .d1 input[type="submit"] {
            width: 100%;
            padding: 10px;
            background-color: #4CAF50;
            color: white;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        /* 提交按钮悬停效果 */
        .d1 input[type="submit"]:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
<div class="d1">
<h1>审稿</h1>
<form action="updateStateByArticleID" method="post">
    <input type="hidden" name="articleID" value="${article.articleID}">
    <p>1:'未审' 2:'退回' 3:'通过'</p>
    审稿状态： <input type="text" name="state" value="${article.state}"/><br/>
    <input type="submit" value="提交审稿结果">
</form>
</div>
</body>
</html>
