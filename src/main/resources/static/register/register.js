var register = angular.module("register", ['ui.router']);
register.config(['$stateProvider','$urlRouterProvider',function($stateProvider , $urlRouterProvider) {
    //$urlRouterProvider.otherwise('/register');
    $stateProvider
        .state('main.register',{
            url: '/register' ,
            views:{
                "body":{
                    templateUrl : 'register/templates/registerForm.tpl.html'
                },
                "menu": {
                    template: "<ul><li ng-repeat='item in items'>{{item}}</li></ul>",
                    controller: function($scope) {
                        $scope.items = ['foo1', 'bar1'];
                    }
                }
            }
        })
        .state('main.list',{
            url : '/list' ,
            views:{
                "body":{
                    templateUrl : 'register/templates/registerList.tpl.html'
                }
            }
        });
}]);