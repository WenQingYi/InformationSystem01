<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>

</head>
<body>

<h1>查询所有用户</h1>

<%--    ${userList}--%>
<table border="1">
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
        <td><a href="findByUserID?userID=${user.userID}">修改</a></td>
    </tr>
</c:forEach>
</table>
</body>
</html>

