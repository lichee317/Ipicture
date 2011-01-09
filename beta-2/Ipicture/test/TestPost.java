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


	System.out.println("��������������ݣ�Ȼ���ȡ��ҳ���ݣ�"); 
	//����һ��WebConversationʵ�� 
	//WebConversation wc = new WebConversation(); 
	//��ָ����URL�������� 
	WebRequest req = new PostMethodWebRequest( "http://127.0.0.1:8080/ipicture/home.jsp");
	//��������ϲ��� 
	req.setParameter("userSession",userSession);
	req.setParameter("username","test");
	req.setParameter("password","test");
	req.setParameter("JSFormSubmit","off");
	req.setParameter("login.x","54");
	req.setParameter("login.y","13");

	//��ȡ��Ӧ���� 
	WebResponse resp;
	try {
		resp = wc.getResponse( req );		
		//��getText������ȡ��Ӧ��ȫ������ 
		//��System.out.println����ȡ�����ݴ�ӡ�ڿ���̨�� 
		System.out.println( resp.getText() ); 
	} catch (IOException e) {
		e.printStackTrace();
	} catch (SAXException e) {
		e.printStackTrace();
	}
	}

}
