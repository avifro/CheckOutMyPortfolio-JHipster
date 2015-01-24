'use strict';

angular.module('checkoutmyportfolioApp')
    .factory('Password', function ($resource) {
        return $resource('api/account/change_password', {}, {
        });
    });
