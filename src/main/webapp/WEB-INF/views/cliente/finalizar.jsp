<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<script src="<spring:url value='/js/jquery-2.1.4.min.js'/>" type="text/javascript"></script>
	<script src="<spring:url value='/js/bootstrap.js'/>" type="text/javascript"></script>
	<link href="<spring:url value='/css/bootstrap.css'/>" rel="stylesheet" type="text/css"/>
	<title>Pizzaria-Online</title>
</head>
<body>
	<div class="container container-fluid">
		<div class="col-sm-8 col-sm-offset-2">
			<div class="row">
				<div class="alert alert-success">Pedido finalizado com sucesso!</div>
			</div>
			<div class="row">
				Obrigado <strong>${cliente.nome}</strong> pela preferência.
			</div>
			<div class="row">
				<p>Confira abaixo seu pedido</p>
				<table class="table table-bordered">
					<thead>
						<tr>
							<th>Item</th>
							<th>Quantidade</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${cliente.pedidos[0].itens}" var="item">
							<tr>
								<td>${item.nome}</td>
								<td>${item.quantidade}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
			<div class="row">
				<p class="label label-primary">Seu pedido será entregue no seguinte endereço:</p>
				${cliente.endereco.rua} ${cliente.endereco.numero}
			</div>
		</div>
	</div>
</body>
</html>