import java.util.Scanner;

public class NoteCalculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Nmax:");
        double Nmax= input.nextDouble();

        System.out.println("Nmin:");
        double Nmin= input.nextDouble();
        System.out.println("Nd(Not Ortalaman):");
        double Nd= input.nextDouble();


        double up=Nmax-Nd;
        double base=Nmax-Nmin;

        double divide=up/base;

        double Average=(divide*3)+1;


        System.out.println("Your Average="+Average);



    }
}
