<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css"/>
	<link href="css/reg.css" rel="stylesheet" type="text/css">
	<link rel="stylesheet" href="css/base.css" type="text/css"/>
	<link rel="stylesheet" href="css/headbott.css" type="text/css"/>
	<link rel="stylesheet" href="css/index.css" type="text/css"/>
	<link rel="stylesheet" href="css/ly-list.css" type="text/css"/>
	<link rel="stylesheet" href="css/reg.css" type="text/css"/>
<title>Insert title here</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>

<!--中间核心-->
<div class="product">
	<!--头上表格-->
	<div class="product-table">
		<div class="product-left">
			<table class="table table-bordered">
				<tr class="text-center">
						<td class="active title-td"><a href="new_product.jsp">基本信息</a></td>
						<td class="title-td"><a href="new_info.jsp">项目信息</a></td>
						<td class="title-td"><a href="new_detail.jsp">详细描述</a></td>
						<td class="title-td"><a href="new_back.jsp">回报设置</a></td>	
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
	<!--下部form表单-->
	<div class="product-form">
		<!--上标题-->
		<div class="product-title">
			<div class="my-h4">
				<h4>选择你的身份类型</h4>
			</div>
			<div class="btn-save">
				<button class="btn btn-default">保存草稿</button>
			</div>

		</div>
		<div class="clear"></div>
		<hr>
		<!--选择机构个人-->
		<div class="choose">
			<table class="table table-bordered">
				<tr class="text-center">
					<td class="choose-td" style="background: #00aced">个人</td>
				</tr>
			</table>
		</div>
		<!--表单-->
		<form>
			<div class="my-form text-center">

				<div class="product-input"><input class="text" type="text" placeholder="请输入中文姓名，2-20个字符"></div>
				<div class="product-input"><input class="text" type="text" placeholder="二代身份证，请输入数字或字母"></div>
				<div class="product-input"><input class="text" type="text" placeholder="请输入手机号码"></div>

				<div class="product-input"><input class="text" type="text" placeholder="客服联系人"></div>
				<div class="product-input"><input class="text" type="text" placeholder="客服咨询电话"></div>
			</div>
			<div class="product-select">
				<div class="product-select1">
					<select class="select1">
						<option>请选择</option>
						<option>河南省</option>
					</select>
				</div>
				<div class="product-select2">
					<select class="select2">
						<option>请选择</option>
						<option>郑州市</option>
						<option>开封市</option>
					</select>
				</div>
			</div>
			<div class="product-select">
				<div class="select-type">
					<select class="select-cla">
						<option>公益</option>
						<option>农业</option>
						<option>娱乐</option>
						<option>其他</option>
					</select>
				</div>
			</div>
		</form>
	</div>
</div>

<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>