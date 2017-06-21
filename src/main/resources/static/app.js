var app = angular.module("myApp",["ngRoute"]);
app.config(function($routeProvider) {
    $routeProvider
    .when("/", {
        templateUrl : "register/templates/registerForm.tpl.html"

    })
    .when("/register",{
        templateUrl : "register/templates/registerForm.tpl.html"

    });
});