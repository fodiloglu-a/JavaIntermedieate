package Inheritance;

public class Computing extends Officer {
    private String mission;
    public Computing(String name, String surname, String ePost, String department, int shift,String mission) {
        super(name, surname, ePost, department, shift);
        this.mission=mission;
    }
    public String getMission(){
        return this.mission;
    }
    public void setMission(String mission){
        this.mission=mission;
    }
    public void netWoring(){
        System.out.println(this.getName()+" Networking");
    }
}
