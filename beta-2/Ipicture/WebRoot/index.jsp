<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" href="css/index.css" type="text/css"></link>
	
</head>
  
  <body>
  
	<div class="logo"><img src="img/logo.jpg"></img></div>
	<hr color="#DEDEDE">
	
	<div class="log_in_gray"></div>
	<div class="log_in_white"></div>
	<div class="log_in_information"><b>会员登录</b></div>
	
	<div class="username_password">
		<form name="login_form" method="post" id="login_form" action="checkLogin">
			用户名：
			<br />
			  <input type="text" name="username" id="username" size="50" height="40px" maxlength="30"/>
			<br /><br />
			密&nbsp;&nbsp;码：
			<br />
			<input type="password" name="password" id="password" size="50" height="40px" maxlength="30"/>
			<br /><br />
			<input type="submit" name="Submit" value="登录" /> &nbsp;&nbsp; 
			<a href="register.jsp">注册会员</a>&nbsp;&nbsp;
			<a href="forget password">忘记密码</a>

		</form>
		<em><%=(request.getAttribute("msg")==null)?"":request.getAttribute("msg") %></em>
		
		<script type="text/javascript">
		<!--
		
		function $(id) { return document.getElementById(id); }
		var form = $('login_form');
		form.onsubmit = function() {

			var username=$('username').value;
			var password=$('password').value;
			
			if(username==''||password=='')
			{
				alert('请输入用户名和密码');
				return false;
			}
			
			
		};
		
		-->
		</script>
		
	</div>
	


		
	<div class="copyright">	
	<table class="table">
		<tr>
			<td width="100"><a href="123">联系我们</a></td> 
			<td width="100"><a href="456">公司简介</a></td> 
			<td width="100"><a href="789">诚征英才</a></td>
		</tr>
	</table>
	<br />
	Tel:15017566574  QQ:527257398 
		<br/ >
		<br />    
		粤ICP备123456789号  ? 2007-2010   black&white All Right Reserved			
	</div>
	
	<div class="backgroundimg"><img src="img/3.jpg"></img></div>

  	
  </body>
</html>
