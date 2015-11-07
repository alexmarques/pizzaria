app.controller('HomeController', ['$scope','$http','$rootScope', function($scope,$http,$rootScope) {
	
	$scope.isSelected = function(checkAba) {
		return $scope.aba === checkAba;
	}
	
	$scope.selecionarAba = function(setAba) {
		$scope.aba = setAba;
	}
}]);