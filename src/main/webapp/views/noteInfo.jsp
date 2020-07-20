<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <%--引入jquery依赖--%>
    <script type="text/javascript" src="/js/jquery-3.3.1.js"></script>

    <%--引入bootstrap依赖--%>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <%--<link href="/css/bootstrap-datetimepicker.min.css" rel="stylesheet" media="screen">--%>
    <%--<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">--%>
    <!-- HTML5 Shiv 和 Respond.js 用于让 IE8 支持 HTML5元素和媒体查询 -->
    <!-- 注意： 如果通过 file://  引入 Respond.js 文件，则该文件无法起效果 -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
    <%--<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>--%>
    <%--<link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">--%>
    <meta charset="UTF-8">
    <title>短信详情</title>
    <script type="text/javascript" src="/js/main.js"></script>
    <script type="text/javascript">
        $(document).ready(
            function () {
                // alert("??")
                var userId = "<%=session.getAttribute("ridId")%>";

                $.ajax({
                    type: "get",
                    datatype: "json",
                    url: "http://localhost:8087/note/getnote?id=" + userId,
                    success: function (data) {
                        var fromTime = data.dataInfo[0].fromTime;
                        // alert(fromTime);
                        console.log("data", data);
                        $(".note-info-table tr td").remove();

                        var content = '';
                        $.each(data.dataInfo, function (k, v) {
                            console.log("???", data.dataInfo[k].noteText);
                            //如果想让模板字符串生效，还要转义一下
                            content =
                                `
                        <tr>
                            <td>\${data.dataInfo[k].noteText}</td>
                            <td>\${data.dataInfo[k].phoneNum}</td>
                            <td>\${data.dataInfo[k].fromTime}</td>
                        </tr>
                        `;
                            $(".note-info-table").append(content);
                        })
                    }
                })
            }
        )
    </script>

</head>
<body>
<%--引入头部jsp--%>
<%@include file="common/head.jsp" %>

