package br.daw.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class for Servlet: RecuperandoHeadersServlet
 *
 */
 public class RecuperandoHeadersServlet extends br.daw.servlet.PrimeiroServletEclipse {
    /* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public RecuperandoHeadersServlet() {
		super();
	}

	@Override
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doProcess(request, response);
		
		Enumeration headersName = request.getHeaderNames();

	       response.setContentType("text/html;charset=UTF-8");
	        PrintWriter out = response.getWriter();
	      
	        out.println("<html>");
	        out.println("<head>");
	        out.println("<title>Recuperando headers</title>");
	        out.println("</head>");
	        out.println("<body>");
	        
	        out.println("<h3>Header Recuperados: </h3>");
	        
	        while(headersName.hasMoreElements()){
	        	
	        	String header = (String) headersName.nextElement();
	        	String headerValue = request.getHeader(header);
	        	
		        out.println("<tr>");
		        out.println("<strong>" + header + "</strong>: " + headerValue 
		        		+ "<br />");
		        
	        }

	        out.println("<br />");
	        out.println("<br />");
	        out.println("<a href='index.html'>Voltar para o formulário</a>");       
	        
	        out.println("</body>");
	        out.println("</html>");
	        
	        out.close(); 		
		
	}
	
	
	
}