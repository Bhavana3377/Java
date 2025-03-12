Feature:

@SmokeTest
Scenario: To check title of the application
Given User opens the Browser
And User navigates to the "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login" Webpage
Then User verifies the title of the Webpage
And User closes the Browser

@RegressionTest

Scenario Outline: User checks login functionality
Given User opens the Browser
And User navigates to the "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login" Webpage
When user enters '<username>' username
And user enters'<password>' password
And user clicks login button
Then user verifies the profile account
And User closes the Browser
Examples: 
|username|password|
|Admin|admin123|
|Admin|admin123|