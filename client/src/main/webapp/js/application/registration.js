var app = angular.module('registrationApp', []);

app.controller("registrationAppCtrl", ['$scope', '$http', function($scope, $http) {
	$scope.newUser = function () {
		var dataObj = {
				nick : $scope.nick,
				name : $scope.nombre,
				lastName : $scope.apellidos,
				email : $scope.email,
				password : $scope.password
		};
		
		var res = $http.post('/utils/registration', dataObj);
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