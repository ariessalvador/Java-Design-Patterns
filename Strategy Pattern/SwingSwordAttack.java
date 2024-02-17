package StrategyPattern;

public class SwingSwordAttack implements AttackStrategy {
    @Override
    public String attack() {
        return " swings a sword!";
    }
}