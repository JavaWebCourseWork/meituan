<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<title></title>

</head>

<body>
</head>
<body>
<div id="left-box" style="float: left">
		<div><a href="${pageContext.request.contextPath }/rest/orders/toneworders?sid=1" target="iframe_a">新的订单</a></div>
		<div><a href="${pageContext.request.contextPath }/rest/orders/togetorders?sid=1" target="iframe_a">未完成订单</a></div>
		<div><a href="${pageContext.request.contextPath }/rest/orders/tofinishorders?sid=1" target="iframe_a">已完成订单</a></div>
		<div><a href="${pageContext.request.contextPath }/rest/orders/tohurryorders?sid=1" target="iframe_a">催单</a></div>
		<div><a href="${pageContext.request.contextPath }/rest/orders/torefundorders?sid=1" target="iframe_a">申请退款</a></div>
</div>
<div id="right-box" style="float: left" >
<iframe src="${pageContext.request.contextPath }/rest/orders/toneworders?sid=1" name="iframe_a" frameborder="1" width="600" height="400">
   
</iframe>
 </div>
</body>
</html>
