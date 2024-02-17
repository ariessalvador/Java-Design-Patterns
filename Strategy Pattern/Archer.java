package StrategyPattern;

public class Archer implements CharacterType{
    @Override
    public void attack() {
        ShootArrowAttack shootArrowAttack = new ShootArrowAttack();
        System.out.println("Archer" + shootArrowAttack.attack());
    }

    @Override
    public void defend() {
        DodgeDefense dodgeDefense = new DodgeDefense();
        System.out.println("Archer" + dodgeDefense.defend());

    }
}
