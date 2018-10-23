package swiss_knife;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = { "/login" })
public class LoginServlet extends HttpServlet {
	
	  public LoginServlet() {
	        super();
	        System.out.println("LoginServlet");
	    }
	  
	  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  doPost(request, response);
	  }
	  
	  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			LoginDao dao = new LoginDao();
			
			
		//	if ("mansur".equals(username) && "1".equals(password)) {
			
			if (dao.check(username, password)) {
			    request.getSession().setAttribute("user", username); // Put user in session.
			   // response.sendRedirect("/secured/home.html"); // Go to some start page.
			    response.sendRedirect("home.jsp");
			} else {
			    request.setAttribute("error", "Unknown login, try again"); // Set error msg for ${error}
			    request.getRequestDispatcher("/login.jsp").forward(request, response); // Go back to login page.
				//response.sendRedirect("login.jsp");
			}	
	  }
}
