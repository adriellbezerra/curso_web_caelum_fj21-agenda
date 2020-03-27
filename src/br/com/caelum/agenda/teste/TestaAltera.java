package br.com.caelum.agenda.teste;

import java.util.Calendar;

import br.com.caelum.agenda.dao.ContatoDao;
import br.com.caelum.agenda.modelo.Contato;

public class TestaAltera {

	public static void main(String[] args) {

		Contato contato = new Contato();
		contato.setId(1L);
		contato.setNome("Isaac Justino da Costa");
		contato.setDataNascimento(Calendar.getInstance());
		contato.setEndereco("Rua 5 de maio");
		contato.setEmail("isaquinho.jus@hotmail.com");

		ContatoDao dao = new ContatoDao();
		dao.altera(contato);

	}

}
