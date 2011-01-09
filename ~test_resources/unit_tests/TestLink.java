import junit.framework.TestCase;
import java.io.*;

import org.xml.sax.*;

import com.meterware.httpunit.*;

public class TestLink extends TestCase {
	
	WebConversation wc = new WebConversation(); 
	WebResponse resp;
	
	public void initTest()
	{
		System.out.println("��ȡҳ��������ָ��ҳ������ݣ�"); 
		//����һ��WebConversationʵ�� 
		
		//��ȡ��Ӧ���� 
		
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
		
			
			//���ҳ�����Ӷ��� 
			WebLink[] link = resp.getLinks();
			String linkURL = link[1].getURLString();
			String linkName = link[1].getName();
			String linkText = link[1].getText();
			String linkID = link[1].getID();
			System.out.println("linkURL:"+linkURL +"\n");
			System.out.print("linkName:"+linkName+"\n");
			System.out.print("linkText:"+linkText+"\n");
			System.out.print("linkID:"+linkID+"\n");
			//ģ���û������¼� 
			link[0].click(); 		
						
			//��õ�ǰ����Ӧ���� 
			WebResponse nextLink = wc.getCurrentPage(); 
			//��getText������ȡ��Ӧ��ȫ������ 
			//��System.out.println����ȡ�����ݴ�ӡ�ڿ���̨�� 
			System.out.println( nextLink.getText() ); 			

	}


}
