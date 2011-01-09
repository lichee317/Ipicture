import static org.junit.Assert.*;
import junit.framework.TestCase;

import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;
import junit.framework.TestCase;

import com.mysql.jdbc.ResultSet;
import com.sun.corba.se.pept.transport.Connection;


public class db_helperTest {
	private Connection testconnection;

	@Test
	public void testDb_helper() {
		System.out.println("initialize db_helper");
	}

	@Test
	public void testDb_open(){
		db_helper testcon = new db_helper();
		try{
			Statement stmt = testcon.db_open().createStatement();
			ResultSet rst1 = (ResultSet) stmt.executeQuery("select * from userinformation");
			assertNotNull(rst1);
			ResultSet rst2 =(ResultSet) stmt.executeQuery("select count(*) from userinformation");
			int count=1;
			while(rst2.next()){
			    count++;
			}
			assertEquals(2,count);

		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
	}

	@Test
	public void testDb_close() {
		db_helper testcon = new db_helper();
		try{
			Statement stmt = testcon.db_close().createStatement();
			ResultSet rst = (ResultSet) stmt.executeQuery("select * from userinformation");
			assertNull(rst);
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
	}

	@Test
	public void testGetConnection() {
		db_helper testcon = new db_helper();
		testconnection = (Connection) testcon.getConnection(); 
		assertNotNull(testconnection);
		System.out.println("get not null db connection");
	}
	
	@Test(timeout = 1000)
	public void infinity() {
	while (true);
	}
	
	
	
	

}
