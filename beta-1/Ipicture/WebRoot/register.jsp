<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'register.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" href="css/register.css" type="text/css"></link></head>
  
  <body>
	<div class="logo"><img src="img/logo.jpg"></img></div>
	<hr color="#DEDEDE">
	
	<div class="title_img"><img src="img/4.jpg"></img>
	你正要注册为 <strong>Ipicture</strong> 套餐用户,该套餐价格为 <strong>每月$0 </strong>。
	</div>
	
	<br />
	<br />
	
	<div class="register_container"><strong>注册会员</strong>
		<br /><br />
	
		<form name="register_form" method="post" action="checkRegister" id="register_form">
		
			<div class="register_item">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;用户名 : 
			  <input type="text" name="username" id="username" size="25" height="40px" maxlength="30"/>
		  	</div>
			<br />
			<div class="register_item">
			
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;密码：<input type="password" name="password" id="password" size="25" height="40px" maxlength="30"/>
			</div>
			<br />
			<div class="register_item">
				&nbsp;确认密码：<input type="password" name="confirmpassword" id="confirmpassword" size="25" height="40px" maxlength="30"/>
			</div>
			<br />
			<div class="register_item">
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;性别：<input type="radio" name="gender" id="gender" value="boy" checked="checked">男
					  <input type="radio" name="gender" id="gender" value="girl">女
			</div>
			<br />
			<div class="register_item">
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;年龄 ：<input type="text" name="age" id="age" size="5" height="40px" maxlength="30"/>
			</div>
			<br />
			<div class="register_item">
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;QQ：<input type="text" name="QQ" id="QQ" size="25" height="40px" maxlength="30"/>
			</div>
			<br />
			<div class="register_item">
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;手机：<input type="text" name="mobile" id="mobile" size="25" height="40px" maxlength="30"/>
			</div>
			<br />
			<div class="register_item">
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;职业：<select name="job" id="job">
						<option value="computer" selected="selected">计算机</option>
						<option value="electron">电子</option>
						<option value="communication">通讯</option>
						<option value="advertisement">广告</option>
						<option value="auto">汽车</option>
						<option value="finance">金融</option>
						<option value="intermediary agent">中介</option>
						<option value="trade">贸易</option>
						<option value="electrical household appliances">家电</option>
						<option value="travel">旅游</option>
						<option value="medical treatment">医疗</option>
						<option value="real estate">房地产</option>
						<option value="civil servant">政府职员</option>
						<option value="traffic">交通</option>
						<option value="entertainment">娱乐</option>
						<option value="energy source">能源</option>
						<option value="service">服务业</option>
						<option value="education">教育</option>
						<option value="student">在校学生</option>
						<option value="others">其他</option>
					  </select>
			</div>
			<br />
			<div class="register_item">
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;学历：<select name="degree" id="degree">
						<option value="junior high school" selected="selected">初中</option>
						<option value="senior high school">中专/高中</option>
						<option value="junior college">大专</option>
						<option value="undergraduate">本科</option>
						<option value="graduate student">研究生</option>
						<option value="doctor">博士或以上</option>
					</select>
			</div>
			<br />
			<div class="register_item">
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" name="Submit" value="提交" />&nbsp;&nbsp;<input type="reset" name="Reset" value="重置" />
			</div>			
		</form>
		<em><%=(request.getAttribute("msg")==null)?"":request.getAttribute("msg") %></em>
	</div>
	
	<script type="text/javascript">
		<!--
		
		function $(id) { return document.getElementById(id); }
		var form = $('register_form');
		form.onsubmit = function() {

			var username=$('username').value;
			var password=$('password').value;
			var confirmpassword=$('confirmpassword').value;
			var gender=$('gender').value;
			var age=$('age').value;
			var QQ=$('QQ').value;
			var mobile=$('mobile').value;
			var job=$('job').value;
			var degree=$('degree').value;
			
			if(username==''||password==''||confirmpassword==''||gender==''||age==''||QQ==''||mobile==''||job==''||degree=='')
			{
				alert('请填写完整的信息');
				return false;
			}
			
			
		};
		
		-->
		</script>
	
	<div class="illustration">注册成为Ipicture用户，了解更多精彩！	</div>
	<br />
	
	<div class="search_friend">
		<img src="img/search.jpg" />找朋友<br />

Ipicture具有完善的搜索系统，帮你找到老朋友，结识新朋友！
	</div>
	
	<br />
	<div class="upload_img">
		<img src="img/upload.jpg" />传照片<br />

上传自己的生活照片，或者把你喜欢的任何人/事/物集合成专门相册。
	</div> 
	
	
	
	
		
  </body>
</html>
