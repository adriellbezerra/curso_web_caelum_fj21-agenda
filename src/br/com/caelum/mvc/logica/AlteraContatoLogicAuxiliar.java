package br.com.caelum.mvc.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.agenda.dao.ContatoDao;
import br.com.caelum.agenda.modelo.Contato;

public class AlteraContatoLogicAuxiliar implements Logica{

	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		long id = Long.parseLong(req.getParameter("id"));
		
		Contato contatoRequisicao = new Contato();
		contatoRequisicao.setId(id);
		
		ContatoDao dao = new ContatoDao();
		Contato contato = dao.buscar(contatoRequisicao);
		
		req.setAttribute("contato", contato);
		
		return "/WEB-INF/jsp/auxiliar-altera-contato.jsp";
		
	}
	
}
