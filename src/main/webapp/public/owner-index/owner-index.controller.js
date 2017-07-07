(function(){
    'use strict';

    angular.module('app')
        .controller('owner-index-controller', ['$scope', '$elasticsearch',
        function($scope, $elasticsearch){

            $scope.companyList = [];

            this.$onInit = function() {
                $scope.getAllOwners().then(
                    function(hits){
                        for(var i = 0; i < hits.length; i++)
                            $scope.companyList.push(hits[i]);
                    }
                )
            }

            $scope.getAllOwners = function(){
                 return $elasticsearch.getAllCompanies().then(
                     function(hits){
                         return hits;
                     }
                 )
            }


        }]);
})();