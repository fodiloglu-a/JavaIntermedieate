package Exceptions;

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Please enter age:");
        int age= input.nextInt();

        try {//Try-catch-finally>>>Exceptions
            ageControl(age);

        }catch (Exception e){
            System.out.println("Age is not big mor them 18");
        }
        finally {
            System.out.println("Program is finish");

        }



    }

    public static void ageControl(int age) throws AgeControlException{
        if (age<18){
            AgeControlException ex=new AgeControlException("null");
            ex.loftExceeption();
            throw new AgeControlException("Not");

        }
        System.out.println(age+": is possible");


    }

    
}
