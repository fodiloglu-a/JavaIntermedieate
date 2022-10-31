package Case_Store.ShopList;

import Case_Store.Marks.Mark;


import java.util.ArrayList;
import java.util.List;

public class LapTop extends Shop{
    private List<Shop> laptopList;

    public LapTop(String name, Mark mark, double price , int stock, int memory, int ram, double screenSize) {
        super(name, mark, price , stock, memory, ram, screenSize);
        this.laptopList=new ArrayList<>();

    }


    @Override
    public void addList(Shop shop) {
        laptopList.add(shop);

    }

    @Override
    public List<Shop> getList() {

        for (Shop s:laptopList
        ) {
            int ıd=1;
            System.out.println("| "+ıd+"\t|\t "+s.getName()+"\t|\t "+s.getPrice()+" \t|\t "+s.getMark()+"\t|\t "+s.getMemory()+"\t|\t "+s.getScreenSize()+"\t|"+s.getRam()+"         |");







        }
        return null;
    }

    @Override
    public void createMobileProduct() {

    }


}
