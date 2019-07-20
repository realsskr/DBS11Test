@FunctionalTest
Feature: Admin functions

	
  Scenario: Admin approves the Agent registration
  
    Given Admin lands on login page
    And Admin enters <Username> and <Password>
    Then Admin lands on home page
    And Admin Navigate to the Pending agent requests page
    Then Admin verifies and clicks approves the request

    	
  Scenario: Admin rejects the Agent registration
  
    Given Admin lands on login page
    And Admin enters <Username> and <Password>
    Then Admin lands on home page
    And Admin Navigate to the Pending agent requests page
    Then Admin verifies and clicks approves the request