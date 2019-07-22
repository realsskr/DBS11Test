Feature: Free CRM Login

Scenario: User login successfully

	Given User lands on FREE CRM page
	When User clicks on login button
	And User enters email address and password
	Then User lands on home page
	