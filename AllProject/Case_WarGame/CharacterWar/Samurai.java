package Case_WarGame.CharacterWar;

import Case_WarGame.IMethots;

public class Samurai extends CharacterWar implements IMethots {
    private final int fullHealth=20;
    public Samurai(String charName, int damage, int money, int health,int defense) {
        super(charName, damage, money, health,defense);
    }









    @Override
    public String selectChar(int enterWeapon,int enterArmor) {



        return null;
    }




    public int getFullHealth() {
        return fullHealth;
    }
}



