angular.module("myApp")
	.controller("registerListController", ['$scope' , 'registerService' , function ($scope, registerServices){
		$scope.getUsers = function (){
			registerServices.getUsers (function (response){
				$scope.users = response.data ;
			}, function (){
				console.log (response);
			});
		};
	}]);