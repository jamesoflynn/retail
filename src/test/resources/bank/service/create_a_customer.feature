@start
Feature: Create a new Bank customer to obtain an account.

  @CreateCustomer
  Scenario Outline: Customer asks to have an account with the bank
    Given  A customer with <name> is not a bank customer yet
    When <name> asks to open an account.
    Then a customer object for <name> is created for the bank.

    Examples:
    | name      |
    | Byron     |

  @DepositAmount
  Scenario Outline: Customer with a bank account attempts to deposit money.
    Given <name> now has an account
    When <name> deposits <amount> into his account
    Then the <balance> is equal to <expected>
    
    Examples:
    | name   | amount | balance | expected |
    | Byron  | 10     | 10      | 10       |