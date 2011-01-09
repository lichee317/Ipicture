
import java.sql.*;

public class db_helper {
	
	private Connection con;
	
	public db_helper(){
	}
	
	public void db_open() {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			con=java.sql.DriverManager.getConnection("jdbc:mysql://localhost/ipicture?characterEncoding=gbk","root","123");
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void db_close(){
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Connection getConnection(){
		return con;
	}
	
	
	

}
