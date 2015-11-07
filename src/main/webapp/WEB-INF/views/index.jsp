<!doctype html>
<html lang="en" ng-app="pizzaria">
	<head>
		<meta charset="UTF-8" />
		<script src="js/jquery-2.1.4.min.js" type="text/javascript"></script>
		<script src="js/bootstrap.js" type="text/javascript"></script>
		<link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
	</head>
	<body ng-controller="HomeController">
		<div class="container container-fluid">
			<div class="row">
				<div class="panel panel-primary">
					<div class="panel-heading">
						<h1 class="panel-title">Pizzaria-Online</h1>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-sm-2">
					<div class="nav">
						<ul class="list-group" ng-model="aba">
							<li ng-class="{active:isSelected(1)}" class="list-group-item"><a href="#/pizzas" ng-click="selecionarAba(1);">Pizzas</a></li>
							<li ng-class="{active:isSelected(2)}" class="list-group-item"><a href="#/bebidas" ng-click="selecionarAba(2);">Bebidas</a></li>
							<li ng-class="{active:isSelected(3)}" class="list-group-item"><a href="#/sobremesas" ng-click="selecionarAba(3);">Sobremesas</a></li>
						</ul>
					</div>
				</div>
				<div class="col-sm-7">
					<ng-view>Carregando...</ng-view>
				</div>
				<div class="col-sm-3" ng-controller="PedidoController as pedido">
					<div class="panel panel-primary">
						<div class="panel-heading">Pedido<span class="badge pull-right"></span></div>
						<div class="panel-body">
							<table class="table">
								<thead>
									<tr>
										<th>Quantidade</th>
										<th>Item</th>
									</tr>
								</thead>
								<tbody>
									<tr ng-repeat="p in pedido.pedidos.pizzas" ng-if="p.quantidade > 0">
										<td>{{p.quantidade}}</td>
										<td>{{p.nome}}</td>
									</tr>
									<tr ng-repeat="b in pedido.pedidos.bebidas" ng-if="b.quantidade > 0">
										<td>{{b.quantidade}}</td>
										<td>{{b.nome}}</td>
									</tr>
								</tbody>
								<tfoot>
									<tr>
										<td>Total</td>
										<td ng-bind="pedido.totalGeral()"></td>
									</tr>
								</tfoot>
							</table>
							<button class="btn btn-primary pull-right">Finalizar Pedido</button>
						</div>
					</div>
				</div>
			</div>
		</div>
		<script src="js/angular.js" type="text/javascript"></script>
		<script src="js/angular-route.min.js" type="text/javascript"></script>
		<script src="js/app.js" type="text/javascript"></script>
		<script src="js/pizza.js" type="text/javascript"></script>
		<script src="js/bebidas.js" type="text/javascript"></script>
		<script src="js/home.js" type="text/javascript"></script>
		<script src="js/controller/pedido.js" type="text/javascript"></script>
	</body>
</html>