var app = angular.module('pizzaria',['ngRoute','ngDraggable']);

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
		.when('/sobremesas', {
			templateUrl: 'js/templates/sobremesas.html',
			controller: 'SobremesasController as sobremesa'
		})
		.otherwise({
			redirectTo: '/'
		});
});

app.service('pizzariaService', ['$http','$filter','$window', function($http,$filter,$window) {
	var pizzaria = this;
	pizzaria.itens = [];
	pizzaria.mista = [];
	$http.get('pizzas').success(function(data) {
		angular.forEach(data, function(value, index) {
			pizzaria.itens.push(value);
		});
	});
	$http.get('bebidas').success(function(data) {
		angular.forEach(data, function(value, index) {
			pizzaria.itens.push(value);
		});
	});
	$http.get('sobremesas').success(function(data) {
		angular.forEach(data, function(value, index) {
			pizzaria.itens.push(value);
		});
	});
	pizzaria.finalizarPedido = function() {
		var pedido = $filter('filter')(pizzaria.itens,{quantidade:'!0'});
		$http.put('finalizarPedido',angular.toJson(pedido),[]);
		$window.location.href = 'cliente/cadastro';
	};
}]);

