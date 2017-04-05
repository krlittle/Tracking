var trackingApp = angular.module('trackingApp', ['ngRoute']);

trackingApp.config(['$routeProvider',
  function ($routeProvider) {
        $routeProvider.
        when('/', {
            templateUrl: 'partials/tracking.html'
        }).
        otherwise({
            redirectTo: '/'
        });
}]);