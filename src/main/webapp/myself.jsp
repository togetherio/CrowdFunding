<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<script type="text/javascript" src="js/jquery-1.42.min.js"></script>
    <script type="text/javascript" src="js/jquery.js"></script>
    <link rel="stylesheet" href="css/headbott.css" type="text/css"/>
    <link rel="stylesheet" href="css/myself.css" type="text/css"/>
<title>Insert title here</title>
</head>

<body>
<jsp:include page="header.jsp"></jsp:include>

<div class="user-con">
    <div class="user-conl">
<ul>
	<li><b class="a-tit" href="">个人设置</b></li>
	<li><i class="i10"></i><a href="smrz.jsp">实名认证</a></li>
    <li><i class="i7"></i><a href="">资料修改</a></li>
    <li><i class="i8"></i><a href="">安全信息</a></li>
    <li><i class="i9"></i><a href="">收件地址管理</a></li>
    <li><b class="a-tit" href="">项目管理</b></li>
    <li><i class="i1"></i><a class="u-hover" href="javascript:void(0)">发起的项目</a></li>
    <li><i class="i2"></i><a href="">参与的项目</a></li>
    <li><i class="i4"></i><a href="">点赞的项目</a></li>
    <li><i class="i6"></i><a href="">资金管理</a></li>
    <!-- <li><b class="a-tit" href="">消息管理</b></li>
    <li><i class="i4"></i><a href="">我的评论</a></li>
    <li><i class="i4"></i><a href="">我的私信</a></li> -->
    
</ul>
    </div>
    <div class="user-conr">
		<div class="user-conr_tab">
    		<ul>
        		<li class="cur">所有项目</li>
        		<li>众筹中项目</li>
    		</ul>
		</div>
        <div class="user-conr_tab2">
            <ul>
                <li class="curq2">还有没有项目列表记录111111111</li>
                <li>还有没有项目列表记录000000000</li>
            </ul>
        </div>
    </div>
    <script>
        $(document).ready(function(){
            $(".user-conr_tab li").click(function(){
                $(".user-conr_tab li").eq($(this).index()).addClass("cur").siblings().removeClass('cur');
                $(".user-conr_tab2 li").hide().eq($(this).index()).show(); })
            });

    </script>
</div>

<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>