package WarriorGame.CharacterWar;

import WarriorGame.CharacterWar.CharacterWar;

public class Archer extends CharacterWar {
    public Archer(String charName, int damage, int money, int health,int defense) {
        super(charName, damage, money, health,defense);
    }

    public String selectChar(){
        System.out.println("You are select>>"+getCharName());
        return null;
    }
}
