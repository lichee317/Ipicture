import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.Exception;
import java.sql.*;

public class isValid {
	String username;
	String password;
	ResultSet dataset;
	public isValid(){
	}
	public boolean isUserValid(HttpServletRequest request,HttpServletResponse response,Connection connection)
		throws Exception{
		getUsernameAndPassword(request);
		getDataSet(connection);
		
		//if (!isUsernameExisted()) return false;
		if(dataset == null && !dataset.next())
		{
			return false;
		}
		
		if (!isNamePassWordMatch()) return false;	
		request.setAttribute("username", username);
		return true;
	}
	public void getUsernameAndPassword(HttpServletRequest request){
		username = request.getParameter("username");
		password = request.getParameter("password");
		username = username.trim();
		password = password.trim();
	}
	public void getDataSet(Connection connection) throws Exception{
		Statement state = connection.createStatement();
		dataset = state.executeQuery("select * from userinformation where username=" + "'" + username + "'");
	}
    
    public boolean isNamePassWordMatch() throws Exception{
		String passwordIndataset = null;
		while (dataset.next()) {
			passwordIndataset = dataset.getString("password");
		}
        return password.equals(passwordIndataset);
	}
}





