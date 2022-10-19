package WarriorGame.Armor;

import WarriorGame.Inventory;

public abstract class Armor extends Inventory {//zırh
    public Armor(String invType, String invName, int id, int damage, int money,int defence) {
        super(invType, invName, id, damage,money, defence);
    }
    public void  printAll(){
        System.out.println("Id: "+getId()+" |Name: "+ getInvName()+" |Damage: "+getDamage()+" |Money: "+getMoney()+"  |Armor Power: "+ getDefense());

    }
    public String armorControl(int enterArmor){
        String a="Not enough money";
        if (enterArmor==2){

            return a;
        } else if (enterArmor==3) {
            return a;

        }else
            return "ok";



    }



}


