<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    	 
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Adicionar Contato</title>
	</head>
<body>
	
	<c:import url="cabecalho.jsp"/>
	
	<div align="center"><h1>Adicionando Contato</h1></div>
	
	<div align="left">
		<form action="mvc?logica=AdicionaContatoLogic" method="post">
			Nome: <input type="text" name="nome"/><br />
			E-mail: <input type="text" name="email"/><br />
			Endereço: <input type="text" name="endereco"/><br />
			Data: <input type="date" name="dataNascimento"/><br/>
			
			<input type="submit" value="Alterar"/>
		</form>	
	</div>
	
	<c:import url="rodape.jsp"/>
	
</body>
</html>