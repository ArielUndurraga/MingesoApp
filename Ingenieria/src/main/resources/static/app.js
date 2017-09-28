var app = angular.module('appstudents', ['ngRoute']);

app.config(function($routeProvider){
    $routeProvider
        .when("/Students",{
            templateUrl: "js/students.html",
            controller: "StudentsController"
        })
        .when('/addStudent',{
            templateUrl: 'js/addStudent.html',
            controller: 'AddStudentController'
        })
        .otherwise({
            redirectTo: '/index'
        });
});