$(function() {
	$("#login_user_sub").click(function() {
		loginUser();
	});
})

function loginUser() {
	var phone = $("#login_phone").val();
	var pwd = $("#login_pwd").val();
	var flag = checkMBPhone(phone);
	if (!flag) {
		return;
	}
	var user = new Object();
	user.phoneNum = phone;
	user.password = pwd;
	$.get({
		url : "login",
		data : user,
		success : function(data) {
			if(data.status==0){
				alert(data.msg);
				return;
			}
			if(data.status==1){
				window.location.href="/index/"
			}
		}
	})
}

/* 用于检验手机号的位数以及检验此手机中是否为中国移动的手机号 */
// 中国移动目前拥有以下字段开头的号码：134(0至8号段) 135 136 137 138 139 147 150 151 152 157 158 159
// 187 188
function checkMBPhone(phone) {

	var mbphno = /^(13[4-9])|(147)|(150)|(151)|(152)|(157)|(158)|(159)|(176)|(187)|(188)/;
	var num11 = /^\d{11}$/; // 11位数字;
	if ("" != phone) {
		if (num11.exec(phone)) {
			if (mbphno.exec(phone)) {
				return true;
			} else {
				alert("对不起，请您正确输入中国移动手机号码(以134-139或147、150、151、152、157、158、159、176、187、188开头)!");
				return false;
			}
		} else {
			alert("请正确输入11位手机号码(数字)!");
			return false;
		}
	} else {
		alert("对不起，请输入您的手机号码!");
		return false;
	}
	return false;
}
$(function() {
	$("#reset_sub").click(function() {
		reset();
	});
})
function reset() {
	document.getElementById("login_phone").value = "";
	document.getElementById("login_pwd").value = "";
}