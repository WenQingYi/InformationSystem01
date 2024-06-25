<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Journal Submission System - Main</title>
    <link rel="stylesheet" href="../css/styles.css">
</head>
<body>
<div class="main-container">
    <header>
        <h1>Journal Submission System</h1>
        <nav>
            <ul>
                <li><a href="#welcome" class="active">Home</a></li>
                <li><a href="#Divice">Submissions Diviced</a></li>
            </ul>
        </nav>
    </header>
    <main>
        <section id="welcome">
            <h2>Welcome to the Journal Submission System</h2>
            <p>Select an option from the menu to get started.</p>
        </section>
        <section id="Divice">
            <h2>Submissions Diviced</h2>
            <ul id="submissionList" >
                <table border="1">
                    <tr>
                        <th>文章编号</th>
                        <th>用户编号</th>
                        <th>标题</th>
                        <th>文件地址</th>
                        <th>上传时间</th>
                        <th>更新时间</th>
                        <th>审核状态</th>
                        <th>关键字</th>
                        <th>类别号</th>
                        <!--<th>点击次数</th>-->
                        <th>修改</th>
                    </tr>
                    <!-- Submissions will be dynamically loaded here -->
                    <c:forEach  var="article" items="${articleList}">
                    <tr>
                        <td>${article.articleID}</td>
                        <td>${article.userID}</td>
                        <td>${article.title}</td>
                        <td>${article.filepath}</td>
                        <td>${article.upLoadTime}</td>
                        <td>${article.updateTime}</td>
                        <td>${article.state}</td>
                        <td>${article.keywords}</td>
                        <td>${article.categoryID}</td>
                        <%--<td>${article.count}</td>--%>
                        <td><a href="findArticleByArticleID?articleID=${article.articleID}">修改</a></td>
                    </tr>
                    </c:forEach>
            </ul>
        </section>
    </main>
</div>
</script>
<script src="../js/scripts.js"></script>
</body>
</html>