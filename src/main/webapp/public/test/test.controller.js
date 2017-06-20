(function(){
    'use strict';

    angular.module('app')
        .controller('testController', ['$scope', '$survey',
        function($scope, $survey){

            // Language selection tools:
            $scope.myFavLanguage = 'None';

            $scope.php = function(){
                $scope.myFavLanguage = 'PHP';
            };

            $scope.javascript = function(){
                $scope.myFavLanguage = 'JavaScript';
            };

            $scope.cpp = function(){
                $scope.myFavLanguage = 'C++';
            };

            $scope.java = function(){
                $scope.myFavLanguage = 'Java';
            };


            

            $scope.submit = function(){
                console.log('Submitting a survey response...');

                var surveyResponse = {
                    name: $scope.name,
                    favoriteLanguage: $scope.myFavLanguage
                }


                $survey.submitSurveyResponse(surveyResponse);

                //$responseService.submitResponse(surveyResponse);
                //.then() { $state.go ... }
            }
            


        }]);
})();