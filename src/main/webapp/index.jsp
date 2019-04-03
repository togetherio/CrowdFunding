<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/base.css" type="text/css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/headbott.css" type="text/css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/index.css" type="text/css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/swiper.min.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css" type="text/css" />
<script src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js" type="text/javascript"></script>


		<script type="text/javascript">
			$(function(){
				$.ajax({
					type:'GET',
					url:'getProjects',
					dataType:'json',
					success:function(returnData){
						console.log(returnData)
						$(returnData.newProjects).each(function(index,item){
							var newProjects = "<li>"+
								"<div class='index-plidiv1'>"+
									"<a href=''><img src='${pageContext.request.contextPath}/images/"+item.psPictureaddress+"' width='237px' height='155px' alt='' /></a>"+
									"<div class='index-p_dkz'>"+item.stName+"</div>"+
								"</div>"+
								"<p><a href=''>"+item.psName+"</a></p>"+
								"<div class='index-pli-bot'>"+
									"<dl>"+
										"<dt>"+item.psMoney+"</dt>"+
										"<dd>目标金额</dd>"+
									"</dl>"+
									"<dl>"+
										"<dt>"+item.psGetmoney+"</dt>"+
										"<dd>已筹金额</dd>"+
									"</dl>"+
									"<dl>"+
										"<dt>"+item.psGetpeople+"</dt>"+
										"<dd>支持人数</dd>"+
									"</dl>"+
								"</div>"+
							"</li>";
								$("#new").append(newProjects);
						});
						
						$(returnData.hotProjects).each(function(index,item){	
							var hotProjects = "<li>"+
								"<div class='index-plidiv1'>"+
									"<a href=''><img src='${pageContext.request.contextPath}/images/"+item.psPictureaddress+"' width='237px' height='155px' alt='' /></a>"+
									"<div class='index-p_dkz'>"+item.stName+"</div>"+
								"</div>"+
								"<p><a href=''>"+item.psName+"</a></p>"+
								"<div class='index-pli-bot'>"+
									"<dl>"+
										"<dt>"+item.psMoney+"</dt>"+
										"<dd>目标金额</dd>"+
									"</dl>"+
									"<dl>"+
										"<dt>"+item.psGetmoney+"</dt>"+
										"<dd>已筹金额</dd>"+
									"</dl>"+
									"<dl>"+
										"<dt>"+item.psGetpeople+"</dt>"+
										"<dd>支持人数</dd>"+
									"</dl>"+
								"</div>"+
							"</li>";
								$("#hot").append(hotProjects);
						});
					}
				});
			})
		</script>

</head>
<body>

	<jsp:include page="header.jsp"></jsp:include>

	<!-- Swiper -->
	<div class="swiper-container">
		<div class="swiper-wrapper">
			<div class="swiper-slide">
				<img src="${pageContext.request.contextPath}/images/1525661829.jpg">
			</div>
			<div class="swiper-slide">
				<img src="${pageContext.request.contextPath}/images/1525661991.png">
			</div>
		</div>
		<!-- Add Pagination -->
		<div class="swiper-pagination"></div>
		<!-- Add Arrows -->
		<div class="swiper-button-next"></div>
		<div class="swiper-button-prev"></div>
	</div>

		

	<div class="content">
	
		<div class="index-mrjxtit">最新项目</div>
		
		<div class="index-mrjx">

 			<div class="index-mrjx_botto">
				<div class="index-pruduct">
					<ul id="new">
