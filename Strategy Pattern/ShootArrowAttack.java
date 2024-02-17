package StrategyPattern;

public class ShootArrowAttack implements AttackStrategy {
    @Override
    public String attack() {
        return " shoots an arrow!";
    }
}
