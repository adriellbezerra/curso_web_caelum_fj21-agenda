<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bem Vindo JSP</title>
</head>
<body>

	<%-- Comentário em JSP aqui: nossa primeira página JSP --%>
	<%
		String mensagem = "Bem vindo ao sistema de agenda do FJ21!";
	%>
	<%
		out.print(mensagem);
	%>
	<br />
	<%
		String desenvolvido = "Desenvolvido por (Adriell Bezerra)";
	%>
	<%=desenvolvido%>

	<%
		System.out.println("Tudo foi executado!");
	%>
</body>
</html>