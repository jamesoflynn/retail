Feature: Create a new Bank customer to obtain an account.

  # Deposit into an account
  Scenario: Customer asks to have an account with the bank
    Given "Byron" is not a bank customer yet
    When a "Byron" asks to open an account.
    Then a customer object "Byron" is created for the bank.
