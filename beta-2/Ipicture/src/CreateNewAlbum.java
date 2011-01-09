import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class CreateNewAlbum {
	
	 public CreateNewAlbum()
	 {
		 
	 }
	 
	 public boolean CreateNewAlbum(HttpServletRequest request,HttpServletResponse response,Connection con) 
	 throws Exception
	 {
		 	String stralbumname = request.getParameter("albumname").trim();
			String strdescription = request.getParameter("description").trim();
			
			HttpSession session = request.getSession(true);
			String strusername = (String) session.getAttribute("Username");
			
			Statement stmt = con.createStatement();
			
			request.setCharacterEncoding("gbk");
			
			if (stralbumname.equals(""))
			{
				return false;//没有输入相册名称
			}
			
			ResultSet rst = stmt.executeQuery( "select * from album where albumname="
					+ "'" + stralbumname + "'"
					+ "and username=" + "'" + strusername + "'");
			
			if (rst != null && rst.next())
			{//数据库结果集不为空，相册名已存在
				request.setAttribute("msg", "创建失败，相册已经存在");
				return false;
			}
			
			String sql = "insert into album values(" + "'" + strusername + "'" + ","
						+ "'" + stralbumname + "'" + ","
						+ "'" + strdescription + "'" + ")";
			
			stmt.execute(sql);
			
			request.setAttribute("username", strusername);
			
			return true;
			
			
			
			
			
	 }
	 
}
