package GenericListCase;

public class Main {
    public static void main(String[] args) {
        MyList myList=new MyList<>();
        System.out.println("Capacity of Mylist="+myList.getCapacity());
        System.out.println("Size of Mylist="+myList.myListSize());
        myList.addList(10);
        myList.addList(20);


        System.out.println(myList.getIndex(0));
        System.out.println(myList.getIndex(1));
        myList.remove(0);
        myList.getMyList();






    }
}
