Feature: Depositing money in to a User account

  Scenario Outline: Depositing and withdrawing money into/from User's account should end up with correct balance
    Given a User has £<initial> in their account
    When £<deposit> is deposited into the account
    And £<withdraw> is widthdrawn from the account
    Then the balance should be £<end>

    Examples:
      | initial | deposit | withdraw | end |
      |    0    |  100    |     0    | 100 |
      |    100  |  100    |     50   | 150 |
      |    50   |  0      |     100  | -50 |