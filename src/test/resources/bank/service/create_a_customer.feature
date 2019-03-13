Feature: Create a new Bank customer to obtain an account.

  # Deposit into an account
  Scenario: Customer asks to have an account with the bank
    Given "Aaron" is not a bank customer yet
    When a "Aaron" asks to open an account.
    Then a customer object is created for the bank.
