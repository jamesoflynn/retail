Feature: Make a deposit

  # Deposit into an account
  Scenario: Customer deposits into their account
    When the Customer deposits 10 euros into their account
    Then their account is incremented by 10 euros
    
    