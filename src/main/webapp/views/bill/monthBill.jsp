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
    <link href="/css/bootstrap-datetimepicker.min.css" rel="stylesheet" media="screen">
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <!-- HTML5 Shiv 和 Respond.js 用于让 IE8 支持 HTML5元素和媒体查询 -->
    <!-- 注意： 如果通过 file://  引入 Respond.js 文件，则该文件无法起效果 -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <meta charset="UTF-8">
    <title>月账单详情</title>
    <script type="text/javascript" src="/js/main.js"></script>
    <script type="text/javascript">
        $(document).ready(
            function () {
                // 手机号
                var phone = "<%= session.getAttribute("phone")%>";
                var date = new Date();
                // 当前年份
                var year = date.getFullYear();
                // 当前月份
                var month = date.getMonth()+1;
                // alert(month);
                var costMoney = 0;
                // alert(phone)
                $.ajax({
                    type: "get",
                    datatype: "json",
                    // 查询当前月份
                    url: "http://localhost:8087/bill/cost?phone=" + phone + "&year=" + year + "&month=" + month,
                    success: function (data) {
                        console.log("data", data);
                        $(".note-info-table tr td").remove();
                        var content = '';
                        $.each(data.dataInfo, function (k, v) {

                            var title = data.dataInfo[k].introduction;
                            // alert(title);
                            if (title==null||title == undefined){
                                title = '';
                            }
                            costMoney+=data.dataInfo[k].price - data.dataInfo[k].reduceMoney;
                            // 实际消费
                            var actMoney = data.dataInfo[k].price - data.dataInfo[k].reduceMoney;
                            //如果想让模板字符串生效，还要转义一下
                            content =
                                `
                        <tr>
                            <td title="\${title}">\${data.dataInfo[k].costName}</td>
                            <td>\${data.dataInfo[k].price}</td>
                            <td>\${data.dataInfo[k].reduceMoney}</td>
                            <td>\${actMoney}</td>
                        </tr>
                        `;
                            $(".note-info-table").append(content);
                            $("#bill-money").html(costMoney/2);
                        })

                    }
                })

            }
        )
    </script>

