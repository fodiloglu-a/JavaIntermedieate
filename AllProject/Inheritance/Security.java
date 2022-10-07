package Inheritance;

public class Security extends Officer {
    private String document;
    public Security(String name, String surname, String ePost, String department, int shift,String document) {
        super(name, surname, ePost, department, shift);
        this.document=document;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }
    public void guard(){
        System.out.println(this.getName()+"Enter Guard");
    }
}
