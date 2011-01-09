import junit.framework.TestCase;
import java.io.*;
import org.xml.sax.*;
import com.meterware.httpunit.*;

public class TestForm extends TestCase {

	
	
	public void TestForm1()
	{
		WebConversation wc = new WebConversation();
		WebResponse wr = null;
		WebRequest reqs = new GetMethodWebRequest( "http://127.0.0.1:8080/ipicture/home.jsp"); 
		reqs = new GetMethodWebRequest( "http://127.0.0.1:8080/ipicture/Album.jsp"); 
		reqs = new GetMethodWebRequest( "http://127.0.0.1:8080/ipicture/RegisterSuccess.jsp"); 
			
		WebResponse resps = null;
		try {
			resps = wc.getResponse( reqs );		
			System.out.println( resps.getText() ); 
			
			//��ñ�����
			WebForm[] webForms = resps.getForms();
			//��ñ������пؼ�������		
			String[] pNames = webForms[0].getParameterNames(); 
			int i = 0; 
			int m = pNames.length; 
			//ѭ����ʾ�������пؼ������� 
			while(i<m){ 
				System.out.println("��"+(i+1)+"���ؼ���������"+pNames[i]+"�������������"
						+webForms[0].getParameterValue(pNames[i])); 
				++i; 
			} 		
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		}

	}
}
