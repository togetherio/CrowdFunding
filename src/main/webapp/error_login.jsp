<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="refresh" content="3;url=login.jsp">
<title>登陆失败</title>
<script type="text/javascript">
function info() {
//循环执行,1秒执行一次
window.setInterval("daojishi()", 1000);
}
function daojishi() {
if(document.getElementById("msg").innerHTML!=1){
document.getElementById("msg").innerHTML=document.getElementById("msg").innerHTML-1;
}
}
</script>
</head>
<body onload="info()">
用户名或密码错误,<span id="msg">3</span>秒返回登录页面
</body>
</html>