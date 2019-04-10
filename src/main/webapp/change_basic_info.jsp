<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<script type="text/javascript" src="js/jquery-1.42.min.js"></script>
<script type="text/javascript" src="js/jquery.js"></script>
<link rel="stylesheet" href="css/base.css" type="text/css" />
<link rel="stylesheet" href="css/headbott.css" type="text/css" />
<link rel="stylesheet" href="css/index.css" type="text/css" />
<link rel="stylesheet" href="css/ly-list.css" type="text/css" />
<link rel="stylesheet" href="css/reg.css" type="text/css" />
<link rel="stylesheet" href="css/detail.css" type="text/css" />
<link rel="stylesheet" href="css/myself.css" type="text/css" />
<link href="css/font-awesome.min.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="css/ace.min.css" type="text/css" />
<title>修改资料</title>
</head>
<script type="text/javascript">
	/* var formData = new FormData($("#form")[0]);
	var username = $("#username").val();
	var password = $("#password").val();
	var phone = $("#password").val();
	console.log(username) */

		
	
	function changeInfo(){
		console.log("===");

		var username = $("#username").val();
		var password = $("#password").val();
		var phone = $("#phone").val();
		console.log(username)
		$.ajax({
			type : 'POST',
			url : '${pageContext.request.contextPath}/changeInfo',
			dataType : 'json',
			data : {"username":username,"password":password,"phone":phone},
			success : function(returnData) {
				console.log(returnData)
				if(returnData.isChange == true){
					alert("修改成功,请重新登陆！")
					window.location.href="login.jsp";
				}else{
					alert("修改失败，请重试！")
				}
			
			},error : function(){
				alert("=====")
			}
		})
	}


</script>
<body>
	<jsp:include page="header.jsp"></jsp:include>

	<div class="user-con">
		<div class="user-conl">
			<ul>
				<li><b class="a-tit" href="">个人设置</b></li>
				<li><i class="i10"></i><a href="smrz.jsp">实名认证</a></li>
				<li><i class="i7"></i><a class="u-hover"
					href="javascript:void(0)">资料修改</a></li>
				<li><b class="a-tit" href="">项目管理</b></li>
				<li><i class="i1"></i><a href="myself.jsp">发起的项目</a></li>
				<li><i class="i2"></i><a href="">参与的项目</a></li>
				<li><i class="i4"></i><a href="">点赞的项目</a></li>
				<li><i class="i6"></i><a href="">资金管理</a></li>
				<!-- <li><b class="a-tit" href="">消息管理</b></li>
    <li><i class="i4"></i><a href="">我的评论</a></li>
    <li><i class="i4"></i><a href="">我的私信</a></li> -->

			</ul>
		</div>
		<div class="user-conr">
			<div class="user-conr_tab">
				<ul>
					<li class="cur">基本信息修改</li>

				</ul>
			</div>
			<div class="user-conr_tab2">

				<form id="form" action="" method="post">
					<div class="product-form">
						<div class="my-form">
							<div class="product-info-input">
								<b>用户名：</b> <input id="username" class="text" name="usUsername" type="text" value="${activeuser.usUsername }"><br><br><br>
								<b>密&nbsp;&nbsp;码：&nbsp;</b> <input id="password" class="text" name="usPassword" type="password" value="${activeuser.usPassword }"><br><br><br>
								<b>手机号：</b> <input id="phone" class="text" name="usPhone" type="text" value="${activeuser.usPhone }"><br><br><br>
								<div class="clearfix">
									<button onclick="changeInfo()" class="width-30 pull-right btn btn-sm btn-success" >提交</button>
								</div>
							</div>
						</div>
					</div>
				</form>

			</div>

		</div>

	</div>

	</div>

	<jsp:include page="footer.jsp"></jsp:include>

</body>



<script>
	$(document).ready(
			function() {
				$(".user-conr_tab li").click(
						function() {
							$(".user-conr_tab li").eq($(this).index())
									.addClass("cur").siblings().removeClass(
											'cur');
							$(".user-conr_tab2 li").hide().eq($(this).index())
									.show();
						})
			});
</script>

</html>