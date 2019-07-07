app.config(function($routeProvider, $locationProvider) {
    $routeProvider
        .when("/", {
            templateUrl : "/angular/partials/listing.html",
            controller : "listingEmployeeController"
        });

    $locationProvider.html5Mode(true);
});