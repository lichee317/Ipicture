import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class NewAlbum {
	String str_albumname;
	String str_description;
	String str_username;
	
	 public NewAlbum()
	 {
		 
	 }
	 
	 public boolean CreateNewAlbum(HttpServletRequest request,HttpServletResponse response,Connection con) 
	 throws Exception
	 {
		    InitialParameters(request,con);
						
			ResultSet rst=GetAlbumExisted(request,con);
			
			if (rst != null && rst.next())//���ݿ�������Ϊ�գ�������Ѵ���;rst.next()�жϽ����rst�Ƿ��м�¼�����ҽ�ָ�����һλ
			{
				request.setAttribute("msg", "����ʧ�ܣ�����Ѿ�����");
				return false;
			}
			
			ExecuteSQL(request,con);				
			
			return true;
		}
	 
	 public void InitialParameters(HttpServletRequest request,Connection con)
	 {
		    str_albumname = request.getParameter("albumname").trim();
			str_description = request.getParameter("description").trim();
			
			HttpSession session = request.getSession(true);//ͨ��session��ȡһ��������Ч���û�����������ת������ҳ���ʱ����Ȼ����ʹ��
			str_username = (String) session.getAttribute("Username");
	 }
	 
	 
	 public ResultSet GetAlbumExisted(HttpServletRequest request,Connection con) throws Exception
	 {
			
			 Statement stmt = con.createStatement();	
			 request.setCharacterEncoding("gbk");
			 ResultSet rst = stmt.executeQuery( "select * from album where albumname=" + "'" + str_albumname + "'" + "and username=" + "'" + str_username + "'");
			 return rst;
		 
	 }
	 
	 
	 public void ExecuteSQL(HttpServletRequest request,Connection con) throws Exception
	 {
			 Statement stmt = con.createStatement();
			 request.setCharacterEncoding("gbk");
			 String sql = "insert into album values(" + "'" + str_username + "'" + ","+ "'" + str_albumname + "'" + "," + "'" + str_description + "'" + ")";
			 stmt.execute(sql);
			 		 
	 }
	 
	 
	 
}
	 
