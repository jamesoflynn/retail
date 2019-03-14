@start
Feature: Create a new Bank customer to obtain an account.

	@test1
  Scenario: Customer asks to have an account with the bank
    Given "Byron" is not a bank customer yet
    When a "Byron" asks to open an account.
    Then a customer object "Byron" is created for the bank.

  @test2
  Scenario Outline: Customer with a bank account attempts to deposit money.
    Given "Byron" now has an account
    When "Byron" deposits <amount> into his account
    Then the <balance> is equal to <expected>
    
    Examples:
    | amount | balance | expected |
    | 10     | 10      | 10       |