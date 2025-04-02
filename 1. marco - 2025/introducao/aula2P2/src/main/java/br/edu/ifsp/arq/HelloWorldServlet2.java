package br.edu.ifsp.arq;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/hello")
public class HelloWorldServlet2 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nome = req.getParameter("nome");
		String idade = req.getParameter("idade");
		
		PrintWriter out = resp.getWriter();
		out.print("<h1> Hello World Again</h1>");
		out.print("<h3>Nome: "+ nome +"</h3>");
		out.print("<h3>Idade: "+ idade +"</h3>");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nomeTarefa = req.getParameter("nome");
		String descricao = req.getParameter("descricao");
		String periodos[] = req.getParameterValues("periodo");
		
		PrintWriter out = resp.getWriter();
		out.print("<h1> infos </h1>");
		out.print("<h3>Tarefa: "+ nomeTarefa +"</h3>");
		out.print("<h3>Descrição: "+ descricao +"</h3>");
		out.print("<h3>Período: ");

		for(String p : periodos) {
			out.print("<h3>"+ p +"</h3>");
		}
	} 
	
}
