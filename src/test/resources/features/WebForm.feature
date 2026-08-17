Feature: Web Form Submission
  As a user
  I want to fill and submit a web form
  So that I can test form functionality

  Background:
    Given user navigates to the web form

  @smoke @webform
  Scenario: Verify successful web form submission
    When user enters "Biswajit" in text field
    And user enters "Test@124" in password field
    And user enters "This is Selenium automation testing." in text area
    And user selects "Two" from dropdown
    And user selects checkbox
    And user selects radio button
    And user clicks submit button
    Then success message "Received!" should be displayed

  @webform
  Scenario: Verify web form with different values
    When user enters "Automation" in text field
    And user enters "Secure@Pass" in password field
    And user enters "Testing web forms with Cucumber BDD" in text area
    And user selects "Three" from dropdown
    And user selects checkbox
    And user selects radio button
    And user clicks submit button
    Then success message "Received!" should be displayed

  @screenshot
  Scenario: Capture screenshot of web form
    When user takes screenshot of "WebForm"
    Then screenshot should be saved