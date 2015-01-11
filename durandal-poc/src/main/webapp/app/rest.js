define(function (require) {
  var ko = require('knockout'),
      http = require('plugins/http');
  var time = ko.observable();
  var getTime = function() {
	  var url = 'webapi/myresource';
	  return http.get(url).then(function(response) {
          time(response);
       }); 
  };
  
  return {
     result: time,
     updateField: getTime,
     activate: function () {
    	 getTime();
     }
   };
});