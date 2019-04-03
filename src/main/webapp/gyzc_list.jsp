<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>公益众筹</title>
	<script type="text/javascript" src="js/jquery-1.42.min.js"></script>
    <script type="text/javascript" src="js/jquery-ui.min.js"></script>
    <script type="text/javascript" src="js/select-widget-min.js"></script>
    <link rel="stylesheet" href="css/drop-down.css" />
    <link rel="stylesheet" href="css/base.css" type="text/css"/>
    <link rel="stylesheet" href="css/product-list.css" type="text/css"/>
    
    <script type="text/javascript">
    	$(function(){
    		$.ajax({
    			type:'GET',
    			url:'getProjectstype',
    			dataType:'json',
    			success:function(returnData){
    				console.log(returnData);
	      			$(returnData).each(function(index,item){
	      				var a = "<a class='lnav_bg' href=''>"+item.pstName+"</a>";
	      				$("#projectstype").append(a);
    					//var li = "<li><a href='product/getProByCid?cid="+item.cid+"'>"+item.cname+"</a></li>";
    					//$("#categoryUl").append(li);
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
           <div class="select-li">
               <span>状态:</span>
               <select name="drop2" class="ui-select">
               <option value="">全部</option>
               <option value="1">全部2</option>
               <option value="2">全部4</option>
               <option value="3">全部5</option>
           </select>
           </div>
        <div class="select-li2">
               <span>排序:</span>
               <select name="drop2" class="ui-select">
               <option value="">全部</option>
               <option value="1">全部2</option>
               <option value="2">全部4</option>
               <option value="3">全部5</option>
           </select>
           </div>

    </div>

    <div class="product-list-l">
        <ul>
            <li class="zcz">
                <div class="product-list-lpic">
                    <a href="product-detail.jsp"><img src="images/prr-dduu_27.jpg" alt=""/></a>
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
            </li>
            <li class="yrz">
                <div class="product-list-lpic">
                    <a href=""><img src="images/prr-dduu_27.jpg" alt=""/></a>
                    <div class="product_one">预热中</div>
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
            </li>

            <li class="cz">
                <div class="product-list-lpic">
                    <a href=""><img src="images/prr-dduu_27.jpg" alt=""/></a>
                    <div class="product_one">项目成功</div>
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
            </li>
            <li class="zcz">
                <div class="product-list-lpic">
                    <a href=""><img src="images/prr-dduu_27.jpg" alt=""/></a>
                    <div class="product_one">筹款中</div>
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
            </li><li class="cz">
                <div class="product-list-lpic">
                    <a href=""><img src="images/prr-dduu_27.jpg" alt=""/></a>
                    <div class="product_one">筹款中</div>
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
            </li><li class="yrz">
                <div class="product-list-lpic">
                    <a href=""><img src="images/prr-dduu_27.jpg" alt=""/></a>
                    <div class="product_one">筹款中</div>
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
            </li><li class="yrz">
                <div class="product-list-lpic">
                    <a href=""><img src="images/prr-dduu_27.jpg" alt=""/></a>
                    <div class="product_one">筹款中</div>
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
            </li><li class="zcz">
                <div class="product-list-lpic">
                    <a href=""><img src="images/prr-dduu_27.jpg" alt=""/></a>
                    <div class="product_one">筹款中</div>
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
            </li><li class="zcz">
                <div class="product-list-lpic">
                    <a href=""><img src="images/prr-dduu_27.jpg" alt=""/></a>
                    <div class="product_one">筹款中</div>
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
            </li><li class="yrz">
                <div class="product-list-lpic">
                    <a href=""><img src="images/prr-dduu_27.jpg" alt=""/></a>
                    <div class="product_one">筹款中</div>
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
            </li><li class="zcz">
                <div class="product-list-lpic">
                    <a href=""><img src="images/prr-dduu_27.jpg" alt=""/></a>
                    <div class="product_one">筹款中</div>
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
            </li>
            <li class="cz">
                <div class="product-list-lpic">
                    <a href=""><img src="images/prr-dduu_27.jpg" alt=""/></a>
                    <div class="product_one">筹款中</div>
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
            </li>
        </ul>
    </div>
<div class="product-ym">

        <a class="product-ym_bg" href="">1</a>
        <a href="">2</a>
        <span>...</span>
        <a href="">43</a>
        <a href="">44</a>
        <a href="">45</a>
    <a class="product-ym_xyy" href="">下一页&gt;</a>
    </ul>
</div>
</div>

<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>