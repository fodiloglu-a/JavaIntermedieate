package Exceptions;

public class AgeControlException extends  Exception{
    public AgeControlException(String message){
        super(message);

    }
    public void loftExceeption(){
        System.out.println("loft");
    }
}
