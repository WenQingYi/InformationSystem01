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
                <li><a href="#submit">Submit Manuscript</a></li>
                <li><a href="#submissions">My Submissions</a></li>
                <li><a href="../index.jsp">Logout</a></li>
            </ul>
        </nav>
    </header>
    <main>
        <section id="welcome">
            <h2>Welcome to the Journal Submission System</h2>
            <p>Select an option from the menu to get started.</p>
            <a href="logout">Logout</a>
        </section>
        <section id="submit">
            <h2>Submit Manuscript</h2>
            <form id="submissionForm">
                <label for="title">Title</label>
                <input type="text" id="title" name="title" required>

                <label for="abstract">Abstract</label>
                <textarea id="abstract" name="abstract" required></textarea>

                <label for="file">Upload File</label>
                <input type="file" id="file" name="file" required>

                <button type="submit">Submit</button>
            </form>
        </section>
        <section id="submissions">
            <h2>My Submissions</h2>
            <ul id="submissionList" >
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
