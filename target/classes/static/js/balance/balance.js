$(function() {
	balanceCheck();
	$("#balance_sub").click(function() {
		balanceCheck();
	});
})

function balanceCheck() {
	$.get({
		url : "balanceCheck",
		success : function(data) {
			// 如果查询失败
			if(data.status != "1"){
				// 显示失败提示
				var tip = "查询失败：" + data.msg;
				alert(tip);
				return;
			}
			//否则查询成功
			var balancetip = "尊敬的中国移动用户您当前话费余额为 " + data.balance + "元";
			$("#balance_tip").html(balancetip);		
		}
	})
}