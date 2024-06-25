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
        /* 整体样式 */
        body {
            font-family: Arial, sans-serif;
            background-color: #f7f7f7;
            margin: 0;
            padding: 20px;
        }

        .d1 {
            background-color: #fff;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
            max-width: 400px;
            margin: 0 auto;
        }

        .d1 h1 {
            text-align: center;
            margin-bottom: 20px;
        }

        .d1 p {
            margin-bottom: 15px;
        }

        .d1 input[type="text"] {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
            margin-bottom: 15px;
        }

        .d1 input[type="submit"] {
            padding: 10px 20px;
            background-color: #4CAF50;
            color: white;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            width: 100%;
        }

        .d1 input[type="submit"]:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
<div class="d1">
<h1>重新对文章进行分类</h1>
<form action="updatecategoryIDByArticleID" method="post">
    <input type="hidden" name="articleID" value="${article.articleID}">
    <p>1:'科幻' 2:'童话' 3:'武侠' 4:'修仙'</p>
    类别： <input type="text" name="categoryID" value="${article.categoryID}"/><br/>
    <input type="hidden" name="updateTime" value="${article.updateTime}"/><br/>
    <input type="submit" value="修改">
</form>
</div>
</body>
</html>