<%--中间详情内容--%>
<div class="center">
    <%--显示分类的地方--%>
    <div class="type-local">
        <div>
            <a href="#">移动商城</a>
            <a>个人中心</a>
        </div>
    </div>
    <%--导航条部分--%>
        <%@include file="common/nav_w.jsp"%>
    <%--<div class="center-nav">--%>
        <%--<div class="panel-group" id="accordion" style="width: 180px;float: left;">--%>
            <%--<div class="panel panel-default nav-width">--%>
                <%--<div class="panel-heading nav-width">--%>
                    <%--<h4 class="panel-title nav-title">--%>
                        <%--<a data-toggle="collapse" data-parent="#accordion"--%>
                           <%--href="#collapseOne">--%>
                            <%--我的账户--%>
                        <%--</a>--%>
                    <%--</h4>--%>
                <%--</div>--%>
                <%--<div id="collapseOne" class="panel-collapse collapse in">--%>
                    <%--<div class="panel-body nav-width">--%>
                        <%--<a href="#" class="nav-a">月账单查询</a>--%>
                        <%--<a href="#" class="nav-a">短信详单查询</a>--%>
                    <%--</div>--%>
                <%--</div>--%>
            <%--</div>--%>
            <%--<div class="panel panel-default nav-width">--%>
                <%--<div class="panel-heading nav-width">--%>
                    <%--<h4 class="panel-title nav-title">--%>
                        <%--<a data-toggle="collapse" data-parent="#accordion"--%>
                           <%--href="#collapseTwo">--%>
                            <%--充值交费--%>
                        <%--</a>--%>
                    <%--</h4>--%>
                <%--</div>--%>
                <%--<div id="collapseTwo" class="panel-collapse collapse">--%>
                    <%--<div class="panel-body nav-width">--%>
                        <%--<a href="#" class="nav-a">话费充值</a>--%>
                        <%--<a href="#" class="nav-a">流量充值</a>--%>
                    <%--</div>--%>
                <%--</div>--%>
            <%--</div>--%>
            <%--<div class="panel panel-default nav-width">--%>
                <%--<div class="panel-heading nav-width">--%>
                    <%--<h4 class="panel-title nav-title">--%>
                        <%--<a data-toggle="collapse" data-parent="#accordion"--%>
                           <%--href="#collapseThree">--%>
                            <%--我的积分--%>
                        <%--</a>--%>
                    <%--</h4>--%>
                <%--</div>--%>
                <%--<div id="collapseThree" class="panel-collapse collapse">--%>
                    <%--<div class="panel-body nav-width">--%>
                        <%--<a href="#" class="nav-a">话费充值</a>--%>
                        <%--<a href="#" class="nav-a">流量充值</a>--%>
                    <%--</div>--%>
                <%--</div>--%>
            <%--</div>--%>
        <%--</div>--%>
    <%--</div>--%>
    <%--各个界面--%>
    <div class="client">
        <%--分类名称--%>
        <div class="client-title">短信详单查询</div>
        <%--快速查询--%>
        <ul class="client-search">
            <button type="button" class="btn btn-link client-search-item" onclick="setToday()">今天</button>
            <button type="button" class="btn btn-link client-search-item" onclick="setOneMonth()">最近1个月</button>
            <button type="button" class="btn btn-link client-search-item" onclick="setThreeMonth()">最近3个月</button>
            <button type="button" class="btn btn-link client-search-item" onclick="setSixMonth()">最近6个月</button>
            <button type="button" class="btn btn-link client-search-item" onclick="setOneYear()">最近一年</button>
            <%--<li class="client-search-item">今天</li>--%>
            <%--<li class="client-search-item">最近1个月</li>--%>
            <%--<li class="client-search-item">最近3个月</li>--%>
            <%--<li class="client-search-item">最近6个月</li>--%>
            <%--<li class="client-search-item">最近1年</li>--%>
        </ul>

        <div class="row client-time-search">
            <%--<div class='col-sm-6'>--%>
            <div class="form-group width160">
                <%--<label>选择开始时间：</label>--%>
                <!--指定 date标记-->
                <div class='input-group date width160' id='startTime'>
                    <input id="startTimeInput" type='text' class="form-control" disabled/>
                    <span class="input-group-addon">
                    <span class="glyphicon glyphicon-calendar"></span>
                </span>
                </div>
            </div>
            <%--</div>--%>
            <span style="color: #c9c9c9;margin: 0 10px;float: left;line-height: 30px">—</span>
            <%--<div class='col-sm-6'>--%>
            <div class="form-group width160">
                <%--<label>选择结束时间：</label>--%>
                <!--指定 date标记-->
                <div class='input-group date width160' id='endTime'>
                    <input id="endTimeInput" type='text' class="form-control" disabled/>
                    <span class="input-group-addon">
                    <span class="glyphicon glyphicon-calendar"></span>
                </span>
                </div>
                <%--</div>--%>
            </div>
            <%--搜索按钮--%>
            <button type="button" class="btn btn-primary" style="margin-left: 15px" onclick="searchNote()"
                    id="searchNoteInfo">查询
            </button>
        </div>
        <%--查询到的内容（表格）--%>
        <table class="table table-hover">
            <%--<caption>悬停表格布局</caption>--%>
            <thead>
            <tr>
                <th>发送内容</th>
                <th>接收方手机号</th>
                <th>发送时间</th>
            </tr>
            </thead>
            <tbody class="note-info-table">
            </tbody>
        </table>
            <div id="no-note-info">
                <%--<div style="clear: both;height: 60px;text-align: center; line-height: 60px;font-size:12px;margin-bottom: 20px">--%>
                <%--<img src="https://shop.10086.cn/i/nresource/image/nodata/detailqry.png" style="display: inline-block">--%>
                <%--<div style="text-align: center; line-height: 60px;display: inline-block">没有短信记录噢</div>--%>
                <%--</div>--%>
            </div>

    </div>
    <%--引入尾部--%>
    <%@include file="common/foot.jsp" %>
</div>

