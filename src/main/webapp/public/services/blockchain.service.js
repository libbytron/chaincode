(function(){
    'use strict';

    angular
        .module('app')
        .service('$blockchain', blockchainService);

    blockchainService.$inject = ['$http'];

    function blockchainService($http){

        var subscribers = [];
        var greeting = {
                response: 'no response'
            }

        // list of service functions:
        var exports = {
            requestMessage: requestMessage
        };

        return exports;

        // service functions:
        function requestMessage(){

            var req = {
                method: 'GET',
                url: '/message',
                responseType: 'text'
            }

            $http.get('/message').then(
                function successCallback(data){
                    console.log(data.data);
                    greeting = data.data;
                    console.log(greeting.response);
                }
            );   
        }

        function subscribe(subscriber) {
            
        }
    }

})();