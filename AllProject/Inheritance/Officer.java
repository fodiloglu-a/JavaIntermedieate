package Inheritance;

public class Officer extends Worker {
    private String department;
    private int shift;



    public Officer(String name, String surname, String ePost, String department, int shift) {
        super(name, surname, ePost);
        this.department=department;
        this.shift=shift;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getShift() {
        return shift;
    }

    public int setShift(int shift) {
        this.shift =shift;
        return this.shift;
    }
    public void worker(){
        System.out.println(this.getName()+" eEnter work");

    }
}














