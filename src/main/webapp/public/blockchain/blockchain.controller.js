(function(){
    'use strict';

    angular.module('app')
        .controller('blockchainController', ['$scope', '$blockchain',
        function($scope, $blockchain){

            $scope.blockchainMessage = '';

            // Language selection tools:
            $scope.getMessage = function() {
                $scope.blockchainMessage = $blockchain.requestMessage();
            }


        }]);
})();