﻿<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	
	<title>缴费记录查询</title>
	
	<meta charset="UTF-8">
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="description" content="通话记录">
	<script type="text/javascript" src="/js/jquery-3.3.1.js"></script>
    <script type="text/javascript" src="/js/changepwd.js"></script>

	<!-- 引入jquery依赖 -->
	
	<!-- 引入该页面的js代码 -->
	<script type="text/javascript" src="/js/call/call_history.js"></script>
	<!-- 引入该页面的css代码 -->
	<link rel="stylesheet" type="text/css" href="/css/call/call_history.css"></link>
	
	<!-- 引入bootstrap框架依赖 -->
	<script type="text/javascript" src="/js/bootstrap/bootstrap.js"></script>
	<link rel="stylesheet" type="text/css" href="/css/bootstrap/bootstrap-theme.css"></link>
	<link rel="stylesheet" type="text/css" href="/css/bootstrap/bootstrap.css"></link>
	
	<!-- HTML5 Shiv 和 Respond.js 用于让 IE8 支持 HTML5元素和媒体查询 -->
    <!-- 注意： 如果通过 file://  引入 Respond.js 文件，则该文件无法起效果 -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
	
</head>
<body class="body">

<%--头部--%>
<%@include file="common/head_tr.jsp"%>

<div class="center">

    <%--显示分类的地方--%>
    <div class="type-local">
        <div>
            <a href="#">移动商城</a>
            <a>个人中心</a>
        </div>
    </div>

    <%--导航条部分--%>
	    <div class="center-nav">
	        <div class="panel-group" id="accordion" style="width: 180px;float: left;">
	            <div class="panel panel-default nav-width">
	                <div class="panel-heading nav-width">
	                    <h4 class="panel-title nav-title">
	                        <a data-toggle="collapse" data-parent="#accordion"
	                           href="#collapseOne">
	                           		 我的账户
	                        </a>
	                    </h4>
	                </div>
	                <div id="collapseOne" class="panel-collapse collapse in">
	                    <div class="panel-body nav-width">
	                        <a href="/bill/index" class="nav-a">月账单查询</a>
	                        <a href="/note/index" class="nav-a">短信详单查询</a>
	                        <a href="/call/" class="nav-a">通话记录查询</a>
	                        <a href="/balance/" class="nav-a">话费余额查询</a>
	                        <a href="/paymentHistory/" class="nav-a">缴费历史查询</a>
	                        <a href="/changepwd/" class="nav-a">修改服务密码</a>
	                    </div>
	                </div>
	            </div>
	            <div class="panel panel-default nav-width">
	                <div class="panel-heading nav-width">
	                    <h4 class="panel-title nav-title">
	                        <a data-toggle="collapse" data-parent="#accordion"
	                           href="#collapseTwo">
	                            	充值缴费
	                        </a>
	                    </h4>
	                </div>
	                <div id="collapseTwo" class="panel-collapse collapse">
	                    <div class="panel-body nav-width">
	                        <a href="/bill/" class="nav-a">充值卡缴费</a>
	                    </div>
	                </div>
	            </div>
	            <div class="panel panel-default nav-width">
	                <div class="panel-heading nav-width">
	                    <h4 class="panel-title nav-title">
	                        <a data-toggle="collapse" data-parent="#accordion"
	                           href="#collapseThree">
	                            	积分计划
	                        </a>
	                    </h4>
	                </div>
	                <div id="collapseThree" class="panel-collapse collapse">
	                    <div class="panel-body nav-width">
	                        <a href="/score/" class="nav-a">积分查询</a>
	                    </div>
	                </div>
	            </div>
	        </div>
	    </div>

    <div class="client">
      <div id="pagebody" class="page">
    	  <div><img class="mb-4"  src="https://shop.10086.cn/i/nresource/headimages/logo.png" width="230" height="62"></div>
    	  <div class="one"><input type="text" id="login_oldpwd" name="user_oldpwd"  class="form-control"size="16" placeholder="请输入6位原密码" /></div>
    	  <div class="two"><input type="password" id="login_pwdone" name="user_pwdone" class="form-control"size="16" placeholder="请输入6位新密码"/></div>
    	  <div class="three"><input type="password" id="login_pwdtwo" name="user_pwdtwo" class="form-control"size="16" placeholder="请再次输入新密码"/></div>
    	  <div class="four">
    	    <button class="btn  btn-primary" type="submit" id="change_user_sub" value="修改">修改</button>
    	  </div>
	      <div id="footer">
	        <p class="mt-5 mb-3 text-muted" style="text-align:center">Copyright©1999-2020</p>
	        <p class="mt-5 mb-3 text-muted" style="text-align:center">中国移动  版权所有</p>
		    </div>
	    </div>
	  </div> 
	  
