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
<script type="text/javascript" src="js/aa.js"></script>
<script type="text/javascript">
	//定义倒计时60秒
	var countdown=60;
	function settime(val) {
        if (countdown == 0) {
            val.removeAttribute("disabled");
            val.value="免费获取验证码";
            countdown = 60;
        } else {
            val.setAttribute("disabled", true);
            val.value="重新发送(" + countdown + ")";
            countdown--;
            setTimeout(function() {
                settime(val)
            },1000)
        }
 
    }
	$(function(){
		$("#btn").click(function (){
			//获得手机号
			var tel_no=$("#tel").val();
				
			$.ajax({
				type:'GET',
				url:'code',
				data:{"tel":tel_no},
				dataType:'json',
				success:function(returnData){	
					
				}
			});
		});
	})
	

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

						<form action="register" method="post">
							<fieldset>


								<label class="block clearfix"> <span
									class="block input-icon input-icon-left"> <input id="username"
										name="usUsername" type="text" class="form-control"
										placeholder="用户名" /> <i class="ace-icon fa fa-user"></i>
								</span>
								</label> <label class="block clearfix"> <span
									class="block input-icon input-icon-left"> <input id="password"
										name="usPassword" type="password" class="form-control"
										placeholder="设置密码" /> <i class="ace-icon fa fa-lock"></i>
								</span>
								</label> <label class="block clearfix"> <span
									class="block input-icon input-icon-left"> <input id="repassword"
										type="password" class="form-control" placeholder="确认密码" onChange="checkpas();" /> <i
										class="ace-icon fa fa-retweet"></i>
								</span>
								<span class="tip" style="color: red;">两次输入的密码不一致</span><br>
								</label> <label class="block clearfix"> <span
									class="block input-icon input-icon-left"> <input id="tel"
										name="usPhone" type="text" class="form-control"
										placeholder="手机号码" /> <i class="ace-icon fa fa-phone"></i>
								</span>							
								<!--验证码-->
								<label class="block clearfix"> <span> 
									<input id="code" name=usCode type="text" class="ace" placeholder="手机验证码" />
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									<input id="btn" class="btn btn-default" type="button" value="获取验证码" onclick="settime(this)"/>
										
								</span>
								</label> <label class="block"> <input type="checkbox" id="accept"
									class="usAccept" /> <span class="lbl"> 接受 <a href="#">用户协议</a>
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
            $(".tip").hide();
            function checkpas1(){//当第一个密码框失去焦点时，触发checkpas1事件
                var pas1=document.getElementById("password").value;
                var pas2=document.getElementById("repassword").value;//获取两个密码框的值
                if(pas1!=pas2&&pas2!="")//此事件当两个密码不相等且第二个密码是空的时候会显示错误信息
                    $(".tip").show();
                else
                    $(".tip").hide();//若两次输入的密码相等且都不为空时，不显示错误信息。
                }
            function checkpas(){//当第一个密码框失去焦点时，触发checkpas2件
                var pas1=document.getElementById("password").value;
                var pas2=document.getElementById("repassword").value;//获取两个密码框的值
                if(pas1!=pas2){
                    $(".tip").show();//当两个密码不相等时则显示错误信息
                }else{
                    $(".tip").hide();
                }
                }
     /*        function checkpas2(){//点击提交按钮时，触发checkpas2事件，会进行弹框提醒以防无视错误信息提交
                var pas3=document.getElementById("password").value;
                var pas4=document.getElementById("repassword").value;
                if(pas3!=pas4){
                    alert("两次输入的密码不一致！");
                    return false;
                }
            } */
        	
            
        </script>
	
</body>
</html>