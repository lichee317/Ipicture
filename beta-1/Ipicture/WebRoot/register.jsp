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
	����Ҫע��Ϊ <strong>Ipicture</strong> �ײ��û�,���ײͼ۸�Ϊ <strong>ÿ��$0 </strong>��
	</div>
	
	<br />
	<br />
	
	<div class="register_container"><strong>ע���Ա</strong>
		<br /><br />
	
		<form name="register_form" method="post" action="checkRegister" id="register_form">
		
			<div class="register_item">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;�û��� : 
			  <input type="text" name="username" id="username" size="25" height="40px" maxlength="30"/>
		  	</div>
			<br />
			<div class="register_item">
			
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;���룺<input type="password" name="password" id="password" size="25" height="40px" maxlength="30"/>
			</div>
			<br />
			<div class="register_item">
				&nbsp;ȷ�����룺<input type="password" name="confirmpassword" id="confirmpassword" size="25" height="40px" maxlength="30"/>
			</div>
			<br />
			<div class="register_item">
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;�Ա�<input type="radio" name="gender" id="gender" value="boy" checked="checked">��
					  <input type="radio" name="gender" id="gender" value="girl">Ů
			</div>
			<br />
			<div class="register_item">
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;���� ��<input type="text" name="age" id="age" size="5" height="40px" maxlength="30"/>
			</div>
			<br />
			<div class="register_item">
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;QQ��<input type="text" name="QQ" id="QQ" size="25" height="40px" maxlength="30"/>
			</div>
			<br />
			<div class="register_item">
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;�ֻ���<input type="text" name="mobile" id="mobile" size="25" height="40px" maxlength="30"/>
			</div>
			<br />
			<div class="register_item">
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ְҵ��<select name="job" id="job">
						<option value="computer" selected="selected">�����</option>
						<option value="electron">����</option>
						<option value="communication">ͨѶ</option>
						<option value="advertisement">���</option>
						<option value="auto">����</option>
						<option value="finance">����</option>
						<option value="intermediary agent">�н�</option>
						<option value="trade">ó��</option>
						<option value="electrical household appliances">�ҵ�</option>
						<option value="travel">����</option>
						<option value="medical treatment">ҽ��</option>
						<option value="real estate">���ز�</option>
						<option value="civil servant">����ְԱ</option>
						<option value="traffic">��ͨ</option>
						<option value="entertainment">����</option>
						<option value="energy source">��Դ</option>
						<option value="service">����ҵ</option>
						<option value="education">����</option>
						<option value="student">��Уѧ��</option>
						<option value="others">����</option>
					  </select>
			</div>
			<br />
			<div class="register_item">
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ѧ����<select name="degree" id="degree">
						<option value="junior high school" selected="selected">����</option>
						<option value="senior high school">��ר/����</option>
						<option value="junior college">��ר</option>
						<option value="undergraduate">����</option>
						<option value="graduate student">�о���</option>
						<option value="doctor">��ʿ������</option>
					</select>
			</div>
			<br />
			<div class="register_item">
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" name="Submit" value="�ύ" />&nbsp;&nbsp;<input type="reset" name="Reset" value="����" />
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
				alert('����д��������Ϣ');
				return false;
			}
			
			
		};
		
		-->
		</script>
	
	<div class="illustration">ע���ΪIpicture�û����˽���ྫ�ʣ�	</div>
	<br />
	
	<div class="search_friend">
		<img src="img/search.jpg" />������<br />

Ipicture�������Ƶ�����ϵͳ�������ҵ������ѣ���ʶ�����ѣ�
	</div>
	
	<br />
	<div class="upload_img">
		<img src="img/upload.jpg" />����Ƭ<br />

�ϴ��Լ���������Ƭ�����߰���ϲ�����κ���/��/�Ｏ�ϳ�ר����ᡣ
	</div> 
	
	
	
	
		
  </body>
</html>
