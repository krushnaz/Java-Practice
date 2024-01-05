
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class GetAddress extends HttpServlet {
  public void doGet(HttpServletRequest request,
HttpServletResponse response)
    throws IOException, ServletException{
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();    
    String name = request.getParameter("name");
	out.println("<h3>You have entered name : " + name + "<br>");	   
    out.println("<b><font color='blue'>
   IP Address of request : </font></b>"
	+request.getRemoteAddr()+"<h3>");
  }
}