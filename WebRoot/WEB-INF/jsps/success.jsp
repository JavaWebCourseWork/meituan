<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>Success</title>
    <meta http-equiv="refresh" content="5;url='${pageContext.request.contextPath }${refleshUrl}'">
  </head>
  
  <body>
    ${promptMsg }<br>
    5秒后将自动跳转到${pageName }页面&nbsp;<a href="${pageContext.request.contextPath }${refleshUrl}">立即跳转或不能自动跳转请点击这</a>
  </body>
</html>
