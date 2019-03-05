<%--
  Created by IntelliJ IDEA.
  User: tar
  Date: 2019/3/3
  Time: 21:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ include file="/jsp/Header.jsp" %>
<div class="main-body">
    <div class="container">
        <div class="row">
            <div class="main-page">

                <aside class="main-navigation">
                    <div class="main-menu">

                        <div class="menu-container">
                            <div class="block-keep-ratio block-keep-ratio-2-1 block-width-full home">
                                <a href="index.html" class="block-keep-ratio__content  main-menu-link">
                                        <span class="main-menu-link-text">
                                            主页
                                        </span>
                                </a>
                            </div>
                        </div>

                        <div class="menu-container">
                            <div class="block-keep-ratio  block-keep-ratio-1-1  block-width-half  pull-left  about-main">
                                <a href="about.html" class="main-menu-link about block-keep-ratio__content flexbox-center">
                                    <i class="fa fa-spinner fa-pulse fa-4x main-menu-link-icon"></i>
                                    最新资讯
                                </a>
                            </div>

                            <div class="block-keep-ratio  block-keep-ratio-1-1  block-width-half  pull-right  contact-main">
                                <a href="contact.html" class="main-menu-link contact block-keep-ratio__content flexbox-center">
                                    <i class="fa fa-envelope-o fa-4x main-menu-link-icon"></i>
                                    联系我们
                                </a>
                            </div>
                        </div>

                        <div class="menu-container">
                            <div class="block-keep-ratio block-keep-ratio-1-1 block-keep-ratio-md-2-1 block-width-full gallery">
                                <a href="gallery.html" class="main-menu-link  block-keep-ratio__content">
                                        <span class="main-menu-link-text">
                                            图站
                                        </span>
                                </a>
                            </div>
                        </div>

                        <!-- sidebar carousel -->
                        <div class="menu-container">
                            <div class="mauris">
                                <div id="carousel-menu" class="carousel slide" data-ride="carousel">
                                    <!-- Wrapper for slides -->
                                    <div class="carousel-inner" role="listbox">
                                        <div class="item active">
                                            <img src="images/slider-img-1.png" alt="slider">
                                            <div class="carousel-caption menu-caption">
                                                二次元图片
                                            </div>
                                        </div>
                                        <div class="item">
                                            <img src="images/menu-bg-home.png" alt="slider">
                                            <div class="carousel-caption menu-caption">
                                                唯美壁纸
                                            </div>
                                        </div>
                                    </div>

                                    <!-- Controls -->
                                    <a class="left carousel-control" href="#carousel-menu" role="button" data-slide="prev">
                                        <span class="fa fa-caret-left" aria-hidden="true"></span>
                                        <span class="sr-only">上一个</span>
                                    </a>
                                    <a class="right carousel-control" href="#carousel-menu" role="button" data-slide="next">
                                        <span class="fa fa-caret-right" aria-hidden="true"></span>
                                        <span class="sr-only">下一个</span>
                                    </a>
                                </div>
                            </div> <!-- .mauris -->
                        </div>
                    </div> <!-- main-menu -->
                </aside> <!-- main-navigation -->

                <div class="content-main">
                    <div class="row margin-b-30">
                        <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
                            <div class="banner-main-home">
                                <div class="banner-main-home-text">
                                    <div class="heading">
                                        <h1>二次元图站</h1>
                                        <p class="text-uppercase">境界的彼方</p>
                                    </div>
                                    <div class="desc">
                                        <p>网站致力于提供广大二次元爱好者，免费高清的二次元图片以及二次元最新资讯，如果喜欢我的网站，希望您能让更多的人了解本站！
                                            <br>
                                            本站出于初期阶段。如有任何好的建议可以点击左栏联系我们！</p>
                                        <button type="button" class="">分享网站</button>
                                    </div>
                                </div>

                            </div>
                        </div>
                    </div>
                    <div class="row margin-b-30">
                        <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6">
                            <div class="box london">
                                <div class="box-icon">
                                    <img src="images/home-img-2.jpg" alt="Image" class="img-responsive">
                                </div>
                                <div class="info float-container">
                                    <div class="col-sm-12 london-title">
                                        <h3 class="text-uppercase">国内精品二次元</h3>
                                        <h4 class="text-uppercase">ヽ(´･д･｀)ﾉ
                                        </h4>
                                    </div>
                                    <p>中国文化博大精深，中华民族拥有五千年的悠久历史，经典的神话传说、伟大的英雄人物、56个民族的特色传统以及各历史朝代的战争故事，每一样都是国漫作品的优秀题材，让这些内容形成优秀的国漫作品，让经典的人物以动漫的形式表现出来，让中华民族传统文化更加形象地展现在世界面前，无疑使得越来越多的国人甚至外国友人喜欢上国漫作品。几乎所有优秀的国产动漫作品，都是极好地将剧情和中国文化结合在了一起，《一人之下》更是用幽默搞笑的风格结合天师道、八卦、东北萨满等中国元素讲述了中国武侠故事，该作品不仅在国内大受欢迎，在日本也是得到了很高的评价，让中国动漫风刮到了国外。</p><hr />
                                    <div class="col-sm-12 location-main">
                                        <div class="pull-left location">
                                            <i class="fa fa-map-marker fa-2x"></i><span>上海</span>
                                        </div>
                                        <div class="pull-right user-icons">
                                            <a href="#"><i class="fa fa-star fa-2x"></i></a>
                                            <a href="#"><i class="fa fa-user fa-2x"></i></a>
                                            <a href="#"><i class="fa fa-twitter fa-2x"></i></a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6">
                            <div class="box paris">
                                <div class="box-icon">
                                    <img src="images/home-img-3.jpg" alt="Image" class="img-responsive">
                                </div>
                                <div class="info float-container">
                                    <div class="col-sm-12 london-title paris-title">
                                        <h3 class="text-uppercase">国外精品图源</h3>
                                        <h4 class="text-uppercase">(๑•ี_เ•ี๑)</h4>
                                    </div>
                                    <p>二次元在日本的动画爱好者中指动画、游戏等作品中的角色，相对地，“三次元”被用来指代现实中的人物。该词广泛在ACGN文化圈中被用作对“架空世界”或者说梦想世界的一种称呼，但ACGN并非等同于二次元。该用法始于日本，早期的日本动画、游戏作品都是以二维图像构成的，其画面是一个平面，所以被称为是“二次元世界”，简称“二次元”，而与之相对的是“三次元”，即“我们所存在的这个次元”，也就是现实世界。二次元是指人类幻想出来的唯美世界，用各种憧憬的体现虐袭观赏者的视觉体验，本质其实还是三次元世界的人类心中模糊的对梦想生活的憧憬和对美好未来的期望。 </p><hr />
                                    <div class="col-sm-12 location-main">
                                        <div class="pull-left location location2">
                                            <i class="fa fa-map-marker fa-2x"></i><span>日本</span>
                                        </div>
                                        <div class="pull-right user-icons">
                                            <a href="#"><i class="fa fa-star fa-2x"></i></a>
                                            <a href="#"><i class="fa fa-user fa-2x"></i></a>
                                            <a href="#"><i class="fa fa-twitter fa-2x"></i></a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div> <!-- row -->
                    <div class="row">
                        <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
                            <div class="box bottom-main">
                                <div class="info float-container">
                                    <div class="col-sm-12 bottom-title">
                                        <h3 class="text-uppercase">热门分类</h3>
                                        <h4 class="text-uppercase">二次元聚集地</h4>
                                    </div>
                                    <div class="row">
                                        <div class="col-xxs-12 col-xs-6 col-sm-6 col-md-4 col-lg-4">
                                            <div class="bottom-img">
                                                <img src="images/home-img-4.jpg" alt="Image">
                                                <p class="first">唯美二次元</p>
                                            </div>
                                        </div>
                                        <div class="col-xxs-12 col-xs-6 col-sm-6 col-md-4 col-lg-4">
                                            <div class="bottom-img">
                                                <img src="images/home-img-5.jpg" alt="Image">
                                                <p class="second">p站插画</p>
                                            </div>
                                        </div>
                                        <div class="col-xxs-12 col-xs-6 col-sm-6 col-md-4 col-lg-4">
                                            <div class="bottom-img">
                                                <img src="images/home-img-6.jpg" alt="Image">
                                                <p class="third">动漫头像</p>
                                            </div>
                                        </div>
                                    </div>
                                    <p class="bottom-desc">&nbsp;&nbsp;&nbsp;&nbsp;是努力还是放弃，只有一种选择，人类能选择的，无论何时都只有这两条路，只有诚实地说出自己的心情，接下来就要看对方的决定了，是努力还是放弃，这时就轮到他们选择了。<br><br><span style="position: relative; left:600px">——花本修司《蜂蜜与四叶草》</span></p><hr />
                                    <div class="col-sm-12 location-main">
                                        <div class="pull-right bottom-user">
                                            <a href="#"><i class="fa fa-caret-right"></i><span>了解更多</span></a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div> <!-- row -->
                </div> <!-- .content-main -->
            </div> <!-- .main-page -->
        </div> <!-- .row -->
        <footer class="row">
            <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 footer">
                <p class="copyright">2019-现在&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  二次元图站</p>
            </div>
        </footer>  <!-- .row -->
    </div> <!-- .container -->
</div> <!-- .main-body -->
<%@ include file="/jsp/footer.jsp" %>


