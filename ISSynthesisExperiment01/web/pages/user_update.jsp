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
<h1>修改用户信息</h1>
<form action="modifyUser" method="post">
    <input type="hidden" name="userID" value="${user.userID}"/>
    昵称：<input type="text" name="nickName" value="${user.nickName}"/><br/>
    密码：<input type="password" name="password" value="${user.password}"/><br/>
    年龄：<input type="text" name="age" value="${user.age}"/><br/>
    性别：<input type="text" name="gender" value="${user.gender}"/><br/>
    真实姓名：<input type="text" name="realName" value="${user.realName}"/><br/>
    身份证号：<input type="text" name="cardID" value="${user.cardID}"/><br/>
    银行卡号：<input type="text" name="debitCard" value="${user.debitCard}"/><br/>
    email：<input type="text" name="email" value="${user.email}"/><br/>
    联系方式：<input type="text" name="phone" value="${user.phone}"/><br/>
    创建时间：<input type="text" name="creatDate" value="${user.creatDate}"/><br/>
    <!--身份（1：作者，2：编辑，3：审稿员）：-->
    <input type="radio" name="typeID" value="1"/>作者
    <input type="radio" name="typeID" value="2"/>编辑
    <input type="radio" name="typeID" value="3"/>审稿员<br/>
    <input type="submit" value="修改">
</form>
</div>
</body>
</html>
