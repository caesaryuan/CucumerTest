Feature: Depositing money in to a User account

  Scenario: Depositing money in to User's account should add money to the User's current balance
    Given a User has £0 in their account
    When £100 is deposited into the account
    Then the balance should be £100

    Given a User has £100 in their account
    When £50 is deposited into the account
    Then the balance should be £150