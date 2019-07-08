const { Given, Then, When} = require('cucumber');
const { client } = require('nightwatch-api');
const ele = client.page.elements();

Given("I am on splitwise page",function(){
  client.url('https://www.splitwise.com/')
  .waitForElementVisible('body').useXpath()
  .assert.elementPresent('body')
});

When("I click on {string}", function(option){
    ele.waitForElementVisible('@signUpButton').click('@signUpButton');
});

Then("I see {string} in the page", function(option){
  client.waitForElementVisible("//body").
        assert.containsText('//h2',"Introduce yourself".toUpperCase())
});

