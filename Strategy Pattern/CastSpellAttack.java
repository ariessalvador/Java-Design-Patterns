package StrategyPattern;

public class CastSpellAttack implements AttackStrategy {
    @Override
    public String attack() {
        return "casts a spell!";
    }
}