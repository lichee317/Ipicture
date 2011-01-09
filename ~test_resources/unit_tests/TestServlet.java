import junit.framework.TestCase;
import java.io.*;
import org.xml.sax.*;
import com.meterware.httpunit.*;
import com.meterware.servletunit.InvocationContext;
import com.meterware.servletunit.ServletRunner;
import com.meterware.servletunit.ServletUnitClient;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class TestServlet extends TestCase {
	
	public void TestCheckLoginServlet()
	{
		//����Servlet�����л��� 
		ServletRunner sr = new ServletRunner(); 
		//�򻷾���ע��Servlet 
		sr.registerServlet( "checkLogin", checkLogin.class.getName() );
		//��������Servlet�Ŀͻ��� 
		ServletUnitClient sc = sr.newClient(); 
		//�������� 
		WebRequest request = new GetMethodWebRequest( "http://127.0.0.1:8080/checkLogin" ); 
		//���ģ�����������Ϣ 
		WebResponse response;
		try {
			response = sc.getResponse( request );		
			//����õĽ����ӡ������̨�� 
			System.out.println(response.getText()); 
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} 
		
	}
	
	
	public  void ServletInternelTest(){
		//����Servlet�����л��� 
		ServletRunner sr = new ServletRunner(); 
		//�򻷾���ע��Servlet 
		sr.registerServlet( "checkLogin", checkLogin.class.getName() ); 
		//��������Servlet�Ŀͻ��� 
		ServletUnitClient sc = sr.newClient(); 
		//�������� 
		WebRequest request = new GetMethodWebRequest( "http://localhost:8080/ipicture/checkLogin" ); 
		request.setParameter("firstname","test");
		request.setParameter("lastname","test");

		WebResponse response;
		try {
			response = sc.getResponse( request );		
			//����õĽ����ӡ������̨�� 
			System.out.println(response.getText()); 
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} 
		
		InvocationContext ic;
		try {
			//��ø�����������Ļ��� 
			ic = sc.newInvocation( request );
			
			//����Servlet�ķǷ��񷽷� 
			checkLogin rpe = (checkLogin)ic.getServlet(); 
			rpe.init(); 
			
			//ֱ��ͨ�������Ļ��request���� 
			System.out.println("request�л�ȡ�����ݣ�"+ic.getRequest().getParameter("firstname"));
			System.out.println("request�л�ȡ�����ݣ�"+ic.getRequest().getParameter("lastname")); 
			
			//ֱ��ͨ�������Ļ��response����,������ͻ��������Ϣ 
			ic.getResponse().getWriter().write("haha"); 

			//ֱ��ͨ�������Ļ��session���󣬿���session���� 
			//��session��ֵ 
			ic.getRequest().getSession().setAttribute("username","timeson"); 
			//��ȡsession��ֵ 
			System.out.println("session�е�ֵ��"+ic.getRequest().getSession().getAttribute("username")); 

			//ʹ�ÿͻ��˻�ȡ������Ϣ�����Ҵ�ӡ���� 
			response = ic.getServletResponse(); 
			System.out.println(response.getText()); 
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ServletException e) {
			e.printStackTrace();
		} 
		
	}



}
