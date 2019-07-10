const { Given, Then, When} = require('cucumber');
const { client } = require('nightwatch-api');
const ele = client.page.elements();

Given("I am on {string} page",async function(homeLink){
  await client.url('https://www.splitwise.com/');
  await client.pause(500);
  await ele.waitForElementVisible(`@${homeLink}Home`).assert.elementPresent(`@${homeLink}Home`);
});

When("I click on {string}", async function(option){
    console.log("WHEN TAG starts!!");
    await ele.waitForElementVisible('@signUpButton').click('@signUpButton');
});

Then("I see {string} in the page", async function(option){
  await client.useXpath().waitForElementVisible(`//h2[text()='${option}']`).useXpath().
        assert.containsText(`//h2[text()='${option}']`,`${option}`.toUpperCase())
});

