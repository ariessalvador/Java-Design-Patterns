# Bank Account Management with State Pattern

## Overview

In our banking system, we need to manage different states of customer accounts, including active, suspended, and closed states. Each state imposes specific rules and restrictions regarding allowed operations. We'll implement the State pattern to improve code maintainability and flexibility.

## Account States and Rules

1. **Active Accounts:**
   - Allow deposits and withdrawals.
2. **Suspended Accounts:**
   - Disallow deposits and withdrawals transactions, but allow viewing account information.
3. **Closed Accounts:**
   - Disallow all transactions and viewing of account information.

## State Pattern Implementation

### AccountState Interface

Defines the contract for different account states, including methods for deposit, withdraw, activate, suspend, and close operations.

### Concrete State Classes

1. **ActiveState:**
   - Implements the behavior for active accounts.
2. **SuspendedState:**
   - Implements the behavior for suspended accounts.
3. **ClosedState:**
   - Implements the behavior for closed accounts.

### Account Class

Represents customer accounts and manages their states.
- Includes attributes for account number and balance.
- Delegates operations to the current account state object.
- Removes state-specific logic from the Account class.

## Usage Example

```java
public class AccountTest {
    public static void main(String[] args) {
        Account myAccount = new Account("1234", 10000.0); // Set acct to active state
        myAccount.activate(); // Displays "Account is already activated!"

        // Suspend the account
        myAccount.suspend(); // Displays "Account is suspended!"

        // Activate the account
        myAccount.activate(); // Displays "Account is activated!"

        // Deposit to the account
        myAccount.deposit(1000.0); // Update balance and display account number and current balance

        // Withdraw from the account
        myAccount.withdraw(100.0); // Update balance and display account number and current balance

        // Close the account
        myAccount.close(); // Displays "Account is closed!"

        // Activate the account
        myAccount.activate(); // Displays "You cannot activate a closed account!"

        // Suspend the account
        myAccount.activate(); // Displays "You cannot suspend a closed account!"

        // Withdraw from the account
        myAccount.withdraw(500.0); // Shows message "You cannot withdraw on a closed account!" and displays current balance and account number

        // Deposit to the account
        myAccount.deposit(1000.0); // Shows message "You cannot deposit on a closed account!" and displays current balance and account number
    }
}
