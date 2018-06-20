<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.11.1.min.js"></script>
<title>店铺信息</title>
	<style type="text/css">
	.aaa{position:fixed;left:400px;border-color: red red;border: thin;background-color: red}
	/* .bbb{margin:20px 20px; font-size: 20px;width: 100%;height:30px;} */
	.bbb{margin:20px 20px; font-size: 20px;overflow: hidden;font-weight: 400;}
	.ccc{float: left;width: 200px;height: 60px;text-align: center;line-height: 60px;}
	.ddd{float: left;width: 800px;height: 60px;text-indent: 20px;text-align: left;line-height: 60px;} 
	#ddd{}
	#updateInfo{background-color: white;width: 30%;height: 500px;position: fixed ;left:30% ;display: none;top:100px;}
		
			.shopline{
				font-family: "微软雅黑";
				width: 90%;
				margin: auto;
				height: 100px;
				border-bottom:solid 1.5px ;border:1px solid #969697;
				background-color: #FFF9D0;
			}
			.shopkey{
				float: left;
				height: 64px;
				width: 15%;
				font-size: 25px;
				margin: 18px 0 18px 40px;
				line-height: 2.6;
				border-right:solid 1.5px ;
				
			}
			.shopvalue{
				float: left;
				height: 64px;
				font-size: 22px;
				margin: 18px 0 18px 40px;
				line-height: 2.9;
				
			}
			.shopupdate{
				float: right;
				height: 36px;
				width: 8%;
				font-size: 17px;
				margin: 32px 40px 29px 0px;
				border:solid 1.5px ;
				text-align: center;
				border-radius: 18px;
				line-height: 2.2;
				
			}
			
			.sss{
				top: 0;
				position: fixed;
				width: 100%;
				height: 800px;
				opacity: 0.7;
				background-color: black;
				display: none;
			}
			#updateInfo{
				top: 200px;
				left: 32%;
				position: fixed;
				width: 36%;
				height: 300px;
				background-color: white;
			}
			
			.ukey{
				margin:35px 0  0 90px;
				font-size: 18px;
			}
			
			.utitle{
				border-radius: 22px 22px 0 0;
				width: 100%;
				height: 39px;
			/* 	background-color: gainsboro; */
				font-size: 20px;
				overflow: hidden;
				line-height: 2;
				text-indent: 38px;
				margin-bottom: 18px;
			}
			
			.inputvalue{
				height: 28px;
				font-size: 18px;
			}
			
			.subBT{
				position: absolute;
				bottom: 30px;
				left:130px ;
				width: 22%;
				height: 40px;
				background-color: #008B8B;
				border-radius: 25px;
				font-size: 16px;
				color: white;
				border: none;
			}
			
			.wingai{
				z-index: 3;
				border-radius: 22px;
				top: 280px;
				left:700px;
				position: fixed;
				width: 540px;
				height: 300px;
				background-color: white;
				font-family: "微软雅黑";
			}
			
			.delBT{
				line-height: 2.4;
				text-align: center;
				position: absolute;
				bottom: 30px;
				left: 310px;
				width: 16%;
				height: 39px;
				background-color: white;
				border: none;
				border-radius: 25px;
				font-size: 16px;
				color: #008B8B;;
				border: solid 1.5px;
			}
	
	</style>
</head>
<body>
	<form action="${pageContext.request.contextPath }/store/updateStoreInfo.do" method="post">
		店名:<input type="text" name="sname" value="${store.sname }"/><br>
    	地址:<input type="text" name="saddress" value="${store.saddress }"/><br>
    	电话:<input type="text" name="sphone" value="${store.sphone }"/><br>
    	营业时间选择：<input type="text" class="datetimepicker1" name="sstabusiness" value="${store.sstabusiness }"/>&nbsp;~&nbsp;<input type="text" class="datetimepicker1" name="sendbusiness" value="${store.sendbusiness }"/><br>
    	配送费:<input type="text" name="sfreight" value="${store.sfreight }"/><br>
    	起送费:<input type="text" name="sstart" value="${store.sstart }"/><br>
		<input type="submit" value="保存信息"/><br>
    </form>
	
	
	<script type="text/javascript">
  	
	$(".delBT").click(function(){
		$("#updateInfo").hide();
    	$("#sss").hide();
		
	})
	
    $(".shopupdate").click(function(){
    	$("#updateInfo").show();
    	$("#sss").show();
    	var value1=$(this).parent().find(".shopkey").text();
    	var value2=$(this).parent().find(".shopvalue").text();
    	$(".utitlekey").text(value1)
    	$(".utitlevalue").text(value2)
   	});
		
	</script>

</body>

</html>