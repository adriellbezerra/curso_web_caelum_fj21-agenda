<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    	 
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Lista Contatos</title>
	</head>
<body>
	
	<c:import url="cabecalho.jsp"/>
	
	<div><h1>Segue dados do contato para alterar</h1></div>
	<!-- <div><p>${contato.nome}</p></div> -->
	
	<div align="left">
		<form action="mvc?logica=AlteraContatoLogic" method="post">
			Id: <input type="text" name="id" value="${contato.id}" readonly="readonly"/><br />
			Nome: <input type="text" name="nome" value="${contato.nome}"/><br />
			E-mail: <input type="text" name="email" value="${contato.email}"/><br />
			Endereço: <input type="text" name="endereco" value="${contato.endereco}"/><br />
			Data: <input type="date" name="dataNascimento" value="${contato.dataNascimento}"/><br/>
			
			<input type="submit" value="Alterar"/>
		</form>	
	</div>
	
	<c:import url="rodape.jsp"/>
	
</body>
</html>