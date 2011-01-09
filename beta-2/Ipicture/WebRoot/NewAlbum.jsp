<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'NewAlbum.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  <link rel="stylesheet" href="css/NewAlbum.css" type="text/css"></link></head>
  
  <body background="img/2.jpg">
	<div class="logo"><img src="img/logo.jpg"></img></div>
	<hr color="#DEDEDE">
	
	<div class="Album_in_gray"></div>
	
	<div class="Album_in_white"></div>
	
	<div class="NewAlbum">
		<form name="NewAlbum_form" method="post" id="NewAlbum_form" action="CreateAlbum">
			请输入新建相册的名称：<br />
			<input name="albumname" type="text" id="albumname" size=15 /><br /><br />
			相册描述:<br />
			<textarea name="description" id="description"/></textarea><br /><br />
			
			<input type="submit" name="submit" value="确定" />
		</form>
		<em><%=(request.getAttribute("msg")==null)?"":request.getAttribute("msg") %></em>
	</div>
	
	<script type="text/javascript">
		<!--
		
		function $(id) { return document.getElementById(id); }
		var form = $('NewAlbum_form');
		form.onsubmit = function() {

			var albumname=$('albumname').value;
			var description=$('description').value;

			
			if(albumname=='')
			{
				alert('请填写相册名称');
				return false;
			}
			
			
		};
		
		-->
		</script>
	
  </body>
</html>
