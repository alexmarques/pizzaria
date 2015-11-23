app.controller('PizzasController', ['$scope','pizzariaService','$http','$rootScope', function($scope, pizzariaService, $http, $rootScope) {
	var pizza = this;
	pizza.service = pizzariaService;
	pizza.pizzaMista = [];
	
	$scope.onDragSuccess = function(data, evt) {
    }
	
	$scope.onDropComplete = function(data, evt) {
		var index = pizza.pizzaMista.indexOf(data);
        if (index == -1 && pizza.pizzaMista.length < 2) {
        	pizza.pizzaMista.push(data);
        }
    }
	
	$scope.limparPizzaMista = function() {
		pizza.pizzaMista = [];
	}
	
	$scope.adicionarPizzaMista = function() {
		console.log('Adicionando pizza mista');
		var pizzaMista = {
			nome: '',
			valor: 0
		};
		angular.forEach(pizza.pizzaMista, function(value, key) {
			if(key > 0) {
				pizzaMista.nome += ' + ' + value.nome;
			} else {
				pizzaMista.nome += value.nome;
			}
			if(value.preco > pizzaMista.valor) {
				pizzaMista.valor = value.preco;
			}
		});
		pizza.service.mista.push(pizzaMista);
		$scope.limparPizzaMista();
	}
}]);