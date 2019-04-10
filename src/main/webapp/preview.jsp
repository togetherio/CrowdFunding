<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.42.min.js"></script>
<script type="text/javascript" src="js/jquery.js"></script>
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css" />
<link href="css/reg.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="css/base.css" type="text/css" />
<link rel="stylesheet" href="css/headbott.css" type="text/css" />
<link rel="stylesheet" href="css/index.css" type="text/css" />
<link rel="stylesheet" href="css/ly-list.css" type="text/css" />
<link rel="stylesheet" href="css/reg.css" type="text/css" />
<link rel="stylesheet" href="css/detail.css" type="text/css" />
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<!--中间-->
	<div class="product">
		
		<!--下部foem表单-->
		<div class="product-form">
			<!--上标题-->
			<div class="product-title">
				<div class="my-h4">
					<h4>预览项目信息</h4>
				</div>
				
				<div class="btn-save">
					<button class="btn btn-default" onclick="javascript :history.back(-1);">返回</button>
				</div>
				

			</div>
			<div class="clear"></div>
			<hr>

				<div class="my-form">
					
					<div class="detail">
						<b>封面：</b>
						<div>
							<img src="/CrowdFunding/images/${sessionScope.projects.paImgName}" width="300">
						</div>
					</div>
					<br>
					
					<div class="detail">
						<b>项目标题：</b>
						<span>${sessionScope.projects.psName}</span>
					</div>
					<br>
					
					<div class="detail">
						<b>为谁筹款：</b>
						<span>${sessionScope.projects.psPatientRelationship}</span>
					</div>
					<br>
					
					<div class="detail">
						<b>所患疾病：</b>
						<span>${sessionScope.projects.psIllnessName}</span>
					</div>
					<br>
					
					<div class="detail">
						<b>求助故事：</b><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						<span>${sessionScope.projects.psStory}</span>
					</div>
					<br>
					
					<div class="detail">
						<b>筹资金额：</b>
						<span><fmt:formatNumber type="number" value="${sessionScope.projects.psMoney}" maxFractionDigits="0"/>元</span>
					</div>
					<br>
					
					<div class="detail">
						<b>筹资天数：</b>
						<span>${sessionScope.projects.psDays}天</span>
					</div>
					<br>
					
				
				</div>

		</div>
	</div>
	
	<jsp:include page="footer.jsp"></jsp:include>
</body>

</html>