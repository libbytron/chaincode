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
        })
        /*
        .state('podcasts', {
          url: '/podcasts/:podcastId',
          templateUrl: 'podcast-detail/podcast-detail.html',
          controller: 'podcastDetailController',
          controllerAs: 'podcast-detail'
        })
        .state('add-podcast', {
          url: '/add-podcast',
          templateUrl: 'add-podcast/add-podcast.html',
          controller: 'addPodcastController',
          controllerAs: 'add-podcast'
        })
        .state('edit-podcast', {
          url: '/edit-podcast/:podcastId',
          templateUrl: 'edit-podcast/edit-podcast.html',
          controller: 'editPodcastController',
          controllerAs: 'edit-podcast'
        })
        .state('episodes', {
          url: '/episodes/:episodeId',
          templateUrl: 'episode-detail/episode-detail.html',
          controller: 'episodeDetailController',
          controllerAs: 'episode-detail'
        })
        .state('add-episode', {
          url: '/add-episode/:podcastId',
          templateUrl: 'add-episode/add-episode.html',
          controller: 'addEpisodeController',
          controllerAs: 'add-episode'
        })

        .state('search', {
          url: '/search?query',
          templateUrl: 'search/search.html',
          controller: 'searchController',
          controllerAs: 'search'
        })
        .state('user-profile', {
          url: '/user-profile',
          templateUrl: 'user-profile/user-profile.html',
          controller: 'userProfileController',
          controllerAs: 'user-profile'
        })*/;

    };

})();
