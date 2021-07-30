Feature: Login to amazon app

Scenario: Verify if login sucessfully
Given User is on sign in page
When title of the page is amazon
Then  enter username and password
Then Check if user is navigated to home page
 