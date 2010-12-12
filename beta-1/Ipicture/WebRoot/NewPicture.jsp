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
	
	<form name="UploadImage_form" method="post" action="UploadImage" id="UploadImage_form">
	
			<div class="NewPicture">
				请输入你要上传的相册：<br /><br />
				<input type="text" name="album_name" id="album_name" /><br /><br />
				请选择你要上传的图片：<br /><br />
				<input type="file" name="filePath" size="50" id="filePath"/><br /><br />
				<input type="submit" name="submit" value="上传" />
			</div>
			
	</form>
	
	<div class="AlbumList">已有相册列表</div>
	
	
	
	<script type="text/javascript">
	<!--
	
	function $(id) { return document.getElementById(id); }
		var form = $('UploadImage_form');
	
	    form.onsubmit = function() {
	    
	    var Albumname=$('album_name').value;
	    var filePath=$('filePath').value;
	    
	    if(Albumname=='')
			{
				alert('请选择您要上传的相册');
				return false;
			}
			
		if(filePath.size==0)
			{
			    alert('请选择您要上传的图片');
				return false;
			}
		
	    };
	    
	 -->
	</script>
	
	
	
	
  </body>
</html>
