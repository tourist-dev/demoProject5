<%--
  Created by IntelliJ IDEA.
  User: sameer
  Date: 24/05/21
  Time: 1:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>create</title>
</head>
<body>
<h1>Add record into student database</h1>
<form action="createServlet" method="post">
  ID: <input type="text" name="id">
  NAME: <input type="text" name="name">
  CLASS: <input type="text" name="class">
</form>
</body>
</html>
