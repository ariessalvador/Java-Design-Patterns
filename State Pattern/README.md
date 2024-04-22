# Bank Account Management System with State Pattern

## Overview

A bank needs to manage different states of customer accounts, including active, suspended, and closed. Each state has specific rules and restrictions regarding allowed operations, and accounts have associated attributes like account number and balance.

- **Active accounts:** Allow deposits and withdrawals.
- **Suspended accounts:** Disallow deposits and withdrawals transactions but allow viewing account information.
- **Closed accounts:** Disallow all transactions and viewing of account information.

Currently, the system relies on conditional statements within the Account class to check the account state and determine valid actions. This approach becomes cumbersome and error-prone as the number of states and their associated logic grows.

We will implement the State pattern to improve code maintainability and flexibility.

## Implementation Steps

1. **Define Account States:**
   - Create separate classes representing different account states: ActiveState, SuspendedState, and ClosedState.
2. **Implement State Interface:**
   - Define an interface AccountState with methods for common actions like deposit, withdraw, activate, suspend, and close.
3. **Implement State Behaviors:**
   - Each concrete state class implements the AccountState interface, providing specific behavior for its respective state. For example, the ActiveState class would allow deposits and withdrawals, while the ClosedState wouldn't allow any transactions.
4. **Update Account Class:**
   - Include attributes for accountNumber and balance.
   - Remove state-specific logic from the Account class.
   - Introduce a reference to the current AccountState object.
   - Delegate actions like deposit, withdraw, activate, suspend, and close to the current state object through its corresponding methods.

## Logic

- If the account is active, you can either suspend it or close it.
- If the account is suspended, you can either activate or close it.
- If the account is closed, you can neither suspend nor activate it.

## Composition of Account

- **Attributes:**
  - accountNumber: String
  - balance: Double
  - accountState: AccountState
- **Methods:**
  - Setter and getter methods
  - deposit(Double depositAmount): void
  - withdraw(Double withdrawAmount): void
  - suspend(): void
  - activate(): void
  - close(): void
  - toString() // displays account number and balance


## UML Diagram
![image](https://github.com/ariessalvador/Software-Engineering-Projects/assets/142958841/f174e749-a7cf-4e98-b10a-6268439181a2)


## Example Usage

```java
public class AccountTest {
    public static void main(String[] args) {
        Account myAccount = new Account("1234", 10000.0); // set account to active state
        myAccount.activate(); // displays "Account is already activated!"

        // Suspend the account
        myAccount.suspend(); // displays "Account is suspended!"

        // Activate the account
        myAccount.activate(); // displays "Account is activated!"

        // Deposit to the account
        myAccount.deposit(1000.0); // update balance and display account number and current balance

        // Withdraw from the account
        myAccount.withdraw(1000.0); // update balance and display account number and current balance

        // Close the account
        myAccount.close(); // displays "Account is closed!"

        // Attempt to activate the closed account
        myAccount.activate(); // Displays "You cannot activate a closed account!"

        // Attempt to suspend the closed account
        myAccount.activate(); // Displays "You cannot suspend a closed account!"

        // Attempt to withdraw from the closed account
        myAccount.withdraw(500.0); // Shows message "You cannot withdraw from a closed account!"

        // Attempt to deposit into the closed account
        myAccount.deposit(1000.0); // Shows message "You cannot deposit into a closed account!"
    }
}
