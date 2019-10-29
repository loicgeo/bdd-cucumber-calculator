Feature: Numbers division

  We want implement division, and manage error ERR_DIVIDE_BY_ZERO.

  Scenario: divide a number by another number
    Given two numbers 6 and 3
    When i make a division
    Then result is equal to 2

#   another way to do
  Scenario Outline: divide a number by another number
    Given two numbers <nb1> and <nb2>
    When i make a division
    Then result is equal to <result>

    Examples:
      | nb1 | nb2 | result |
      | 6   | 3   | 2      |
      | 8   | -2  | -4     |
      | 1   | 1   | 1      |

  @fail
  Scenario: divide a number by zero
    Given two numbers 6 and 0
    When i make a division
    Then i expect a "ERR_DIVIDE_BY_ZERO" exception
