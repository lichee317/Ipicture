import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.Exception;
import java.sql.*;

public class isRegisterSuccess {	
	String username;
	String password;
	String confirmpassword;
	String gender;
	String age;
	String QQ;
	String mobile;
	String job;
	String degree;
	ResultSet DataSet;
	Statement state;
	
	public isRegisterSuccess(){		
	}	
	public boolean isValidRegisterInformation(HttpServletRequest request, HttpServletResponse response, Connection connection)
	throws Exception{	
		initial(request, connection);		
		request.setCharacterEncoding("gbk");	
		
		if (!isAllDataFilled()) return false; 
		
        if ((DataSet != null && DataSet.next()))
        {  
        	request.setAttribute("msg", "ע��ʧ�ܣ��û����Ѿ�����");
        	return false;
        }
		
		if (!isPasswordValid())
		{  
        	request.setAttribute("msg", "ע��ʧ�ܣ�������������벻ͬ");
        	return false;
        }
		
		state.execute(getSql());
		return true;
	}  
	private void initial(HttpServletRequest request, Connection connection) throws Exception {
    	username = request.getParameter("username").trim();
		password = request.getParameter("password").trim();
		confirmpassword = request.getParameter("confirmpassword").trim();
		gender = request.getParameter("gender").trim();
		age = request.getParameter("age").trim();
		QQ = request.getParameter("QQ").trim();
		mobile = request.getParameter("mobile").trim();
		job = request.getParameter("job").trim();
		degree = request.getParameter("degree").trim();
		state = connection.createStatement();	
		DataSet = state.executeQuery("select * from userinformation where username=" + "'" + username + "'");
	}	
    public boolean isAllDataFilled(){       
		return !(username.equals("") 
            || password.equals("") 
            || confirmpassword.equals("")
		    || gender.equals("") 
            || age.equals("") 
            || QQ.equals("")
		    || mobile.equals("") 
            || job.equals("")
            || degree.equals(""));
	}
   
    public boolean isPasswordValid(){
        return password.equals(confirmpassword);	
    }
    private String getSql() {
    	String sql = "insert into userinformation values(NULL," + "'" + username + "'," +
		"'" + password + "'," + "'" + gender + "'," + "'" + age + "'," + "'" + QQ + "'," + 
		"'" + mobile + "'," + "'" + job + "'," + "'" + degree + "')";
		return sql;
	}
}
