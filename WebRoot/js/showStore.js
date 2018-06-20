
$(function(){
	$(".tab-item").click(function(){
		$(this).siblings().removeClass("active");
		$(this).addClass("active");
		$(".ori-foodtype-nav").children("ul").hide();
		$(".ori-foodtype-nav").children("ul").eq($(this).index()).show();
	});
	//点击菜单选项，改变样式
	$("#tabClassify li").click(function(){
		$(this).siblings().removeClass("active");
		$(this).addClass("active");
	});
	
	//为购物车添加显示和隐藏
		$(".cart-footer").click(function(){
			var list = $(".order-list");
			if(list.hasClass("showCart")==true){
				list.removeClass("showCart").addClass("hideCart");
			}else{
				list.removeClass("hideCart").addClass("showCart");
			}				
		});
		
		
		
		//点击添加菜品到购物车
		$(".food-addcart").click(function(){
			//改变点菜的数量
			var foodNumber = alterFoodCount($(this),true);
			//加入购物车并显示
			var DBFoodId = alterCartContent($(this),foodNumber);
			//发送数据到后台并放入session
			alterServiceCount(DBFoodId,foodNumber);
		});
		
		//改变服务端商品数量
		function alterServiceCount(DBFoodId,foodNumber){
			alert($("#sid").val());
			$.ajax({
				type:'POST',
				url:'/meituan/store/alterCount.do',
				data:{sid : $("#sid").val(),fid:DBFoodId,count:foodNumber},
				success:function(){}
			});
		}
		
		//改变点菜的数量
		function alterFoodCount(addbuttun,isAdd){
			var showNumber = addbuttun.siblings(".food-number");
			var number = parseInt(showNumber.text());
			if(isAdd==true){
				number++;
				showNumber.text(number);
				if(number>0){
					showNumber.show();
				}
			}else{
				number--;
				showNumber.text(number);
				if(number==0){
					showNumber.hide();
				}
			}
			return number;
		}
		
		
		//加入购物车并显示
		function alterCartContent(buttumItem,foodNumber){
				var foodId = buttumItem.attr("id");
				var dbFoodId = foodId.substring(5);
				var foodPri = buttumItem.siblings(".price").children().text();
				var cartFoodId = "#cart-"+foodId;
				if(foodNumber==0){
					$(cartFoodId).remove();
					return dbFoodId;
				}
				if($(cartFoodId).size()>0){
					$(cartFoodId).find(".txt-count").val(foodNumber);
				}else{
					var foodTitle = buttumItem.parent().siblings(".np").children().text();
					var newStr = "<li class='clearfix' id='cart-"+foodId+"'><div class='fl foodName clearfix' title='"+foodTitle+"'>"+foodTitle+
					"</div><div class='fl modify clearfix'><a href='javascript:;' class='fl minus'>-</a>"+    
					"<input type='text' class='fl txt-count' value='"+foodNumber+" ' maxlength='2'>"+   
	  
					"<a href='javascript:;' class='fl plus'>+</a></div>"+ 
					"<div class='fr pri '><span>"+ foodPri+"</span></div></li>";
					$(".shopping-cart ul").append(newStr);
					$(".shopping-cart").trigger("create");
					//通过购物车添加商品数量
					$(".plus").off("click").on("click",function(){
						var cartFoodId = $(this).closest("li").attr("id");
						var foodId = cartFoodId.substring(5);
						var foodNumber = alterFoodCount($("#"+foodId),true);
						var DBFoodId = alterCartContent($("#"+foodId),foodNumber);
						alterServiceCount(DBFoodId,foodNumber);
					});
					//通过购物车减少商品数量
					$(".minus").off("click").on("click",function (){
						var cartFoodId = $(this).closest("li").attr("id");
						var foodId = cartFoodId.substring(5);
						var foodNumber = alterFoodCount($("#"+foodId),false);
						var DBFoodId = alterCartContent($("#"+foodId),foodNumber);
						alterServiceCount(DBFoodId,foodNumber);
					});
					//通过输入框修改商品数量
					$(".txt-count").off("blur").on("blur",function(){
						if($(this).val().trim()==""){
							alert("输入错误");
							return;
						}
						var cartFoodId = $(this).closest("li").attr("id");
						var foodId = cartFoodId.substring(5);
						$("#"+foodId).siblings("span").text($(this).val());
						
						var DBFoodId = foodId.substring(5);
						alterServiceCount(DBFoodId,$(this).val());
					});

				}
				
				return dbFoodId;
				
			}
		
});