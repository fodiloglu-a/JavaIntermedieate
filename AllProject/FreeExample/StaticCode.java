package FreeExample;

import java.util.Scanner;

public class StaticCode {
    public static int B;
    public  static int H;


    public static boolean flag=true;
    
    static{
        Scanner input=new Scanner(System.in);
        System.out.println("enter");
        B= input.nextInt();
        H= input.nextInt();
        if ((B<0 ||H<0)){
            flag=false;
            System.out.println("YAZI");
        }
            }

    public static void main(String[] args){

        if(flag){
            int area=B*H;
            System.out.println(area);
        }

    }//end of main

}//end of class