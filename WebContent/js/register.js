/**
 * 
 */
$(document).ready(function() {  
	function checkData() {
    	var userName = document.getElementById("username");
    	if (username.value.length==0){
    		alert("用户名不能为空");
    		return false;
    	}
        var count = document.getElementById("count");
        if (count.value.length < 3 || count.value.length > 7) {
            alert("账号必须在3到7字符之间");
            return false;
        }
        var password = document.getElementById("password");
        if (password.value.length == 0) {
            alert("密码不可为空");
            return false;
        }
        var confirmPassword = document.getElementById("re-password");
        if (password.value != confirmPassword.value) {
            alert("密码不相同");
            return false;
        }
        return true;
    }
});