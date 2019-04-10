<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="js/jquery-1.42.min.js"></script>
<script type="text/javascript" src="js/jquery.js"></script>
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css" />
<link rel="stylesheet" href="css/base.css" type="text/css" />
<link rel="stylesheet" href="css/headbott.css" type="text/css" />
<link rel="stylesheet" href="css/index.css" type="text/css" />
<link rel="stylesheet" href="css/ly-list.css" type="text/css" />
<link rel="stylesheet" href="css/reg.css" type="text/css" />
<link rel="stylesheet" href="css/detail.css" type="text/css" />
<title></title>
<script type="text/javascript">
$(function() {
	$.ajax({
		type : 'GET',
		url : '${pageContext.request.contextPath}/getRelationship',
		dataType : 'json',
		success : function(returnData) {
			$("#sel option :gt(0)").remove();
			console.log(returnData)
			$(returnData).each(function(index,item){
				 var option="<option value='"+item.rsName+"'>"+item.rsName+"</option>";
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
			$("#sel option :gt(0)").remove();
			console.log(returnData)
			$(returnData).each(function(index,item){
				 var option="<option value='"+item.pstId+"'>"+item.pstName+"</option>";
				 $("#sel2").append(option);
			})
		
		}
	})
})
</script>

</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>

	<!--中间核心-->
	<div class="product">
		<!--头上表格-->
		<div class="product-table">
			<div class="product-left">
				<div class="btn-save">
					<button class="btn btn-default" onclick="saveDraft()">保存草稿</button>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<a href="preview.jsp"><button class="btn btn-default">预览</button></a>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<button class="btn btn-default" onclick="submit()">提交审核</button>
				</div>
			</div>

			<!-- <div class="product-right">
				<div class="btn-save">
					<button class="btn btn-default">保存草稿</button>
					<button class="btn btn-default">预览</button>
					<button class="btn btn-default">提交审核</button>
				</div>

			</div> -->
		</div>
		<!--下部form表单-->
		<div class="product-form">
			<form id="projectForm" action="" method="post"
				enctype="multipart/form-data">
				<!--上标题-->
				<div class="product-title">
					<div class="my-h4">
						<h4>基本信息</h4>
					</div>
				</div>
				<div class="clear"></div>
				<hr>
				<div class="my-form">

					<div class="product-info-input">
						<b>为谁筹款：</b> <!-- <input class="text" name="psPatientRelationship"
							type="text" placeholder="请输入与患者关系"> -->
							<select class="text" name="psPatientRelationship" id="sel">
								<option>--请选择--</option>
								<!-- 
								<option>自己</option>
								<option>配偶</option>
								<option>父母</option>
								<option>子女</option>
								<option>其他亲属</option>
								<option>同事</option>
								<option>同学</option>
								<option>朋友</option>
								<option>其他</option>
								 -->
							</select>
					</div>
					<div class="product-info-input">
						<b>所患疾病：</b> <input class="text" name="psIllnessName" type="text"
							placeholder="患者所患疾病">
					</div>

				</div>
				<hr>
				<!--上标题-->
				<div class="product-title">
					<div class="my-h4">
						<h4>详细描述</h4>
					</div>
				</div>
				<div class="clear"></div>
				<hr>
				<div class="my-form">
					<div class="product-info-input">
						<b>设置封面：</b> <input name="paImgName" type="file">
					</div>
					<div class="product-info-input">
						<b>项目标题：&nbsp;</b><input class="text" name="psName" type="text">
					</div>
					<div class="product-info-input">
						<b>项目类型：</b>
						<select name="psPstId" class="text" id="sel2">
							<option>--请选择--</option>
						</select>
					</div>
					<div class="product-info-input detail">
						<b>求助故事：</b>
						<!-- <input class="text" name="psStory" type="text"> -->
						<div>
							&nbsp;<textarea name="psStory" rows="4"></textarea>
						</div>	
					</div>
					<div class="product-info-input">
						<b>筹资金额：&nbsp;</b><input class="text" name="psMoney" type="text">元
					</div>
					<div class="product-info-input">
						<b>筹资天数：&nbsp;</b><input class="text" name="psDays" type="text">天
					</div>
				</div>
			</form>
		</div>
	</div>

	<jsp:include page="footer.jsp"></jsp:include>
</body>

<script>
	function saveDraft() {
		var formData = new FormData($('#projectForm')[0]);
		console.log(formData);
		$.ajax({
			type : 'POST',
			url : '${pageContext.request.contextPath}/savedraft',
			dataType : 'json',
			data : formData,
			cache : false,
			processData : false,
			contentType : false,
			success : function(returnData) {

			}
		})
		/* $("#projectForm").attr("action","${pageContext.request.contextPath}/savedraft");
		$("#projectForm").submit(); */
	}
	
	function submit() {
		var formData = new FormData($('#projectForm')[0]);
		console.log(formData);
		$.ajax({
			type : 'POST',
			url : '${pageContext.request.contextPath}/pojectSubmit',
			dataType : 'json',
			data : formData,
			cache : false,
			processData : false,
			contentType : false,
			success : function(map) {
				console.log(map);
				if(map.isAdd == true){
					alert("项目提交成功，正在审核中，请等待！")
					window.location.href="index.jsp";
				}else{
					alert("项目提交失败，请重试！")
				}
				
				
			}
		})
	}
</script>

</html>