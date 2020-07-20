$(function() {
	// 初始化
	init();
})

// 初始化函数
function init() {
	$("#get_ch_submit").click(function() {
		getCallHistory();
	});
}

// 查询通话记录
function getCallHistory() {

	// 获得开始日期和开始时间
	var beginDate = $("#begin_date").val();

	// 日期为空，则认为使用默认时间查询
	if (beginDate == "") {
		var beginTime = null;
	} else {
		
		// 获得开始时间
		var bTime = $("#begin_time").val()
		
		// 时间为空，则认为00:00
		if(bTime == ""){
			bTime = "00:00";
		}
		
		// 由于时间控件没有毫秒，需要自行添加
		var beginTime = beginDate + " " + bTime + ":00";
	}

	// 获得截至日期和截至时间
	var endDate = $("#end_date").val();

	// 日期为空，则认为使用默认时间查询
	if (beginDate == "") {
		var beginTime = null;
	} else {
		
		// 获得截至开始时间
		var eTime = $("#end_time").val()
		
		// 时间为空，则认为00:00
		if(eTime == ""){
			eTime = "00:00";
		}
		
		// 由于时间控件没有毫秒，需要自行添加
		var endTime = endDate + " " + eTime + ":00";
	}

	// 进行ajax请求，查询通话记录
	$.ajax({
		url : "ch",
		type : "get",
		data : {
			beginTime : beginTime,
			endTime : endTime
		},
		dataType : "json",
		contentType : "UTF-8",
		success : function(data) {
			
			// 如果查询失败
			if(data.status == "0"){
				
				// 显示失败提示
				var tip = "查询失败：" + data.msg;
				$("#call_history_tip").html(tip);
	
				// 直接返回，不显示通话记录
				return;
			}
			
			// 查询成功，则提示数据条数
			var tip = "共查询到 " + data.callNum + " 条通话记录：";
			$("#call_history_tip").html(tip);
			
			// 显示通话记录
			// 获取表格模板，
			var tabTemplate = $("#resu_tab_template");
			
			//清空上次显示的内容
			$("#ch_tab_span").empty();
			
			// 复制n份，分别显示n条通话记录
			for(var i=0; i<data.callList.length; i++){
				
				//克隆表格，并修改id
				var clonedTab = tabTemplate.clone(true);
				var tabId = "call_tab_"+i;
				clonedTab.attr("id", tabId);
				
				//显示表格
				clonedTab.css("display", "true");
				
				//添加表格到父元素中
				$("#ch_tab_span").append(clonedTab);
				
				//添加要显示的数据
				$("#" + tabId + " tr:eq(0)" + " td:nth-child(2)")
					.html(data.callList[i].beginTime);
				$("#" + tabId + " tr:eq(1)" + " td:nth-child(2)")
					.html(data.callList[i].stopTime);
				$("#" + tabId + " tr:eq(2)" + " td:nth-child(2)")
					.html(data.callList[i].callDuration+" 秒");
				$("#" + tabId + " tr:eq(3)" + " td:nth-child(2)")
					.html(data.callList[i].fromPhone);
				$("#" + tabId + " tr:eq(4)" + " td:nth-child(2)")
					.html(data.callList[i].toPhone);
			}
		}
	});
}