<%--
  Created by IntelliJ IDEA.
  User: tar
  Date: 2019/3/4
  Time: 22:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
 <form type="" method="post" action="/ImgLibraryServlet?navigate=upImg" enctype="multipart/form-data">
     <input name="navigate" type="hidden" value="upImg">
     <input name="tag" type="text" >
     <input name="image" type="file" >

     <button type="submit"> 上传 </button>
 </form>

</body>
</html>
