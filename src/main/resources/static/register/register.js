var register = angular.module("register", ['ui.router']);
register.config(['$stateProvider','$urlRouterProvider',function($stateProvider , $urlRouterProvider) {
    //$urlRouterProvider.otherwise('/register');
    $stateProvider
        .state('register',{
            url:'/register',
            views:{
                'body':{
                    templateUrl : 'register/templates/registerForm.tpl.html'
                }
            }
        })
        .state('list',{
            url:'/list',
            views:{
                'body':{
                    templateUrl : '/register/templates/registerList.tpl.html'
                }
            }
        });
}]);