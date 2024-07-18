Feature: Swag labs

Scenario: Login To Swag labs using valid credentials
Given I goto browser "chrome" and goto to url "https://www.saucedemo.com/?ref=hackernoon.com"
When I write user name as "standard_user" 
And password as "secret_sauce"
Then login should successfull
Scenario: Add to cart successfully
Then add to cart
Then checkout
Scenario: Enter Information
Then Enter First name as "Snehal" 
And Last name as "Patil" 
And zipcode as "415108"
Then Continue and finish the process
Scenario: close tab
Then close browser
