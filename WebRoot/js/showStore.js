
$(function(){
	$(".tab-item").click(function(){
		$(this).siblings().removeClass("active");
		$(this).addClass("active");
//		$(".tab-item-ul").hide();
		$(".ori-foodtype-nav").children("ul").hide();
		$(".ori-foodtype-nav").children("ul").eq($(this).index()).show();
	});
});