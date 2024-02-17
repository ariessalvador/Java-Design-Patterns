# GameApp Character Class with Strategy Pattern

## Overview

In our game application, we have three types of characters: Knight, Wizard, and Archer. Each character has specific attack and defense strategies. We've implemented the Strategy Pattern to encapsulate these strategies and allow characters to switch them dynamically.

## Character Class Definition

### Character

The `Character` class represents the characters in our game. It implements the `CharacterType` interface to support polymorphic behavior for attacks and defense strategies.

## Strategy Interfaces

### AttackStrategy

The `AttackStrategy` interface defines the contract for different attack strategies.

### DefenseStrategy

The `DefenseStrategy` interface defines the contract for different defense strategies.

## Concrete Strategies

We have concrete implementations for both attack and defense strategies:
- For Attack:
  - `CastSpellAttack`: Used by the Wizard to cast spells.
  - `SwingSwordAttack`: Used by the Knight to swing swords.
  - `ShootArrowAttack`: Used by the Archer to shoot arrows.
- For Defense:
  - `ShieldDefense`: Used by the Knight to defend with a shield.
  - `CreateMagicDefense`: Used by both the Knight and Wizard to create magic barriers.
  - `DodgeDefense`: Used by the Archer to dodge attacks.

## Example Usage

```java
public class GameApp {
    public static void main(String[] args) {
        Character knight = new Character(new Knight());
        knight.attack();
        knight.defend();
        System.out.println();

        Character wizard = new Character(new Wizard());
        wizard.attack();
        wizard.defend();
        System.out.println();

        Character archer = new Character(new Archer());
        archer.attack();
        archer.defend();
    }
}
