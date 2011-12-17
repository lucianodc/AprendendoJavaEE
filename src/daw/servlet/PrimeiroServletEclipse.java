package br.daw.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class for Servlet: PrimeiroServletEclipse
 *
 */
 public class PrimeiroServletEclipse extends javax.servlet.http.HttpServlet {
    /* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public PrimeiroServletEclipse() {
		super();
	} 
	
	/* (non-Javadoc)
	 * @see javax.servlet.Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
		
		log("...destruindo o servlet!");
	}   	 	  	  	  
	
	/* (non-Javadoc)
	 * @see javax.servlet.GenericServlet#init()
	 */
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		
		log("Iniciando o servlet...");
	}   
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		log("Passando pelo Get");
		
		doProcess(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		log("Passando pelo Post");
		
		doProcess(request, response);
	
	}
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		log("Passando pelo Process");
		
	}

/*
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(request, response);
		
		log("Passando pelo Service");
		
		doProcess((HttpServletRequest) request, (HttpServletResponse) response);
		
		String valor = request.getParameter("valor");
		
		
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
      
        out.println("<html>");
        out.println("<head>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Primeiro Servlet Eclipse</h1>");
        out.println("</body>");
        out.println("</html>");
      
        out.close();
		
		
	}    
*/}