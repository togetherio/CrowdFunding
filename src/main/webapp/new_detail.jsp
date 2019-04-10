<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css" />
<link href="css/reg.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="css/base.css" type="text/css" />
<link rel="stylesheet" href="css/headbott.css" type="text/css" />
<link rel="stylesheet" href="css/index.css" type="text/css" />
<link rel="stylesheet" href="css/ly-list.css" type="text/css" />
<link rel="stylesheet" href="css/reg.css" type="text/css" />
<link rel="stylesheet" href="css/detail.css" type="text/css" />
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>

	<!--中间-->
	<div class="product">
		<!--头上表格-->
		<div class="product-table">
			<div class="product-left">
				<table class="table table-bordered">
					<tr class="text-center">
						<td class="title-td"><a href="new_info.jsp">基本信息</a></td>
						<td class="active title-td"><a href="javascript:void(0)">详细描述</a></td>
					</tr>
				</table>
			</div>
			<div class="product-right">
				<table class="table table-bordered">
					<tr class="text-center">
						<td class="title-td">预览</td>
					</tr>

				</table>

			</div>
		</div>
		<!--下部foem表单-->
		<div class="product-form">
			<!--上标题-->
			<div class="product-title">
				<div class="my-h4">
					<h4>描述你的项目详情</h4>
				</div>
				<div class="btn-save">
					<button class="btn btn-default">保存草稿</button>
				</div>

			</div>
			<div class="clear"></div>
			<hr>
			<!--编辑信息表单-->
			<form action="#">
				<div class="my-form">
					<div class="detail">
						<b>设置封面：</b> <input type="file">
					</div>
					<div class="detail">
						<b>项目标题：</b>
						<div>
							<textarea rows="2" placeholder="一句话介绍一下你的项目吧"></textarea>
						</div>
					</div>
					<div class="detail">
						<b>更多支持：</b>
						<div>
							<textarea rows="2" placeholder="一句话介绍一下你的项目吧"></textarea>
						</div>
					</div>
					<div class="detail">
						<b>提供回报：</b>
						<div>
							<textarea rows="2" placeholder="一句话介绍一下你的项目吧"></textarea>
						</div>
					</div>
					<div class="detail">
						<b>关于我：</b>
						<div>
							<textarea rows="2" placeholder="一句话介绍一下你的项目吧"></textarea>
						</div>
					</div>
				</div>
			</form>
		</div>
	</div>

	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>