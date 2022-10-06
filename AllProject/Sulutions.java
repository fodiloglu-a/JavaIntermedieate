
import java.util.*;

public class Sulutions {





    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            String a=String.valueOf(x);
            if(a.length()<3){

                System.out.println(s1+"\t"+"0"+a);
            }else{
                System.out.println(s1+"\t"+a);

            }

        }
        System.out.println("================================");
    }
}
