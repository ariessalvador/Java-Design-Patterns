package StrategyPattern;

public class Wizard implements CharacterType{
    @Override
    public void attack() {
        CastSpellAttack castSpellAttack = new CastSpellAttack();
        System.out.println("Wizard " + castSpellAttack.attack());
    }

    @Override
    public void defend() {
        CreateMagicDefense createMagicDefense = new CreateMagicDefense();
        System.out.println("Wizard " + createMagicDefense.defend());

    }
}
