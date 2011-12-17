package br.daw.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class for Servlet: RedirectAccessServlet
 *
 */
public class RedirectAccessServlet extends
		br.daw.servlet.PrimeiroServletEclipse {
	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public RedirectAccessServlet() {
		super();
	}

	@Override
	protected void doProcess(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		super.doProcess(request, response);

		String usuario = request.getParameter("usuario");
		String senha = request.getParameter("senha");

		if (usuario.equals("luciano") && senha.equals("1234")) {

			response.sendRedirect("acesso_permitido.html");

		} else {

			response.sendRedirect("acesso_negado.html");

		}

	}

}