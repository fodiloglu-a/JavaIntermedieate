package RentCar;

public abstract class Car {
    private  int luggage;
    private String Marka;
    private String color;

    public Car(int luggage, String marka, String color) {
        this.luggage = luggage;
        Marka = marka;
        this.color = color;
    }

    public   abstract void montllyRent();







    public int getLuggage() {
        return luggage;
    }

    public void setLuggage(int luggage) {
        this.luggage = luggage;
    }

    public String getMarka() {
        return Marka;
    }

    public void setMarka(String marka) {
        this.Marka = marka;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
