package StrategyPattern;

public class Character implements CharacterType{
    private CharacterType characterType;
    public Character (CharacterType characterType){
        this.characterType = characterType;
    }


    @Override
    public void attack() {
        characterType.attack();
    }

    @Override
    public void defend() {
        characterType.defend();
    }
}