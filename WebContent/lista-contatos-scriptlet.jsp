<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.util.*,
    		java.text.SimpleDateFormat,
            br.com.caelum.agenda.dao.*,
            br.com.caelum.agenda.modelo.*"
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista Contatos</title>
</head>
<body>

	<table border="1" align="center">
	<caption>Tabela de Contados Cadastrados</caption>
	<thead>
		<tr>
			<th>Nome</th>
			<th>Email</th>
			<th>Endereço</th>
			<th>Nascimento</th>
		</tr>
	</thead>
	<%
    ContatoDao dao = new ContatoDao();
    List<Contato> contatos = dao.getLista();

    for (Contato contato : contatos ) {
    %>
    <tr>
    	<td><%= contato.getNome()%></td>
    	<td><%= contato.getEmail()%></td>
    	<td><%= contato.getEndereco()%></td>
    	<%
    	SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
    	%>
    	<td><%= f.format(contato.getDataNascimento().getTime())%></td>
    </tr>
    <%
    }
    %>
	</table>
</body>
</html>