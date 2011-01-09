import junit.framework.TestCase;
import java.io.*;

import org.xml.sax.*;

import com.meterware.httpunit.*;

public class TestLink extends TestCase {
	
	WebConversation wc = new WebConversation(); 
	WebResponse resp;
	
	public void initTest()
	{
		System.out.println("获取页面中链接指向页面的内容："); 
		//建立一个WebConversation实例 
		
		//获取响应对象 
		
		try {
			resp = wc.getResponse( "http://127.0.0.1:8080/ipicture/home.jsp" );
			resp = wc.getResponse( "http://127.0.0.1:8080/ipicture/Album.jsp" );

			String respText = resp.getText();
			System.out.println(respText);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} 
		
	}
		
	public  void testLink1() throws SAXException, IOException
	{
		
			
			//获得页面链接对象 
			WebLink[] link = resp.getLinks();
			String linkURL = link[1].getURLString();
			String linkName = link[1].getName();
			String linkText = link[1].getText();
			String linkID = link[1].getID();
			System.out.println("linkURL:"+linkURL +"\n");
			System.out.print("linkName:"+linkName+"\n");
			System.out.print("linkText:"+linkText+"\n");
			System.out.print("linkID:"+linkID+"\n");
			//模拟用户单击事件 
			link[0].click(); 		
						
			//获得当前的响应对象 
			WebResponse nextLink = wc.getCurrentPage(); 
			//用getText方法获取相应的全部内容 
			//用System.out.println将获取的内容打印在控制台上 
			System.out.println( nextLink.getText() ); 			

	}


}
