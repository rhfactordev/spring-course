<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Minha loja Virtual</title>
</head>
<body>
	<h1>Lista de produto</h1>
	
	<table>
		<thead>
			<tr>
				<th>Nome</th>
				<th>Descricao</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${produtos}" var="produto">
				<tr>
					<td>${produto.nome}</td>
					<td>${produto.descricao}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
</body>
</html>