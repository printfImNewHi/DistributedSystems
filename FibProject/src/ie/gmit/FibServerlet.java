package ie.gmit;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

public class FibServerlet extends HttpServlet { 
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

protected void doGet(HttpServletRequest request, 
      HttpServletResponse response) throws ServletException, IOException 
  {
	
    // reading the user input
    int max= Integer.parseInt(request.getParameter("max"));  
    
    PrintWriter out = response.getWriter();
    out.println (
      "<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"  \"http://www.w3.org/TR/html4/loose.dtd\">\n" +
      "<html> \n" +
        "<head> \n" +
          "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\"> \n" +
          "<title></title> \n" +
        "</head> \n" +
        "<body> \n" +
          "<font size=\"12px\" Fibonacci=\"\">" +
            "Your sequence you entered is : "+ max +" " +
            "Your Job Number is : "+
          "</font> \n" +
        "</body> \n" +
      "</html>" 
        
    );  
  }  
}
