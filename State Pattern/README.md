# Bank Account Management with State Pattern

## Overview

In our banking application, we need to manage different states of customer accounts, including active, suspended, and closed states. Each state imposes specific rules and restrictions regarding allowed operations, such as deposits, withdrawals, and account status changes. The existing implementation relies on conditional statements within the Account class, making it cumbersome and error-prone to manage multiple states and their associated logic.

To improve code maintainability and flexibility, we'll implement the State pattern:

1. **Define Account States**: Create separate classes representing different account states: ActiveState, SuspendedState, and ClosedState.
2. **Implement State Interface**: Define an interface AccountState with methods for common actions like deposit, withdraw, activate, suspend, and close.
3. **Implement State Behaviors**: Each concrete state class implements the AccountState interface, providing specific behavior for its respective state.
4. **Update Account Class**:
    - Include attributes for accountNumber and balance.
    - Remove state-specific logic from the Account class.
    - Introduce a reference to the current AccountState object.
    - Delegate actions like deposit, withdraw, activate, suspend, and close to the current state object through its corresponding methods.

## Logic

- If the account is active, you can either suspend it or close it.
- If the account is suspended, you can either activate or close it.
- If the account is closed, you cannot suspend or activate it.

## Composition of Account

- **Attributes**:
  - accountNumber: String
  - balance: Double
  - accountState: AccountState

- **Methods**:
  - Setter and getter methods
  - deposit(Double depositAmount): void
  - withdraw(Double withdrawAmount): void
  - suspend(): void
  - activate(): void
  - close(): void
  - toString() // displays account number and balance


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
        myAccount.deposit(1000.0); // update balance and display account number and current balance.

        // Withdraw from the account
        myAccount.withdraw(1323300.0); // update balance and display account number and current balance.

        // Close the account
        myAccount.close(); // displays "Account is closed!"

        // Attempt to activate a closed account
        myAccount.activate(); // displays "You cannot activate a closed account!"

        // Attempt to suspend a closed account
        myAccount.activate(); // displays "You cannot suspend a closed account!"

        // Attempt to withdraw from a closed account
        myAccount.withdraw(500.0); // Show message "You cannot withdraw from a closed account!".

        // Attempt to deposit into a closed account
        myAccount.deposit(1000.0); // Show message "You cannot deposit into a closed account!".
    }
}
