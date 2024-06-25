<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 2024/6/20
  Time: 11:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>期刊投稿管理系统</title>
    <style>
        /* 整体样式 */
        body {
            font-family: 'Arial', sans-serif;
            margin: 0;
            padding: 20px;
            background-color: #f5f5f5;
        }

        .d1 {
            max-width: 600px;
            margin: 0 auto;
            background-color: #fff;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
        }

        h1 {
            text-align: center;
            margin-bottom: 20px;
        }
        label, input[type="text"], input[type="password"], input[type="radio"] {
            margin-bottom: 15px;
        }

        input[type="text"], input[type="password"] {
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }

        input[type="radio"] {
            margin-right: 5px;
        }

        input[type="submit"] {
            padding: 10px 20px;
            background-color: #5cb85c;
            color: white;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            align-self: center;
        }

        input[type="submit"]:hover {
            background-color: #4cae4c;
        }
    </style>
</head>
<body>
<div class="d1">
    <h1>新添用户</h1>
<form action="/ISSynthesisExperiment01/user/addArticle" method="post">
    用户编号：<input type="text" name="userID" /><br/>
    标题：<input type="text" name="title" /><br/>
    文件地址：<input type="file" name="filepath" /><br/>
    <!--1:'科幻' 2:'童话' 3:'武侠' 4:'修仙'-->
    类别： <input type="radio" name="categoryID" value="1"/>科幻
           <input type="radio" name="categoryID" value="2"/>童话
           <input type="radio" name="categoryID" value="3"/>武侠
           <input type="radio" name="categoryID" value="4"/>修仙<br/>
    上传时间：<input type="text" name="upLoadTime" /><br/>
    更新时间：<input type="text" name="updateTime" /><br/>
    审核状态：<input type="text" name="state" /><br/>
    关键字：<input type="text" name="keywords" /><br/>
    点击次数：<input type="text" name="count" /><br/>
    <input type="submit" value="添加">
</form>
</div>
</body>
</html>
