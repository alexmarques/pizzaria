app.controller('PedidoController', ['$scope','$rootScope','pizzariaService', function($scope, $rootScope, pizzariaService) {
	var pedido = this;
	pedido.pedidos = pizzariaService;
	pedido.totalGeral = function() {
		var valor = 0;
		angular.forEach(pedido.pedidos.pizzas, function(value, key) {
			if(value.quantidade > 0) {
				valor += value.preco * value.quantidade;
			}
		});
		angular.forEach(pedido.pedidos.bebidas, function(value, key) {
			if(value.quantidade > 0) {
				valor += value.preco * value.quantidade;
			}
		});
	}
}]);