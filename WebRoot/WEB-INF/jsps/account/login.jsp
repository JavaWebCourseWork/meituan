<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>登录</title>
  </head>
  
  <body>
  	账号登录：<br>
    <form action="${pageContext.request.contextPath }/user/login.do" method="post">
    	Phone:<input type="text" name="uphone"/><br>
    	Password:<input type="password" name="upassword"/><br>
    	忘记密码？<br>
    	没有账号，马上<a href="${pageContext.request.contextPath }/user/reg.do">注册</a>
    	<input type="submit" value="登录"/>
    </form>
  </body>
</html>
