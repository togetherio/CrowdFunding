<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<script type="text/javascript" src="js/jquery-1.42.min.js"></script>
<script type="text/javascript" src="js/jquery.js"></script>
<link rel="stylesheet" href="css/headbott.css" type="text/css" />
<link rel="stylesheet" href="css/myself.css" type="text/css" />

<title>个人认证</title>
<style>
#video {
	float: left;
}
</style>
</head>

<body>
	<jsp:include page="header.jsp"></jsp:include>

	<div class="user-con">
		<div class="user-conl">
			<ul>
				<li><b class="a-tit" href="">个人设置</b></li>
				<li><i class="i10"></i><a class="u-hover"
					href="javascript:void(0)">实名认证</a></li>
				<li><i class="i7"></i><a href="change_basic_info.jsp">资料修改</a></li>
				<li><b class="a-tit" href="">项目管理</b></li>
				<li><i class="i1"></i><a href="myself.jsp">发起的项目</a></li>
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
					<li class="cur">人脸认证</li>
					<li>身份证认证</li>
					<li>审核结果</li>

				</ul>
			</div>
			<div class="user-conr_tab2">
				<ul>



					<li class="curq2">
						<div style="font-size: 30px">人脸验证</div>
						<div style="font-size: 20px">请打开摄像头进行面部认证</div>
						<div style="padding-top: 20px">
							<button id="live" style="font-size: 20px">打开摄像头</button>
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<button class="snap" style="font-size: 20px">拍照</button>
							<!-- <div style="padding-top: 20px">
        					<form id="form1" action=""  method="post" enctype="multipart/form-data">
        						<input class="imgInput1" type="file" name="uploadfile" value="选择照片" style="font-size: 20px">
        						<input id="imgsub1" type="button" value="上传" style="font-size: 20px">
        					</form>
        					<img src="" class="img1" width="400px"/>						      				
    					</div> -->
						</div>


						<div class="box">
							<nobr>
								<video id="video" width="370" height="300"></video>
								<canvas id="canvas"></canvas>
							</nobr>
							<button id="submit" style="font-size: 20px">提交</button>
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<button class="snap again" style="font-size: 20px">重新拍照</button>
						</div>
					</li>

					<li>
						<div style="font-size: 30px">身份证验证</div>
						<div style="font-size: 20px">请上传身份证正面照片</div>
						<div style="padding-top: 20px">
							<form id="form2" action="" method="post"
								enctype="multipart/form-data">
								<input class="imgInput2" type="file" name="uploadfile"
									value="选择照片" style="font-size: 20px"> <input
									id="imgsub2" type="button" value="上传" style="font-size: 20px">
							</form>
							<img src="" class="img2" width="400px" />
						</div>
					</li>

					<li id="li"></li>


				</ul>




			</div>
		</div>

	</div>

	<jsp:include page="footer.jsp"></jsp:include>

</body>

<script>  
   	  var sub = document.getElementById("submit");//提交
   	  var snap = document.getElementsByClassName("snap");//拍照
      var video = document.getElementById('video');//捕捉图像显示
      var canvas = document.getElementById('canvas');  //拍照成功显示图片
      var ctx = canvas.getContext('2d');
      var width = video.width;  
      var height = video.height;  
      canvas.width = width;  
      canvas.height = height; 
      $("#submit").hide();
      $(".again").hide();
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
          var Pic;
          for(var i = 0; i < snap.length; i++){
        	  snap[i].addEventListener('click', function() {  
              	ctx.drawImage(video, 0, 0, width, height); 
                  $("#canvas").show(); 
      		   // Generate the image data（将Canvas的内容保存为图片借助toDataURL来实现） 方法返回一个包含图片展示的 data URI 。  
                      Pic = canvas.toDataURL("image/jpg");                
                      //对其进行base64编 之后的字符串  
                      Pic = Pic.replace(/^data:image\/(png|jpg);base64,/,"")
                       $("#submit").show();
          			   $(".again").show();
/*           		      document.getElementById("submit").addEventListener('click',function(){  
          		    	//把图片传递给服务器
                          $.ajax({
                          	type:'POST',
                          	url:'${pageContext.request.contextPath}/smrz',
                          	dataType:'json',
                          	data:{"imageData":Pic},
                          	success:function(map){
                          		console.log(map);
                          		if(map.isSubmit = true){
                          			alert(map.msg)
                          		}else if(map.isSubmit = false){
                          			alert(map.msg)
                          			window.location.href = 'login.jsp';
                          		}
                          		
                          	}
                          });
          		      });   */                       
                }); 
          }    
          document.getElementById("submit").addEventListener('click',function(){  
		    	//把图片传递给服务器
                $.ajax({
                	type:'POST',
                	url:'${pageContext.request.contextPath}/smrz',
                	dataType:'json',
                	data:{"imageData":Pic},
                	success:function(map){
                		console.log(map);
                		if(map.isSubmit = true){
                			alert(map.msg);
                			//刷新一下页面，关闭摄像头
                			history.go(0);
                		}else if(map.isSubmit = false){
                			alert(map.msg);
                			window.location.href = 'login.jsp';
                		}
                		
                	}
                });
		      }); 
          
        }, function(error){  
          console.log(error.name || error);  
        });  
      }       
      
      document.getElementById("live").addEventListener('click',function(){  
        liveVideo();  
      }); 
      
 /*      //选择面部照片后 在页面显示出来
      $(".imgInput1").change(function(){
    	  $(".img1").attr("src",URL.createObjectURL($(this)[0].files[0]));
      })
       //上传面部照片
      document.getElementById("imgsub1").addEventListener('click',function(){  
                          $.ajax({
                          	type:'POST',
                          	url:'${pageContext.request.contextPath}/smrz',
                          	dataType:'json',
                          	data: new FormData($('#form1')[0]),
                          	cache: false,
                            processData: false,
                            contentType: false,
                          	success:function(map){
                          		console.log(map);
                          		if(map.isSubmit = true){
                          			alert(map.msg)
                          		}else if(map.isSubmit = false){
                          			alert(map.msg)
                          		}
                          	}       
                          });
          		      }); 
       */
      
      
      //选择身份证照片后 在页面显示出来
      $(".imgInput2").change(function(){
    	  $(".img2").attr("src",URL.createObjectURL($(this)[0].files[0]));
      })
      
      //上传身份证照片
      document.getElementById("imgsub2").addEventListener('click',function(){  
                          $.ajax({
                          	type:'POST',
                          	url:'${pageContext.request.contextPath}/imgUpload',
                          	dataType:'json',
                          	data: new FormData($('#form2')[0]),
                          	cache: false,
                            processData: false,
                            contentType: false,
                          	success:function(map){
                          		console.log(map);
                          		if(map.isSubmit = true){
                          			alert(map.msg)
                          		}else if(map.isSubmit = false){
                          			alert(map.msg)
                          		}
                          	}       
                          });
          		      });  
      
      $(function(){
    	  $.ajax({
            	type:'GET',
            	url:'${pageContext.request.contextPath}/checkResult',
            	dataType:'json',
            	success:function(returnData){
            		var h2 = "<h2>"+returnData.check+"<h2/>";
            		$("#li").append(h2);
            		
            	}
    	  });
      });
      
      
    </script>

<script>
        $(document).ready(function(){
            $(".user-conr_tab li").click(function(){
                $(".user-conr_tab li").eq($(this).index()).addClass("cur").siblings().removeClass('cur');
                $(".user-conr_tab2 li").hide().eq($(this).index()).show(); })
            });

    </script>

</html>