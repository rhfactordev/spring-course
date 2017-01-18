<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Minha loja Virtual</title>
</head>
<body>
	<h1>Cadastro de produto</h1>
	
	<form name="produtoForm" id="produtoForm" method="post" action="/shop/produtos">
		
		<div>
			<label for="nome">Nome</label>
			<input type="text" name="nome" id="nome">
		</div>
			
		<div>
			<label for="descricao">Descricação</label>
			<textarea name="descricao" id="descricao"></textarea>
		</div>
		
		<input type="submit" value="Salvar" />
	</form>
	
</body>
</html>