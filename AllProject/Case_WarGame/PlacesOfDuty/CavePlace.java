package Case_WarGame.PlacesOfDuty;

public class CavePlace extends Places{

    public CavePlace(int ıd, String placeName, String properties, int placeMoney) {
        super(ıd, placeName, properties, placeMoney);
    }
    public void info(){
        System.out.println("Welcome to Cave"+"\n"+
                "Here you have to overcome the obstacles in front of you and earn your loot.");
    }


}
