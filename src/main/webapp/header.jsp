<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div id="header">
		<div class="heade-con">
			<div class="logo">
				<a href=""><img src="${pageContext.request.contextPath}/images/LOGO.png" /></a>
			</div>
			<div class="nav posa">
				<ul>
					<!-- <li><a class="vcolor" href="index.jsp">首页</a></li> -->
					<li><a href="index.jsp">首页</a></li>
					<li><a href="gyzc_list.jsp">公益众筹</a></li>
					<li><a href="faq_list.jsp">常见问题</a></li>
					<li><a href="message_list.jsp">众筹资讯</a></li>
					<li><a href="new_product.jsp" style="">发布项目</a></li>
				</ul>
			</div>
			<div class="search">
				<form action="">
					<input type="text" class="search-txt" value="" placeholder="找项目">
					<input type="submit" class="search-but" value="">
				</form>
			</div>
			<div class="index-login" style="right: -150px">

				<c:if test="${empty sessionScope.activeuser }">
					<a href="login.jsp">登录</a>
					<span style="color: white;">|</span>
					<a href="register.jsp">注册</a>
				</c:if>
				<c:if test="${!empty sessionScope.activeuser }">
					<li style="color: white">欢迎,${sessionScope.activeuser.usUsername}
					<a href="quit">退出</a><a href="logout">注销</a><a href="smrz.jsp">我的</a></li>
				</c:if>

			</div>
		</div>
	</div>

	<script>
		var d_var = $(".search .search-txt").val();
		$(".search .search-txt").focus(function() {
			if ($(this).val() == d_var) {
				$(this).val("");
			}
		});

		$(".search .search-txt").blur(function() {
			if ($(this).val() == "") {
				$(this).val("找项目");
			}
		});
	</script>

</body>
</html>