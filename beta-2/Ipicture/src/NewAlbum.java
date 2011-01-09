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
			
			if (rst != null && rst.next())//数据库结果集不为空，相册名已存在;rst.next()判断结果集rst是否有记录，并且将指针后移一位
			{
				request.setAttribute("msg", "创建失败，相册已经存在");
				return false;
			}
			
			ExecuteSQL(request,con);				
			
			return true;
		}
	 
	 public void InitialParameters(HttpServletRequest request,Connection con)
	 {
		    str_albumname = request.getParameter("albumname").trim();
			str_description = request.getParameter("description").trim();
			
			HttpSession session = request.getSession(true);//通过session获取一个长期有效地用户名，便于跳转到其他页面的时候仍然可以使用
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
	 
