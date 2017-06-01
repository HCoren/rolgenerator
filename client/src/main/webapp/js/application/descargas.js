var app = angular.module('descargasApp', []);

app.controller("descargasAppCtrl", ['$scope', '$http', function($scope, $http) {
	
	$scope.descargar = function (opcion) {
		var dataObj = {documento : opcion};
		
		var res = $http.post('/descargar', dataObj, {responseType: 'arraybuffer'});
		res.success(function(data) {
			var file = new Blob([data], {type: 'application/pdf'});
		    var fileURL = URL.createObjectURL(file);
		    window.open(fileURL);
		});
		res.error(function(data, status) {
			alert("Ha fallado la petición. Estado HTTP:" + status);
		});
	}
}]);