package Encapsulation;

public class UsesA {//This class for Dependency uses a

    private  String userName;
    private  String userSurname;
    private  String code;
    private int Id;
    public TestEncapsulation age;



    public UsesA(String userName,String userSurname, String code) {
        this.userName = userName;
        this.code = code;
        this.userSurname=userSurname;


    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double isId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }
    public void setUserSurname(String userSurname){this.userName=userName;}
    public String getUserSurname(){return userSurname;}

    public  int createId(TestEncapsulation use){ //This code I'am used for "uses a"-Dependency-
        this.Id=use.getAge()*5;
        return this.Id;
    }










}
