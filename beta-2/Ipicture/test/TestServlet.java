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
		//创建Servlet的运行环境 
		ServletRunner sr = new ServletRunner(); 
		//向环境中注册Servlet 
		sr.registerServlet( "checkLogin", checkLogin.class.getName() );
		//创建访问Servlet的客户端 
		ServletUnitClient sc = sr.newClient(); 
		//发送请求 
		WebRequest request = new GetMethodWebRequest( "http://127.0.0.1:8080/checkLogin" ); 
		//获得模拟服务器的信息 
		WebResponse response;
		try {
			response = sc.getResponse( request );		
			//将获得的结果打印到控制台上 
			System.out.println(response.getText()); 
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} 
		
	}
	
	
	public  void ServletInternelTest(){
		//创建Servlet的运行环境 
		ServletRunner sr = new ServletRunner(); 
		//向环境中注册Servlet 
		sr.registerServlet( "checkLogin", checkLogin.class.getName() ); 
		//创建访问Servlet的客户端 
		ServletUnitClient sc = sr.newClient(); 
		//发送请求 
		WebRequest request = new GetMethodWebRequest( "http://localhost:8080/ipicture/checkLogin" ); 
		request.setParameter("firstname","test");
		request.setParameter("lastname","test");

		WebResponse response;
		try {
			response = sc.getResponse( request );		
			//将获得的结果打印到控制台上 
			System.out.println(response.getText()); 
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} 
		
		InvocationContext ic;
		try {
			//获得该请求的上下文环境 
			ic = sc.newInvocation( request );
			
			//调用Servlet的非服务方法 
			checkLogin rpe = (checkLogin)ic.getServlet(); 
			rpe.init(); 
			
			//直接通过上下文获得request对象 
			System.out.println("request中获取的内容："+ic.getRequest().getParameter("firstname"));
			System.out.println("request中获取的内容："+ic.getRequest().getParameter("lastname")); 
			
			//直接通过上下文获得response对象,并且向客户端输出信息 
			ic.getResponse().getWriter().write("haha"); 

			//直接通过上下文获得session对象，控制session对象 
			//给session赋值 
			ic.getRequest().getSession().setAttribute("username","timeson"); 
			//获取session的值 
			System.out.println("session中的值："+ic.getRequest().getSession().getAttribute("username")); 

			//使用客户端获取返回信息，并且打印出来 
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
