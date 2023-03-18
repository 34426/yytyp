<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN""http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
  <head>
	<meta http-equiv="pragma" content="no-cache"/>
	<meta http-equiv="cache-control" content="no-cache"/>
	<meta http-equiv="expires" content="0"/>    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3"/>
	<meta http-equiv="description" content="This is my page"/>
	
	<link rel="stylesheet" href="<%=path %>/css/reset.css" type="text/css" media="screen" />
	<link rel="stylesheet" href="<%=path %>/css/style.css" type="text/css" media="screen" />
	<link rel="stylesheet" href="<%=path %>/css/invalid.css" type="text/css" media="screen" />
	
	
    <script type='text/javascript' src='<%=path %>/dwr/interface/loginService.js'></script>
    <script type='text/javascript' src='<%=path %>/dwr/engine.js'></script>
    <script type='text/javascript' src='<%=path %>/dwr/util.js'></script>
    
    <script language="javascript">
		function ccc()
		{                                                                                         
		     if(document.ThisForm.userName.value=="")
			 {
			 	alert("请输入用户名");
				document.ThisForm.userName.focus();
				return false;
			 }
			 if(document.ThisForm.userPw.value=="")
			 {
			 	alert("请输入密码");
				document.ThisForm.userPw.focus();
				return false;
			 }
			 
			 loginService.login(document.ThisForm.userName.value,document.ThisForm.userPw.value,document.ThisForm.userType.value,callback);
		}
		
		function callback(data)
		{
			alert(data);
		    if(data=="no")
		    {
		        alert("用户名或密码错误");
		    }
		    if(data=="yes")
		    {
		        alert("通过验证,系统登录成功");
		        window.location.href="<%=path %>/admin/index.jsp";
		    }
		    
		}
		
		function qing()
		{
		    document.ThisForm.userName.value="";
		    document.ThisForm.userPw.value="";
		}
	</script>
	
  </head>
  
<body id="login">
<div id="login-wrapper" class="png_bg">
  <div id="login-top" style="font-size: 30px;">
                      基于ssh的婴幼儿产品销售系统
  </div> 
  <div id="login-content" style="margin-top: 50px;">
    <form action="0" method="post" name="ThisForm">
      <p>
        <label style="font-family: 微软雅黑">登陆账号：</label>
        <input class="text-input" type="text" name="userName"/>
      </p>
      <div class="clear"></div>
      <p>
        <label style="font-family: 微软雅黑">登陆密码：</label>
        <input class="text-input" type="password" name="userPw"/>
      </p>
      <div class="clear"></div>
      <p style="display: none;">
        <label style="font-family: 微软雅黑">登陆类型：</label>
        <select name="userType" style="width: 210px;margin-left: 18px;" class="text-input" >
            <option value="0">00</option>
            <option value="11">11</option>
        </select>
      </p>
      <div class="clear"></div>
      <p>
        <label>&nbsp;</label>
        <input class="button" type="button" value="登陆" style="width: 80px;" onclick="ccc()"/>
      </p>
      <div class="clear"></div>
    </form>
  </div>
</div>
</body>
</html>
