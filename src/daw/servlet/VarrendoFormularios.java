package br.daw.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class for Servlet: VarrendoFormularios
 *
 */
 public class VarrendoFormularios extends br.daw.servlet.PrimeiroServletEclipse {
    /* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public VarrendoFormularios() {
		super();
	}

	@Override
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doProcess(request, response);

		Enumeration parameters = request.getParameterNames();
		Enumeration headersName = request.getHeaderNames();
		
	       response.setContentType("text/html;charset=UTF-8");
	        PrintWriter out = response.getWriter();
	      
	        out.println("<html>");
	        out.println("<head>");
	        out.println("</head>");
	        out.println("<body>");
	        
	        /*
	         * Recuperando header.
	         */
	        out.println("<h3>Header Recuperados: </h3>");
	        
	        while(headersName.hasMoreElements()){
	        	
	        	String header = (String) headersName.nextElement();
	        	String headerValue = request.getHeader(header);
	        	
		        out.println("<strong>" + header + "</strong>: " + headerValue 
		        		+ "<br />");
		        
	        }       
	        
	        /*
	         * Varrendo Form.
	         */
	        out.println("<h3>Paramêtros enviados: </h3>");
	        
	        out.println("<table border='1'>");
	        out.println("<tr>");
	        out.println("<td>Parâmetro</td>");
	        out.println("<td>Valor</td>");		        
	        out.println("</tr>");
	        
	        while(parameters.hasMoreElements()){
	        	
	        	String parameterName = (String) parameters.nextElement();
	        	String parameterValue = request.getParameter(parameterName);
	        	
		        out.println("<tr>");
		        out.println("<td>" + parameterName + "</td>");
		        out.println("<td>" + parameterValue + "</td>");		        
		        out.println("</tr>");
	        	
	        }
	        
	        out.println("</table>");
	        out.println("<br />");
	        out.println("<br />");
	        out.println("<a href='form_enviar_2.html'>Voltar para o formulário</a>");       
	        
	        out.println("</body>");
	        out.println("</html>");
	        
	        out.close(); 		
	
	}
	
}