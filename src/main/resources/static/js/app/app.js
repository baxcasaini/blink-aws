'use strict'

var demoApp = angular.module('demo', [ 'ui.bootstrap', 'demo.controllers',
		'demo.services' ]);
demoApp.constant("CONSTANTS", {
	getUserByIdUrl : "https://st9wu0vpia.execute-api.us-east-2.amazonaws.com/Prod/"
});