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
		
		if (strname.equals("") || strpassword.equals(""))//û��д�û���������
		{
			
			return false;
		}
		
		ResultSet rst = stmt.executeQuery("select * from userinformation where username=" + "'" + strname + "'");
		
		if (rst == null && !rst.next())//���ݿ�����Ϊ��
		{
			return false;
		}

		String strName = "", strPwd = "";
		while (rst.next()) {
			strName = rst.getString("username");
			strPwd = rst.getString("password");
		}
		

		if (!strname.equals(strName) || !strpassword.equals(strPwd))//�û��������벻ƥ��
		{
			return false;
		}
		
		request.setAttribute("username", strname);
		
		return true;
		
	}
	
}
