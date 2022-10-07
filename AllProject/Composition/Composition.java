package Composition;

public class Composition {
    private  String name;
    private  String Surname;
    private  int Gsm;

    public Composition(String name, String surname, int gsm) {
        this.name = name;
        this.Surname = surname;
        this.Gsm = gsm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public int getGsm() {
        return Gsm;
    }

    public void setGsm(int gsm) {
        Gsm = gsm;
    }
}
