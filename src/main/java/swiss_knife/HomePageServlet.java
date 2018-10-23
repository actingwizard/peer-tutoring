package swiss_knife;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/home" })
public class HomePageServlet extends HttpServlet {
	
	  public HomePageServlet() {
	        super();
	        System.out.println("HomePageServlet");
	    }
	  
	  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  doPost(request, response);
	  }
	  
	  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  request.getRequestDispatcher("/home.jsp").forward(request, response); 
				
	  }
}