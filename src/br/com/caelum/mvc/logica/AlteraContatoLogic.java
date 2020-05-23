package br.com.caelum.mvc.logica;

import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.agenda.dao.ContatoDao;
import br.com.caelum.agenda.modelo.Contato;

public class AlteraContatoLogic implements Logica{
	
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		PrintWriter out = res.getWriter();
		
		ContatoDao dao = new ContatoDao();
		
		long id = Long.parseLong(req.getParameter("id"));
		System.out.println("Pegou o ID");
		
		String nome = req.getParameter("nome");
		System.out.println("Pegou o nome");
		String endereco = req.getParameter("endereco");
		System.out.println("Pegou o endereco");
		String email = req.getParameter("email");
		System.out.println("Pegou o email");
		String dataEmTexto = req.getParameter("dataNascimento");
		Calendar dataNascimento = null;

		if (!(dataEmTexto == null || dataEmTexto.equals(""))) {
			try {
				Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dataEmTexto);
				dataNascimento = Calendar.getInstance();
				dataNascimento.setTime(date);
			} catch (ParseException e) {
				out.println("Erro de conversão da data");
				return "Erro na conversão da data"; // Para a execução do método
			}
		}
				
		Contato contatoRequest = new Contato();
		contatoRequest.setId(id);
		
		Contato contatoDoBanco = new Contato();
		contatoDoBanco = dao.buscar(contatoRequest);
		System.out.println("Buscou o contato do Banco pelo ID");
		
		contatoDoBanco.setNome(nome);
		contatoDoBanco.setEndereco(endereco);
		contatoDoBanco.setEmail(email);
		
		if(dataNascimento != null) {
			contatoDoBanco.setDataNascimento(dataNascimento);
		}
		
		System.out.println("Setou os parâmetros necessários");
				
		dao.altera(contatoDoBanco);
		
		System.out.println("Alterou o contato no Banco de Dados");
		
		return "mvc?logica=ListaContatosLogic";
		
		
	}

}
