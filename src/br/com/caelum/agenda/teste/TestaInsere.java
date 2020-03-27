package br.com.caelum.agenda.teste;

import java.util.Calendar;

import br.com.caelum.agenda.dao.ContatoDao;
import br.com.caelum.agenda.modelo.Contato;

public class TestaInsere {

	public static void main(String[] args) {
		// Pronto para gravar
		Contato contato = new Contato();
		
		contato.setNome("Josefa Iranete");
		contato.setEmail("netinha01@email.com");
		contato.setEndereco("Rua dos meninas lindas");
		contato.setDataNascimento(Calendar.getInstance());
		
		ContatoDao dao = new ContatoDao();
		dao.adiciona(contato);
		System.out.println("Gravado!");

	}

}
