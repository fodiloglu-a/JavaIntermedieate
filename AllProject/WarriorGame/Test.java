package WarriorGame;

import WarriorGame.Monster.Monster;
import WarriorGame.PlacesOfDuty.Places;

import java.util.Scanner;

public class Test {
    Scanner input=new Scanner(System.in);

    public int placeContinue(Places places, Monster monster){
        System.out.println("There are River");
        System.out.println("");
        System.out.println("Karşına çıkacak canavar: "+monster.getMonsterName());
        System.out.println("Properties Monster:");
        System.out.println("Name: "+monster.getMonsterName()+"Damage: "+monster.getMonsterDamage()+
                            "Power: "+monster.getMonsterPower());

        System.out.println("Would you like fight:(1/0)");
        int continueFight=input.nextInt();
        if (continueFight==0){
            return 0;

        } else if (continueFight==1) {
            return 1;

        }else return 0;

    }








}

