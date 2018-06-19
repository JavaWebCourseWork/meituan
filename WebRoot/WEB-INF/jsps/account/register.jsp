<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML>
<html>
  <head>
    <title>注册</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath }/css/reset.css"></link>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath }/css/base.css"></link>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath }/css/login.css"></link>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.11.1.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/login.js"></script>
  </head>
  
  <body>
  <header class="header clearfix">
		<a class="site-logo fl" href="${pageContext.request.contextPath}">首页</a>
	</header>

	<div class="site-body-wrapper">
		<div class="site-body clearfix">
			<div class="login-div fr">
			
			
    <form action="${pageContext.request.contextPath }/user/checkRegister.do" method="post">
    	<div class="toptitle">注册</div>
				<div class="log-input-container">
						<span id="errorMsg"></span>
						<div class="clear" style="font-size:0px;"></div>
						<div class="log-line log-line-hover" id="rowCacct">
							<input name="uphone" value="${uphone}" id="log-cacct" type="text" autocomplete="off" maxlength="11" class="log-input" placeholder="手机号码">
							<div class="logIco">&nbsp;</div>
						</div>
						<div class="log-line" id="rowPwd">
							<input name="upassword" value="${upassword }" id="log-pwd" type="password" autocomplete="new-password" maxlength="20" class="log-input" placeholder="密码">
							<div class="logIco">&nbsp;</div>
						</div>
				</div>
				<div id="error" class="worn">true</div>
				<input type="submit" id="login-button" class="loginBtn regBtn" value="免费注册" disabled="disabled"></div>
    </form>
    
    </div>

		</div>
    </div>
  </body>
</html>
