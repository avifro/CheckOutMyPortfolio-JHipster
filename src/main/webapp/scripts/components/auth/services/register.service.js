'use strict';

angular.module('checkoutmyportfolioApp')
    .factory('Register', function ($resource) {
        return $resource('api/register', {}, {
        });
    });