<%--引用datetimepicker--%>
<script src="/js/time.js"></script>
<script src="https://cdn.bootcss.com/bootstrap-datetimepicker/4.17.47/js/bootstrap-datetimepicker.min.js"></script>
<script type="text/javascript" src="/js/bootstrap-datetimepicker.js" charset="UTF-8"></script>
<%--中文引用--%>
<script type="text/javascript" src="/js/locales/bootstrap-datetimepicker.zh-CN.js" charset="UTF-8"></script>
<%--英文引用--%>
<%--<script type="text/javascript" src="/js/locales/bootstrap-datetimepicker.fr.js" charset="UTF-8"></script>--%>
<script type="text/javascript">

    /**
     * 时间转换
     * @param format
     * @param time
     * @returns {void | string | *}
     */
    function dateTran(format, time) {
        var t = new Date(time);
        //将不住两位的在前面加零
        var tf = function (i) {
            return (i < 10 ? '0' : '') + i
        };
        return format.replace(/yyyy|MM|dd|HH|mm|ss/g, function (a) {
            switch (a) {
                case 'yyyy':
                    return tf(t.getFullYear());
                    break;
                case 'MM':
                    return tf(t.getMonth() + 1);
                    break;
                case 'mm':
                    return tf(t.getMinutes());
                    break;
                case 'dd':
                    return tf(t.getDate());
                    break;
                case 'HH':
                    return tf(t.getHours());
                    break;
                case 'ss':
                    return tf(t.getSeconds());
                    break;
            }
        })
    }

    /**
     * 查询今天
     */
    function setToday() {
        var date = new Date();
       var currentTime = dateTran("yyyy-MM-dd",date);
        alert(currentTime);
        $('#startTimeInput').val(currentTime);
        $('#endTimeInput').val(currentTime);
    }

    /**
     * 查询最近一个月
     */
    function setOneMonth() {
        var date = new Date();
        // 结束时间
        var endTime = dateTran("yyyy-MM-dd", date);
        // 前一天
        // date.setTime(date.getTime()-(1000*60*60*24));
        // 最近一个月，所以减1
        date.setMonth(date.getMonth()-1);
        var startTime = dateTran("yyyy-MM-dd",date);
        $('#startTimeInput').val(startTime);
        $('#endTimeInput').val(endTime);

    }


    /**
     * 查询最近3个月
     */
    function setThreeMonth() {
        var date = new Date();
        // 结束时间
        var endTime = dateTran("yyyy-MM-dd", date);
        // date.setTime(date.getTime()-(1000*60*60*24));
        date.setMonth(date.getMonth()-3);
        var startTime = dateTran("yyyy-MM-dd",date);
        $('#startTimeInput').val(startTime);
        $('#endTimeInput').val(endTime);

    }

    /**
     * 查询最近6个月
     */
    function setSixMonth() {
        var date = new Date();
        // 结束时间
        var endTime = dateTran("yyyy-MM-dd", date);
        // date.setTime(date.getTime()-(1000*60*60*24));
        date.setMonth(date.getMonth()-6);
        var startTime = dateTran("yyyy-MM-dd",date);
        $('#startTimeInput').val(startTime);
        $('#endTimeInput').val(endTime);
    }

    /**
     * 查询最近一年
     */
    function setOneYear() {
        var date = new Date();
        // 结束时间
        var endTime = dateTran("yyyy-MM-dd", date);
        // date.setTime(date.getTime()-(1000*60*60*24));
        date.setMonth(date.getMonth()-12);
        var startTime = dateTran("yyyy-MM-dd",date);
        $('#startTimeInput').val(startTime);
        $('#endTimeInput').val(endTime);

    }

    //    按照时间段搜索
    function searchNote() {
        var startTime = $("#startTimeInput").val();
        var endTime = $("#endTimeInput").val();
        var userId = "<%=session.getAttribute("ridId")%>";
        alert("userid"+userId);
        // alert("搜索")
        $.ajax({
            type: "get",
            datatype: "json",
            url: "http://localhost:8087/note/getnote?id=" + userId + "&startTime=" + startTime + "&endTime=" + endTime,
            success: function (data) {
                // var notice = '';
                // console.log("datainfo",data.dataInfo);
                // 查询到的结果为空的情况
                // if (data.dataInfo==null||data.dataInfo.length == 0){
                //     notice = `
                //     <div style="clear: both;height: 60px;text-align: center; line-height: 60px;font-size:12px;margin-bottom: 20px;margin-top:30px;">
                // <img src="https://shop.10086.cn/i/nresource/image/nodata/detailqry.png" style="display: inline-block">
                // <div style="text-align: center; line-height: 60px;display: inline-block">没有短信记录噢</div>
                // </div>
                //     `;
                //     // $("#no-note-info").remove();
                //     console.log("note-info",$("#no-note-info img").length);
                //
                //         $("#no-note-info").append(notice);
                    $(".note-info-table tr td").remove();
                // }
                // else {
                //     alert("不为空");
                //     $("#no-note-info").remove();

                    console.log("data", data);
                // $(".note-info-table tr td").remove();

                $.each(data.dataInfo, function (k, v) {
                    var content = '';
                    console.log("???", data.dataInfo[k].noteText);
                    //如果想让模板字符串生效，还要转义一下
                    content =
                        `
                        <tr>
                            <td>\${data.dataInfo[k].noteText}</td>
                            <td>\${data.dataInfo[k].phoneNum}</td>
                            <td>\${data.dataInfo[k].fromTime}</td>
                        </tr>
                        `;
                    $(".note-info-table").append(content);
                })
            }
        })
    }


