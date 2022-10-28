package WarriorGame;

import WarriorGame.Armor.Armor;
import WarriorGame.Armor.IceArmor;
import WarriorGame.Armor.OttomanArmor;
import WarriorGame.Armor.WolfArmor;
import WarriorGame.CharacterWar.Archer;
import WarriorGame.CharacterWar.CharacterWar;
import WarriorGame.CharacterWar.Chivalry;
import WarriorGame.CharacterWar.Samurai;
import WarriorGame.Monster.Bear;
import WarriorGame.Monster.Lion;
import WarriorGame.Monster.Monster;
import WarriorGame.Monster.Vampire;
import WarriorGame.PlacesOfDuty.*;
import WarriorGame.Weapon.Gun;
import WarriorGame.Weapon.Sword;
import WarriorGame.Weapon.Weapon;
import WarriorGame.Weapon.Arrow;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int a=0;//for while loop


        /////////////////////////////////---Create Character for Game---////////////////////////////////////////////////
        CharacterWar samurai=new Samurai("Samurai",5,21,25,0);
        CharacterWar archer=new Archer("Archer",7,18,21,0);
        CharacterWar chivalry=new Chivalry("Chivalry",8,24,5,0);
        /// ////////////////////////////////////---Create Armor---//////////////////////////////////////////////////////
        Armor iceArmor=new IceArmor("Armor","Ice Armor",1,0,15,10);
        Armor ottomanArmor=new OttomanArmor("Armor","Ottoman Armor",2,0,10,10);
        Armor wolfArmor=new WolfArmor("Armor","Wolf Armor",3,0,5,5);
        /////////////////////////////////////---Crate Weapon---/////////////////////////////////////////////////////////
        Weapon arrow=new Arrow("Weapon","Arrow",1,15,15,0);
        Weapon gun=new Gun("Weapon","Gun",2,10,10,0);
        Weapon sword=new Sword("Weapon","Sword",3,5,5,0);
        /////////////////////////////////////---Crate Places---/////////////////////////////////////////////////////////
        Places home=new HomePlace(1,"Home","Regeneration",0);
        Places rever=new ReverPlace(2,"Rever","Prize Gold",1);
        Places cave=new CavePlace(3,"Cave","Prize Diner",2);
        Places volcano=new VolcanoPlace(4,"Volcano","Prize Horse",4);
        /////////////////////////////////////---Crate Monster---////////////////////////////////////////////////////////
        Monster vampire=new Vampire("Vampire",1,10,100,10);
        Monster  bear=new Bear("Bear",2,15,100,15);
        Monster  lion=new Lion("Lion",3,20,100,20);

        System.out.println("Welcome to Warrior Game!");
        System.out.println("");
        System.out.println("----------------------------------------------------");
        System.out.print("Please enter name:");
        String userName=input.nextLine();
        User user=new User(userName,1,0);
        System.out.println("");
        System.out.println("");
        System.out.println("----------------------------------------------------");

        System.out.println("Welcome "+"Mutalip"+": There are a war word!!!");
        System.out.println("Mind your step!!!");
        System.out.println("-----------------------------------------------------");
        System.out.println("Please Select Your Character!");
        System.out.println("ID:1-Samurai :\tDamage:5\tHealth:20\tMoney:21\tDefense:0 ");
        System.out.println("ID:2-Archer  :\tDamage:5\tHealth:20\tMoney:21\tDefense:0 ");
        System.out.println("ID:3-Chivalry:\tDamage:5\tHealth:20\tMoney:5\tDefense:0");
        System.out.println("");
        System.out.println("Please Enter Character Id:");
        int selectCharId=input.nextInt();
        if (selectCharId==1) {
            user.setUserMoney(samurai.getMoney());
            while (a == 0) {
                System.out.println("Please Enter Samurai Armor:");
                iceArmor.printAll();
                ottomanArmor.printAll();
                wolfArmor.printAll();
                System.out.println("-----------------------------------------------");

                int selectArmor = input.nextInt();

                if ("ok" == iceArmor.armorControl(selectArmor)) {
                    user.setUserMoney(user.getUserMoney() - iceArmor.getMoney());
                    a++;
                } else {
                    System.out.println("Samurai can use Ice Armor--Please select this armor!!!");
                }
            }a=0;


            System.out.println("----------------------------------------------");

            do {
                System.out.println("Please Enter Samurai Weapon:");
                arrow.printAll();
                gun.printAll();
                sword.printAll();
                System.out.println("----------------------------------------------");
                int selectWeapon = input.nextInt();
                if ("ok" == sword.weaponControl(selectWeapon)) {
                    user.setUserMoney(user.getUserMoney() - sword.getMoney());
                    a++;
                } else {
                    System.out.println("Samurai can use Sword Weapon--Please select this weapon!!! ");
                }

            } while (a == 0);a=0;
            samurai.setDefense(iceArmor.getDefense());
            samurai.setDamage(sword.getDamage());
            samurai.createChar(iceArmor, sword);

            System.out.println("==============================================");
            System.out.println("User Name: " + user.getUserName() + "|" + "User Money: " + user.getUserMoney());
            System.out.println("Char Name: " + samurai.getCharName() + "|" + "Damage: " + samurai.getDamage() + "|" + "Health: " + samurai.getHealth() + "|" + "Weapon: " + sword.getInvName() + "|" + "Armor: " + samurai.getArmor().getInvName() + "|" + "Defense:" + samurai.getDefense());
            System.out.print("Armor Properties: ");
            iceArmor.printAll();
            System.out.print("Weapon Properties: ");
            sword.printAll();
            System.out.println();
            System.out.println("==============================================");

            System.out.println("Now that we've completed our preparations, you need to complete the missions.");
            System.out.println("");
            System.out.println("Remember, you have to complete the missions in all locations.");
            System.out.println("");
            System.out.println("Let's  Start");

            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("---------------------------------------------------------------------");

            do {
                home.printAllPlaces();
                rever.printAllPlaces();
                cave.printAllPlaces();
                volcano.printAllPlaces();

                System.out.println("Please Enter Place  ID:");
                int enterPlace = input.nextInt();

                if (enterPlace==1){
                    System.out.println("Your select ");
                    home.printAllPlaces();
                    home.info();
                    a++;
                } else if (enterPlace==2) {
                    System.out.println("Your select ");
                    rever.printAllPlaces();
                    rever.info();
                    a++;

                } else if (enterPlace==3) {
                    System.out.println("Your select");
                    cave.printAllPlaces();
                    cave.info();
                    a++;

                } else if (enterPlace==4) {
                    System.out.println("Your select");
                    volcano.printAllPlaces();
                    volcano.info();
                    a++;

                }else {
                    System.out.println( "Wrong enter please try again");
                }
            }while (a==0);a=0;

            Test test=new Test();
            if (test.placeContinue(rever,vampire)==1){
                fiht fiht=new fiht();
                if (fiht.fightVampire(samurai,vampire)==1){
                    System.out.println("Congratulations you are finish river place");
                }else
                    System.out.println("Next time");
            }else
                System.out.println("Next time");
            
            








        }
    }
}
