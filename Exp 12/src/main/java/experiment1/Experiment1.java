package experiment1;

import java.io.*;
import java.util.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 * Servlet implementation class Experiment1
 */
@WebServlet("/Experiment1")
public class Experiment1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Experiment1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");  
		PrintWriter out=response.getWriter();  
		ServletContext context=getServletContext();  
		Enumeration<String> e=context.getInitParameterNames();  
		String str="";  
		out.print("<h4>Initialisation Params are: </h4>");
		while(e.hasMoreElements()){  
		    str=e.nextElement();  
		    out.print("<li><b>" + str + ":</b> "+context.getInitParameter(str) + "</li>");  
		} 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		PrintWriter out = response.getWriter();  
		String[] values=request.getParameterValues("topic");
		out.print("Selected Values - ");
		for(int i=0;i<values.length;i++)
	       {
	           out.println("<li>"+values[i]+"</li>");
	       }
	}

}
