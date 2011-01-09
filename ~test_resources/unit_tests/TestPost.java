import junit.framework.TestCase;
import java.io.*;
import org.xml.sax.*;
import com.meterware.httpunit.*;

public class TestPost extends TestCase {
	
	public void test1()
	{
		WebConversation wc = new WebConversation();
		WebResponse wr = null;
		String userSession = "" ;
		try {
			wr = wc.getResponse( "http://127.0.0.1:8080/ipicture/Home.jsp" );
			String responseText = wr.getText() ;
			System.out.println( responseText );
			String toFind = "userSession value=";
			int LB = responseText.indexOf(toFind) + toFind.length();
			int RB = responseText.indexOf(">",LB);			
			userSession = responseText.substring(LB,RB);
			
			System.out.println("userSession value = " + userSession);
			

		} catch (IOException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		}


	System.out.println("向服务器发送数据，然后获取网页内容："); 
	//建立一个WebConversation实例 
	//WebConversation wc = new WebConversation(); 
	//向指定的URL发出请求 
	WebRequest req = new PostMethodWebRequest( "http://127.0.0.1:8080/ipicture/home.jsp");
	//给请求加上参数 
	req.setParameter("userSession",userSession);
	req.setParameter("username","test");
	req.setParameter("password","test");
	req.setParameter("JSFormSubmit","off");
	req.setParameter("login.x","54");
	req.setParameter("login.y","13");

	//获取响应对象 
	WebResponse resp;
	try {
		resp = wc.getResponse( req );		
		//用getText方法获取相应的全部内容 
		//用System.out.println将获取的内容打印在控制台上 
		System.out.println( resp.getText() ); 
	} catch (IOException e) {
		e.printStackTrace();
	} catch (SAXException e) {
		e.printStackTrace();
	}
	}

}
