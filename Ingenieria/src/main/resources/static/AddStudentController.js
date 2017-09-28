app.controller("AddStudentController", function($scope, $http) {

	$scope.newStudent = {};

	$scope.resetNewStudent = function(){
        $scope.newStudent = {
        "rut":"",
        "name":"",
        "email":"",
        "career":"",
        "entryYear":"",
        }
	}
	$scope.submit = function(){
    	$http.post('http://localhost:8181/Ingenieria/students', $scope.newStudent).then(function(response){
    		$scope.resetNewStudent();
    	});

    }
});
