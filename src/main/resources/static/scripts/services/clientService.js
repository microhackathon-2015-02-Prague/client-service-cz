'use strict';

angular.module('BootstrapApplication.services')
  .factory('ClientService', ['$http', function ($http) {
    var clientService = {};
    clientService.saveClient = function (client) {
      return $http({
        url: '/clients/',
        dataType: 'json',
        method: 'POST',
        data: {'firstName': client.firstName, 'lastName': client.lastName, 'age': client.age, 'loanId': client.loanId},
        headers: {
          'Content-Type': 'application/json'
        }
      });
    };

    return clientService;
  }
  ]);