<!-- 						<li>
							<div class="index-plidiv1">
								<a href=""><img src="images/pruduct2_34.jpg" width="237px"
									height="155px" alt="" /></a>
								<div class="index-p_dkz">等款中</div>
							</div>
							<p>
								<a href="">NGDS新游戏手柄 手机一秒变游戏机</a>
							</p>
							<div class="index-pli-bot">
								<dl>
									<dt>133.3</dt>
									<dd>达成率</dd>
								</dl>
								<dl>
									<dt>88888.3</dt>
									<dd>已筹金额</dd>
								</dl>
								<dl>
									<dt>8515</dt>
									<dd>支持人数</dd>
								</dl>
							</div>
						</li> -->

					</ul>
 				</div>
			</div>
		</div>
		
		<div class="ggt2">
			<a href=""><img src="images/ggt2_39.jpg" alt="" /></a>
		</div>

		<div class="index-mrjxtit">最热项目</div>
		
		<div class="index-mrjx">

 			<div class="index-mrjx_botto">
				<div class="index-pruduct">
					<ul id="hot">
						<!-- <li>
							<div class="index-plidiv1">
								<a href=""><img src="images/pruduct2_34.jpg" width="237px"
									height="155px" alt="" /></a>
								<div class="index-p_dkz">等款中</div>
							</div>
							<p>
								<a href="">NGDS新游戏手柄 手机一秒变游戏机</a>
							</p>
							<div class="index-pli-bot">
								<dl>
									<dt>133.3</dt>
									<dd>达成率</dd>
								</dl>
								<dl>
									<dt>88888.3</dt>
									<dd>已筹金额</dd>
								</dl>
								<dl>
									<dt>8515</dt>
									<dd>支持人数</dd>
								</dl>
							</div>
						</li> -->
					</ul>
 				</div>
			</div>
		</div>
		
		<div class="ggt2">
			<a href=""><img src="images/ggt2_39.jpg" alt="" /></a>
		</div>




		<div class="index-jjks">

			<div class="index-jjkstit">即将开始</div>
			<div class="index-jjkscon">
				<ul>
					<li>
						<div class="index-jjkscon1">
							<a href=""><img src="images/producc_47.jpg" width="238"
								height="155" alt="" /></a>
							<div class="index-j_dkz">预热中</div>
						</div>
						<div>
							<a href="">NGDS新游戏手柄 手机一秒变游戏机</a>
						</div>
						<div>
							<i>目标金额：<span>50000.00</span></i><b>上线日期<span>06/03</span></b>
						</div>
					</li>
					<li>
						<div class="index-jjkscon1">
							<a href=""><img src="images/producc_47.jpg" width="238"
								height="155" alt="" /></a>
							<div class="index-j_dkz">预热中</div>
						</div>
						<div>
							<a href="">NGDS新游戏手柄 手机一秒变游戏机</a>
						</div>
						<div>
							<i>目标金额：<span>50000.00</span></i><b>上线日期<span>06/03</span></b>
						</div>
					</li>
					<li>
						<div class="index-jjkscon1">
							<a href=""><img src="images/producc_47.jpg" width="238"
								height="155" alt="" /></a>
							<div class="index-j_dkz">预热中</div>
						</div>
						<div>
							<a href="">NGDS新游戏手柄 手机一秒变游戏机</a>
						</div>
						<div>
							<i>目标金额：<span>50000.00</span></i><b>上线日期<span>06/03</span></b>
						</div>
					</li>
					<li>
						<div class="index-jjkscon1">
							<a href=""><img src="images/producc_47.jpg" width="238"
								height="155" alt="" /></a>
							<div class="index-j_dkz">预热中</div>
						</div>
						<div>
							<a href="">NGDS新游戏手柄 手机一秒变游戏机</a>
						</div>
						<div>
							<i>目标金额：<span>50000.00</span></i><b>上线日期<span>06/03</span></b>
						</div>
					</li>
				</ul>
			</div>
		</div>
		<div class="ggt2 ggt3">
			<a href=""><img src="images/ggt2_39.jpg" alt="" /></a>
		</div>
		<div class="index-jjks">

			<div class="index-jjkstit">成功案例</div>
			<div class="index-jjkscon">
				<ul>
					<li>
						<div class="index-jjkscon1">
							<a href=""><img src="images/producc_47.jpg" width="238"
								height="155" alt="" /></a>
							<div class="index-j_dkz">预热中</div>
						</div>
						<div>
							<a href="">NGDS新游戏手柄 手机一秒变游戏机</a>
						</div>
						<div>
							<i>已获得：<span>50000.00</span></i><b>支持人数<span>5888</span></b>
						</div>
					</li>
					<li>
						<div class="index-jjkscon1">
							<a href=""><img src="images/producc_47.jpg" width="238"
								height="155" alt="" /></a>
							<div class="index-j_dkz">预热中</div>
						</div>
						<div>
							<a href="">NGDS新游戏手柄 手机一秒变游戏机</a>
						</div>
						<div>
							<i>已获得：<span>50000.00</span></i><b>支持人数<span>5888</span></b>
						</div>
					</li>
					<li>
						<div class="index-jjkscon1">
							<a href=""><img src="images/producc_47.jpg" width="238"
								height="155" alt="" /></a>
							<div class="index-j_dkz">预热中</div>
						</div>
						<div>
							<a href="">NGDS新游戏手柄 手机一秒变游戏机</a>
						</div>
						<div>
							<i>已获得：<span>50000.00</span></i><b>支持人数<span>5888</span></b>
						</div>
					</li>
					<li>
						<div class="index-jjkscon1">
							<a href=""><img src="images/producc_47.jpg" width="238"
								height="155" alt="" /></a>
							<div class="index-j_dkz">预热中</div>
						</div>
						<div>
							<a href="">NGDS新游戏手柄 手机一秒变游戏机</a>
						</div>
						<div>
							<i>已获得：<span>50000.00</span></i><b>支持人数<span>5888</span></b>
						</div>
					</li>
				</ul>
			</div>
		</div>
		<div class="ggt2 ggt3">
			<a href=""><img src="images/ggt2_39.jpg" alt="" /></a>
		</div>
	</div>

	

	<jsp:include page="footer.jsp"></jsp:include>


	<script type="text/javascript" src="js/jquery.js"></script>
	<script type="text/javascript" src="js/swiper.min.js"></script>
	<script>
		var swiper = new Swiper('.swiper-container', {
			slidesPerView : 1,
			spaceBetween : 30,
			centeredSlides : true,
			loop : true,
			autoplay : {
				delay : 2500,
				disableOnInteraction : false,
			},
			pagination : {
				el : '.swiper-pagination',
				clickable : true,
			},
			navigation : {
				nextEl : '.swiper-button-next',
				prevEl : '.swiper-button-prev',
			},
		});
	</script>
</body>
</html>