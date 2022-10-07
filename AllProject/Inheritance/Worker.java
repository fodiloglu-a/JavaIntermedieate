package Inheritance;//SUPER CLASSS

public class Worker {
    private String name;
    private String surname;
    private String ePost;

    public Worker(String name,String surname,String ePost) {
        this.name = name;
        this.surname = surname;
        this.ePost = ePost;
    }
     //Get and Set Methot
    public String getName() {        return name;    }

    public void setName(String name) {        this.name = name;    }

    public String getSurname() {        return surname;    }

    public void setSurname(String surname) {        this.surname = surname;    }

    public String getePost() {        return ePost;    }

    public void setePost(String ePost) {this.ePost = ePost;    }

    //Inheritance Methot
    public  void enter(){
        System.out.println(this.name+" Enter University");
    }
    public void exit(){
        System.out.println(this.name+" Exit University");
    }
    public  void diningHall(){
        System.out.println(this.name+" Enter Dining Hall");
    }


}