</div>



</body>

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

   

    .center {
		width: 100%;
        background-color: #f6f6f6;
        overflow: hidden;
    }
    
    

    /*分类位置开始*/
    .type-local {
        margin: 0 auto;
        width: 1200px;
        height: 40px;
        /*background: red;*/
        margin-top: 15px;
    }

    .type-local a {
        line-height: 40px;
        padding-right: 15px;
    }

    /*分类位置结束*/
    /*导航条的高度统一*/
    .nav-width {
        width: 170px;
    }

    .nav-a {
        display: block;
        font-size: 14px;
        margin-left: 15px;
        padding-top: 10px;
    }

    /*垂直导航条开始*/
    .center-nav {
        width: 1200px;
        margin: 0 auto;

        /*background: blue;*/
    }

    .nav-title {
        color: #585858;
        font-size: 14px;
    }

    /*垂直导航条结束*/
    /*客户部分*/
    .client {
        padding: 10px;
        width: 1020px;
        height: 600px;
        background: #ffffff;
        text-align: center;
        border-bottom: 1px solid #f6f6f6;
        overflow-y: auto;
        overflow-x: hidden;
        
    }

    /*哪个业务 标题*/
    .client-title {
        font-size: 16px;
        border-bottom: 1px #ccc solid;
        height: 50px;
        line-height: 50px;
        color: #4e4e4e;
    }

    /*按照时间段快速查询*/
    .client-search {
        width: 100%;
        display: flex;
    }

    ul {
        list-style: none;
        /*消除自带的间距*/
        padding: 0;
    }

    .client-search-item {
        padding: 10px 20px;
        border: #ccc 1px solid;
        display: inline-block;
        float: left;
        margin: 0;
        margin-right: 10px;
        margin-top: 20px;
        font-size: 14px;
        color: #666666;
    }

    /*.client-search li:active {*/
        /*border: 1px #31adfc solid;*/
        /*background: url(https://shop.10086.cn/i/nresource/image/icon-select.gif) right bottom no-repeat;*/
    /*}*/
    .client-search button:active {
        border: 1px #31adfc solid;
        background: url(https://shop.10086.cn/i/nresource/image/icon-select.gif) right bottom no-repeat;
    }

    .width160 {
        width: 160px;
        height: 30px;
        line-height: 30px;
        float: left;
    }

    /*按照时间段查询的整体div*/
    .client-time-search {
        margin-top: 20px;
        margin-left: 2px;
    }

    /*尾部开始*/
    .foot {
        clear: both;
        width: 100%;
    }

    .foot1 {
        margin: 0 auto;
        text-align: center;
        padding-top: 20px;
        padding-bottom: 8px;
    }

    .foot1-item {
        display: inline-block;
        padding: 5px;
    }

    .foot2 {
        text-align: center;
        padding-bottom: 10px;
    }
    .one {
    	padding-top: 20px;
    	width: 25%;
    	margin-left: 378px;
    }
    .two {
    	padding-top: 10px;
    	width: 25%;
    	margin-left: 378px;
    }
    .three {
    	padding-top: 10px;
    	width: 25%;
    	margin-left: 378px;
    }
    .four {
    	padding-top: 10px;
    }
    
    
    
</style>

</html>