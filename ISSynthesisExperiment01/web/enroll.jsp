<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 2024/6/20
  Time: 22:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户注册表单</title>
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
<h1>输入用户信息</h1>
<form action="user/insertUser" method="post">
    昵称：<input type="text" name="nickName" /><br/>
    密码：<input type="password" name="password" /><br/>
    年龄：<input type="text" name="age" /><br/>
    性别：<input type="text" name="gender" /><br/>
    真实姓名：<input type="text" name="realName" /><br/>
    身份证号：<input type="text" name="cardID" /><br/>
    银行卡号：<input type="text" name="debitCard" /><br/>
    email：<input type="text" name="email" /><br/>
    联系方式：<input type="text" name="phone" /><br/>
    创建时间：<input type="text" name="creatDate" /><br/>
    <!--身份（1：作者，2：编辑，3：审稿员）：-->
    <input type="radio" name="typeID" value="1"/>作者
    <input type="radio" name="typeID" value="2"/>编辑
    <input type="radio" name="typeID" value="3"/>审稿员<br/>
    <!--1:'科幻' 2:'童话' 3:'武侠' 4:'修仙'-->
    <input type="radio" name="categoryID" value="1"/>科幻
    <input type="radio" name="categoryID" value="2"/>童话
    <input type="radio" name="categoryID" value="3"/>武侠
    <input type="radio" name="categoryID" value="4"/>修仙<br/>
    <input type="submit" value="注册">
</form>
</div>
</body>
</html>
