package Case_WarGame;

import Case_WarGame.CharacterWar.CharacterWar;
import Case_WarGame.Monster.Monster;

import java.util.Scanner;

public class fiht {
    Scanner input=new Scanner(System.in);
    public int fightVampire(CharacterWar caharacterWar, Monster monster){
        int firstHealt=caharacterWar.getHealth();

        while(true){
            System.out.println("1.Round");
            System.out.println("-------");
            System.out.println("First Shout"+caharacterWar.getCharName());
            System.out.println("-------");
            caharacterWar.setHealth(caharacterWar.getHealth()-(monster.getMonsterDamage()));
            System.out.println("-------");
            System.out.println(caharacterWar.getCharName()+":"+"Health: "+caharacterWar.getHealth());
            System.out.println("Do you want continue(1/0)");
            int cont=input.nextInt();
            if (cont==1){
                System.out.println("Second Shout"+monster.getMonsterName());
                System.out.println("-------");
                caharacterWar.setHealth(caharacterWar.getHealth()-(monster.getMonsterDamage()));
                System.out.println("-------");
                return 1;

            }else {
                caharacterWar.setHealth(firstHealt);
                return 0;
            }






        }
    }
}
