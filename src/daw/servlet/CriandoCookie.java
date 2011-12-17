package br.daw.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class for Servlet: CriandoCookie
 *
 */
 public class CriandoCookie extends br.daw.servlet.PrimeiroServletEclipse {
    /* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public CriandoCookie() {
		super();
	}

	@Override
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doProcess(request, response);
		
		Cookie cookie = new Cookie("name", "luciano");
		cookie.setMaxAge(60);
		cookie.setSecure(false);
		cookie.setComment("My Name");
		response.addCookie(cookie);
		
	       response.setContentType("text/html;charset=UTF-8");
	        PrintWriter out = response.getWriter();
	      
	        out.println("<html>");
	        out.println("<head>");
	        out.println("</head>");
	        out.println("<body>");
	        
	        out.println("<h2>Cookie criado com sucesso!</h2>");


	        
	        out.println("</body>");
	        out.println("</html>");
	        
	        out.close(); 		
	        
	        
		
		
	}   	
	


	
	
	
}