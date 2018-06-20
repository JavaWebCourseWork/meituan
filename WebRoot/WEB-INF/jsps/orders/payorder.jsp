<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>下单页面</title>
<script type="text/javascript"	src="/meituan/js/jquery-1.11.1.min.js"></script>
<script type="text/javascript">
	function hiddenform(i) {
		i.parentNode.parentNode.style.display = 'none';
	}
	function showselectform(){
		var selectfrom= document.getElementById("selectfrom");
		var addrform= document.getElementById("addrform");
		addrform.style.display='none';
		selectfrom.style.display='block';
	}
	function showaddrform(){
		var addrform= document.getElementById("addrform");
		var selectfrom= document.getElementById("selectfrom");
		selectfrom.style.display='none';
		addrform.style.display='block';
	}
	function overlapdaddress(i){
			var addr = i.innerHTML  ;
			var addressinfo = document.getElementById("addressinfo");
			addressinfo.innerHTML=addr;
			
			
			
			var selectfrom= document.getElementById("selectfrom");
			selectfrom.style.display='none';
	}
//---------------------------------------------------------------
	$(document).ready(function() {
		$("#addbutton").click(function() {
			var uid = $("#uid").val();
			var aaddress = $("#aaddress").val();
			var aname = $("#aname").val();
			var aphone = $("#aphone").val();
			var str = {
				"uid" : uid,
				"aaddress" :aaddress,
				"aname":aname,
				"aphone":aphone
			};
			var da = JSON.stringify(str);
			alert(da);
			$.ajax({
				url : "${pageContext.request.contextPath}/orders/form.do",
				data : da,
				type : "post",
				contentType : 'application/json;charset=UTF-8',
				success : function(data) {
				alert(data.aname);
				var  html = "<div  onclick='overlapdaddress(this)'>"+
							"<div>收货人名称："+data.aname+"</div>"+
							"<div>收货人电话："+data.aphone+"</div>"+
							"<div>地址："+data.aaddress+"</div>"+
							"<input type='hidden' value='"+data.aid+"'>"+
							"</div>";
					$("#addressinfo").html(html);
				}
			}
	);
	});
	}
	);
	
	
	
</script>
<style type="text/css">
					#addrform {
						position: absolute;
						top: 300px;
						left: 500px;
						display: none;
						left: 500px;
					}
					#selectfrom{
						position: absolute;
						top: 300px;
						left: 500px;
						display: none;
						left: 500px;
					}
</style>

</head>
<body>
	<div id="top"
		style="width: 100%; height: 100px; background-color: red;">
		<div style="margin: auto, 0;">
			<p>
				<span style="font-size: 50;">订单信息</span>
			</p>
		</div>
	</div>
	<div align="center">
		<div id="main" style="width: 1200px;">
			<div>店名：</div>
			<div id="left"
				style="width: 500px; float: left; height: 500px; background-color: yellow;">
				<table id="left-table" border="5" style="height: 100%; width: 100%;"
					align="center">
					<tr>
						<td>菜品</td>
						<td>价格/分数</td>
					</tr>
					<tr>
						<td id="food">汉堡</td>
						<td id="money_nums">12*3</td>
					</tr>
					<tr>
						<td>配送费</td>
						<td id="money_nums">6</td>
					</tr>
					<tr>
						<td>合计</td>
						<td>42</td>
					</tr>
				</table>
			</div>

			<div id="right" style="width: 700px; float: left; height: 500px;">
				<table border="1">
					<tr><th><p>送餐详情:</p></th></tr>
					<tr><th>
					<div style="width: 100%; float: left; height: 100px;">
					<p>地址信息：</p>
						<input type="button" value="点击添加地址" onclick="showaddrform()">
						<input type="button" value="点击选择地址" onclick="showselectform()"> 
						<div id="addressinfo" style="width: 700px; height: 200px;">
						</div>
						<input id="aid" type="hidden" value="${aid} ">
					</div>
					</th></tr>
					<tr><th>
					<div  style="width: 100%; float: left; height: 100px;">
						给商家留言：<input id="omessage" type="text" style="height: 100%; width: 100%;">
					</div>
					</th></tr>
					<tr><th>
					<div>
						您需支付:<span id="oprice">42</span><input type="submit" value="付款">
					</div>
					</th></tr>
				</table>
			</div>
		</div>
	</div>
	<div id="bottom"
		style="width: 100%; height: 100px; background-color: skyblue;">
	</div>



	<div id="addrform" style="display: none">
		<form  style="background-color: skyblue" method="post">
				<div>地址信息</div>
				地          址：<input type="text" name="aaddress" id="aaddress"><br> 
				收货人名称：<input type="text" name="aname" id="aname"><br> 
				收货人电话：<input type="text"name="aphone" id="aphone"><br>
			<input type="button" value="确定" id="addbutton" onclick="hiddenform(this)"><input type="button"value="取消" onclick="hiddenform(this)">
				<input type="hidden" name="uid" value="1" id="uid"> 
		</form>
	</div>
	
	<div id="selectfrom"  style="display: none ;background-color: white;">
				<div>地址信息</div>
				<div  onclick="overlapdaddress(this)">
							<div>收货人名称：林林</div>
							<div>收货人电话：123456789456</div>
							<div>地址：海珠区东沙街24号</div>
							<input type="hidden" value="aid">
				</div>
				<div onclick="overlapdaddress(this)">
							<div>收货人名称：张三</div>
							<div>收货人电话：123456789456</div>
							<div>地址：海珠区东沙街26号</div>
							<input type="hidden" value="aid">
				</div>
	</div>



</body>
</html>