<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>期刊投稿管理系统</title>
    <style type="text/css">
        /* 整体背景色和字体设置 */
        body {
            background-color: #f4f4f4;
            font-family: Arial, sans-serif;
            text-align: center; /* 使内容居中 */
        }

        /* h1 标题样式 */
        h1 {
            color: #333;
            font-size: 2.5em;
            margin-bottom: 20px; /* 为下面的链接留出空间 */
        }

        /* 链接容器样式 */
        .d1 {
            width: 300px; /* 设置固定宽度 */
            margin: 10% auto; /* 水平和垂直居中 */
            padding: 20px; /* 内边距 */
            background-color: #fff; /* 白色背景 */
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1); /* 阴影效果 */
            border-radius: 5px; /* 圆角 */
            text-align: left; /* 链接文本左对齐 */
        }

        /* 链接样式 */
        .d1 a {
            display: block; /* 块级显示 */
            padding: 10px 0; /* 上下内边距 */
            color: #3498db; /* 链接颜色 */
            text-decoration: none; /* 去除下划线 */
            font-size: 1.2em; /* 字体大小 */
            transition: color 0.3s ease; /* 颜色过渡效果 */
        }

        /* 鼠标悬停链接时的样式 */
        .d1 a:hover {
            color: #e74c3c; /* 悬停颜色 */
        }
    </style>
</head>
<body>
<h1>期刊投稿管理系统</h1>
<div class="d1">
<a href="mlogin.jsp">管理员登录</a><br>
<a href="alogin.jsp">作者登录</a><br>
<a href="elogin.jsp">编辑登录</a><br>
<a href="expert_login.jsp">审稿员登录</a><br>
<a href="enroll.jsp">注册</a>
    <a href="article/findArticleState3">查看期刊</a>
</div>
</body>
</html>
