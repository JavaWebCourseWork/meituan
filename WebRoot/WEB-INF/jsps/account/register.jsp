<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>注册</title>
  </head>
  
  <body>
 	 账号注册：<br>
    <form action="${pageContext.request.contextPath }/user/register.do" method="post">
    	Phone:<input type="text" name="uphone"/>
    	Password:<input type="password" name="upassword"/><br>
    	<input type="submit" value="注册"/>
    </form>
  </body>
</html>
