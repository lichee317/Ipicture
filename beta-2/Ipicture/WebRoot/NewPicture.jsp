<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'NewPicture.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  <link rel="stylesheet" href="css/NewPicture.css" type="text/css"></link></head>
  
  <body background="img/2.jpg">
    <div class="logo"><img src="img/logo.jpg"></img></div>
	<hr color="#DEDEDE">
	
	<div class="Picture_in_gray"></div>
	
	<div class="Picture_in_white"></div>
	
	<div class="NewPicture">
		请输入你要上传的相册：<br /><br />
		<input type="text" name="album_name" id="album_name" /><br /><br />
		请选择你要上传的图片：<br /><br />
		<input type="file" name="picture_file" /><br /><br />
		<input type="submit" name="submit" value="确定" />
	</div>
	
	<div class="AlbumList">已有相册列表</div>
  </body>
</html>
