package Case_Store.ShopList;

import Case_Store.Marks.Mark;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;


public class MobilePhone extends Shop implements IMethod{

    private int battery;
    private String color;
    private List<Shop> mobileList;

    public MobilePhone(String name, Mark mark, double price , int stock, int memory, int ram, double screenSize,int battery,String color) {
        super(name, mark, price  , stock, memory, ram, screenSize );
        this.battery=battery;
        this.color=color;
        this.mobileList=new ArrayList<>();
    }





    @Override
    public void addList(Shop shop) {
        mobileList.add(shop);

    }

    @Override
    public List<Shop> getList() {

        for (Shop s:mobileList
             ) {
            int ıd=1;
            System.out.println("| "+ıd+"  | "+s.getName()+"            | "+s.getPrice()+"    | "+s.getMark().getName()+"     | "+s.getMemory()+"    | "+s.getScreenSize()+"       | "+s.getBattery()+"         | "+s.getRam()+"         | "+s.getRam()+"      |");







        }
        return null;
    }

    @Override
    public void createMobileProduct() {

    }


    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<Shop> getMobileList() {
        return mobileList;
    }

    public void setMobileList(List<Shop> mobileList) {
        this.mobileList = mobileList;
    }
}

