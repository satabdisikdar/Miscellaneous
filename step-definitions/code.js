const client= require('nightwatch-api');
import objects, { flagIcon } from '../pageObjects/objects';

Given ("I open amazon url", async()=>{
    client.url('https://www.amazon.in/');
    console.log("amazon");
});

Then ("I am on homepage" , async()=>{
    let sel = 'css or xpath of home logo'
    await client.waitForElementPresent(sel).assert.elementPresent(sel);
});

When ("I click on flag icon", async()=>{
    await objects.waitForElementPresent(flagIcon).click(flagIcon);
})


Then('I see languages dropdown', async()=>{
    let sel = 'css or xpath of dropdown'
    await client.waitForElementPresent(sel).assert.elementPresent(sel);
});

When("I select {string} from the list" , async(lang)=>{
    let sel = 'css or xpath of lang boxes';
    await client.waitForElementPresent(sel).assert.containsText(sel,lang);
    let button= `xpath with ${lang}`
    await client.waitForElementPresent(button).click(button);

});

Then("Page language changes to Kannada", async()=>{
    let sel = 'xpath for radio button enabled for KN language';
    await client.waitForElementPresent(sel).assert.elementPresent(sel);
});
