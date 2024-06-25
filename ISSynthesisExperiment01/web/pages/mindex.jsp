<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Journal Submission System - mindex</title>
    <link rel="stylesheet" href="../css/styles.css">
</head>
<body>
<div class="main-container">
    <header>
        <h1>Journal Submission System</h1>
        <nav>
            <ul>
                <li><a href="#welcome" class="active">Home</a></li>
                <li><a href="#UIM">User Information Management</a></li>
                <li><a href="#AIM">Article Information Management</a></li>
                <!--<li><a href="logout">Logout</a></li>-->
            </ul>
        </nav>
    </header>
    <main>
        <section id="welcome">
            <h2>Manager,Welcome to the Journal Submission System</h2>
            <p>Select an option from the menu to get started.</p>
            <a href="logout">Logout</a>
        </section>
        <section id="UIM">
            <h2>User Information</h2>
            <a href="../pages/user_add.jsp">新增用户</a>
            <table border="1">
                <tr>
                    <th>用户编号</th>
                    <th>昵称</th>
                    <th>密码</th>
                    <th>年龄</th>
                    <th>性别</th>
                    <th>真实姓名</th>
                    <th>身份证号</th>
                    <th>银行卡号</th>
                    <th>电子邮件</th>
                    <th>联系方式</th>
                    <th>创建时间</th>
                    <th>身份</th>
                    <th>类别</th>
                    <th>修改</th>
                    <th>删除</th>
                </tr>
                <c:forEach items="${userList}" var="user">
                    <tr>
                        <td>${user.userID}</td>
                        <td>${user.nickName}</td>
                        <td>${user.password}</td>
                        <td>${user.age}</td>
                        <td>${user.gender}</td>
                        <td>${user.realName}</td>
                        <td>${user.cardID}</td>
                        <td>${user.debitCard}</td>
                        <td>${user.email}</td>
                        <td>${user.phone}</td>
                        <td>${user.creatDate}</td>
                        <td>${user.typeID}</td>
                        <td>${user.categoryID}</td>
                        <td><a href="findByUserID?userID=${user.userID}">修改</a></td>
                        <td><a href="deleteUserByUserID?userID=${user.userID}">删除</a></td>
                    </tr>
                </c:forEach>
            </table>
        </section>
        <section id="AIM">
            <h2>Article Information</h2>
            <a href="../pages/article_add.jsp">添加文章</a>
                <table border="1">
                    <tr>
                        <th>文章编号</th>
                        <th>用户编号</th>
                        <th>标题</th>
                        <th>文件地址</th>
                        <th>类别号</th>
                        <th>上传时间</th>
                        <th>更新时间</th>
                        <th>审核状态</th>
                        <th>关键字</th>
                        <th>点击次数</th>
                        <th>修改</th>
                        <th>删除</th>
                    </tr>
                    <!-- Submissions will be dynamically loaded here -->
                    <c:forEach  var="article" items="${articleList}">
                    <tr>
                        <td>${article.articleID}</td>
                        <td>${article.userID}</td>
                        <td>${article.title}</td>
                        <td>${article.filepath}</td>
                        <td>${article.categoryID}</td>
                        <td>${article.upLoadTime}</td>
                        <td>${article.updateTime}</td>
                        <td>${article.state}</td>
                        <td>${article.keywords}</td>
                        <td>${article.count}</td>
                        <td><a href="findArticleByArticleID?articleID=${article.articleID}">修改</a></td>
                        <td><a href="deleteArticleByArticleID?articleID=${article.articleID}">删除</a></td>
                    </tr>
                    </c:forEach>
        </section>
    </main>
</div>
</script>
<script src="../js/scripts.js"></script>
</body>
</html>
