var moment = require('moment'); // require
let myMap = new Map();

for(let i=1; i<=5; i++){
    myMap.set(i, moment().format());
}
console.log(myMap);
