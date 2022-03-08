Feature: Free CRM Application Test

#@SmokeTest
Scenario: DataDriven Free CRM Deals Page Test
Given user opens browser
Then user is on login page
Then user logs into app
Then validate home page title
Then validate logged in user
Then click on deals link
Then create new datadriven deals
| Test@456	| 1000 	| 10  | 2	|






