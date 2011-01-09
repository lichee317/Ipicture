import junit.framework.TestCase;
import java.io.*;
import org.xml.sax.*;
import com.meterware.httpunit.*;


public class TestPages extends TestCase {
	
	public void testHomePage()
	{
		WebConversation wc = new WebConversation();
		WebResponse wr = null;
		try 
		{
			wr = wc.getResponse( "http://127.0.0.1:8080/ipicture/Home.jsp" );
			System.out.println( wr.getText() );
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		} 
		catch (SAXException e) 
		{
			e.printStackTrace();
		}
		

	}
	
	public void testAlBumPage()
	{
		WebConversation wc = new WebConversation();
		WebResponse wr = null;
		try 
		{
			wr = wc.getResponse( "http://127.0.0.1:8080/ipicture/Album.jsp" );
			System.out.println( wr.getText() );
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		} 
		catch (SAXException e) 
		{
			e.printStackTrace();
		}
	}
	

	public void testIndexPage()
	{
		WebConversation wc = new WebConversation();
		WebResponse wr = null;
		try 
		{
			wr = wc.getResponse( "http://127.0.0.1:8080/ipicture" );
			System.out.println( wr.getText() );
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		} 
		catch (SAXException e) 
		{
			e.printStackTrace();
		}
	}
	
	public void testNewAlbumPage()
	{
		WebConversation wc = new WebConversation();
		WebResponse wr = null;
		try 
		{
			wr = wc.getResponse( "http://127.0.0.1:8080/ipicture/Album.jsp" );
			System.out.println( wr.getText() );
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		} 
		catch (SAXException e) 
		{
			e.printStackTrace();
		}
	}
	
	public void testRegisterPage()
	{
		WebConversation wc = new WebConversation();
		WebResponse wr = null;
		try 
		{
			wr = wc.getResponse( "http://127.0.0.1:8080/ipicture/RegisterSuccess.jsp" );
			System.out.println( wr.getText() );
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		} 
		catch (SAXException e) 
		{
			e.printStackTrace();
		}
	}
	
	public void testSearchFriend()
	{
		WebConversation wc = new WebConversation();
		WebResponse wr = null;
		try 
		{
			wr = wc.getResponse( "http://127.0.0.1:8080/ipicture/SearchFriend.jsp" );
			System.out.println( wr.getText() );
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		} 
		catch (SAXException e) 
		{
			e.printStackTrace();
		}
	}
	
}





