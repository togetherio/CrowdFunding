<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="css/bootstrap.min.css" type="text/css"/>
    <link href="css/reg.css" rel="stylesheet" type="text/css">
    <link rel="stylesheet" href="css/base.css" type="text/css"/>
    <link rel="stylesheet" href="css/headbott.css" type="text/css"/>
    <link rel="stylesheet" href="css/index.css" type="text/css"/>
    <link rel="stylesheet" href="css/ly-list.css" type="text/css"/>
    <link rel="stylesheet" href="css/reg.css" type="text/css"/>
    <link rel="stylesheet" href="css/back.css" type="text/css"/>
<title>Insert title here</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>


<!--中间-->
<div class="product">
    <!--头上表格-->
    <div class="product-table">
        <div class="product-left">
            <table class="table table-bordered">
                <tr class="text-center">
                    <td class="title-td"><a href="new_product.jsp">基本信息</a></td>
                    <td class="title-td"><a href="new_info.jsp">项目信息</a></td>
                    <td class="title-td"><a href="new_detail.jsp">详细描述</a></td>
                    <td class="active title-td"><a href="new_back.jsp">回报设置</a></td>
                </tr>
            </table>
        </div>
        <div class="product-right">
            <table class="table table-bordered">
                <tr class="text-center">
                    <td class="title-td">预览</td>
                </tr>

            </table>

        </div>
    </div>
    <!--下部foem表单-->
    <div class="product-form">
        <!--上标题-->
        <div class="product-title">
            <div class="my-h4">
                <h4>设置你的回报信息</h4>
            </div>
            <div class="btn-save">
                <button class="btn btn-default">保存草稿</button>
            </div>

        </div>
        <div class="clear"></div>
        <hr>
        <!--描述项目-->
        <div class="product-title">
            <div class="my-h4">
                <h4><b>回报1</b></h4>
            </div>
        </div>
        <div class="clear"></div>
        <hr>
        <!--编辑信息表单-->
        <form action="#">
            <div class="my-form">
                <div class="back">
                    <b>回报类型：</b>
                    <label class="radio-inline">
                        <input type="radio" name="optionsRadiosinline" id="optionsRadios3" value="option1" checked> <b>实物回报(回报需邮寄)</b>
                    </label>
                    <label class="radio-inline">
                        <input type="radio" name="optionsRadiosinline" id="optionsRadios4"  value="option2"> <b>虚拟回报(回报无需邮寄)</b>
                    </label>
                </div>
                <div class="back"><b>支持金额：</b><input class="input-mon" placeholder="输入需要用户支持的金额">元</div>
                <div class="back"><b>具体规则：</b>每 <input class="input-per" placeholder="此项必填"> 支持者抽出1名中奖者</div>
                <div class="back"><b>回报内容：</b><div><textarea rows="2" placeholder="一句话介绍一下你的项目吧"></textarea></div></div>
                <div class="back"><b>人数上限：</b><input class="input-num" placeholder="0">个<small>"0"为不需要名额</small></div>
                <div class="back"><b>回报时间：</b><input class="input-num" placeholder="0">天<small>"0"为开奖后立即发送</small></div>
                <div class="clear"></div>
                <hr>
                <div class="text-center"><button class="btn btn-primary">删除</button><button class="btn">保存</button></div><br>
            </div>
        </form>
        <div class="text-center"><a  href="#">+继续添加新的回报</a></div>
    </div>

</div>

<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>