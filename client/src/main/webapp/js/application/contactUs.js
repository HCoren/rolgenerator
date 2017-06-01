var app = angular.module('contactUsApp', []);

app.controller("contactUsAppCtrl", ['$scope', '$http', function($scope, $http) {
	$scope.sendMail = function () {
		var dataObj = {
				nombre : $scope.nombre,
				mail : $scope.mail,
				contenido : $scope.contenido
		};
		
		var res = $http.post('/utils/mailer', dataObj);
		res.success(function(data) {
			var arr = $.map(JSON
					.parse(angular
							.toJson(data)),
					function(el) {
						return el
					});
			alert(arr[0]);
		});
		res.error(function(data, status) {
			alert("Ha fallado la petición. Estado HTTP:" + status);
		});
	}
}]);