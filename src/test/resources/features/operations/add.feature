Feature: Apply additions on numbers

  We want add numbers because it's fun.

  Scenario: I want to add a number to another one
    Given two numbers 1 and 3
    When i make an addition
    Then result is equal to 4

  Scenario: I want to add a suite of numbers
    Given several numbers "1, 3, -8 , 151"
    When i make an addition
    Then result is equal to 147

  @fail
  Scenario: I expect a "NumberFormatException" exception for a wrong suite of numbers
    Given several numbers "1, 3, , 151"
    When i make an addition
    Then i expect a "NumberFormatException" exception

  @wip
  Scenario: I don't know really what i want to test for the moment
    Given ...
    When i make an action
    Then result is equal to 4

  @fail
  @wip
  Scenario: I still don't know really what i want to test for the moment
    Given ...
    When i make an action
    Then result is an error
