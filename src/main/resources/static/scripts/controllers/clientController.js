'use strict';

/**
 * @ngdoc function
 * # ClientCtrl
 */
angular.module('BootstrapApplication.controllers')
  .controller('ClientCtrl', ['$scope', 'ClientService', function ($scope, ClientService) {
    $scope.awesomeThings = [
      'HTML5 Boilerplate',
      'AngularJS',
      'Karma'
    ];

    $scope.client = {
      /*firstName: 'Ferda',
      lastName: 'Mravenec',
      age: 20,
      loanId: '123'*/
    };

    $scope.alerts = [];

    $scope.result = '';

    $scope.saveClient = function () {
      ClientService
        .saveClient($scope.client)
        .success(function (data) {
          $scope.result = "Client saved!!!";
          //$scope.result = data;
        })
        .error(function (reason) {
          $scope.alerts = [{msg: reason}];
        });
    };

    $scope.closeAlert = function (index) {
      $scope.alerts.splice(index, 1);
    };
  }]);
