import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.*;


public class isValid {
	
	public isValid(){
	}
	
	public boolean isValidUser(HttpServletRequest request,HttpServletResponse response,Connection con) 
	throws Exception{
		
		Statement stmt = con.createStatement();
		
		String strname = request.getParameter("username");
		String strpassword = request.getParameter("password");
		
		strname = strname.trim(); 
		strpassword = strpassword.trim();
		
		if (strname.equals("") || strpassword.equals(""))//没填写用户名或密码
		{
			
			return false;
		}
		
		ResultSet rst = stmt.executeQuery("select * from userinformation where username=" + "'" + strname + "'");
		
		if (rst == null && !rst.next())//数据库结果集为空
		{
			return false;
		}

		String strName = "", strPwd = "";
		while (rst.next()) {
			strName = rst.getString("username");
			strPwd = rst.getString("password");
		}
		

		if (!strname.equals(strName) || !strpassword.equals(strPwd))//用户名与密码不匹配
		{
			return false;
		}
		
		request.setAttribute("username", strname);
		
		return true;
		
	}
	
}
