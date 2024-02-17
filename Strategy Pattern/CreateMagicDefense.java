package StrategyPattern;

public class CreateMagicDefense implements DefenseStrategy {
    @Override
    public String defend() {
        return "is creating a magic barrier for defense!";
    }
}