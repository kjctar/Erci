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

    <div style="color: whitesmoke">

    <form  method="post" action="/UserServlet?navigate=Register">

        用户名：<input type="text" name="name" ><br>
        性别：  <input type="radio" name="sex" value="男">男
                <input type="radio" name="sex" value="女">女<br>
        出生日期：<input type="date" name="birthday"><br>
        邮箱：<input type="email" name="email"><br>
        密码：<input type="password" name="password"><br>


        <button type="submit">注册</button>
    </form>

    </div>
    <%@include file="footer.jsp"%>

</head>
<body>

</body>
</html>
