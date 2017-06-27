angular.module('myApp')
    .controller("registerFormController" ,['$scope' , 'registerService', function($scope , registerService){
        $scope.register = function (){
            if ($scope.user.password == $scope.user.passwordR){
                registerService.saveUser ($scope.user , function(response){
                    console.log("se salvo bien");
                    console.log(response.data);
                    alert("Se ingreso correctamegetAllnte.");
                    $scope.user = {};
                }, function (response){
                    console.log(response.data);
                    console.log("anduvo mal");
                    alert("Hubo un error en el ingreso.");
                });
            } else
            {
                alert ("Las claves son distintas.");
            }
        }
    }]);