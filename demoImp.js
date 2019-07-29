const config = require('/home/abc/Desktop/Satabdi/test/demo.json');

for (let i = 0; i < config.cars.length; i++)
{
    for(let j = 0; j<=i ; j++){
        console.log(config.cars[i].models[j])
    }
}
