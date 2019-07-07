app.controller("listingEmployeeController", function ($scope, $http) {

    $scope.taskList = [];
    $scope.queryParam = "";
    $scope.sort = "salDesc";
    $scope.currEmp={};
    $scope.empName="";

    $scope.filterByName = function() {
        $scope.queryParam = "?name="+$scope.empName;
        $scope.recordFetcher($scope.sort);
    }

    $scope.recordFetcher = function(sort) {
        $scope.sort = sort;
        $http({
            method : "GET",
            url : "/api/get-employees/"+$scope.sort+$scope.queryParam
        }).then(function mySuccess(response) {
            $scope.employeeList = response.data;
            console.log(JSON.stringify($scope.taskList));
        }, function myError(response) {
            $scope.taskList = [];
        });
    }

    $scope.showEmp = function(obj) {
        $scope.currEmp=obj
        //alert(JSON.stringify());
    }

    $scope.recordFetcher('salDesc');

});