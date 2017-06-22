var register = angular.module("register", ['ngRoute']);
register.config(function($routeProvider) {
    $routeProvider
    .when("/", {
        templateUrl : "register/templates/registerForm.tpl.html"
    })
    .when("/register",{
        templateUrl : "register/templates/registerForm.tpl.html"

    });
});