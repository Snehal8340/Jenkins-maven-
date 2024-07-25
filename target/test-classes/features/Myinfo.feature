Feature: Login to OrangeHRM And Admin edit My Information

Scenario: Login with valid inputs
Given Launch browser to 25july24 "chrome" and nevigate to url "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
When Type username 25july24 as "Admin" 
And Type password 25july24 as "admin123" 
Then Click login button 25july24

Scenario: Admin enter data into My info
Then Click on MyInfo and nevigate to MyInfo page 
Then Enter First Name "Snehal"
And Enter middle Name "Santosh"
And Enter Last Name "Patil"
Then close the browser 