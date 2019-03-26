<%--
  Created by IntelliJ IDEA.
  User: tar
  Date: 2019/3/5
  Time: 19:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%@include file="Header.jsp"%>
<div style="background-color: whitesmoke; margin: 20px 20px;padding: 100px 200px;">

<form  method="post" action="/UserServlet?navigate=Login">
<table class="table">
    <tr><td>用户名：</td><td><input type="text" name="name" ></td></tr>
    <tr><td>密码：</td><td>  <input type="password" name="password"></td></tr>
    <tr><td><button type="submit" class="btn btn-success">登录</button></td></tr>
</table>
</form>
<a href="/UserServlet?navigate=RegisterPage">注册</a>
</div>
<%@include file="footer.jsp"%>

</body>
</html>
