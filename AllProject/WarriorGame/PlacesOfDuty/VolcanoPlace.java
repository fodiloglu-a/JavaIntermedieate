package WarriorGame.PlacesOfDuty;

public class VolcanoPlace extends Places{

    public VolcanoPlace(int ıd, String placeName, String properties, int placeMoney) {
        super(ıd, placeName, properties, placeMoney);
    }
    public void info(){
        System.out.println("Welcome to  Volcano"+"\n"+
                "Here you have to overcome the obstacles in front of you and earn your loot.");
    }


}
