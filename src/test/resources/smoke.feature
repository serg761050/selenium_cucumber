Feature: Smoke
  As a user
  I want to test all main site functionality
  So that I can be sure that site works correctly

  Scenario Outline: Check home page functionality
    Given User opens '<home page>' site
    And User checks header visibility
    And User checks cart icon visibility

    Examples:
    | home page |
    | https://www.ebay.com/ |

  Scenario Outline: Check cart
    Given User opens '<home page>' site
    And User click login button



    Examples:
      | home page |
      | https://www.ebay.com/ |




