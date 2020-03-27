package br.com.caelum.agenda.teste;

import br.com.caelum.agenda.dao.ContatoDao;
import br.com.caelum.agenda.modelo.Contato;

public class TestaRemove {

	public static void main(String[] args) {
		
		Contato contato = new Contato();
		
		contato.setId(3L);
		
		ContatoDao dao = new ContatoDao();
		dao.remove(contato);
		
		System.out.println("Contato removido.");
		
	}

}
