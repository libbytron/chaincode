(function() {
  'use strict';

    angular.module('app')
      .config(config)

    config.$inject = ['$stateProvider', '$urlRouterProvider'];
    function config($stateProvider, $urlRouterProvider) {

      $urlRouterProvider.otherwise('/');

      $stateProvider
      
        .state('home', {
          url: '/home',
          templateUrl: '/home/index.html',
        })
        .state('blockchain', {
          url: '/blockchain',
          templateUrl: '/blockchain/blockchain.html',
        })
        /*
        .state('login', {
          url: '/login',
          templateUrl: 'login/login.html',
          controller: 'loginController',
          controllerAs: 'login'
        })
        */
        
        .state('sign-up', {
          url: '/sign-up',
          templateUrl: '/test/test.html',
        });

    };

})();
