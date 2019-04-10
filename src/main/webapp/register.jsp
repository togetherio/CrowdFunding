<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>
<script type="text/javascript" src="js/jquery-1.42.min.js"></script>
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
<link href="css/font-awesome.min.css" rel="stylesheet" type="text/css">
<link href="css/base.css" rel="stylesheet" type="text/css">
<link href="css/reg.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="css/ace.min.css" type="text/css" />
<script type="text/javascript">
	//定义倒计时60秒
	var countdown = 60;
	function settime(val) {
		if (countdown == 0) {
			val.removeAttribute("disabled");
			val.value = "免费获取验证码";
			countdown = 60;
		} else {
			val.setAttribute("disabled", true);
			val.value = "重新发送(" + countdown + ")";
			countdown--;
			setTimeout(function() {
				settime(val)
			}, 1000)
		}

	}
	$(function() {
		$("#btn").click(function() {
			//获得手机号
			var tel_no = $("#tel").val();

			if (!(/^1[34578]\d{9}$/.test(tel_no))) {
				alert("手机号码有误，请重填");
				return false;
			} else {
				$.ajax({
					type : 'GET',
					url : 'code',
					data : {
						"tel" : tel_no
					},
					dataType : 'json',
					success : function(returnData) {

					}
				});
			}
		});
	})

	function check(obj) {
		if (obj.usUsername.value != "" && obj.usPassword.value != ""
				&& obj.usPhone.value != "" && obj.usCode.value != ""
				&& obj.acc.checked != "") {
			return true;
		}
		return false;
	}
</script>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>

	<div class="login-container">

		<div class="space-6"></div>

		<div class="position-relative">
			<div id="signup-box" class="signup-box widget-box no-border">
				<div class="widget-body">
					<div class="widget-main">
						<h4 class="header green lighter bigger">
							<i class="ace-icon fa fa-users blue"></i> 用户注册
						</h4>

						<div class="space-6"></div>
						<p>填写信息:</p>

						<form action="register" method="post"
							onsubmit="return check(this)">
							<fieldset>


								<label class="block clearfix"> <span
									class="block input-icon input-icon-left"> <input
										id="username" name="usUsername" type="text"
										class="form-control" placeholder="用户名" /> <i
										class="ace-icon fa fa-user"></i>
								</span>
								</label> <label class="block clearfix"> <span
									class="block input-icon input-icon-left"> <input
										id="password" name="usPassword" type="password"
										class="form-control" placeholder="设置密码(6-16位字母与数字组合)"
										onChange="checkpas();" /> <i class="ace-icon fa fa-lock"></i>
								</span>
								</label> <label class="block clearfix"> <span
									class="block input-icon input-icon-left"> <input
										id="repassword" type="password" class="form-control"
										placeholder="确认密码" onChange="checkpas1();" /> <i
										class="ace-icon fa fa-retweet"></i>
								</span> <span id="tip" style='color: red'></span><span id="tip1"
									style='color: red'></span><br>
								</label> <label class="block clearfix"> <span
									class="block input-icon input-icon-left"> <input
										id="tel" name="usPhone" type="text" class="form-control"
										placeholder="手机号码" /> <i class="ace-icon fa fa-phone"></i>
								</span> <!--验证码--> <label class="block clearfix"> <span>
											<input id="code" name="usCode" type="text" class="ace"
											placeholder="手机验证码" /> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
											<input id="btn" class="btn btn-default" type="button"
											value="获取验证码" onclick="settime(this)" />

									</span>
								</label> <label class="block"> <input type="checkbox"
										id="accept" name="acc" class="usAccept" /> <span class="lbl">
											接受 <a href="#">用户协议</a>
									</span>
								</label>

									<div class="space-24"></div>

									<div class="clearfix">
										<button type="reset" class="width-30 pull-left btn btn-sm">
											<i class="ace-icon fa fa-refresh"></i> <span
												class="bigger-110">重置</span>
										</button>

										<input id="submit" name="submit" type="submit" value="注册"
											class="width-65 pull-right btn btn-sm btn-success" />

									</div>
							</fieldset>
						</form>


						<div class="toolbar center">
							<a href="login.jsp" data-target="#login-box"
								class="back-to-login-link"> <i
								class="ace-icon fa fa-arrow-left"></i> 返回登录
							</a>
						</div>
					</div>
					<!-- /.widget-body -->
				</div>
			</div>
		</div>
	</div>

	<jsp:include page="footer.jsp"></jsp:include>

	<script>
		var tip = document.getElementById("tip");
		var tip1 = document.getElementById("tip1");
		function checkpas() {//当第一个密码框失去焦点时，触发checkpas件
			var pas1 = document.getElementById("password").value;
			var pas2 = document.getElementById("repassword").value;//获取两个密码框的值
			var pwdReg = /^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{6,16}$/;//6到16位数字与字母组合
			if (!pwdReg.test(pas1)) {
				tip.innerHTML = "密码不符合规则";
				$("#tip").show();
			} else {
				tip.innerHTML = "";
				$("#tip").hide();
			}

		}
		function checkpas1() {//当第二个密码框失去焦点时，触发checkpas1件
			var pas1 = document.getElementById("password").value;
			var pas2 = document.getElementById("repassword").value;//获取两个密码框的值
			if (pas1 != pas2) {
				tip1.innerHTML = "两次输入的密码不一致";
				$("#tip1").show();//当两个密码不相等时则显示错误信息
			} else {
				tip1.innerHTML = "";
				$("#tip1").hide()
			}
		}
	</script>

</body>
</html>