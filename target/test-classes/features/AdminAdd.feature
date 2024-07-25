Feature: Login to OrangeHRM And Admin Add new user successfully

Scenario: Login with valid inputs
Given Launch browser to 25july "chrome" and nevigate to url "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
When Type username 25july as "Admin" 
And Type password 25july as "admin123" 
Then Click login button 25july

Scenario: Admin Add new user
Then Click on Admin button and nevigate to Admin page 
And Click on Add button
Then Click user role 
And Click choice admin
And Enter Emolyee name as "Ranga  Akunuri"
And Choice Employee name
And Select Status as enable
Then Enter User name as "Snehal"
Then Enter password as "Snehal@123"
Then Enter Confirm password as "Snehal@123"
Then Click on save button
Then Close the browser