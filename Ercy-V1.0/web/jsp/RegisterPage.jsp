<%--
  Created by IntelliJ IDEA.
  User: tar
  Date: 2019/3/25
  Time: 21:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="Header.jsp"%>

    <div style="background-color: whitesmoke; margin: 20px 20px;padding: 100px 200px;">

    <form  method="post" action="/UserServlet?navigate=Register">
        <table class="table">
        <tr><td>用户名：</td>  <td><input type="text" name="name" ></td></tr>
         <tr><td>性别：</td>  <td><input type="radio" name="sex" checked value="男">男
                      <input type="radio" name="sex" value="女">女</td></tr>
            <tr><td>出生日期：</td><td><input type="date" name="birthday"></td></tr>
            <tr><td>邮箱：</td><td><input type="email" name="email"></td></tr>
            <tr><td>密码：</td><td><input type="password" name="password"></td></tr>


       <tr><td> <button type="submit" class="btn btn-success">注册</button></td></tr>

    </table>
    </form>

    </div>
    <%@include file="footer.jsp"%>

</head>
<body>

</body>
</html>
