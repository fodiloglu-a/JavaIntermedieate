package Encapsulation;


//This project I m used Encapsulation and "uses a" Dependency....
public class Encapsulation {
    public static void main(String[] args) {
        TestEncapsulation  no1=new TestEncapsulation("Yaşar","Kemal",65);
        UsesA use1=new UsesA("Fyodor","Dostoyevski","Fdos");

        System.out.println(use1.createId(no1));
        //use1.createId(no1)
        //Up code: This code I'am used for "uses a"-Dependency-









    }
}
