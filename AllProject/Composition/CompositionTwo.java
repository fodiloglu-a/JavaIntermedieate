package Composition;

public class CompositionTwo {
    private  String country;
    private String city;

    private Composition composition;//Add Composition class



    public CompositionTwo(String country, String city,Composition composition) {
        this.country = country;
        this.city = city;
        this.composition=composition;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public  Composition getComposition() {
        return composition;
    }

    public void setComposition(Composition composition) {
        this.composition = composition;
    }
}
