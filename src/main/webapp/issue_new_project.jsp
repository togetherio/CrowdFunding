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
<link href="css/reg.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="css/base.css" type="text/css" />
<link rel="stylesheet" href="css/headbott.css" type="text/css" />
<link rel="stylesheet" href="css/index.css" type="text/css" />
<link rel="stylesheet" href="css/ly-list.css" type="text/css" />
<link rel="stylesheet" href="css/reg.css" type="text/css" />
<title></title>
<script type="text/javascript">
	function skip() {
		window.location.href = "login.jsp"
	}
</script>



</head>
<c:if test="${empty sessionScope.activeuser}">
	<body onload="skip()">
	</body>
</c:if>
<c:if test="${!empty sessionScope.activeuser}">
	<body>
		<jsp:include page="header.jsp"></jsp:include>


			<div class="product-form" style="height: 500px">
				<ul>
					<li id="li"></li>
					
				</ul>
			</div>


		<jsp:include page="footer.jsp"></jsp:include>

		<script>
			$(function() {
				$.ajax({
					type : 'GET',
					url : '${pageContext.request.contextPath}/checkResult',
					dataType : 'json',
					success : function(returnData) {
						console.log(returnData)
						if(returnData.isPass == true){
							window.location.href="new_project_info.jsp";
						}
						if(returnData.isPass == false){
							
						}
						var h2 = "<h2>" + returnData.check + "<br><br><h2>进行<a href='smrz.jsp'>实名认证<a/><h2/><h2/>";
						$("#li").append(h2);

					}
				});
			});
		</script>
	</body>
</c:if>
</html>