package br.daw.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class for Servlet: GetParametersServlet
 *
 */
 public class GetParametersServlet extends PrimeiroServletEclipse {
    /* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public GetParametersServlet() {
		super();
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(request, response);
	}

	@Override
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doProcess(request, response);
		
		String[] parameters = request.getParameterValues("musica");

	       response.setContentType("text/html;charset=UTF-8");
	        PrintWriter out = response.getWriter();
	      
	        out.println("<html>");
	        out.println("<head>");
	        out.println("</head>");
	        out.println("<body>");
	        
	        out.println("<h3>Estilos escolhidos: </h3>");
	        
	        for(String parameter : parameters){
	        	
		        out.println("<h4>" + parameter + ";</h4>");
	        	
	        }
	        
	        out.println("<br />");
	        out.println("<br />");
	        out.println("<a href='form_musicas.html'>Voltar para o formulário</a>");       
	        
	        out.println("</body>");
	        out.println("</html>");
	        
	        out.close(); 		
		
	}   	 	
}