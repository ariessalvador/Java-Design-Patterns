package StrategyPattern;

public class ShieldDefense implements DefenseStrategy {
    @Override
    public String defend() {
        return "is using a shield to defend!";
    }
}