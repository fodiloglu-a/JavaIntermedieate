package Encapsulation;

public class TestEncapsulation {
    private String name;
    private String surname;
    private int age;
    public int use =9;
    public  static final int num=123;


   public TestEncapsulation(String name,String surname,int age){
       if (age<0){//Here I'm used Encapsulation....
           age=0;
       }
        this.age=age;
        this.name=name;
        this.surname=surname;

    }
    /**/

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        if (age<0){             //Here I used Encapsulation....
            age=0;
        }
        this.age = age;
    }
}
