package Inheritance;

public class Assistant  extends Akademician{
    public int officeHour;
    public Assistant(String name, String surname, String ePost, String episode, String title, int officeHour) {
        super(name, surname, ePost, episode, title);
        this.officeHour=officeHour;
    }

    public int getOfficeHour() {
        return officeHour;
    }

    public void setOfficeHour(int officeHour) {
        this.officeHour = officeHour;
    }
    public void makeQuiz(){
        System.out.println(this.getName()+"Make Quiz");
    }
}
