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

public class AdicionaContatoLogic implements Logica{

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		PrintWriter out = res.getWriter();
		System.out.println("Criou o Out");

		String nome = req.getParameter("nome");
		String endereco = req.getParameter("endereco");
		String email = req.getParameter("email");
		String dataEmTexto = req.getParameter("dataNascimento");
		System.out.println("Carregou informações do request (nome, endereco, email, dataEmTexto)");
		System.out.println("Convertendo a data pa Calendar dataNascimento...");
		Calendar dataNascimento = null;

		// fazendo a conversão da data
		try {
			Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dataEmTexto);
			dataNascimento = Calendar.getInstance();
			dataNascimento.setTime(date);
		} catch (ParseException e) {
			out.println("Erro de conversão da data");
			return "Erro de conversão da data"; // Para a execução do método
		}
		

		// Monta um objeto contato
		Contato contato = new Contato();
		contato.setNome(nome);
		contato.setEndereco(endereco);
		contato.setEmail(email);
		contato.setDataNascimento(dataNascimento);
		System.out.println("Montou o contato para ser adicionado ao DB");
		
		
		ContatoDao dao = new ContatoDao();
		dao.adiciona(contato);
		System.out.println("Salvou o contato");
		
		return "mvc?logica=ListaContatosLogic";
	}
}