</script>
<script type="text/javascript">
    <%--时间段选择。
    超过当前当前时间不能选
    起始时间不能大于结束时间--%>
    $(function () {
        $('#startTime').datetimepicker({
            minView: "month", //选择日期后，不会再跳转去选择时分秒
            language: 'zh-CN',
            format: 'yyyy-mm-dd',
            locale: moment.locale('zh-cn'),
            //minDate: '2016-7-1'
            autoclose: true,   //选择日期后自动关闭日期选择框
            todayHighlight: true,   //当天高亮显示
            endDate: new Date()
        }).on('changeDate', function (ev) {
            if (ev.date) {
                $('#endTime').datetimepicker('setStartDate', new Date(ev.date.valueOf()))
            } else {
                $('#endTime').datetimepicker('setStartDate', null);
            }
        }).val("开始时间");

        $('#endTime').datetimepicker({
            minView: "month", //选择日期后，不会再跳转去选择时分秒
            language: 'zh-CN',
            format: 'yyyy-mm-dd',
            locale: moment.locale('zh-cn'),
            todayBtn: "true",  //显示今天按钮
            autoclose: true,   //选择日期后自动关闭日期选择框
            todayHighlight: true,   //当天高亮显示
            endDate: new Date()

        }).on('changeDate', function (ev) {
            console.log("333", ev.date.valueOf())
            //获取时间
            //这种方法获取到的时间是英文的
            console.log($("#startTime").data("datetimepicker").getDate());
            // 这种方法是获取输入框中的时间，是中文的
            console.log($("#endTime").find("input").val())
            if (ev.date) {
                $('#startTime').datetimepicker('setEndDate', new Date(ev.date.valueOf()))
            } else {
                $('#startTime').datetimepicker('setEndDate', new Date());
            }

        });

        console.log("1111")
        //动态设置最小值
        // picker1.on('changeDate', function (e) {
        //     $("#datetimepicker1").datetimepicker("setEndDate", $("#datetimepicker2").val());
        //
        // });
        // //动态设置最大值
        // picker2.on('changeDate', function (e) {
        //     $("#datetimepicker2").datetimepicker("setStartDate", $("#datetimepicker1").val());
        //
        // });

        //设置开始时间
        // $('#startTime').datepicker('setStartDate', new Date());
        // $('#endTime').datepicker('setStartDate', new Date());
        // $("#startTime").datepicker().on('changeDate', function(e) {
        //     //获取选取的开始时间
        //     var endTimeStart =$("#startTime").val();
        //     //设置结束时间
        //     $('#endTime').datepicker('setStartDate', endTimeStart);
        // });
        // //设置结束时间必须晚于开始时间
        // $("#endTime").datepicker().on('changeDate', function(e) {
        //     //获取选取的开始时间
        //     var endTimeStart =$("#startTime").val();
        //     //设置结束时间
        //     $('#endTime').datepicker('setStartDate', endTimeStart);
        // });
    });


    /*4.17版本一些可能用得到的方法参数*/
    /*
            showClose:true	//是否显示关闭 按钮
            /*viewMode: 'days',//天数模块展示，months则为以月展示
            daysOfWeekDisabled: false,//星期几 禁止选择,参数 [num],多个逗号隔开
            calendarWeeks: false,	//显示 周 是 今年第几周
            toolbarPlacement:'default', //工具摆放的位置，top 则为上，默认为底
            showTodayButton:false,	//是否工具栏 显示 直达今天天数的 按钮，默认false
            showClear:false, //是否 工具栏显示  清空 输入框  的按钮。默认false
    */
</script>
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
        /*height: 400px;*/
        background: #ffffff;
        float: left;
        border-bottom: 1px solid #f6f6f6;
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
</style>
</html>