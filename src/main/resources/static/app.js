var app = angular.module("myApp",['ui.router' , 'register']);

app.config(['$stateProvider','$urlRouterProvider',function($stateProvider , $urlRouterProvider) {
    $urlRouterProvider.otherwise('/main');
    $stateProvider
        .state('main',{
            url:'/main',
            templateUrl : '/templates/main.html'
        });
}]);

angular.module("myApp")
    .controller("mainController",["$scope" ,"$state" ,function($scope , $state){
        var params = {}
        $state.go('main.register' , params);
    }]);