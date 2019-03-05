<%@ page import="Bean.User" %><%--
  Created by IntelliJ IDEA.
  User: tar
  Date: 2019/3/3
  Time: 21:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title></title>
    <link href="${pageContext.request.contextPath}/css/font-awesome.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/menu.css" rel="stylesheet">
    <style></style>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.10.1.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/google-maps.js"></script>
    <link rel='stylesheet' type='text/css' href='https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700,400italic'>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css">

    <script>$(document).ready(function(){$(".vertical-nav").verticalnav({speed: 400,align: "left"});});</script>
</head>

<body>


<div class="row clearfix">
    <div class="col-md-2 column">
        <ul class="vertical-nav dark red" >
            <li class="active">
                <%
                  if(null != request.getSession().getAttribute("user")){
                      User user=new User();
                      user= (User) request.getSession().getAttribute("user");
                       %>
                          <%="<a href=\"/UserServlet?navigate=LoginPage\"><i class='icon-home'></i>"+user.getName()+"</a>" %>
                <%
                  }else{
                      %>
                <a href="/UserServlet?navigate=LoginPage"><i class="icon-home"></i>登录</a>
                <%

                  }

                %>


            </li>
            <li><a href="#"><i class="icon-cogs"></i>二次元节点
                <span class="submenu-icon"></span></a>
                <ul>
                    <li><a href="/ImgLibraryServlet?navigate=LoadImgPage">图库</a></li>
                    <li><a href="#">资讯</a></li>
                    <li><a href="#">番剧</a></li>
                </ul>
            </li>
            <li><a href="#"><i class="icon-briefcase"></i>Acm节点
                <span class="submenu-icon"></span></a>
                <ul>
                    <li><a href="#">本地题库</a></li>
                    <li><a href="#">热门Online Judge</a></li>
                    <li><a href="#">ACM官网</a></li>
                </ul>
            </li>
            <li><a href="#"><i class="icon-user"></i>上传排行</a></li>
            <li><a href="#"><i class="icon-comments-alt"></i>资源分享</a></li>
            <li><a href="#"><i class="icon-picture"></i>区块链游戏</a></li>
            <li><a href="#"><i class="icon-info"></i>电影网站导航</a></li>
            <li><a href="#"><i class="icon-group"></i>绿色软件</a></li>
            <li><a href="#"><i class="icon-question"></i>免费代码</a></li>
            <li><a href="#"><i class="icon-bar-chart"></i>开发者博客</a></li>

        </ul>
    </div>
    <div class="col-md-10 column">