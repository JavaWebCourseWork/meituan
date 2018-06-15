function submitImgSize1Upload(){
		var option={
				type:'POST',
				url:'/meituan/upload/uploadPic.do',
				dataType:'text',
				data:{fileName : 'imgSize1File'},
				success:function(data){
					//把json格式的字符串转换成json对象
					var jsonObj = $.parseJSON(data);
					//返回服务器图片路径，把图片路径设置给img标签
					$("#imgSize1ImgSrc").attr("src",jsonObj.fullPath);
					//数据库保存相对路径
					$("#imgPath").val(jsonObj.relativePath);
				}				
			};
		$("#licenceForm").ajaxSubmit(option);
	}
$(function(){
	$('.datetimepicker1').datetimepicker({
		datepicker:false,
		format:'H:i',
		step:5
	});
	$('.datetimepicker1').css("width","50px").css("text-align","center");
});