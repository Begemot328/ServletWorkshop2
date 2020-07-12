package by.epam.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    public void init() throws ServletException {
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {
     response.setContentType("text/html");
      response.getWriter().print("This is " + this.getClass().getName() 
         + ", using the GET method");
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {
     response.setContentType("text/html");
      response.getWriter().write("This is " + this.getClass().getName() 
    	       + ", using the POST method");
    }
    public void destroy() {
     super.destroy(); // Just puts "destroy" string in log
    }
}
