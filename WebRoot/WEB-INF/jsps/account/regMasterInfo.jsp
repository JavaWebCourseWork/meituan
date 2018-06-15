<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE>
<html>
  <head>
    <title>店铺注册</title>
    <script type="text/javascript" src="/meituan/js/jquery-1.11.1.min.js"></script>
	<script type="text/javascript" src="/meituan/js/jquery.form.js"></script>
	<script type="text/javascript" src="/meituan/js/home.js"></script>
  </head>
  
  <body>
    <form id="licenceForm" action="${pageContext.request.contextPath }/user/regMasterInfo.do" method="post">
    	上传营业执照:<br>
    	<p><label></label>
		<img id='imgSize1ImgSrc' src='${pageContext.request.contextPath }${slicence }'  height="200" width="200" />
		<input type='file' id='imgSize1File' name='imgSize1File' class="file" onchange='submitImgSize1Upload()' /><span class="pos" id="imgSize1FileSpan">请上传图片的大小不超过3MB</span>
        <input type='hidden' id='imgPath' name='slicence' value='' reg="^.+$" tip="亲！您忘记上传图片了。" />
		</p>
    	法人名称:<input type="text" name="smaster" value="${smaster }"/><br>    	
    	<input type="submit" value="下一步"/>
    </form>
  </body>
</html>



