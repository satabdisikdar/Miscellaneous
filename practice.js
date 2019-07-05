const { Given, Then, When} = require('cucumber');
const { client } = require('nightwatch-api');

Given("I am on splitwise page",function(){
  client.url('https://www.splitwise.com/')
  .waitForElementVisible('body').useXpath()
  .assert.elementPresent('//a[text()="Sign up"]')
});

When("I click on {string}", function(option){
    let selector = '//a[text()="${option}"]';
    client.waitForElementVisible(selector).click(selector);
});

Then("I see {string} in the page", function(option){
  client.waitForElementVisible("//body").
        assert.containsText('//h2',"Introduce yourself".toUpperCase())
});

