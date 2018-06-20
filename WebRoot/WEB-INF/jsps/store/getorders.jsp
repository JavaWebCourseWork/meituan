<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>接到的订单页面</title>
</head>
<body>
	<div>
		<table border="1">
		<tr>
		<th>订单编号</th>
		<th>时间</th>
		<th>收货人</th>
		<th>收货地址</th>
		<th>订单金额</th>
		</tr>
		<c:forEach items="${ordersList }" var="orders">
		<tr>
			<td>${orders.oid }</td>
			<td>${orders.odate }</td>
			<td>${orders.address. aname}</td>
			<td>${orders.address.aaddress}</td>
			<td>${orders.oprice }</td>
			</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>