Feature: Login into Application

Scenario Outline: Positive test validating login
Given Initialize chrome browser
And Navigate to url "https://rahulshettyacademy.com"
And Click on login button
When Enter userName <username> and password <password>
Then Verify user is successfully logged in
And close browser

Examples:
|username				  		|password |
|test99@gmail.com			|123456		|
|test123@gmail.com		|123456   |