package WarriorGame.CharacterWar;

import WarriorGame.CharacterWar.CharacterWar;

public class Chivalry extends CharacterWar {
    public Chivalry(String charName, int damage, int money, int health,int defense) {
        super(charName, damage, money, health,defense);
    }

    public String selectChar(){
        System.out.println("You are select>>"+getCharName());
        return null;
    }
}
