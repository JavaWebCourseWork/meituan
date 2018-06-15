<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE>
<html>
  <head>
    <title>店铺注册</title>
    <link rel="stylesheet" type="text/css" href="/meituan/css/jquery.datetimepicker.css">
    <script type="text/javascript" src="/meituan/js/jquery-1.11.1.min.js"></script>
	<script type="text/javascript" src="/meituan/js/jquery.datetimepicker.full.min.js"></script>
	<script type="text/javascript" src="/meituan/js/home.js"></script>
  </head>
  
  <body>
    <form action="${pageContext.request.contextPath }/user/regStoreInfo.do" method="post">  	
    	店铺标签:<select name="stagid">
				    <option value="">---请选择分类--</option>
				    <c:forEach items="${storeSort}" var="s">
				        <option value="${s.did}"  >${s.dstate}</option>
				    </c:forEach>
				</select><br>
    	店名:<input type="text" name="sname"/><br>
    	地址:<input type="text" name="saddress"/><br>
    	电话:<input type="text" name="sphone"/><br>
    	营业时间选择：<input type="text" class="datetimepicker1" name="sstabusiness"/>&nbsp;~&nbsp;<input type="text" class="datetimepicker1" name="sendbusiness"/><br>
    	配送费:<input type="text" name="sfreight"/><br>
    	起送费:<input type="text" name="sstart"/><br>
    	<a href="${pageContext.request.contextPath }/user/regStore.do">上一步</a><input type="submit" value="完成入驻"/><br>
    </form>
  </body>
</html>
