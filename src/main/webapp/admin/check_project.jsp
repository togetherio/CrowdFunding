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
		$.ajax({
			type : 'GET',
			url : '${pageContext.request.contextPath}/getCheckProjects',
			dataType : 'json',
			success : function(returnData) {
				console.log(returnData);
				$(returnData).each(function(index,item){
					var tr = "<tr>"+
								"<td>"+item.psId+"</td>"+
								"<td>"+item.psName+"</td>"+
								"<td>"+item.pstName+"</td>"+
								"<td>"+item.usUsername+"</td>"+
								"<td>"+item.psMoney+"</td>"+
								"<td>"+item.psDays+"</td>"+
								"<td><a href=''>详情</a></td>"+
								"<td><button onclick='pass("+item.psId+")'>通过</button>&nbsp;&nbsp;<button onclick='nopass("+item.psId+")'>不通过</button></td>"+
				  			   "</tr>";
				  	$("#tbody").append(tr);
				})
			
			}
		})
	})
	
	function pass(psId){
				$.ajax({
					type : 'POST',
					url : '${pageContext.request.contextPath}/checkProjectsPass',
					dataType : 'json',
					data : {"psId":psId},
					success : function(returnData) {
						console.log(returnData);
						if(returnData.isPass == true){
							console.log(this);
							history.go(0);
							
						}

					}
					
				});
			}
	
	function nopass(psId){
		$.ajax({
			type : 'POST',
			url : '${pageContext.request.contextPath}/checkProjectsNoPass',
			dataType : 'json',
			data : {"psId":psId},
			success : function(returnData) {
				console.log(returnData);
				if(returnData.isNoPass == true){
					console.log(this);
					history.go(0);
					
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
					<li><a href="index.jsp">首页</a></li>
				</ul>
				<ul class="nav nav-sidebar">
					<li><a href="all_projects.jsp">所有项目</a></li>
					<li class="active"><a href="javascript:void(0)">项目审核</a></li>
				</ul>
				<ul class="nav nav-sidebar">
					<li><a href="all_users.jsp">所有用户</a></li>
					<li><a href="smsh.jsp">实名审核</a></li>
				</ul>
			</div>
			<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
				<h1 class="page-header">所有待审核项目</h1>

				<div class="panel panel-default">
					<div class="panel-heading">
						<div class="panel-title">所有项目列表&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;审核人:&nbsp;&nbsp;冯波</div>
					</div>
					<div class="panel-body">

						<div class="table-responsive "
							style="padding-top: 15px; padding-bottom: 50px">
							<table class="table table-striped table-bordered">
								<thead>
									<tr>
										<th>项目ID</th>
										<th>项目名字</th>
										<th>项目类型</th>
										<th>发起人</th>
										<th>筹资金额</th>
										<th>筹资时间</th>
										<th>详情</th>
										<th>操作</th>
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