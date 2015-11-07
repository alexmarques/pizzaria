app.controller('PizzasController', ['$scope','pizzariaService','$http','$rootScope', function($scope, pizzariaService, $http, $rootScope) {
	var pizza = this;
	pizza.pizzas = pizzariaService;
}]);