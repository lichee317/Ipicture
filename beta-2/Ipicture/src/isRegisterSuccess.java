import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.*;


public class isRegisterSuccess {
	
	public isRegisterSuccess(){
		
	}
	
	public boolean isValidRegisterInformation(HttpServletRequest request,HttpServletResponse response,Connection con)
	throws Exception{
		
		Statement stmt = con.createStatement();
		
		request.setCharacterEncoding("gbk");
		
		String strname = request.getParameter("username").trim();
		String strpassword = request.getParameter("password").trim();
		String strconfirmpassword = request.getParameter("confirmpassword").trim();
		String strgender = request.getParameter("gender").trim();
		String strage = request.getParameter("age").trim();
		String strQQ = request.getParameter("QQ").trim();
		String strmobile = request.getParameter("mobile").trim();
		String strjob = request.getParameter("job").trim();
		String strdegree = request.getParameter("degree").trim();
		
		
		if (strname.equals("") || strpassword.equals("") || strconfirmpassword.equals("")
				|| strgender.equals("") || strage.equals("") || strQQ.equals("")
				|| strmobile.equals("") || strjob.equals("") || strdegree.equals("")) {
			return false;//û��дĳһ��Ϣ
		}
		
		ResultSet rst = stmt.executeQuery("select * from userinformation where username=" + "'" + strname + "'");
		
		if (rst != null && rst.next())
		{//���ݿ�������Ϊ�գ��û����Ѵ���
			request.setAttribute("msg", "ע��ʧ�ܣ��û����Ѿ�����");
			return false;
		}
	
		if (!strpassword.equals(strconfirmpassword))
		{
			request.setAttribute("msg", "ע��ʧ�ܣ�������������벻ͬ");
			return false;//������������벻ͬ
		}
		
		String sql = "insert into userinformation values(NULL," + "'" + strname + "'," +
		"'" + strpassword + "'," + "'" + strgender + "'," + "'" + strage + "'," + "'" + strQQ + "'," + 
		"'" + strmobile + "'," + "'" + strjob + "'," + "'" + strdegree + "')";
		
		stmt.execute(sql);
		return true;
	}
	

}
