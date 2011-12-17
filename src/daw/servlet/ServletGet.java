package br.daw.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class for Servlet: ServletGet
 *
 */
 public class ServletGet extends br.daw.servlet.ServletPost {
    /* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public ServletGet() {
		super();
	}   	
	
	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String nome = request.getParameter("nome");
		String sobrenome = request.getParameter("sobrenome");
		
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
      
        out.println("<html>");
        out.println("<head>");
        out.println("</head>");
        out.println("<body>");

        out.println("<h3>Recebendo dados com GET!</h3>");
        
		out.println("Nome: <strong>" + nome + "</strong><br/>");
		out.println("Sobrenome <strong>: " + sobrenome + "</strong><br/>");
		
		out.println("Query String completa recebida: <strong>: " + 
				request.getQueryString() + "</strong><br/>");

		out.println("</body>");
        out.println("</html>");
      
        out.close(); 		
		
		
	}  	  	  	    
}