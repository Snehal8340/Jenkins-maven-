Feature: Login to OrangeHRM 24july

Scenario: Login with valid inputs 24july
Given Launch browser to "chrome" and nevigate to url to 24july "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
When Type username as "Admin" 
And Type password as "admin123" 
Then Click login button
Then Quit browser