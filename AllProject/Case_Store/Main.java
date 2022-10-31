package Case_Store;

import Case_Store.Marks.Mark;
import Case_Store.ShopList.LapTop;
import Case_Store.ShopList.MobilePhone;
import Case_Store.ShopList.Shop;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {//Samsung, Lenovo, Apple, Huawei, Casper, Asus, HP, Xiaomi, Monster


        Scanner in=new Scanner(System.in);



       ///////////////////////////////////---Create Mark
        Mark mark=new Mark("Mark");
        Mark Samsung=new Mark("Samsung");mark.addList(Samsung);
        Mark Lenova=new Mark(" Lenova");mark.addList(Lenova);
        Mark Apple=new Mark(" Apple");mark.addList(Apple);
        Mark Huawei=new Mark("Huawei");mark.addList(Huawei);
        Mark Casper=new Mark("Casper");mark.addList(Casper);
        Mark Asus=new Mark("Asus");mark.addList(Asus);
        Mark HP=new Mark("HP");mark.addList(HP);
        Mark Xiaomi=new Mark("Xiaomi");mark.addList(Xiaomi);
        Mark Monster =new Mark("Monster");mark.addList(Monster);
        ///////////////////////////////////---Create MobilPhone

        Shop SAMSUNGGALAXYA51=new MobilePhone("SAMSUNG GALAXY A51 ",Samsung,3199.0,20,256,8,6,4000,"BLACK");
        SAMSUNGGALAXYA51.addList(SAMSUNGGALAXYA51);
        Shop IPhone1164GB=new MobilePhone("IPhone11 64 GB",Apple,10500,20,64,16,6,4500,"WHITE");
        IPhone1164GB.addList(IPhone1164GB);
        Shop RedmiNote10Pro8GB=new MobilePhone("Redmi Note 10 Pro 8GB ",Xiaomi,7500,20,64,6,4000,4500,"GRAY");
        RedmiNote10Pro8GB.addList(RedmiNote10Pro8GB);
        ///////////////////////////////////---Create Laptop
        Shop HUAWEIMatebook14=new LapTop("HUAWEI Matebook 14 ",Huawei,12550,10,560,32,16.1);
        HUAWEIMatebook14.addList(HUAWEIMatebook14);
        Shop  LENOVOV14IGL=new LapTop(" LENOVO V14 IGL  ",Lenova,10000,10,1000,16,16.5);
        LENOVOV14IGL.addList(LENOVOV14IGL);
        Shop ASUSTufGaming=new LapTop("ASUS Tuf Gaming ",Asus,15200,10,1000,64,17.5);
        ASUSTufGaming.addList(ASUSTufGaming);




        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("|                            WELCOME TO MY JAVA STORE                                      |");
        System.out.println("--------------------------------------------------------------------------------------------");


        /////////////////////////////////////////---USER
        System.out.println("1-)Create Mobile Product");
        System.out.println("");
        System.out.println("2-)Create Laptop Product");
        System.out.println("");
        System.out.println("3-)Create Mark");
        System.out.println("");
        System.out.println("4-)Delete Laptop Product");
        System.out.println("");
        System.out.println("5-)Delete Mobile Product");
        System.out.println("");
        System.out.println("------------------------");
        System.out.println("Please Enter Chose");
        int choseUser=in.nextInt();
        switch (choseUser){
            //    public MobilePhone(
            case 1:
                System.out.println("Hii!User->(This menu for create mobile product)");


        }


































        /////////////////////////////////////////////////-COSTUMER
        System.out.println("1-)Get All Marks");
        System.out.println("2-)Get Mobil Phone List");
        System.out.println("3-)Get Laptop List");
        System.out.println("");
        System.out.println("Please Enter Chose:");
        int chose= in.nextInt();

        if (chose==1){
            System.out.println(mark.getMarkList());
        } else if (chose==2) {
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("| ID | Ürün Adı                       | Fiyat     | Marka       | Depolama    | Ekran         | Pil       | RAM       | Renk      | ");
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------");

            SAMSUNGGALAXYA51.getList();
            IPhone1164GB.getList();
            RedmiNote10Pro8GB.getList();


        } else if (chose==3) {
            System.out.println("----------------------------------------------------------------------------------------------------");
            System.out.println("| ID | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran     | RAM         |");
            System.out.println("----------------------------------------------------------------------------------------------------");

            HUAWEIMatebook14.getList();
            LENOVOV14IGL.getList();
            ASUSTufGaming.getList();


        }else {
            System.out.println("WRONG ENTER <!!!>");
        }


    }
}
