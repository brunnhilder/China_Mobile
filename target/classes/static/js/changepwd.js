$(function() {
	$("#change_user_sub").click(function() {
		changePwd();
	});
})

function changePwd() {
	var oldpwd = $("#login_oldpwd").val();
	var pwdone = $("#login_pwdone").val();
	var pwdtwo = $("#login_pwdtwo").val();
	
	var flag = checkMBPwd(pwdone,pwdtwo);
	if (!flag) {
		return;
	}
	var user = new Object();
	user.oldpassword = oldpwd;
	user.password = pwdtwo;
	$.post({
		url : "password",
		data : user,
		success : function(data) {
			if(data.status==0){
				alert(data.msg);
				return;
			}
			if(data.status==1){
				window.location.href="/"
			}
		}
	})
}

/* 用于检验密码的位数格式以及2次新密码是否相同 */

function checkMBPwd(pwdone,pwdtwo) {

	var num6 = /^\d{6}$/; // 11位数字;
	if ("" != pwdone) {
		if (num6.exec(pwdone)) {
			if (pwdone==pwdtwo) {
				return true;
			} else {
				alert("对不起，两次输入的密码不一致！");
				return false;
			}
		} else {
			alert("请正确输入6位密码(数字)!");
			return false;
		}
	} else {
		alert("对不起，请输入新密码!");
		return false;
	}
	return false;
}
$(function() {
	$("#reset_sub").click(function() {
		reset();
	});
})
/* 返回登录页面 */
function reset() {
	window.location.href="/index/"
}