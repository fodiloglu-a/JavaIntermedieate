package Case_WarGame.PlacesOfDuty;

public abstract class Places {
    private int ıd;
    private String placeName;
    private String properties;
    private int placeMoney;

    public Places(int ıd, String placeName, String properties, int placeMoney) {
        this.ıd = ıd;
        this.placeName = placeName;
        this.properties = properties;
        this.placeMoney = placeMoney;
    }

    public void printAllPlaces() {
        System.out.println("Id: " + this.ıd + "Name: " + this.placeName + "Properties: " + this.properties + "Enter Place Money: " + this.placeMoney);

    }

    public void info(){

    }


































    public void setId(int ıd) {
        this.ıd = ıd;
    }

    public int getId() {
        return ıd;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public int getPlaceMoney() {
        return placeMoney;
    }

    public void setPlaceMoney(int placeMoney) {
        this.placeMoney = placeMoney;
    }
}
