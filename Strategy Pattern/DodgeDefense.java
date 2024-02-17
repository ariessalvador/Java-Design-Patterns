package StrategyPattern;

public class DodgeDefense implements DefenseStrategy {
    @Override
    public String defend() {
        return " is dodging to avoid attack!";
    }
}