package experiment4;

import java.io.*;

import java.util.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 * Servlet implementation class Experiment4
 */
@WebServlet("/Experiment4")
public class Experiment4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Experiment4() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = response.getWriter();
		String n1 = request.getParameter("num1");
		String n2 = request.getParameter("num2");
		String op = request.getParameter("op");
		
		String res = "";
		
		switch(op) {
			case "+":
				res = "" + (Integer.parseInt(n1) + Integer.parseInt(n2));
				break;
			case "-":
				res = "" + (Integer.parseInt(n1) - Integer.parseInt(n2));
				break;
			case "*":
				res = "" + (Integer.parseInt(n1) * Integer.parseInt(n2));
				break;
			case "/":
				res = "" + (Integer.parseInt(n1) / Integer.parseInt(n2));
				break;
		}
		
		pw.print(n1 + " " + op + " " + n2 + " = " + res);
	}

}
