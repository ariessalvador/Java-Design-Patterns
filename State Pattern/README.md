# Bank Account Management System with State Pattern

## Overview

The bank needs to manage different states of customer accounts: active, suspended, and closed. Each state has specific rules and restrictions regarding allowed operations. Implementing the State pattern improves code maintainability and flexibility, allowing the system to handle various account states seamlessly.

## Account Class Definition

### Account

The `Account` class represents customer accounts. It includes the following features:
- Attributes:
  - accountNumber: String
  - balance: Double
  - accountState: AccountState
- Methods:
  - deposit(double amount): void
  - withdraw(double amount): void
  - suspend(): void
  - activate(): void
  - close(): void
  - toString(): String

## State Interfaces and Classes

### AccountState

The `AccountState` interface defines methods for common actions like deposit, withdraw, activate, suspend, and close.

### Concrete State Classes

We have concrete implementations for different account states:
- ActiveState: Allows deposits, withdrawals, suspension, and closure.
- SuspendedState: Disallows deposits and withdrawals but allows activation and closure.
- ClosedState: Disallows all transactions and state changes.

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
