<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>订单详情</title>
<script type="text/javascript"
	src="/meituan/js/jquery-1.11.1.min.js"></script>
<script type="text/javascript">
	//将订单状态改为催单状态
	$(document).ready(function() {
		$("#hurry").click(function() {
			var oid = $("#oid").val();
			var str = {
				"oid" : oid,
				"did" : 3
			};
			var da = JSON.stringify(str);
			$.ajax({
				url : "${pageContext.request.contextPath}/orders/changoid.do",
				data : da,
				type : "post",
				contentType : 'application/json;charset=UTF-8',
				success : function(data) {
					var html = "已催单";
					var str = $("#p1").children("div").html(html);
					$("#p1").children("input").attr('type', 'hidden');
				}
			});

		});

		//将订单状态改为申请等待退款状态			
		$("#drawback").click(function() {
			var oid = $("#oid").val();
			var str = {
				"oid" : oid,
				"did" : "5"
			};
			var da = JSON.stringify(str);
			$.ajax({
				url : "${pageContext.request.contextPath}/orders/changoid.do",
				data : da,
				type : "post",
				contentType : 'application/json;charset=UTF-8',
				success : function(data) {
					var html = "已申请，等待商家确认退款";
					var str = $("#p1").children("div").html(html);
					$("#p1").children("input").attr('type', 'hidden');
				}
			});
		});
		
		
		//将订单状态改为已完成状态			
		$("#placeorder").click(function() {
			var oid = $("#oid").val();
			var str = {
				"oid" : oid,
				"did" : "4"
			};
			var da = JSON.stringify(str);
			$.ajax({
				url : "${pageContext.request.contextPath}/orders/changoid.do",
				data : da,
				type : "post",
				contentType : 'application/json;charset=UTF-8',
				success : function(data) {
					var html = "已完成";
					var str = $("#p1").children("div").html(html);
					alert(str);
					$("#placeorder").attr('type','hidden');
				}
			});
		});
		
	}
	

	);
</script>


</head>
<body>
	<div id="top"
		style="width: 100%; height: 100px; background-color: red;">
		<div style="margin: auto, 0;">
			<p>
				<span style="font-size: 50;">订单详情</span>
			</p>
		</div>
	</div>
	<div align="center">
		<div id="main" style="width: 1200px;">
				<div>店名:${users.ordersList[0].store.sname}</div>
				<div id="left"
					style="width: 500px; float: left; height: 300px; background-color: yellow;">
					<table id="left-table" border="5"
						style="height: 100%; width: 100%;" align="center">
						<tr>
							<td>菜品</td>
							<td>价格/分数</td>
						</tr>
						<c:forEach items="${users.ordersList[0].orderfoodList}" var="list">
						<tr>
							<td id="food">${list.food.fname}</td>
							<td >${list.food.fprice}*${list.ofnumber}</td>
						</tr>
						</c:forEach>
						<tr>
							<td>配送费</td>
							<td >${users.ordersList[0].store.sfreight}</td>
						</tr>
						<tr>
							<td>合计</td>
							<td>${users.ordersList[0].oprice}</td>
						</tr>
					</table>
				</div>

				<div id="right" style="width: 700px; float: left; height: 300px;">
					<p>订单详情:</p>
					<div>
						<div style="width: 100%; float: left; height: 100px;">
							给商家留言：
							<div id="omessage" style="height: 100%; width: 100%;">${users.ordersList[0].omessage}</div>
						</div>
						<div style="width: 100%; float: left; height: 100px;">
							地址信息：
							<div id="address" style="height: 100%; width: 100%;">${users.ordersList[0].address.aaddress}</div>
						</div>
					</div>
					<p>订单状态:</p>
					<input id="oid" type="hidden" value="${users.ordersList[0].oid}">
					<div id="ordertail">
						<c:choose>
							<c:when test="${users.ordersList[0].did ==1}">
								<div>已付款，未接单</div>
							</c:when>
							<c:when test="${users.ordersList[0].did==2 }">
								<div id="p1">
									<div>已接单（正在派送中）</div>
									<input id="hurry" type="button" value="催单">
									<input id="placeorder" type="button" value=" 已完成">
								</div>
							</c:when>
							<c:when test="${users.ordersList[0].did==3 }">
								<div>已催单</div>
							</c:when>
							<c:when test="${users.ordersList[0].did==4 }">
								<div id="p1">
									<div>已完成</div>
									<input id="drawback" type="button" value="申请退款">
								</div>
							</c:when>
							<c:when test="${users.ordersList[0].did ==5}">
								<div>已申请，等待商家确认退款</div>
							</c:when>
							<c:otherwise>
								<div>已退款</div>
							</c:otherwise>
						</c:choose>
					</div>
					<div id="order_data">订单日期：${users.ordersList[0].odate}</div>
				</div>
			</div>

	</div>
	<div id="bottom"
		style="width: 100%; height: 150px; background-color: skyblue;">
	</div>
</body>
</html>