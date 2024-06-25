<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 2024/6/20
  Time: 10:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>期刊投稿管理系统</title>
    <style>
        /* 基本样式重置 */
        body, h1, input {
            font-family: Arial, sans-serif;
        }

        /* 整体容器样式 */
        .d1 {
            width: 600px;
            margin: 0 auto;
            padding: 20px;
            background-color: #f9f9f9;
            border: 1px solid #ddd;
            border-radius: 5px;
        }

        /* 标题样式 */
        .d1 h1 {
            text-align: center;
            color: #333;
        }

        /* 表单输入样式 */
        .d1 input[type="text"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }

        /* 提交按钮样式 */
        .d1 input[type="submit"] {
            padding: 10px 20px;
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

        /* 表单布局样式 */
        .d1 form > label {
            display: block;
            margin-bottom: 5px;
            font-weight: bold;
        }
    </style>
</head>
<body>
<div class="d1">
<h1>修改文章信息</h1>
<form action="modifyArticleByArticleID" method="post">
    <input type="hidden" name="articleID" value="${article.articleID}"/>
    标题：<input type="text" name="title" value="${article.title}"/><br/>
    文件地址：<input type="text" name="filepath" value="${article.filepath}"/><br/>
    类别号：<input type="text" name="categoryID" value="${article.categoryID}"/><br/>
    上传时间：<input type="text" name="upLoadTime" value="${article.upLoadTime}"/><br/>
    更新时间：<input type="text" name="updateTime" value="${article.updateTime}"/><br/>
    审核状态：<input type="text" name="state" value="${article.state}"/><br/>
    关键字：<input type="text" name="keywords" value="${article.keywords}"/><br/>
    点击次数：<input type="text" name="count" value="${article.count}"/><br/>
    <input type="submit" value="修改">
</form>
</div>
</body>
</html>
