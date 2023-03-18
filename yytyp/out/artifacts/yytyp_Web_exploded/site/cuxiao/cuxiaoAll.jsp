<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page isELIgnored="false" %> 
<%
String path = request.getContextPath();
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
  <head>
	<meta http-equiv="pragma" content="no-cache"/>
	<meta http-equiv="cache-control" content="no-cache"/>
	<meta http-equiv="expires" content="0"/>    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3"/>
	<meta http-equiv="description" content="This is my page"/>
	
	<link href="<%=path %>/css/qiantai.css" rel="stylesheet" type="text/css" />
	<style type="text/css">
		.c1-bline{border-bottom:#999 1px dashed;border-top:1px;}
		.f-right{float:right}
		.f-left{float:left}
		.clear{clear:both}
	</style>
	<script type="text/javascript">
        function go(index)
        {
            window.location.href="&lt;%=path %>/goodsAll.action?index="+index;
        }
    </script>
  </head>
  
<body>
<div class="main">
	  <div class="header">
		    <div class="header_resize">
			      <div class="logo"><br/><h1 style="font-size: 26px;">基于ssh的婴幼儿产品销售系统
<small>&nbsp;</small></h1></div>
				      <jsp:include flush="true" page="/site/daohang.jsp"></jsp:include>
			      <div class="clr"></div>
		    </div>
	  </div>
	  <div class="content">
		    <div class="content_resize">
			      <div class="mainbar">
				        <!--  -->
				        <div class="article">
					          <!-- <h2>商品展示</h2><div class="clr"></div> -->
					          <div>
							        <c:forEach items="${requestScope.cuxiaoList}" var="cuxiao" varStatus="sta">
				                        <div class="c1-bline" style="padding:7px 0px;">
					                        <div class="f-left">
					                             <img src="<%=path %>/img/head-mark4.gif" align="middle" class="img-vm" border="0"/> 
					                             <a href="<%=path %>/cuxiaoDetailQian.action?id=${cuxiao.id }">${cuxiao.biaoti }</a>
					                        </div>
					                        <div class="f-right">${cuxiao.fabushi }</div>
					                        <div class="clear"></div>
				                        </div>
				                    </c:forEach> 
					               <div align="center">
				              </div>   
					          </div>
					          <p class="spec"></p>
				        </div>
				        <!--  -->
			      </div>
			      <div class="sidebar">
				        <jsp:include flush="true" page="/site/left.jsp"></jsp:include>
			      </div>
			      <div class="clr"></div>
		    </div>
	  </div>

	  <div class="fbg">
	    <div class="fbg_resize" align="center">
	         <a href="<%=path %>/login.jsp">系统管理员登陆</a>
	    </div>
	  </div>
</div>


</body>
</html>
