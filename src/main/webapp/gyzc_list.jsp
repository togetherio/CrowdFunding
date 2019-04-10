<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>公益众筹</title>
<script src="js/jquery-1.11.3.min.js" type="text/javascript"></script>
<script src="js/bootstrap.min.js" type="text/javascript"></script>
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css" />
<link rel="stylesheet" href="css/drop-down.css" />
<link rel="stylesheet" href="css/base.css" type="text/css" />
<link rel="stylesheet" href="css/product-list.css" type="text/css" />

<script type="text/javascript">
	$(function() {
		
		/* $.ajax({
			type : 'GET',
			url : 'getAllProjects',
			dataType : 'json',
			success : function(returnData) {}
		}) */
		
		$.ajax({
			type : 'GET',
			url : 'getProjectstype',
			dataType : 'json',
			success : function(returnData) {
				console.log(returnData);
				$(returnData).each(
						function(index, item) {
							var a = "<a class='lnav_bg' href='getPojectByPstId?pstId="+item.pstId+"'>"
									+ item.pstName + "</a>";
							$("#projectstype").append(a);
						});
			}
		});

	});
</script>

</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>

	<div class="product-con">
		<h1 class="product-con_tit">公益众筹</h1>
		<div class="product-con_nav" id="projectstype">
			<!-- <a class="lnav_bg" href="">全部</a> -->
			<!--    <a class="lnav_bg" href=""><i><img src="images/ii_04.png" alt=""/></i>全部</a>
        <a href=""><i><img src="images/ii_06.png" alt=""/></i>教育助学</a>
        <a href=""><i><img src="images/ii_08.png" alt=""/></i>爱心环保</a>
        <a href=""><i><img src="images/ii_10.png" alt=""/></i>扶贫助困</a>
        <a href=""><i><img src="images/ii_12.png" alt=""/></i>公益创业</a>
        <a href=""><i><img src="images/ii_14.png" alt=""/></i>公益活动</a> -->
			<!-- <a class="lnav_bg" href="">全部</a>
        <a class="lnav_bg" href="">教育助学</a>
        <a class="lnav_bg" href="">爱心环保</a>
        <a class="lnav_bg" href="">扶贫助困</a>
        <a class="lnav_bg" href="">公益创业</a>
        <a class="lnav_bg" href="">公益活动</a> -->
			<!--
			<div class="select-li">
				<span>状态:</span> <select name="drop2" class="ui-select">
					<option value="">全部</option>
					<option value="1">全部2</option>
					<option value="2">全部4</option>
					<option value="3">全部5</option>
				</select>
			</div>
			<div class="select-li2">
				<span>排序:</span> <select name="drop2" class="ui-select">
					<option value="">全部</option>
					<option value="1">全部2</option>
					<option value="2">全部4</option>
					<option value="3">全部5</option>
				</select>
			</div>
 		-->
		</div>

		<div class="product-list-l">
			<ul id="allLi">
				<c:forEach items="${sessionScope.info.list}" var="project">
					<li class="zcz">
						<div class="product-list-lpic">
							<a href="getOneDetailBypsId?psId=${project.psId }"><img width='237px' height='155px'
								src="/CrowdFunding/images/projects/${project.paImgName }" alt="" /></a>
							<div class="product_one">${project.stName }</div>
						</div>
						<p>
							<a href="getOneDetailBypsId?psId=${project.psId }">${project.psName }</a>
						</p>
						<div class="product-list-lmin">
							<dl>
								<dt><fmt:formatNumber type="number" value="${(project.psGetmoney/project.psMoney) * 100}" maxFractionDigits="0"/>%</dt>
								<dd>达成率</dd>
							</dl>
							<dl>
								<dt>${project.psGetmoney }</dt>
								<dd>已筹金额</dd>
							</dl>
							<dl>
								<dt>${project.psGetpeople }</dt>
								<dd>支持人数</dd>
							</dl>
						</div>
					</li>
				</c:forEach>

				<!--          <li class="zcz">
                <div class="product-list-lpic">
                    <a href="product-detail.jsp"><img src="images/producc_47.jpg" alt=""/></a>
                    <div class="product_one">制作中</div>
                </div>
                <p><a href="">NGDS新游戏手柄 手机一秒变游戏机</a></p>
                <div class="product-list-lmin">
                    <dl>
                        <dt>133.3%</dt>
                        <dd>达成率</dd>
                    </dl><dl>
                    <dt>88888.3</dt>
                    <dd>已筹金额</dd>
                </dl><dl>
                    <dt>8515</dt>
                    <dd>支持人数</dd>
                </dl>
                </div>
            </li> -->





			</ul>
		</div>

		<!--分页 -->
		<div style="width: 380px; margin: 0 auto; margin-top: 50px;">
			<span>当前是 ${info.pageNum} 页</span>
			<ul class="pagination" style="text-align: center; margin-top: 10px;">

				<li><a href="getPojectByPstId?pstId=${pstId }&pageNum=1">首页</a></li>

				<c:if test="${info.hasPreviousPage}">
					<li><a href="getPojectByPstId?pstId=${pstId }&pageNum=${info.prePage}">上一页</a></li>
				</c:if>

				<c:if test="${info.hasNextPage}">
					<li><a href="getPojectByPstId?pstId=${pstId }&pageNum=${info.nextPage}">下一页</a></li>
				</c:if>

				<li><a href="getPojectByPstId?pstId=${pstId }&pageNum=${info.pages}">尾页</a></li>

			</ul>
			<span>共有 ${info.pages} 页</span>

		</div>


	</div>

	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>