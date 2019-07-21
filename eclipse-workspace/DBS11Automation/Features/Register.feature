@FunctionalTest
Feature: Register on the application

@SmokeTest	
  Scenario: Agent registered successfully
  
    Given Agent lands on register page
    And Agent enters all the mandatory fields
    When Agent clicks on register button
    Then Agent is registered successfully
	
	
	@SmokeTest
  Scenario: Customer registered successfully
  
    Given Customer lands on register page
    And Customer enters all the mandatory fields
    When Customer clicks on register button
    Then Customer is registered successfully
