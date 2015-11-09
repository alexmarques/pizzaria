app.controller('PedidoController', ['$scope','pizzariaService','$filter', function($scope, pizzariaService, $filter) {
	
	var pedido = this;
	pedido.service = pizzariaService;
	
	$scope.totalGeral = function() {
		var valor = 0;
		angular.forEach($filter('filter')(pedido.service.itens, {quantidade:'!0'}), function(value, index) {
			valor += value.preco * value.quantidade;
		});
		return valor;
	}
	
	$scope.finalizarPedido = function() {
		pizzariaService.finalizarPedido();
	}
}]);