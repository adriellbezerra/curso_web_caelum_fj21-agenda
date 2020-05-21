<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    	 
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Lista Contatos</title>
	</head>
<body>
	
	<c:import url="cabecalho.jsp"/>
	
	<!-- Cria o DAO 
	<jsp:useBean id="dao" class="br.com.caelum.agenda.dao.ContatoDao"/> -->
	
	<div align="center">
	<table border="1">
	<caption>Tabela de Contados Cadastrados</caption>
	<thead>
		<tr>
			<th>Nome</th>
			<th>Email</th>
			<th>Endereço</th>
			<th>Nascimento</th>
			<th>Remover</th>
		</tr>
	</thead>
		
		<!-- Percorre o contato e monta as linhas da tabela -->
		<c:forEach var="contato" items="${contatos}" varStatus="id">
			<tr bgcolor="#${id.count % 2 == 0 ? 'aaee88' : 'ffffff'}">
				<td>${contato.nome}</td>
				<td>
					
					<c:choose>
						<c:when test="${not empty contato.email}">
							<a href="mailto:${contato.email}">${contato.email}</a>
						</c:when>
						<c:otherwise>
							E-mail não informado
						</c:otherwise>
					</c:choose>
					
				</td>
				<td>${contato.endereco}</td>
				<td>${contato.dataFormatada()}</td>
				<td><a href="mvc?logica=RemoveContatoLogic&id=${contato.id}">Remover</a></td>
			</tr>
		</c:forEach>
	</table>
	</div>
	<c:import url="rodape.jsp"/>
	
</body>
</html>