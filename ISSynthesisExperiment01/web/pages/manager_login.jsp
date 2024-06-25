<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 2024/6/19
  Time: 23:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>管理员登录界面</title>
</head>
<body>
<div class="d1">
    <form action="../pages/main.jsp" method="post" onsubmit="checkReg()" onreset="cleanInfo()">
        用户名：<input type="text" id="account" name="account" placeholder="请输入用户名"><br>
        密码：<input type="password" id="password" name="password" placeholder="请输入密码"><br>
        <input type="submit" id="submit1" value="登录">
        <input type="reset" id="reset1" value="重置">
    </form>
</div>
<script>
    function checkReg() {
        var account = document.getElementById('account').value;
        var password = document.getElementById('password').value;

        fetch('/getManagers')
            .then(response => response.json())
            .then(data => {
                data.forEach(manager => {
                    console.log(manager.id, manager.name);
                });
            })
            .catch(error => console.error('Error:', error));

    }
</script>
</body>
</html>
