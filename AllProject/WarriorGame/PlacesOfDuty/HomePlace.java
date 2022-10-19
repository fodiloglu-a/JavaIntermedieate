package WarriorGame.PlacesOfDuty;

import WarriorGame.CharacterWar.CharacterWar;
import WarriorGame.User;

public  class HomePlace extends Places {


    public HomePlace(int ıd, String placeName, String properties, int placeMoney) {
        super(ıd, placeName, properties, placeMoney);
    }

    @Override
    public void info(){
        System.out.println("Home-Info:welcome home\n" +
                "here your health is regenerated and your armor is strengthened");

    }



}
