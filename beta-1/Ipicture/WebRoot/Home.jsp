<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Home.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  <link rel="stylesheet" href="css/Home.css" type="text/css"></link>
  
  </head>
  <body background="img/2.jpg">
    <div class="logo"><img src="img/logo.jpg"></img></div>
	<hr color="#DEDEDE" />

	<div class="icon"><img src="img/personal_icon4.jpg"></img>
	<br />大头像
	<br /><br /><strong>Welcome Back,<%=request.getAttribute("username") %></strong>

	</div>
		
	<div class="album_thumb">
	<P>
	进入相册
	<P>
	<a href="Album.jsp"><img src="img/album_thumb.jpg"></img></a>
	</div>
	
	<div class="notice_board">
		<img src="img/notice3.gif"></img>
		<marquee direction="up" loop="-1" hspace="20" vspace="10">
				 你好，欢迎光临<br /><br />
				 这里是Ipicture爱图网<br /><br />
				 让我们与您分享您的点点快乐<br /><br />
				 让我们与您分担您的片片忧伤<br /><br />
		</marquee>
	</div>
	
	
	<div class="operation">
		<table class="operation_buttom" align="center">
			<tr height= 80>
				<td><img src="img/buttom.jpg"></img> <a href="NewAlbum.jsp">创建相册</td>
			</tr>
			
			<tr height= 80>
				<td><img src="img/buttom.jpg"></img> <a href="NewPicture.jsp">上传图片</td>
			</tr>
			
			<tr height= 80>
				<td><img src="img/buttom.jpg"></img> <a href="SearchFriend.jsp">搜索好友</td>
			</tr>
			
		</table>
	</div>
	
	<div class="friendlist">好友列表
	</div>
  </body>
</html>
