/**
 * Created by Sakshi Kukreti on 26-04-2017.
 */

'use strict';
(function () {
    angular.module('app')
        .controller('HomeController', function ($scope, designService) {
            $scope.designs = [];
            designService.fetchAllDesigns().then(function (httpResponse) {
                $scope.designs = httpResponse.data._embedded.designs;
                console.log($scope.designs);
            });
        });
})();