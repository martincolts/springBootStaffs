angular.module("myApp")
    .service ("registerService", function($http){
        this.saveUser = function (data , success , error){
            $http.post('/user/save',data ).then (success , error);
        }
        
        this.getUsers = function (success, error){
        	$http.get('/user/getAll').then (success, error);
        }

    })