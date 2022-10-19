package WarriorGame.Weapon;

import WarriorGame.Inventory;

public abstract class Weapon extends Inventory {
    public Weapon(String invType, String invName, int id, int damage, int money,int defence) {
        super(invType, invName, id, damage, money,defence);
    }
    public void printAll(){
        System.out.println("Id: "+getId()+" Name:"+getInvName()+" Damage:"+getDamage()+
                        " Armor Power:" + getDefense()+" Money:"+getMoney());
    }
    public String weaponControl(int enterWeapon){
        String a="Not enough money";
        if (enterWeapon==2){

            return a;
        } else if (enterWeapon==1) {
            return a;

        }else
            return "ok";



    }
}
