<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>项目详情</title>
<script type="text/javascript" src="js/jquery-1.42.min.js"></script>
<script type="text/javascript" src="js/jquery.js"></script>
<link rel="stylesheet" href="css/base.css" type="text/css" />
<link rel="stylesheet" href="css/headbott.css" type="text/css" />
<link href="css/product-detail.css" rel="stylesheet" type="text/css">
	<script type="text/javascript" src="js/jquery.min.js"></script>
	<script type="text/javascript" src="js/qrious.min.js"></script>
	<script type="text/javascript">
	function callqrcode(){
	//获取要支付的金额
	var money=document.getElementById('money').value;
	var psId = ${sessionScope.one.psId };
	if(money){
	 $.ajax({
	   type:'get',
	   url:'getqrcode',
	   data:{"money":money},
	   dataType:'json',
	   success:function(response){
	     if(response){
	        document.getElementById('orderid').innerHTML='订单编号:'+response.out_trade_no;
	        //生成二维码
	         var qr=new QRious({
	             element:document.getElementById('erweima'),
	             size:240,
	              level:'H',
	              value:response.qrcode   
           });
           //调用查询订单状态接口
           $.ajax({
             type:'get',
	         url:'paystatus',
	         data:{"out_trade_no":response.out_trade_no},
	          dataType:'json',
	          success:function(response2){
	             if(response2){
	               if(response2.trade_status=='TRADE_SUCCESS'){
	            	   console.log(response2.trade_status);
	            	   $.ajax({
	            		   type:'get',
	            		   url:'addMoney',
	            		   data:{"money":money,"psId":psId},
	            		   dataType:'json',
	            		   success:function(returnData){
	            			   console.log(returnData);
	            			   if(returnData.isAdd == true){
	            				   alert("支付成功！");
	            				   history.go(0);
	            			   }else{
	            				   alert("支付失败！");
	            			   }	            			  
	            		   }	            		   
	            	   })             
	               }else{
	                 alert("支付失败！")
	               }
	             }
	          }
           })
	        
	     }
	   }
	 })
	  
	}
	   
	}
	
	
	</script>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<div class="p-detail_con">
		<div class="p-detail_contit">
			<h1>${sessionScope.one.psName }</h1>
			<div class="p-detail_cfx">
				<span class="p-detail_contit"><a href=""><i></i>分享</a></span> <span
					class="p-detail_contit2"><a href=""><i></i>点赞</a></span>
			</div>
			<div class="p-detail_cfx2">
				<ul>
					<li class="p-detail_cfx2-1">发起人</li>
					<li class="p-detail_cfx2-2">${sessionScope.one.usUsername}<span>|</span></li>
					<li class="p-detail_cfx2-3">${sessionScope.one.usSex}</li>
					<%-- <li class="p-detail_cfx2-4">${sessionScope.one.usAddress}</li>
					<li class="p-detail_cfx2-4">${fn:substringBefore("${sessionScope.one.usAddress}","县") }</li> --%>
				</ul>
				<%-- ${fn:substringBefore(${sessionScope.one.usAddress},"县") } --%>
			</div>
		</div>

		<div class="p-detail-tab2">
			<ul>
				<li><a class="p-detail-tab2-tb" href="">项目主页</a></li>
				<!-- <li><a class="p-detail-tab2-tb2" href="">评论(3)</a></li> -->
			</ul>
		</div>
		<div class="p-detail_con2">
			<div class="p-detail_con2l">

				<div style="width: 675px; height: 445px; margin: 30px auto">

					<img
						src="/CrowdFunding/images/projects/${sessionScope.one.paImgName }"
						width="640" height="445">
				</div>

				<div class="p-detail_txt1">

					<h3>求助人故事</h3>

					<p>${sessionScope.one.psStory }</p>



				</div>

				<div class="detail-bott">
					<div class="detail-bott2">
						<i><img src="imgs/zcvprod-a_32.png" alt="" /></i>如果你对项目有疑问，可以发起咨询<span><a
							href="javascript:void(0);">对发起人提问</a></span>
					</div>
					<div class="textarea1">
						<textarea class="textarea2"></textarea>

						<form action="">
							<input class="textarea2-tji" type="submit" value="提交" />
						</form>
					</div>
					<script>
						$(".detail-bott2 span a").click(function() {
							$(".textarea1").toggle();
						})
					</script>
				</div>
			</div>

			<div class="p-detail_con2r">
				<div class="p-detail_con2r1">

					<div class="bot-con1zti">
						<img src="images/zcvprod-a_20.png" alt="" />
					</div>
					<div class="p-detail_con2r1tit">目前累计金额</div>
					<div class="p-detail_con2r1min">￥${sessionScope.one.psGetmoney }</div>
					<div class="llloading-bar">
						<div class="loading-bar">
							<div class="amount blue"
								style="width: <fmt:formatNumber type="number" value="${(sessionScope.one.psGetmoney/sessionScope.one.psMoney) * 100}" maxFractionDigits="0"/>%">
								<div class="loaded"></div>
								<span><fmt:formatNumber type="number"
										value="${(sessionScope.one.psGetmoney/sessionScope.one.psMoney) * 100}"
										maxFractionDigits="0" />%</span>
								<div class="lines"></div>
							</div>
						</div>
					</div>
					<p>
						<span>目标</span><i>${sessionScope.one.psMoney }</i>
					</p>
					<br>

					<p>
						<span>支持者</span><i>${sessionScope.one.psGetpeople }</i>
					</p>
					<p class="loading-barcolo">
						项目截止时间：
						<fmt:formatDate value="${sessionScope.one.psEndtime }"
							pattern="yyyy-MM-dd" />
					</p>

				</div>
				<%-- 				<c:if test="${sessionScope.one.psStateId eq 2 }">
					<div class="loading-bzcz">
						<a href="pay.jsp">支持项目</a>（目前仅支持支付宝扫码支付）
					</div>
				</c:if> --%>

				<c:if test="${! empty sessionScope.activeuser }">
					<c:if test="${sessionScope.one.psStateId eq 2 }">
						<div class="loading-bzcz">
							<div>
								<a style="cursor: default;">支持项目</a>(支付宝扫码支付)<br>
								<p><b>请输入金额:&nbsp;&nbsp;</b><input type="text" name="money" id="money" style="font-size:18px" size="8"></p>
								<p><input type="button" value="      获取支付二维码      " style="font-size:20px" onclick="callqrcode()"></p>
								<em id='orderid'></em><br> 
								<img id="erweima">
								
							</div>
						</div>
					</c:if>
				</c:if>



				<div class="loading-bzcz loading-bzcz2">
					<div class="loading-bzcz-2">付款与退款说明：</div>
					<p>1.项目需在截止日期之前筹资成功</p>
					<p>2.筹资失败的项目将会退款到会员余额中，下 次可以继续使用。如果需要提现的会员，可以 到会员中心点击提现申请！</p>
				</div>
			</div>


		</div>
	</div>






	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>