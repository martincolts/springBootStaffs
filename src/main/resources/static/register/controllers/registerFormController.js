angular.module('myApp')
    .controller("registerFormController" ,['$scope' , 'registerService', function($scope , registerService){
        $scope.name = "ingrese un nombre";
        $scope.lastname = "ingrese un apellido";
        $scope.register = function (){

            registerService.saveUser ($scope.data , function(){
                console.log("se salvo bien");
            }, function (){
                console.log($scope.data);
                console.log("anduvo mal");
            });

        }
    }]);