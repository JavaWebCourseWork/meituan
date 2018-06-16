<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>店铺详情</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath }/css/reset.css"></link>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath }/css/base.css"></link>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath }/css/storeInfo.css"></link>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath }/css/cart.css"></link>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.11.1.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/showStore.js"></script>
  </head>
  
  <body>
  <div class="page-wrap"><div class="inner-wrap">
  	<div class="rest-info">	
  		<input id="sid" type="hidden" value="${storeData.store.sid }"/>
  	    <div class="right-bar fr clearfix ct-lightgrey">	
	      <div class="fl average-speed">
	          <div class="desc">平均送餐时间</div>
	          <div class="nu">
	                  <strong>${storeData.store.smeantime }</strong>分钟
	          </div>
	      </div>
	
	        <div class="fl ack-ti">
	            <div class="desc">起送</div>
	            <div class="nu">
	                  <strong>${storeData.store.sstart }</strong>元
	            </div>
	        </div>	
	
	      <div class="fl in-ti">
	          <div class="desc">配送费</div>
	          <div class="nu">
	              <strong>${storeData.store.sfreight }</strong>元
	          </div>
	
	      </div>
	    </div>
	  <div class="details">
	    <div class="up-wrap clearfix">
	      <div class="avatar fl">
	        <img class="scroll-loading" src="http://p0.meituan.net/120.0/business/e98b18decfe45ebeaf7adde341278122110134.png" data-src="http://p0.meituan.net/120.0/business/e98b18decfe45ebeaf7adde341278122110134.png" data-max-width="106" data-max-height="80" style="width: 105.495px; height: 80px;">
	      </div>
	      <div class="list">
	        <div class="na">
	          <a href="/restaurant/144800588976432172">
	            <span>${storeData.store.sname }</span><i class="icon i-triangle-dn"></i>
	          </a>
	        </div>
	        <div class="stars clearfix" style="margin-top:14px;">
	            <span class="star-ranking fl">
	                    <span class="star-score" style="width: 67px"></span>
	              </span>
	            <span class="fl mark ct-middlegrey">${storeData.store.sstar }</span> <br>
	        </div>
	      </div>
	    </div>	    
	  </div>
	  <div class="save-up-wrapper">
	    <a href="javascript:;" class="save-up j-save-up " data-poiid="144800588976432172">
	      <p class="ct-black">收藏本店</p>
	      <i class="icon i-heart-22"></i>
	    </a>
	    <p class="cc-lightred-new j-save-up-people"></p>
	  </div>
	</div>
	<div class="cate-tab-area">
	  <div class="tab-link">
	    <div class="tab-link-inner clearfix">
	      <a href="#" class="tab-item  active">菜单</a>
	      <a href="#" class="tab-item ">评价</a>
	      <a href="#" class="tab-item ">店铺资料</a>
	    </div>
	  </div>
	  <div class="ori-foodtype-nav clearfix">
	      <ul class="clearfix tab-item-ul">
	        <li class="active">
	          <a href="javascript:;" class="type" data-anchor="0" title="美食节“金奖”套餐">
	            <span class="name">美食节“金奖    ...</span>
	          </a>
	        </li> 
	       </ul>
	       <ul class="tab-item-ul" style="display:none">test2</ul>
	       <ul class="tab-item-ul" style="display:none">
		       	<div class="rest-info-down-wrap" style="">
			      <div class="clearfix sale-time">
			        <p class="poi-detail-left"><span>营业时间</span></p>
			        <p class="poi-detail-right"><span class="info-detail">${storeData.store.sstabusiness }-${storeData.store.sendbusiness }</span></p>
			      </div>
			
			        <div class="rest-info-thirdpart poi-address">
				        <p class="poi-detail-left"><span class="poi-address-title">商家地址</span></p>
				        <p class="poi-detail-right">${storeData.store.saddress }</p>
			        </div>
			        <div class="telephone">
			            <p class="poi-detail-left">商家电话:</p>${storeData.store.sphone }
			        </div>			
			     </div>
			     <div>
                    	<p>营业执照</p>
						  <img src="${pageContext.request.contextPath }${storeData.store.slicence }" style="width:200px;height:200px">
                
			     </div>
	       </ul>
       </div>
	 </div>
	 
	 
	 	<div class="food-nav">
			<div class="title-blank hidden" style="display: none;">
			  <span class="tag-na">汤类</span>
			</div>

			<div class="category"><h3 class="title title-0" title="私房特色抄手">
				<span class="tag-na">    私房特色抄手</span></h3>
			<div class="pic-food-cont clearfix">
	 
			<div class="j-pic-food pic-food" id="776508279">
				<div class="avatar">
				  <img src="http://p1.meituan.net/210.0/wmproduct/67e7417765e1be48fb6a7e3441da4488312375.jpg" data-src="http://p1.meituan.net/210.0/wmproduct/67e7417765e1be48fb6a7e3441da4488312375.jpg" class="food-shape scroll-loading" alt="美团外卖-紫苏煎泥鳅">
				</div>

				<div class="np clearfix">
				  <span class="name fl" title="紫苏煎泥鳅">
					紫苏煎泥鳅
				  </span>
				</div>

				<div class="labels clearfix">
					<div id="food-1" class="food-addcart contextCannotSelected fr">+</div>
					<span id="food776508279-cart-num" class="food-number fr" style="display:none;">0</span>

					  <div class="price fl">
						  <div class="only">¥42</div>
					  </div>
				</div>
			  </div>
  
		</div>
	 
	 <div class="shopping-cart clearfix">
	    <form method="post" action="/order/shoppingcart" id="shoppingCartForm">
  	    <div class="order-list hideCart" style="top: -257px;">
  	      <div class="title">
            <span class="fl buy-title">购物车</span>
  	        <a href="javascript:;" class="clear-cart fr">清空菜品</a>
  	      </div>
		  
  	      <ul style="height: auto; overflow: visible;">
			</ul>
  	      
		  
		  <div class="other-charge">			
  	        <div class="clearfix delivery-cost">
  	          <span class="fl">配送费(不计入起送价)</span>
  	          <span class="fr shippingfee">¥8</span>
  	        </div>			
  	      </div>
		  
		  
  	      <div class="privilege hidden" style="">
  	      </div>
  	      <div class="total">共<span class="totalnumber">1</span>份，总计<span class="bill">¥35</span></div>
  	    </div>

  	    <div class="cart-footer clearfix">
          <div class="logo icon fl"></div>
          <div class="brief-order fl" style="display: none;">
            <span class="count">1</span>
            <span class="price"><i>¥</i>35</span>
          </div>
          <div class="fr">
           <a class="ready-pay borderradius-2" href="javascript:;" style="display: none;">差<span data-left="15" class="margintominprice">0</span>元起送</a>
            <input class="go-pay fr" type="submit" value="立即下单" style="display: inline-block;">
            <input type="hidden" value="{&quot;poi&quot;:&quot;144720505017167356&quot;,&quot;foods&quot;:[{&quot;sku&quot;:254415497,&quot;attrs&quot;:[],&quot;num&quot;:1}]}" class="order-data" name="shop_cart">
          </div>
        </div>
      </form>
    </div>
	 
	 
		</div>
	 </div>
  	店铺头像        店铺名称      营业状态
  			     星级  平均时间  						
  	店名
  	地址
  	电话
  	营业时间
  	配送费
  	起送费
  	？？营业执照，法人名称？？
  </body>
</html>
