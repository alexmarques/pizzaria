var app = angular.module('pizzaria',['ngRoute']);

app.config(function($routeProvider) {
	$routeProvider
		.when('/', {
			templateUrl: 'js/templates/home.html',
			controller: 'HomeController as home'
		})
		.when('/pizzas', {
			templateUrl: 'js/templates/pizzas.html',
			controller: 'PizzasController as pizza'
		})
		.when('/bebidas', {
			templateUrl: 'js/templates/bebidas.html',
			controller: 'BebidasController as bebida'
		})
		.otherwise({
			redirectTo: '/'
		});
});

app.service('pizzariaService', ['$http', function($http) {
	var pizzaria = this;
	pizzaria.pizzas = [];
	pizzaria.bebidas = [];
	$http.get('pizzas').success(function(data) {
		pizzaria.pizzas = data;	
	});
	$http.get('bebidas').success(function(data) {
		pizzaria.bebidas = data;
	});
}]);