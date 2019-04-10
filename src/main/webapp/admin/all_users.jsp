<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>众筹管理后台</title>
<script type="text/javascript" src="js/jquery1.12.4.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/countUp.js"></script>
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/dashboard.css" />

<style type="text/css">
.table th, .table td {
	text-align: center;
	vertical-align: middle !important;
}
</style>


<script type="text/javascript">
	$(function() {
		$
				.ajax({
					type : 'GET',
					url : '${pageContext.request.contextPath}/getAllUsers',
					dataType : 'json',
					success : function(returnData) {
						console.log(returnData);
						$(returnData)
								.each(
										function(index, item) {
											console.log(item);

											var tr = "<tr style='text-align:center'>"
													+ "<td>"
													+ item.usId
													+ "</td>"
													+ "<td>"
													+ item.usUsername
													+ "</td>"
													+ "<td>"
													+ item.usPhone
													+ "</td>"
													+ "<td>"
													+ item.usCreateTime
													+ "</td>"
													+ "<td>"
													+ item.usRealname
													+ "</td>"
													+ "<td>"
													+ item.usSex
													+ "</td>"
													+ "<td>"
													+ item.usEntic
													+ "</td>"
													+ "<td>"
													+ item.usBirthday
													+ "</td>"
													+ "<td>"
													+ item.usAddress
													+ "</td>"
													+ "<td>"
													+ item.usIdcard
													+ "</td>"
													+ "</tr>";

											$("#tbody").append(tr)
										})

					}
				})
	})
</script>

</head>
<body>

	<jsp:include page="header.jsp"></jsp:include>


	<div class="container-fluid">
		<div class="row">
			<div class="col-sm-3 col-md-2 sidebar">
				<ul class="nav nav-sidebar">
					<li><a href="index.jsp">首页</a></li>
				</ul>
				<ul class="nav nav-sidebar">
					<li><a href="all_projects.jsp">所有项目</a></li>
					<li><a href="check_project.jsp">项目审核</a></li>
				</ul>
				<ul class="nav nav-sidebar">
					<li class="active"><a href="javascript:void(0)">所有用户</a></li>
					<li><a href="smsh.jsp">实名审核</a></li>
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
										<th>用户ID</th>
										<th>用户名</th>
										<th>手机号</th>
										<th>注册时间</th>
										<th>姓名</th>
										<th>性别</th>
										<th>民族</th>
										<th>出生日期</th>
										<th>地址</th>
										<th>身份证号码</th>
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

</body>
</html>