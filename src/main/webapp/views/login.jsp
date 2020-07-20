<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>欢迎访问移动服务平台</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="/css/login/signin.css">
	
	<!-- <style type="text/css">
	
	</style> -->
	<script type="text/javascript" src="/js/jquery-3.3.1.js"></script>
    <script type="text/javascript" src="/js/login/login.js"></script>
  </head>
 
  <body>
  <div id="container">
	<div id="pagebody">
	  <table>
		<tr><td> 
		      <table class="tt">      
				  <tr><td><div id="user" style="display:block">
				  	<table cellSpacing=1 cellPadding=0 width=200 border=0 align="center" class="tt">
				  		<div><img class="mb-4"  src="https://shop.10086.cn/i/nresource/headimages/logo.png" width="230" height="62"></div>
		  				<tr>
		  				<td><input type="text" id="login_phone" name="user_phone"  class="form-control"size="16" placeholder="请输入11位手机号"/></td></tr>
						<tr>
						<td><input type="password" id="login_pwd" name="user_pwd" class="form-control"size="16" placeholder="请输入6位服务密码"/></td></tr>
						<tr><td colspan="2" align="center"></td></tr>
						<tr><td colspan="2" align="center"><input class="btn  btn-primary" type="submit" id="login_user_sub" value="登录"></input>&nbsp;<input id="reset_sub"class="btn btn-primary"type="reset" value="重置" ></input></td></tr>
				    </table>
				  </div></td></tr>  
			  </table>         
		</td></tr>
	   </table>
	</div>
	<div id="footer">
	<p class="mt-5 mb-3 text-muted" style="text-align:center">Copyright©1999-2020</p>
	<p class="mt-5 mb-3 text-muted" style="text-align:center">中国移动  版权所有</p>
  </div> 
  </body>
</html>
