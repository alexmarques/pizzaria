app.controller('SobremesasController', ['$scope','pizzariaService', function($scope, pizzariaService) {
	var sobremesa = this;
	sobremesa.service = pizzariaService;	
}]);