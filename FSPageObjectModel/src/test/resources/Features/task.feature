Feature: FreeCRM App Testing 



@SmokeTest
Scenario: validate Free CRM Tasks Page Test
Given user opens browser
Then user is on login page
Then user logs into app
Then validate home page title
Then validate logged in user
Then click on task link
Then create new task



