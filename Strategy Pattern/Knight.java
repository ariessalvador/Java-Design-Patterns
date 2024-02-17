package StrategyPattern;

public class Knight implements CharacterType{
    @Override
    public void attack() {
        SwingSwordAttack swingingSword = new SwingSwordAttack();
        System.out.println("Knight"+ swingingSword.attack());
    }

    @Override
    public void defend() {
        ShieldDefense shieldDefense = new ShieldDefense();
        CreateMagicDefense createMagicDefense = new CreateMagicDefense();
        DodgeDefense dodgeDefense = new DodgeDefense();

        System.out.println("Knight " + shieldDefense.defend());
        System.out.println("Knight " + createMagicDefense.defend());
        System.out.println("Knight" +  dodgeDefense.defend());

    }
}
