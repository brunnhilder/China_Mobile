$(function() {
	// 初始化
	init();
})

// 初始化函数
function init() {

	// 给充值按钮绑定事件
	$("#refill_btn").click(function() {
		refill();
	});
	
	// 给重置按钮绑定事件
	$("#rb_reset_btn").click(function() {
		
		// 清空提示文字
		$("#refill_tip").html("");
	});

}

// 充值话费
function refill() {

	// 获得卡号和密码
	var cardId = $("#cardId").val();
	var password = $("#password").val();

	// 清空提示文字
	$("#refill_tip").html("");

	// 检查卡号和密码的格式
	var idPatrn = /^[0-9]{17}$/;
	if (!idPatrn.exec(cardId)) {
		$("#refill_tip").html("输入卡号格式错误！");
		return;
	}
	var pwdPatrn = /^[0-9]{18}$/;
	if (!pwdPatrn.exec(password)) {
		$("#refill_tip").html("输入密码格式错误！");
		return;
	}

	// 使用ajax进行充值请求
	$.ajax({
		url : "rb",
		type : "post",
		data : {
			cardId : cardId,
			password : password
		},
		success : function(data) {

			// 失败
			if (data.status == "0") {
				
				// 显示提示
				$("#refill_tip").html(data.failMsg);
			}

			// 成功
			if (data.status == "1") {
				
				// 显示提示
				$("#refill_tip").html(data.succMsg);

				// 清空卡号密码输入框
				$("#cardId").val("");
				$("#password").val("");
			}
		}
	});

}