</head>
<body>
<%--引入头部jsp--%>
<%@include file="../common/head.jsp" %>

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
        <%@include file="../common/nav_w.jsp"%>
    <%--各个界面--%>
    <div class="client">
        <img src="https://shop.10086.cn/i/operation/12720200430161337.jpg" style="padding: 0;margin: 0">

        <div class="blue">
            <div class="blue-item">
                <div class="blue-item-one">
                    <div class="bill-title">计费周期:</div>
                    <div class="bill-content" id="time">07月01日-07月09日</div>
                    <%--<div class="bill-time">2020-7</div>--%>

                    <div class="dropdown bill-time">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" id="dropdown-title">
                            2020-7
                            <b class="caret"></b>
                        </a>
                        <ul class="dropdown-menu" id="dropdown-list">
                            <li><a href="#">2020-7</a></li>
                            <li><a href="#">2020-6</a></li>
                            <li><a href="#">2020-5</a></li>
                            <li><a href="#">2020-4</a></li>
                            <li><a href="#">2020-3</a></li>
                            <li><a href="#">2020-2</a></li>
                            <li><a href="#">2020-1</a></li>

                        </ul>
                    </div>

                </div>

                <div class="blue-item-two">
                    <div class="bill-title">客户姓名:</div>
                    <div class="bill-content">${user.name}</div>
                    <div class="bill-title" style="margin-left: 40px">手机号码:</div>
                    <div class="bill-content">${phone}</div>
                    <div class="bill-title" style="margin-left: 40px">客户星级:</div>
                    <div class="bill-content">一星用户</div>
                </div>
            </div>
        </div>

        <div class="blue-item-three">
            <div class="bill-title" style="line-height: 28px;color: #333">您<span id="month" style="color: #4cae4c">本月</span>共消费</div>
            <div class="bill-cost" id="bill-money">4.64</div>
            <div class="bill-title" style="float: right;margin-right: 0px;line-height: 28px">单位(元)</div>
        </div>

        <%--表格数据部分--%>
        <table class="table table-hover blue-item-four">
            <%--<caption>悬停表格布局</caption>--%>
            <thead>
            <tr>
                <th>消费项目</th>
                <th>价格</th>
                <th>减免</th>
                <th>实际消费</th>
            </tr>
            </thead>
            <tbody class="note-info-table">
            <tr>
                <td>套餐及固定费</td>
                <td>4.64</td>
                <td>0.00</td>
                <td>4.64</td>
            </tr>
            <tr>
                <td>合计</td>
                <td>4.64</td>
                <td>0.00</td>
                <td>4.64</td>
            </tr>
            </tbody>
        </table>
        <%--实时费用仅供参考，请以月末结账后月账单为准--%>
        <div class="refer">实时费用仅供参考，请以月末结账后月账单为准</div>
        <%--表格下方装饰--%>
        <img src="https://shop.10086.cn/i/nresource/image/billqry/zd-foot.png" class="table-decorate">
        <%--温馨提示--%>
        <div class="notice">
            <img src="https://shop.10086.cn/i/nresource/image/icon-bulb.png" style="float: left;margin-left: 20px">
            <div class="notice-title">温馨提示:</div>
            <div class="notice-content">1、以上是您本月通过话费支付方式订购和使用中国移动业务/服务的消费记录, 通过第三方支付的消费请您至所用支付工具中查询。</div>
            <div class="notice-content">2、账单生成时间: 2020-07-10 17:16:30。</div>
            <div class="notice-content">3、除特别说明，以上“ 国内 ”指国内（除港澳台地区）。</div>
        </div>
    </div>

    <%--引入尾部--%>
    <%@include file="../common/foot.jsp" %>
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
    function setToday() {
        let date1 = date('Y-m-d', new Date());
        // alert(date1)
        $('#startTimeInput').val(date1);
    }

    $("#dropdown-list li").on('click', function () {
//       获取下拉框中的内容
        console.log($(this).children("a").text());

        var time = $(this).children("a").text();
        //    把time分解成年月
        var month = time.slice(5);
        var year = time.slice(0,4);
        $("#time").html(time);
        $("#month").html(year+"年"+month+"月");
        $("#dropdown-title").html(time);
        // 手机号
        var phone = "<%= session.getAttribute("phone")%>";

        //    消费金额
        var costMoney = 0;
    //    发送ajax请求
        $.ajax({
            type: "get",
            datatype: "json",
            url: "http://localhost:8087/bill/cost?phone=" + phone + "&year=" +year + "&month=" + month,
            success: function (data) {
                console.log("data", data);
                $(".note-info-table tr td").remove();
                var content = '';
                $.each(data.dataInfo, function (k, v) {
                    var title = data.dataInfo[k].introduction;

                    costMoney+=data.dataInfo[k].price - data.dataInfo[k].reduceMoney;
                    // 实际消费
                    var actMoney = data.dataInfo[k].price - data.dataInfo[k].reduceMoney;
                    //如果想让模板字符串生效，还要转义一下
                    content =
                        `
                        <tr>
                            <td title="\${title}">\${data.dataInfo[k].costName}</td>
                            <td>\${data.dataInfo[k].price}</td>
                            <td>\${data.dataInfo[k].reduceMoney}</td>
                            <td>\${actMoney}</td>
                        </tr>
                        `;
                    $(".note-info-table").append(content);
                    $("#bill-money").html(costMoney/2);
                })

            }
        })

    })


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
        padding-left: 0px;
        padding-top: 0px;
        width: 1025px;
        /*height: 500px;*/
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

    /*蓝条部分 子绝父相*/
    .blue {
        margin: 0 auto;
        width: 959px;
        height: 132px;
        margin-top: 12px;

        /*background: red;*/
        background: url("https://shop.10086.cn/i/nresource/image/billqry/zd-bg.png") no-repeat;
    }

    .blue-item-one {
        width: 959px;
        padding: 50px 0 0 52px;
    }

    .bill-title {
        float: left;
        font-size: 14px;
        color: #a4a4a4;
    }

    .bill-content {
        float: left;
        color: #333;

    }

    .bill-time {
        float: right;
        margin-right: 25px;
        color: #0085d0;
    }

    .blue-item-two {
        clear: both;
        width: 959px;
        padding: 12px 0 0 52px;
    }

    .blue-item-three {
        clear: both;
        width: 959px;
        padding-top: 20px;
        padding-bottom: 20px;
        padding-left: 80px;
    }

    .bill-cost {
        color: #00a4ff;
        font-size: 20px;
        float: left;
    }

    .blue-item-four {
        width: 959px;
        margin: 0 auto;
        margin-top: 20px;
    }

    .refer {
        width: 959px;
        margin: 0 auto;
        padding-top: 20px;
        padding-bottom: 20px;
        text-align: center;
        font-size: 14px;
        color: #a4a4a4;
    }

    .table-decorate {
        /*margin: 0 auto;*/
        display: block;
        margin-left: 20px;
        width: 1005px;
    }

    /*温馨提示部分开始*/
    .notice {
        height: 170px;
    }

    .notice-title {
        float: left;
        margin-left: 5px;
        color: #4e4e4e;
        font-size: 12px;
        line-height: 26px;
    }

    .notice-content {
        clear: both;
        margin-left: 48px;
        font-size: 12px;
        color: #777777;
        margin-top: 5px;
    }
</style>
</html>