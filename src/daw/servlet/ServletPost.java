package br.daw.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class for Servlet: ServletPost
 *
 */
 public class ServletPost extends PrimeiroServletEclipse {
    /* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public ServletPost() {
		super();
	}   	 	
	
	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		super.doProcess(request, response);
		
		String usuario = request.getParameter("usuario");
		String senha = request.getParameter("senha");
		
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
      
        out.println("<html>");
        out.println("<head>");
        out.println("</head>");
        out.println("<body>");
        
        if( usuario.equals("luciano") && senha.equals("1234")){
        	
        	out.println("<h3 style='color:green'>Login realizado com sucesso!!!</h3>");
        	
        } else {
        	
        	out.println("<h3 style='color:red'>Falha no login!!!</h3>");
        	
        }
        
        out.println("</body>");
        out.println("</html>");
      
        out.close(); 		
		
	}   	  	    
}