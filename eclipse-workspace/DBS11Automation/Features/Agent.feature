@FunctionalTest
Feature: Agent login

	@SmokeTest
  Scenario: Agent login with valid credentials
  
    Given Agent lands on login page
    And Agent enters username and password
    Then Agent lands on home page  