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

<form  method="post" action="/UserServlet?navigate=Login">

 <input type="text" name="name" >
 <input type="password" name="password">
 <button type="submit">submit</button>
</form>


<%@include file="footer.jsp"%>

</body>
</html>
