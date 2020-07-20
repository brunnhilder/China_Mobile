<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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