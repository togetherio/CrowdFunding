<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>众筹管理后台</title>
<script type="text/javascript" src="js/jquery1.12.4.min.js"></script>
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/dashboard.css" />

<style type="text/css">
#tbody img {
	cursor: pointer;
	transition: all 0.6s;
}

#tbody img:hover {
	transform: scale(5);
}
</style>


<script type="text/javascript">
			$(function() {
				$.ajax({
					type : 'GET',
					url : '${pageContext.request.contextPath}/getCheckUser',
					dataType : 'json',
					success : function(returnData) {
						 console.log(returnData);
						 /*console.log(returnData[0][0].usId);
						console.log(returnData.length) */
						/* console.log(atob(returnData[0][1])) */
						/* console.log(returnData[0][1]) */
						$(returnData).each(function(index,item){
							console.log(item)
							var tr = "<tr style='text-align:center'>" + "<td>"
							+ item[0].usId
							+ "</td>"
							+ "<td>"
							+ item[0].usUsername
							+ "</td>"
							+ "<td>"
							+ item[0].usPhone
							+ "</td>"
							+ "<td>"
							+ item[0].usCreateTime
							+ "</td>"
							+ "<td>"
							+ "<img src='data:image/jpg;base64,"+item[1]+"' width='45px' height='30px'/>"
							+ "</td>"
							+ "<td>"
							+ "<img src='data:image/jpg;base64,"+item[2]+"' width='45px' height='30px'/>"
							+ "</td>"
							+ "<td><a href='${pageContext.request.contextPath}/smshDetail?usId="
							+ item[0].usId
							+ "'>详情</a></td>"
							+ "<td><button onclick='pass("+item[0].usId+")'>通过</button>&nbsp;&nbsp;<button onclick='nopass("+item[0].usId+")'>不通过</button></td>"
							+ "</tr>"; 

						$("#tbody").append(tr)
						})
				/* 		for (var i = 0; i < returnData.length; i++) {
							var tr = "<tr style='text-align:center'>" + "<td>"
									+ returnData[i][0].usId
									+ "</td>"
									+ "<td>"
									+ returnData[i][0].usUsername
									+ "</td>"
									+ "<td>"
									+ returnData[i][0].usPhone
									+ "</td>"
									+ "<td>"
									+ returnData[i][0].usCreateTime
									+ "</td>"
									+ "<td>"
									+ "<img src='data:image/jpg;base64,"+returnData[i][1]+"' width='45px' height='30px'/>"
									+ "</td>"
									+ "<td>"
									+ "<img src='data:image/jpg;base64,"+returnData[i][2]+"' width='45px' height='30px'/>"
									+ "</td>"
									+ "<td><a href='${pageContext.request.contextPath}/smshDetail?usId="
									+ returnData[i][0].usId
									+ "'>详情</a></td>"
									+ "<td><button onclick='pass("+returnData[i][0].usId+")'>通过</button>&nbsp;&nbsp;<button onclick='nopass("+returnData[i][0].usId+")'>不通过</button></td>"
									+ "</tr>"; 

							$("#tbody").append(tr)
						}*/
					}
				})
			})
			
			function pass(usId){
				$.ajax({
					type : 'POST',
					url : '${pageContext.request.contextPath}/CheckPass',
					dataType : 'json',
					data : {"usId":usId},
					success : function(returnData) {
						console.log(returnData);
						console.log(returnData.passSign);
						if(returnData.passSign == true){
							console.log(this)
							/* $(this).parent().parent().remove(); */
							history.go(0)
							
						}

					}
					
				});
			}
			
			function nopass(usId){
				$.ajax({
					type : 'POST',
					url : '${pageContext.request.contextPath}/CheckNopass',
					dataType : 'json',
					data : {"usId":usId},
					success : function(returnData) {
						console.log(returnData)
						if(returnData.noPassSign == true){
							history.go(0)
						}
					}
					
				});
			}
</script>

</head>
<body>

	<jsp:include page="header.jsp"></jsp:include>


	<div class="container-fluid">
		<div class="row">
			<div class="col-sm-3 col-md-2 sidebar">
				<ul class="nav nav-sidebar">
					<li><a href="index.html">首页</a></li>
				</ul>
				<ul class="nav nav-sidebar">
					<li><a href="products.html">所有项目*</a></li>
					<li><a href="#">项目审核</a></li>
					<li><a href="#">项目跟踪</a></li>
					<li><a href="#">项目评论</a></li>
					<li><a href="classify/all_classity.html">项目分类*</a></li>
					<li><a href="#">项目推荐</a></li>
				</ul>
				<ul class="nav nav-sidebar">
					<li><a href="">注册用户</a></li>
					<li><a href="">用户资金</a></li>
					<li><a href="">用户日志</a></li>
					<li class="active"><a href="javascript:void(0)">实名审核</a></li>
				</ul>
				<ul class="nav nav-sidebar">
					<li><a href="">新闻管理</a></li>
					<li><a href="">问题管理</a></li>
					<li><a href="">管理用户</a></li>
					<li><a href="">管理日志</a></li>
				</ul>
			</div>
			<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
				<h1 class="page-header">所有待审核实名认证人员</h1>

				<div class="panel panel-default">
					<div class="panel-heading">
						<div class="panel-title">所有人员列表&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;审核人:&nbsp;&nbsp;冯波</div>
					</div>
					<div class="panel-body">

						<div class="table-responsive "
							style="padding-top: 15px; padding-bottom: 50px">
							<table class="table table-striped table-bordered">
								<thead>
									<tr>
										<th>ID</th>
										<th>用户名</th>
										<th>手机号</th>
										<th>注册时间</th>
										<th>面部照片</th>
										<th>身份证照片</th>
										<th>身份证信息</th>
										<th>审核结果</th>
									</tr>
								</thead>
								<tbody id="tbody">
									<!-- <tr>
										<td></td>
										<td></td>
										<td></td>
										<td></td>
										<td></td>
										<td></td>
										<td><a href="product/product-info1.html">详情</a> <a href="#" title="查看项目详情"><span class="glyphicon glyphicon-info-sign" aria-hidden="true"></span></a>
											&nbsp;&nbsp;
                  	<a href="#" title="编辑项目信息"><span class="glyphicon glyphicon-edit" aria-hidden="true"></span></a>
										</td>
									</tr> -->


								</tbody>
							</table>
						</div>

						<nav aria-label="Page navigation" class="text-right">
						<ul class="pagination">
							<li class="disabled"><a href="#" aria-label="Previous">
									<span aria-hidden="true">&laquo;</span>
							</a></li>
							<li class="active"><a href="#">1</a></li>
							<li><a href="#">2</a></li>
							<li><a href="#">3</a></li>
							<li><a href="#">4</a></li>
							<li><a href="#">5</a></li>
							<li><a href="#" aria-label="Next"> <span
									aria-hidden="true">&raquo;</span>
							</a></li>
						</ul>
						</nav>
					</div>


				</div>

			</div>
		</div>
	</div>

	<script type="text/javascript" src="js/jquery1.12.4.min.js"></script>
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/countUp.js"></script>
	<script>
		$(document).ready(function() {

		});
	</script>
</body>
</html>