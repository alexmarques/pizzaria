<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!doctype html>
<html lang="en">
	<head>
		<meta charset="UTF-8" />
		<script src="<c:url value="/js/jquery-2.1.4.min.js"/>" type="text/javascript"></script>
		<script src="<c:url value="/js/bootstrap.js"/>" type="text/javascript"></script>
		<link href="<c:url value="/css/bootstrap.css"/>" rel="stylesheet" type="text/css"/>
	</head>
	<body>
		<div class="container">
			<table class="table table-bordered table-striped">
				<thead>
					<tr>
						<th>Nome</th>
						<th>Descrição</th>
						<th>Preço</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${pizzas}" var="pizza">
						<tr>
							<td>${pizza.nome}</td>
							<td>${pizza.descricao}</td>
							<td><fmt:formatNumber value="${pizza.preco}" currencySymbol="R$" minFractionDigits="2" type="currency"/></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</body>
</html>