<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>所有项目</title>
<script type="text/javascript" src="js/jquery1.12.4.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/countUp.js"></script>
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/dashboard.css" />
</head>

<script type="text/javascript">
	$(function() {
		$.ajax({
			type : 'GET',
			url : '${pageContext.request.contextPath}/getProjectsstate',
			dataType : 'json',
			success : function(returnData) {
				/* $("#sel option :gt(0)").remove(); */
				console.log(returnData)
				$(returnData).each(
						function(index, item) {
							var option = "<option value='"+item.stId+"'>"
									+ item.stName + "</option>";
							$("#sel").append(option);
						})

			}
		})
	})

	$(function() {
		$.ajax({
			type : 'GET',
			url : '${pageContext.request.contextPath}/getProjectstype',
			dataType : 'json',
			success : function(returnData) {
				/* $("#sel2 option :gt(0)").remove(); */
				console.log(returnData)
				$(returnData).each(
						function(index, item) {
							var option = "<option value='"+item.pstId+"'>"
									+ item.pstName + "</option>";
							$("#sel2").append(option);
						})

			}
		})
	})

	$(function() {
		$.ajax({
			type : 'GET',
			url : '${pageContext.request.contextPath}/getAllProjects',
			dataType : 'json',
			success : function(returnData) {
				console.log(returnData)

				$(returnData).each(
						function(index, item) {
							var tr = "<tr>" + "<td>" + item.psId + "</td>"
									+ "<td>" + item.psName + "</td>" + "<td>"
									+ item.pstName + "</td>" + "<td>"
									+ item.stName + "</td>" + "<td>"
									+ item.psStarttime + "</td>" + "<td>"
									+ item.psEndtime + "</td>" + "<td>"
									+ item.psGetmoney + "</td>" + "<td>"
									+ item.usUsername + "</td>"
									+ "<td><a href=''>详情</a></td>" + "</tr>"
							$("#tbody").append(tr);
						})

			}
		})
	})
</script>
<body>

	<jsp:include page="header.jsp"></jsp:include>


	<div class="container-fluid">
		<div class="row">
			<div class="col-sm-3 col-md-2 sidebar">
				<ul class="nav nav-sidebar">
					<li><a href="index.jsp">首页</a></li>
				</ul>
				<ul class="nav nav-sidebar">
					<li class="active"><a href="javascript:void(0)">所有项目</a></li>
					<li><a href="check_project.jsp">项目审核</a></li>
				</ul>
				<ul class="nav nav-sidebar">
					<li><a href="all_users.jsp">所有用户</a></li>
					<li><a href="smsh.jsp">实名审核</a></li>
				</ul>
			</div>
			<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
				<h1 class="page-header">所有众筹项目</h1>


				<div class="panel panel-default">
					<div class="panel-body">
						<form class="form-inline">
							<div class="form-group">
								<input type="text" class="form-control" id="exampleInputName2"
									placeholder="项目名称">
							</div>
							<div class="form-group">
								<input type="text" class="form-control" id="exampleInputName2"
									placeholder="项目发起人">
							</div>
							<div class="form-group">
								<select class=form-control id="sel">
									<option>项目状态</option>

								</select>
							</div>
							<div class="form-group">
								<select class=form-control id="sel2">
									<option>项目类型</option>

								</select>
							</div>
							&nbsp;&nbsp;
							<button type="submit" class="btn btn-default btn-primary">查询</button>
						</form>
					</div>
				</div>
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
										<th>项目状态</th>
										<th>开始日期</th>
										<th>结束日期</th>
										<th>已筹金额</th>
										<th>发起人</th>
										<th>操作</th>
									</tr>
								</thead>
								<tbody id="tbody">
						<%-- 			<c:forEach items="${allProjects }" var="pro">
									<tr>
										<td>${pro.psId }</td>
										<td>${pro.psName }</td>
										<td>${pro.pstName }</td>
										<td>${pro.stName }</td>
										<td><fmt:formatDate value="${pro.psStarttime }" pattern="yyyy-MM-dd"/></td>
										<td><fmt:formatDate value="${pro.psEndtime }" pattern="yyyy-MM-dd"/></td>
										<td>${pro.psGetmoney }</td>
										<td>${pro.usUsername }</td>
										<td><a href="">详情</a></td>
									</tr> 
								</c:forEach>
 --%>
									<!-- <td><a href="product/product-info1.html">详情</a> <a href="#" title="查看项目详情"><span class="glyphicon glyphicon-info-sign" aria-hidden="true"></span></a>
											&nbsp;&nbsp;
                  	<a href="#" title="编辑项目信息"><span class="glyphicon glyphicon-edit" aria-hidden="true"></span></a>
										</td> -->


								</tbody>
							</table>
						</div>

						<nav aria-label="Page navigation" class="text-right">
						<ul class="pagination">
							<c:if test="${pageInfo.hasPreviousPage }">
								<li><a
									href="${pageContext.request.contextPath}/getAllProjects?pageNum=${pageInfo.pageNum-1}"
									aria-label="Previous"> <span aria-hidden="true">&laquo;</span>
								</a></li>
							</c:if>

							<c:forEach items="${pageInfo.navigatepageNums  }" var="page">
								<c:if test="${page==pageInfo.pageNum }">
									<li class="active"><a
										href="${pageContext.request.contextPath}/getAllProjects?pageNum=${page}">${page}</a></li>
								</c:if>
								<c:if test="${page!=pageInfo.pageNum }">
									<li><a
										href="${pageContext.request.contextPath}/getAllProjects?pageNum=${page}">${page}</a></li>
								</c:if>
							</c:forEach>

							<c:if test="${pageInfo.hasNextPage }">
								<li><a
									href="${pageContext.request.contextPath}/getAllProjects?pageNum=${pageInfo.pageNum+1}"
									aria-label="Next"> <span aria-hidden="true">&raquo;</span>
								</a></li>
							</c:if>
						</ul>
						</nav>
					</div>


				</div>

			</div>
		</div>
	</div>
</body>
</html>