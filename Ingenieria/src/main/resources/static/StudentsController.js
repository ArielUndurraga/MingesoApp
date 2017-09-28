
app.controller("StudentsController", function($scope, $http) {
    $http.get('http://localhost:8181/Ingenieria/students').
        then(function(response) {
            $scope.students = response.data;
        });
});