app.controller('AbaController', function() {
	
	this.aba = 0;
	
	this.selecionarAba = function(setAba) {
		this.aba = setAba;
	}
	
	this.isSelected = function(checkAba) {
		return this.aba === checkAba;
	}
});