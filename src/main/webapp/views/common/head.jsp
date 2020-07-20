<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <%--<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>--%>
    <script type="text/javascript" src="/js/jquery-3.3.1.js"></script>

    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <%--<link href="https://cdn.bootcss.com/bootstrap-datetimepicker/4.17.47/css/bootstrap-datetimepicker.min.css" rel="stylesheet">--%>

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
    <title>短信详情</title>
    <script type="text/javascript" src="/js/main.js"></script>


</head>
<body>
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
                    src="https://shop.10086.cn/i/nresource/headimages/t3-1.png">欢迎你:${user.name}</a></div>
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

<script src="/js/time.js"></script>

<script src="https://cdn.bootcss.com/bootstrap-datetimepicker/4.17.47/js/bootstrap-datetimepicker.min.js"></script>
<script type="text/javascript" src="/js/bootstrap-datetimepicker.js" charset="UTF-8"></script>
<%--中文引用--%>

<script type="text/javascript" src="/js/locales/bootstrap-datetimepicker.zh-CN.js" charset="UTF-8"></script>
<%--英文引用--%>
<%--<script type="text/javascript" src="/js/locales/bootstrap-datetimepicker.fr.js" charset="UTF-8"></script>--%>
<script type="text/javascript">
    function setToday() {
        alert("jint");
        // var todayDay=$.format.date(new Date(),'yyyy-MM-dd');//根据自己的时间展现需要来格式化成相关的格式
        // alert(todayDay)
        let date1 = date('Y-m-d',new Date());
        alert(date1)
        $('#startTimeInput').val(date1);
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
        }).on('changeDate', function(ev){
            if(ev.date){
                $('#endTime').datetimepicker('setStartDate', new Date(ev.date.valueOf()))
            }else{
                $('#endTime').datetimepicker('setStartDate',null);
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

        }).on('changeDate', function(ev){
            console.log("333",ev.date.valueOf())
            //获取时间
            //这种方法获取到的时间是英文的
            console.log($("#startTime").data("datetimepicker").getDate());
            // 这种方法是获取输入框中的时间，是中文的
            console.log($("#endTime").find("input").val())
            if(ev.date){
                $('#startTime').datetimepicker('setEndDate', new Date(ev.date.valueOf()))
            }else{
                $('#startTime').datetimepicker('setEndDate',new Date());
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
</html>