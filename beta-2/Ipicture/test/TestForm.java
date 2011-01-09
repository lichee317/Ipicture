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
			
			//获得表单对象
			WebForm[] webForms = resps.getForms();
			//获得表单中所有控件的名字		
			String[] pNames = webForms[0].getParameterNames(); 
			int i = 0; 
			int m = pNames.length; 
			//循环显示表单中所有控件的内容 
			while(i<m){ 
				System.out.println("第"+(i+1)+"个控件的名字是"+pNames[i]+"，里面的内容是"
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
