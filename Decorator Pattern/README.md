# CIMB Digital Bank - Savings Account System

## Overview

CIMB is a digital bank that provides innovative savings account options, including GSave and UpSave. These accounts have unique features and benefits, and the system follows a decorator pattern approach for flexible functionality.

## Class Definitions

### BankAccount
The `BankAccount` class represents a typical savings account with attributes such as `accountNumber`, `accountName`, and `balance`. It serves as the base class for the decorator pattern.

### SavingsAccountDecorator (Interface)
The `SavingsAccountDecorator` interface defines the methods that decorators must implement. It includes methods for showing account type, getting interest rates, retrieving balance, displaying benefits, computing balance with interest, and showing account information.

### StandardSavingsAccount
The `StandardSavingsAccount` class is a concrete class implementing the `SavingsAccountDecorator` interface. It represents the typical savings account with a 1% interest rate.

### GSaveAccount
The `GSaveAccount` class is a concrete decorator for the GSave savings account. It extends the `SavingsAccountDecorator` interface and adds functionality such as a 2.5% interest rate and additional benefits like "GCash transfer."

### UpSaveAccount
The `UpSaveAccount` class is a concrete decorator for the UpSave savings account. It extends the `SavingsAccountDecorator` interface and adds functionality such as a 4.0% interest rate and benefits like "With Insurance."


## Decorator Pattern

The decorator pattern allows for dynamic and flexible features for different types of savings accounts. Decorators can be stacked to combine the benefits of multiple account types.

## Expected Behavior

- `showAccountType()` returns "Savings Account," "GSave," or "UpSave."
- `getInterestRate()` returns the corresponding interest rate (1%, 2.5%, or 4.0%).
- `getBalance()` returns the current balance of the account.
- `showBenefits()` returns the benefits associated with each account type.
- `computeBalanceWithInterest()` calculates the new balance with added interest based on the interest rate.
- `showInfo()` returns details of the account, including the account number, account name, and balance.

## UML Diagram




