<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="pragma" content="no-cache" />
		<meta http-equiv="cache-control" content="no-cache" />
		<meta http-equiv="expires" content="0" />
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3" />
		<meta http-equiv="description" content="This is my page" />

		<link rel="stylesheet" type="text/css" href="<%=path %>/css/base.css" />
		
        <script language="javascript">
           function cuxiaoDel(id)
           {
               if(confirm('您确定删除吗？'))
               {
                   window.location.href="&lt;%=path %>/cuxiaoDel.action?id="+id;
               }
           }
       </script>
	</head>

	<body leftmargin="9" topmargin="9" background='<%=path %>/img/allbg.gif'>
			<table width="98%" border="0" cellpadding="2" cellspacing="1" bgcolor="#D1DDAA">
				<tr bgcolor="#E7E7E7">
					<td height="14" colspan="14" background="<%=path %>/img/tbg.gif">&nbsp;&nbsp;</td>
				</tr>
				<tr align="center" bgcolor="#FAFAF1" height="22">
					<td width="4%">序号</td>
					<td width="30%">信息标题</td>
					<td width="10%">发布时间</td>
					<td width="10%">操作</td>
		        </tr>	
				<s:iterator value="#request.cuxiaoList" id="cuxiao" status="ss">
				<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='red';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
					<td bgcolor="#FFFFFF" align="center">
						<s:property value="#ss.index+1"/>
					</td>
					<td bgcolor="#FFFFFF" align="center">
						<s:property value="#cuxiao.biaoti"/>
					</td>
					<td bgcolor="#FFFFFF" align="center">
						<s:property value="#cuxiao.fabushi"/>
					</td>
					<td bgcolor="#FFFFFF" align="center">
						<input type="button" value="删除" onclick="cuxiaoDel(<s:property value="#cuxiao.id"/>)"/>
					</td>
				</tr>
				</s:iterator>
			</table>
	</body>
</html>
