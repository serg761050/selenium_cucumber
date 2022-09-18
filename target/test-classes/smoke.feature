Feature: Smoke
  As a user
  I want to test all main site functionality
  So that I can be sure that site works correctly

  Scenario: Check home page functionality
    Given User opens "https://www.ebay.com/" site
    And User checks header visibility
#    And User checks footer visibility
    And User checks myEbayButton visible
#    And