'use strict';

angular.module('checkoutmyportfolioApp')
    .controller('LogoutController', function (Auth) {
        Auth.logout();
    });
