(function(){
    'use strict';

    angular
        .module('app')
        .service('$survey', surveyService);

    surveyService.$inject = ['$http'];

    function surveyService($http){
        // list of service functions:
        var exports = {
            submitSurveyResponse: submitSurveyResponse
        };

        return exports;

        // service functions:
        function submitSurveyResponse(surveyResponse){
            var req = {
                method: 'POST',
                url: '/response/submit',
                headers: {
                    'Content-Type': 'application/json',
                },
                data: surveyResponse
            }

            console.log(req);

            return $http(req).then(
                function(response){
                    console.log(response);
                },
                function(error) {
                    console.log(error);
                }
            );
           
        }
    }

})();