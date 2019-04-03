<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="css/bootstrap.min.css" type="text/css"/>
    <link rel="stylesheet" href="css/base.css" type="text/css"/>
    <link rel="stylesheet" href="css/headbott.css" type="text/css"/>
    <link rel="stylesheet" href="css/index.css" type="text/css"/>
    <link rel="stylesheet" href="css/ly-list.css" type="text/css"/>
    <link rel="stylesheet" href="css/reg.css" type="text/css"/>
<title></title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>

<!--中间核心-->
<div class="product">
    <!--头上表格-->
    <div class="product-table">
        <div class="product-left">
            <table class="table table-bordered">
                <tr class="text-center">
                    <td class="title-td"><a href="new_product.jsp">基本信息</a></td>
                    <td class="active title-td"><a href="new_info.jsp">项目信息</a></td>
                    <td class="title-td"><a href="new_detail.jsp">详细描述</a></td>
                    <td class="title-td"><a href="new_back.jsp">回报设置</a></td>
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
                <h4>创建你的项目信息</h4>
            </div>
            <div class="btn-save">
                <button class="btn btn-default">保存草稿</button>
            </div>

        </div>
        <div class="clear"></div>
        <hr>
        <!--表单-->
        <form>
            <div class="my-form">
                <div class="product-info-input">
                    <b>设置封面：</b>
                    <input type="file">
                </div>
                <div class="product-info-input"><b>项目标题：</b><input class="text" type="text" placeholder="给自己的项目起个漂亮的名字吧"></div>
                <div class="product-info-input"><b>筹款目的：</b><div class="text-area"><textarea rows="2" placeholder="一句话介绍一下你的项目吧"></textarea></div></div>
                <div class="product-info-select">
                    <div class="product-info-text"><b>项目地点：</b></div>
                    <div class="product-info-select1">
                        <select class="info-select1">
                            <option>请选择</option>
                        </select>
                    </div>
                    <div class="product-info-select2">
                        <select class="info-select2">
                            <option>请选择</option>
                        </select>
                    </div>
                </div>

                <div class="product-info-input"><b>筹资金额：</b><input class="text" type="text" placeholder="输入你需要的金额，最少500元">元</div>
                <div class="product-info-input"><b>筹资天数：</b><input class="text" type="text" placeholder="">天</div>
            </div>
        </form>
    </div>
</div>

<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>