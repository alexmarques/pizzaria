app.controller('BebidasController', ['$scope','pizzariaService', function($scope, pizzariaService) {
	var bebida = this;
	bebida.service = pizzariaService;
}]);