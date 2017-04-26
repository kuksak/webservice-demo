/**
 * Created by Sakshi Kukreti on 26-04-2017.
 */

'use strict';
(function () {
    angular.module('app')
        .service('designService', function ($http, $q) {
            var defer;

            function handleSuccess(data) {
                defer = $q.defer();
                defer.resolve(data);
                return defer.promise;
            }

            function handleError(data) {
                defer = $q.defer();
                defer.resolve(data);
                return defer.promise;
            }

            function fetchAllDesigns() {
                return $http.get('/designs').then(handleSuccess, handleError);
            }

            function fetchDesignById(designId) {
                return $http.get('/design/' + designId).then(handleSuccess, handleError);
            }

            this.fetchAllDesigns = fetchAllDesigns;
            this.fetchDesignById = fetchDesignById;
        });
})();