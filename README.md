# retail
Wemanity Kata for SpringBoot and TDD

Copied from https://gist.github.com/abachar/d20bdcd07dac589feef8ef21b487648c


# Bank account kata
Think of your personal bank account experience When in doubt, go for the simplest solution

# Requirements
- Deposit and Withdrawal
- Account statement (date, amount, balance)
- Statement printing

# User Stories
##### US 1:
**In order to** save money  
**As a** bank client  
**I want to** make a deposit in my account  

Interpretation: A "bank" HAS "clients", a "client HAS "account(s)", an "account contains, has, "money"

    Bank -> Client -> Account -> Money

Step 1: An account has Money, which can be deposited.

##### US 2: 
**In order to** retrieve some or all of my savings  
**As a** bank client  
**I want to** make a withdrawal from my account  

Step 2: Money can be withdrawn from an Account which has enough balance.

##### US 3: 
**In order to** check my operations  
**As a** bank client  
**I want to** see the history (operation, date, amount, balance)  of my operations

Interpretation: as a client, I want a Ledger of the operations I have carried out on my Account, which I want to consult on the basis of a time window.

A new user story to take this a little further

##### US 4:
**In order to** make money  
**As a** bank  
**I want to** have customers that will places their money in accounts provided by the bank.

##### US 5:
**In order to** make deposits and withdrawals . 
**As a** Bank client . 
**I want to** Access my account from a banking service.
