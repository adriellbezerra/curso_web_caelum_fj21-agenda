<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Adiciona Contatos</title>

</head>
<body>
	<c:import url="cabecalho.jsp"/>

	<h1>Adiciona Contatos</h1>
	<hr />
	<form action="mvc?logica=AlteraContatoLogic" method="post">
		Nome: <input type="text" name="nome" /><br />
		E-mail: <input type="text" name="email" /><br />
		Endere�o: <input type="text" name="endereco" /><br />
		Data Nascimento:
			<input type="date" name="dataNascimento" /><br />
			
		<input type="submit" value="Gravar"/>
	</form>
	
	<c:import url="rodape.jsp"/>
</body>
</html>