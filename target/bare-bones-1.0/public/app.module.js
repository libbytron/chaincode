(function() {
    'use strict';

    angular.module('app', [
        'ui.router',
        'ngMaterial',
        'ngSanitize',
    ]).config(function($mdThemingProvider) {

        $mdThemingProvider.theme('default')
            .primaryPalette('grey',{
                'default': '900'})
            .accentPalette('grey',{
                'default': '700'})
            //
            // .backgroundPalette('black')
            .dark();
    })

})();



