const jQuery = require('jquery');

var arr = [ "one", "two", "three", "four", "five" ];
var obj = { one:1, two:2, three:3, four:4, five:5 };



jQuery.each( obj, function( key, value ) {
    console.log( key + ": " + value );
  });

