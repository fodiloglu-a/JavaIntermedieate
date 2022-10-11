package Inheritance;

public class Lecturer extends Academician {
    private String doorNo;


    public Lecturer(String name,String surname,String ePost,String episode,String title){
        super(name ,surname,ePost,episode,title);
    }

    public String getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(String doorNo) {
        this.doorNo = doorNo;
    }
    public void senatorMeet(){
        System.out.println(this.getName()+" Enter Meet");
    }
    public void  makeExam(){
        System.out.println(this.getName()+" Make Exam");
    }
}
