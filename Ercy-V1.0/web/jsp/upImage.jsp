<%--
  Created by IntelliJ IDEA.
  User: tar
  Date: 2019/3/4
  Time: 22:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" type="text/css" href="http://cdn.bootcss.com/jqueryui/1.11.0/jquery-ui.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/jquery.tagsinput-revisited.css" />
<style type="text/css">
    .content {
        width: 800px;
        margin: 20px auto;
    }
    label {

        padding: 20px 0 5px 0;
    }
</style>
<%@include file="Header.jsp"%>
<div class="content" >
<form type="" method="post" action="/ImgLibraryServlet?navigate=upImg" enctype="multipart/form-data">
    <input name="navigate" type="hidden" value="upImg">

    <input name="image" type="file" >
     <label>选择标签</label>
     <input id="form-tags" name="tags" type="text" value="很纠结 就开始打哈大啊啊看见">


    <button type="submit"> 上传 </button>
</form>
</div>

<%@include file="footer.jsp"%>
<script src="${pageContext.request.contextPath}/js/jquery-ui.min.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery.tagsinput-revisited.js"></script>
<script type="text/javascript">

    $(function() {
        $('#form-tags').tagsInput({
            'unique': true,
            'minChars': 2,
            'maxChars': 10,
            'limit': 5,
            'autocomplete': {
                source: [
                    'apple',
                    'banana',
                    'orange',
                    'pizza'
                ]
            },
            'delimiter': [' '],
            'validationPattern': new RegExp('[\u4e00-\u9fa5]'),
            'onAddTag': function(input, value) {
                console.log('tag added', input, value);
            },
            'onRemoveTag': function(input, value) {
                console.log('tag removed', input, value);
            },
            'onChange': function(input, value) {
                console.log('change triggered', input, value);
            }
        });
    });
</script>

