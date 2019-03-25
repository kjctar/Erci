<%@ page import="Bean.Img" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Enumeration" %>
<%@ page import="Bean.Tag" %>
<%@ page import="util.ColorSelecter" %><%--
  Created by IntelliJ IDEA.
  User: tar
  Date: 2019/3/4
  Time: 13:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@include file="Header.jsp"%>
<link rel="stylesheet" type="text/css" href="../css/magnific-popup.css">   <!-- Magnific Popup core CSS file -->
<!-- content-main -->


    <div class="gallery-main-inner" style="position: relative">

        <div class="col-md-12 gallery_title_main"

        >
            <div class="gallery_title" >
                <h4>图站</h4>

                 <a  class="btn btn-success  text-right" href="/ImgLibraryServlet?navigate=upPage" >上传</a>

                <br>
                 <%!ColorSelecter tagcolor=new ColorSelecter();%>

                <%

                    List<Tag> tags= (List<Tag>) request.getAttribute("tags");
                    for (Tag tag : tags) {

                %>
                <%="<span class='label "+ tagcolor.getRandomColor() +" '>"+ tag.getTname()+"</span>"%>
                <%
                    }
                %>

            </div>
        </div>



        <div id="content" class="gallery-images-container" style="margin-top: 2px">
            <div class="box-gutter"></div>
            <div class="box-sizer"></div>

            <%
               List<Img> imgs= (List<Img>) request.getAttribute("images");
                if(imgs!=null){
                    for (Img img : imgs) {
                        %>
            <div class="box" style="background-color:#161E2C;">
                <a href="${pageContext.request.contextPath}<%=img.getUrl() %>"><img alt="Agra picture" src="${pageContext.request.contextPath}<%=img.getUrl() %>"></a>

            </div>
            <%

                    }
                }


            %>



        </div>

        <div class="row text-center view_more_main">
            <a href="#" class="btn view_more">查看更多</a>
        </div>

    </div>



<%@include file="footer.jsp"%>
<script src="../js/imagesloaded.3.1.8.min.js"></script>
<script src="../js/jquery.masonry.3.2.1.min.js"></script> <!-- http://masonry.desandro.com/ -->
<script src="../js/jquery.magnific-popup.min.js"></script> <!-- http://dimsemenov.com/plugins/magnific-popup/ -->

<script>
    function init_masonry(){
        var $container = $('#content');

        $container.imagesLoaded( function(){
            $container.masonry({
                itemSelector: '.box',
                isAnimated: true



            });
        });
    }

    $(document).ready(function(){

        //Init jQuery Masonry layout
        init_masonry();

        // Magnific Popup
        $('.gallery-images-container').magnificPopup({
            delegate: 'a', // child items selector, by clicking on it popup will open
            type: 'image',
            gallery: {
                enabled: true,
                navigateByImgClick: true,
                preload: [0,1] // Will preload 0 - before current, and 1 after the current image
            },
        });

        //Select menu onchange
        $("#collapsed-navbar").change(function () {
            window.location = $(this).val();
        });

    });
</script>

