# GameApp Character Class with Strategy Pattern

## Overview

In our game application, we have three types of characters: Knight, Wizard, and Archer. Each character has specific attack and defense strategies. However, the existing implementation of the Character class lacks flexibility and scalability, especially when it comes to handling different strategies for each character type.

To address these issues, we'll refactor the existing Character class and implement the Strategy Pattern for handling both attack and defense strategies in a more flexible and maintainable way.

## Character Class Definition

### Character

The `Character` class represents the characters in our game. It includes the following features:

- **Attributes:**
  - type: Represents the type of character (Knight, Wizard, or Archer).
  - attackStrategy: Defines the attack strategy for the character.
  - defenseStrategy: Defines the defense strategy for the character.

## Strategy Pattern Implementation

### AttackStrategy

The `AttackStrategy` interface defines the contract for different attack strategies. Each concrete attack strategy class implements this interface.

### DefenseStrategy

The `DefenseStrategy` interface defines the contract for different defense strategies. Each concrete defense strategy class implements this interface.

### Concrete Strategies

We have concrete implementations for both attack and defense strategies:
- For Attack:
  - CastSpellAttack
  - ShootArrowAttack
  - SwingSwordAttack
- For Defense:
  - ShieldDefense
  - DodgeDefense
  - CreateMagicDefense

## Example Usage

```java
// Creating a Knight character with specific attack and defense strategies
Character knight = new Character(new Knight());

// Creating a Wizard character with specific attack and defense strategies
Character wizard = new Character(new Wizard());

// Creating an Archer character with specific attack and defense strategies
Character archer = new Character(new Archer());

// Performing actions with characters
knight.attack();
knight.defend();

wizard.attack();
wizard.defend();

archer.attack();
archer.defend();

