<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

	<script type="text/javascript" src="js/jquery-1.42.min.js"></script>
    <script type="text/javascript" src="js/jquery.js"></script>
    <link rel="stylesheet" href="css/headbott.css" type="text/css"/>
    <link rel="stylesheet" href="css/myself.css" type="text/css"/>
    
<title>个人认证</title>
</head>

<body>
<jsp:include page="header.jsp"></jsp:include>

<div class="user-con">
    <div class="user-conl">
<ul>
    <li><b class="a-tit" href="">项目管理</b></li>
    <li><i class="i1"></i><a href="myself.jsp">发起的项目</a></li>
    <li><i class="i2"></i><a href="">参与的项目</a></li>
    <li><i class="i4"></i><a href="">点赞的项目</a></li>
    <li><i class="i6"></i><a href="">资金管理</a></li>
    <li><b class="a-tit" href="">消息管理</b></li>
    <li><i class="i4"></i><a href="">我的评论</a></li>
    <li><i class="i4"></i><a href="">我的私信</a></li>
    <li><b class="a-tit" href="">个人设置</b></li>
    <li><i class="i7"></i><a href="">资料修改</a></li>
    <li><i class="i8"></i><a href="">安全信息</a></li>
    <li><i class="i9"></i><a href="">收件地址管理</a></li>
    <li><i class="i10"></i><a class="u-hover" href="javascript:void(0)">实名认证</a></li>
</ul>
    </div>
    <div class="user-conr">
		<div class="user-conr_tab">
    		<ul>
        		<li class="cur">个人认证</li>
    		</ul>
		</div>
        <div class="user-conr_tab2">
        	<div style="font-size: 30px">人脸验证</div>
        	<div style="font-size: 20px">请打开摄像头进行面部认证</div>
        	<div>
   				<button id="live">打开摄像头</button>
    			<button id="snap">登录验证</button>	
    		</div>
        	
			<div class="box">
     			<video id="video" width="400" height="300"></video>    
      			<canvas id="canvas"></canvas>
    		</div>
    		

        </div>
    </div>

</div>

<jsp:include page="footer.jsp"></jsp:include>

</body>

   <script>  
      var video = document.getElementById('video');
      var canvas = document.getElementById('canvas');  
      var ctx = canvas.getContext('2d');
      var width = video.width;  
      var height = video.height;  
      canvas.width = width;  
      canvas.height = height; 
      function liveVideo(){  
        var URL = window.URL || window.webkitURL;   // 获取到window.URL对象
        navigator.getMedia = navigator.getUserMedia || navigator.webkitGetUserMedia || navigator.mozGetUserMedia || navigator.msGetUserMedia;
        navigator.getMedia({  
          video: true, 
          audio: false
        }, function(stream){ 
        	try{
                video.src = URL.createObjectURL(stream);   // 将获取到的视频流对象转换为地址   //此方法目前被弃用，使用下面方法
        	}catch(e){
        		video.srcObject = stream;//使用此方法
        	}
          video.play();   // 播放
         //点击截图     
          document.getElementById("snap").addEventListener('click', function() {  
            ctx.drawImage(video, 0, 0, width, height); 
            $("#canvas").hide(); 
		   // Generate the image data（将Canvas的内容保存为图片借助toDataURL来实现） 方法返回一个包含图片展示的 data URI 。  
                var Pic = canvas.toDataURL("image/jpg");                
                //对其进行base64编 之后的字符串  
                Pic = Pic.replace(/^data:image\/(png|jpg);base64,/,"")
                console.log(Pic);
                
          }); 
         
       
        }, function(error){  
          console.log(error.name || error);  
        });  
      }       
    /*  $("#live").addEventListener('click',function(){   */
      document.getElementById("live").addEventListener('click',function(){  
        liveVideo();  
      });        
    </script>

</html>