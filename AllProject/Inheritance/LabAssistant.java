package Inheritance;

public class LabAssistant extends Assistant{

    public LabAssistant(String name, String surname, String ePost, String episode, String title, int officeHour) {
        super(name, surname, ePost, episode, title, officeHour);
    }
    public void enterLab(){
        System.out.println(this.getName()+" Enter Laboratory");
    }
    public void enterLess(){
        System.out.println(this.getName()+" Enter Lesson");
    }
}
