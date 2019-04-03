<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>众筹管理后台</title>
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/dashboard.css" />

</head>
<body>

<jsp:include page="header.jsp"></jsp:include>
			
			<div class="  col-md-offset-2 ">
				<h1 class="page-header" style="padding-top: 30px">身份证信息</h1>

				<div>
					<div class="panel panel-default">
						<div class="panel-heading">
							<h3 class="panel-title">认证人真实信息
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<button onClick="javascript :history.back(-1);">返回</button></h3>
							
						</div>
						<div class="panel-body">
							<table class="table table-bordered">

								<tr>
									<th>姓名</th>
									<td>${sessionScope.userIdCardDetail.usRealname}</td>
								</tr>
								<tr>
									<th>性别</th>
									<td>${sessionScope.userIdCardDetail.usSex}</td>
								</tr>
								<tr>
									<th>民族</th>
									<td>${sessionScope.userIdCardDetail.usEntic}</td>
								</tr>
								<tr>
									<th>出生</th>
									<td>${sessionScope.userIdCardDetail.usBirthday}</td>
								</tr>
								<tr>
									<th>住址</th>
									<td>${sessionScope.userIdCardDetail.usAddress}</td>
								</tr>
								<tr>
									<th>公民身份号码</th>
									<td>${sessionScope.userIdCardDetail.usIdcard}</td>
								</tr>
							</table>
						</div>
					</div>
				</div>
			</div>
</body>
</html>