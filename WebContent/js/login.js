/**
 * 
 */
function userlogincheck() {
	var usercount = document.getElementById("UserCount");
	var password = document.getElementById("Password");
	if (usercount.value.length==0 || password.value.length==0) {
		alert('用户名或密码不可为空！');
		return false;
	} else {
		return true;
	}
}