<%--
  Created by IntelliJ IDEA.
  User: sameer
  Date: 24/05/21
  Time: 1:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update</title>
</head>
<body>
<h1>Update student record</h1>
<form action="updateServlet" method="post">
    ID: <input type="text" name="id">
    NAME: <input type="text" name="name">
    CLASS: <input type="text" name="class">
    <input type="submit">
</form>
</body>
</html>
