<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
    
<%--头部bar--%>
<div class="topbar">
    <div class="top">
        <div class="topleft">
            <a href="#" style="padding-right: 10px" ;border-left: 1px solid #ececec>ENGLISH</a>
            <a href="#" style="padding-left: 10px;border-left: 1px solid #ececec;">政企客户</a>
        </div>
        <div class="topright">
            <div class="topright-item">关于中国移动</div>
            <div class="topright-item">积分商城</div>
            <div class="topright-item"><a href="#"><img src="https://shop.10086.cn/i/nresource/headimages/t1-1.png">手机营业厅</a>
            </div>
            <div class="topright-item"><a href="#"><img
                    src="https://shop.10086.cn/i/nresource/headimages/t3-1.png">登录</a></div>
            <div class="topright-item"><a href="#"><img
                    src="https://shop.10086.cn/i/nresource/headimages/red-shoppingtrolley.png">购物车</a></div>
        </div>
    </div>
</div>
<%--头部容器--%>
<div class="headcon">
    <div class="head-left">
        <img src="https://shop.10086.cn/i/nresource/headimages/logo.png" style="padding-top: 20px;">
    </div>
    <div class="head-right">
        <div class="search">
            <input type="text" class="search-input">
            <button type="button" class="btn btn-primary"
                    data-toggle="button"> 搜索
            </button>
        </div>
        <div class="search-keyword">
            <div class="search-keyword-item"><a href="#">5G正式试用</a></div>
            <div class="search-keyword-item"><a href="#">信用购机</a></div>
            <div class="search-keyword-item"><a href="#">电子发票</a></div>
        </div>
    </div>


</div>
</div>
<%--水平导航栏--%>
<div class="bar">
    <a class="bar-item" href="#">
        <div class="">首页</div>
    </a>
    <a class="bar-item" href="#">
        <div class="">移动商城</div>
    </a>
    <a class="bar-item" href="#">
        <div class="">个人中心</div>
    </a>
    <a class="bar-item" href="#">
        <div class="">服务与支持</div>
    </a>

    <%--<div class="bar-item">移动商城</div>--%>
    <%--<div class="bar-item">个人中心</div>--%>
    <%--<div class="bar-item">信用购机</div>--%>
    <%--<div class="bar-item">服务与支持</div>--%>
</div>


<style>

    <%--a标签统一样式--%>
    a {
        text-decoration: none;
        color: #888888;
    }

    a:hover {
        color: lightblue;
    }

    /*li标签样式统一*/
    li {
        list-style: none;
    }

    /*头部bar开始*/
    .topbar {
        width: 100%;
        height: 26px;
        background-color: #f6f6f6;
        border-bottom: 1px solid #ececec;
        font-size: 12px;
    }

    .top {
        width: 1200px;
        height: 26px;
        /*background: red;*/
        margin: 0 auto;
    }

    .topleft {
        float: left;
        /*文字居中*/
        line-height: 26px;
    }

    .topright {
        float: right;
    }

    .topright-item {
        float: right;
        line-height: 26px;
        color: #888888;
        padding-left: 10px;
        padding-right: 10px;
        border-left: 1px solid #ececec
    }

    .topright-item img {
        display: inline-block;
        padding-right: 3px;
    }

    /*头部bar结束*/
    /*第二部分头部开始*/
    .headcon {
        width: 1200px;
        height: 66px;

        /*background: red;*/
        margin: 0 auto;
    }

    .head-left {
        float: left;
    }

    .head-right {
        float: right;
        padding-top: 10px;
    }

    .search-input {
        width: 440px;
        height: 35px;

        /*background: red;*/
    }

    .search-keyword-item {
        float: left;
        padding: 10px;
    }

    .search-keyword-item a {
        color: #e8428d;
    }

    .search-keyword-item a:hover {
        color: lightblue;
    }

    /*第二部分头部完成*/

    /*水平导航栏开始*/
    .bar {
        width: 1200px;
        display: flex;
        margin: 0 auto;
        height: 40px;
    }

    .bar-item {
        flex: 1;
        text-align: center;
        color: #666666;
        background: #CCCCCC;
        line-height: 40px;
        font-size: 16px;
        border: 1px solid #ffffff;
    }

    .bar a:hover {
        background-color: #dddddd;
        color: lightblue;
        text-decoration: none;
    }

    /*水平导航栏结束*/


</style>