app.controller('BebidasController', ['$scope','pizzariaService','$http', function($scope, pizzariaService, $http) {
	
	var bebida = this;
	bebida.bebidas = pizzariaService;
	
}]);