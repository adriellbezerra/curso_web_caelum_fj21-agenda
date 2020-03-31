package br.com.caelum.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/contador")
public class ContadorServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	private int contador = 0;

	public void init(ServletConfig config) throws ServletException{
		super.init(config);
		log("Iniciando a servlet");
	}
	
	public void destroy(){
		super.destroy();
		log("Destruindo a servlet");
	}
	
	public void service(HttpServletRequest request, HttpServletResponse response) 
						throws ServletException, IOException {
		
		contador++;
		
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<head>");
		out.print("<title>Contador Servlet</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("Contador agora é: " + contador);
		out.print("</body>");
		out.print("</html>");
		
	}
	
}
