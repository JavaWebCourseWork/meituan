$(function(){
	//点击输入框焦点事件
	$(".log-input").click(function(){
		$(".log-input").closest("div").removeClass("log-line-hover");
		$(this).closest("div").addClass("log-line-hover");
	});
	$("#log-cacct").blur(function(){
		var flag = validatemobile($(this).val());
		if(flag!=true){
			$('#error').html(flag).show();
			$(this).css("border-color","red");
			$("#login-button").attr("disabled","disabled").css("background","#888");
		}else{
			if($("#login-button").hasClass("regBtn")){
				$.ajax({
					type:'POST',
					url:'/meituan/user/checkPhone.do',
					dataType:'text',
					data:{uphone : $("#log-cacct").val()},
					success:function(data){
						if(data=="No"){
							$("#errorMsg").html("该手机号码已被注册").show();
							$("#login-button").attr("disabled","disabled").css("background","#888");
						}else{
							$("#errorMsg").html("true").hide();
							if($("#log-pwd").val().trim()!=''){
								$("#login-button").attr("disabled",false).css("background","rgb(47,130,255)");
							}
						}
						
					}				
				});
			}
			
			$('#error').html(flag).hide();
			$(this).css("border-color","#888");
			console.log($("#errorMsg").html()=="true");
			if($("#errorMsg").html()=="true"&&$("#log-pwd").val().trim()!=''){
				$("#login-button").attr("disabled",false).css("background","rgb(47,130,255)");
			}
			
		}
	});
	$("#log-pwd").blur(function(){
		if($(this).val().trim()==''){
			if($("#error").html()=="true"){
				$('#error').html("密码不能为空").show();
				$(this).css("border-color","red");
				$("#login-button").attr("disabled","disabled").css("background","#888");
			}
		}else{
			$(this).css("border-color","#888");
			if(validatemobile($("#log-cacct").val())&&$("#errorMsg").html()=="true"){
				$("#login-button").attr("disabled",false).css("background","rgb(47,130,255)");
			}
		}
		
	});
	$("#ogin-button").click(function(){
		
	});
	
	
	function validatemobile(phone) {		
		if (phone.length == 0) {
			return '请输入手机号码！';
		}
		if (phone.length != 11) {
			return '请输入有效的手机号！';
		}
		var myreg = /^(((13[0-9]{1})|(14[0-9]{1})|(17[0]{1})|(15[0-3]{1})|(15[5-9]{1})|(18[0-9]{1}))+\d{8})$/;
		
		if (!myreg.test(phone)) {
			return '请输入有效的手机号！';
		}else{
			return true;
		}
	}
});