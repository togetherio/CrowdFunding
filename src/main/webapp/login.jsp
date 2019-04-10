<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script type="text/javascript" src="js/jquery-1.42.min.js"></script>
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
<link href="css/font-awesome.min.css" rel="stylesheet" type="text/css">
<link href="css/base.css" rel="stylesheet" type="text/css">
<link href="css/index2.css" rel="stylesheet" type="text/css">
<link href="css/reg.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="css/headbott.css" type="text/css" />
<link rel="stylesheet" href="css/ace.min.css" type="text/css" />
<title>登陆</title>

<script type="text/javascript" charset="UTF-8">
	$(function() {
		var rem = document.getElementById("rem");
		var usPhone = document.getElementById("usPhone");
		var usPassword = document.getElementById("usPassword");
		if ((usPhone.value != "") && (usPassword.value != "")) {
			rem.checked = true;
		} else {
			rem.checked = false;
		}
	});

	function check(obj) {
		console.log(obj)
		if (obj.usPhone.value != "" && obj.usPassword.value != "") {
			return true;
		}
		return false;
	}

/* 	function addrem() {
		var rem = document.getElementById("rem");
		rem.checked = true;

	} */
</script>

<%
	Cookie[] cks = request.getCookies();
	String value = "";
	String[] info = {"", ""};
	if(cks != null){
		for (Cookie ck : cks) {
			if ("userinfo".equals(ck.getName())) {
				value = ck.getValue();
				info = value.split(":");
			}	
		}	
	}else{
		info[0] = "";
		info[1] = "";
	}
%>

</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>

	<div class="login-container">

		<div class="space-6"></div>

		<div class="position-relative">
			<div id="login-box" class="login-box visible widget-box no-border">
				<div class="widget-body">
					<div class="widget-main">
						<h4 class="header blue lighter bigger">
							<i class="ace-icon fa fa-coffee green"></i> 用户登陆
						</h4>

						<div class="space-6"></div>

						<form action="login" method="post"
							onsubmit="return check(this)">
							<fieldset>
								<label class="block clearfix"> <span
									class="block input-icon input-icon-left"> <i
										class="ace-icon fa fa-user"></i> <input id="usPhone"
										name="usPhone" value="<%= info[0] %>" type="text" class="form-control"
										placeholder="手机号码" />

								</span>
								</label> <label class="block clearfix"> <span
									class="block input-icon input-icon-left"> <i
										class="ace-icon fa fa-lock"></i> <input id="usPassword"
										name="usPassword" value="<%= info[1] %>" type="password" class="form-control"
										placeholder="请输入密码" />

								</span>
								</label>

								<div class="space"></div>

								<div class="clearfix">
									<label class="inline"> <input type="checkbox"
										class="ace" id="rem" name="rem" value="rem" /> <span
										class="lbl"> 记住用户名</span>
									</label> <!-- &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <label class="inline">
										<input type="checkbox" class="ace" name="autoLogin"
										value="autoLogin" onclick="addrem()" /> <span class="lbl">
											自动登陆</span>
									</label> --> <input name="submit" type="submit" value="登陆"
										class="width-35 pull-right btn btn-sm btn-primary" />


								</div>

								<div class="space-4"></div>
							</fieldset>
						</form>

						<div class="social-or-login center">
							<span class="bigger-110">第三方登录</span>
						</div>

						<div class="space-6"></div>

						<div class="social-login center">
							<a href="#"> <img src="images/weixin.png">
							</a> <a href="#"> <img src="images/qq.png">
							</a> <a href="#"> <img src="images/sina.png">
							</a>
						</div>

					</div>
					<!-- /.widget-main -->
					<div class="toolbar clearfix">
						<div>
							<a href="#" data-target="#forgot-box"
								class="forgot-password-link"> <i
								class="ace-icon fa fa-arrow-left"></i> 忘记密码
							</a>
						</div>

						<div>
							<a href="register.jsp" data-target="#signup-box"
								class="user-signup-link"> 注册 <i
								class="ace-icon fa fa-arrow-right"></i>
							</a>
						</div>
					</div>
				</div>
				<!-- /.widget-body -->
			</div>
			<!-- /.login-box -->

			<!-- /.position-relative -->
		</div>
	</div>
	<!-- /.col -->

	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>