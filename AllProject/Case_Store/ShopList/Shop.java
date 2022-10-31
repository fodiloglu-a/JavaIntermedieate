package Case_Store.ShopList;

import Case_Store.Marks.Mark;

import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public abstract class Shop implements IMethod {
    private UUID uuid;
    private String name;
    private Mark mark;
    private double price;
    private double discount;
    private int stock;
    private int memory;
    private int ram;
    private double screenSize;
    Scanner in=new Scanner(System.in);


    public Shop(String name, Mark mark, double price  , int stock, int memory,int ram, double screenSize) {
        this.name = name;
        this.mark = mark;
        this.price = price;

        this.stock = stock;
        this.memory = memory;
        this.ram = ram;
        this.screenSize = screenSize;
        this.uuid = UUID.randomUUID();


    }

    public void addList(Shop shop) {
        System.out.println("Add List");


    }
    public List<Shop> getList(){
        System.out.println("");
        return null;
    }
    public void  createMobileProduct(int id){
        System.out.println("Welcome to create mobile product");
        System.out.println("Please Enter Product Name:");

        System.out.println( "Please Enter Product ");


//      name, Mark   price ,   stock,   memory,  ram,  screenSize,  battery,  color



    }


    ////

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Mark getMark() {
        return mark;
    }

    public void setMark(Mark mark) {
        this.mark = mark;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public Double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    protected int getBattery() {
        return getBattery();
    }
    public String getColor() {
        return getColor();
    }
}


