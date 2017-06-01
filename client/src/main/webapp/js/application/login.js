var app = angular.module('loginApp', []);

app.controller('loginAppCtrl', [
		'$scope',
		'$http',
		function($scope, $http) {

			$scope.login = function() {
				var res = $http({
					method : 'POST',
					url : '/login',
					headers : {
						Authorization : "Basic "
								+ btoa($scope.username + ":"
										+ $scope.password),
					},
				});
				res.success(function(data) {
				});
				res.error(function(data, status) {
					alert("Ha fallado la petición. Estado HTTP:" + status);
				});
			}
		} ]);