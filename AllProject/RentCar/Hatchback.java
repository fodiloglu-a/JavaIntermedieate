package RentCar;

public class Hatchback extends Car implements IRentCar{
    public Hatchback(int luggage, String marka, String color) {
        super(luggage, marka, color);
    }

    @Override
    public void montllyRent() {

    }

    @Override
    public void daylyRent() {

    }
}
