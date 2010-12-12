
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.io.File;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;


public class UploadImage extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public UploadImage() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request,response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		
		//
		String filePath = this.getServletContext().getRealPath("/upload");
		
		//
		boolean isMultipart = ServletFileUpload.isMultipartContent(request);
		if(!isMultipart)
		{
			return;
		}//
		
		DiskFileItemFactory factory = new DiskFileItemFactory();
		ServletFileUpload upload = new ServletFileUpload(factory);
		
		//upload.setSizeMax(10*1024*1024);
		//文件最大尺寸，设为-1表示不受限制
		//factory.setSizeThreshold(256);//缓存大小，设为-1表示不受限制
		//factory.setRepository(new File("F:\\temp"));
		//设置一个临时目录，默认用容器分配的
		List<FileItem> items=null; //解析请求得到所有文件
		try{
			items=upload.parseRequest(request);
		}catch(FileUploadException e){
			e.printStackTrace();
		}
		
		for (FileItem item : items )
		{
			//
			if(!item.isFormField())
			{
				//
				File fullFile = new File(item.getName());
				File uploadedFile = new File(filePath, fullFile.getName());
				try{
					item.write(uploadedFile);
				}catch (Exception e){
					e.printStackTrace();
				}
			}
		}
		request.getRequestDispatcher("NewPicture.jsp").forward(request,response);
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
