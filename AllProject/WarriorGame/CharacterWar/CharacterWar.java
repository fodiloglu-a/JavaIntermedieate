package WarriorGame.CharacterWar;

import WarriorGame.Armor.Armor;
import WarriorGame.IMethots;
import WarriorGame.Weapon.Weapon;

public abstract  class CharacterWar implements IMethots {

    private  int damage;
    private int money;
    private int health;
    private int defense;
    private final int fullHealth=20;

    private  String charName;
    private Armor armor;
    private Weapon weapon;

    public CharacterWar(String charName,int damage, int money, int health,int defense) {
        this.damage = damage;
        this.money = money;
        this.health = health;
        this.charName = charName;
        this.defense=defense;
    }
    //Methods

    public String selectChar(int enterArmor,int enterWeapon){
        return null;
    }


    public  void createChar(Armor armor,Weapon weapon){
        this.armor=armor;
        this.weapon=weapon;

    }







    //GET UND SET METHOD


    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }



    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public Armor getArmor() {
        return armor;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public int getFullHealth() {
        return fullHealth;
    }
}
