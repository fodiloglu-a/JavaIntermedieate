package GenericListCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyList <T>{

    private T[] myList;
    private int capacity=10;
    public  int controlCapacity=0;

    public MyList( int capacity) {
        this.capacity=capacity;

    }
    public MyList(){
        myList= (T[]) new Object[capacity];


    }
    public int myListSize(){

        return this.controlCapacity;

    }
    public int getCapacity(){
        return  this.capacity;
    }
    public void addListControl() {

        if (capacity-2==controlCapacity){
            this.capacity *=2;
            T[] myListTemp= (T[]) new Object[capacity];
            for (int i=0;i<controlCapacity;i++){

                myListTemp[i]=myList[i];
            }
            myList=myListTemp;

        }


    }
    public void addList(T value){
        addListControl();
        myList[controlCapacity]=value;
        this.controlCapacity+=1;
    }
    public T getIndex(int index){
        if (index<0 ||index>capacity){
            return null;
        }
        return myList[index];
    }
    public T  remove(int index){

       if(index>=0) {
           for (int i=index;i<myList.length-1;i++){

               myList[i]=myList[i+1];

           }
       }else
           return null;

    return null;
    }
    public boolean setIndex(int index,T value){
        if (index<0 ||index>capacity){
            this.myList[index]=value;
        }
        return false;
    }

    public void getMyList() {
        for (int i=0;i<myList.length;i++) {
            System.out.println("["+myList[i]+"]");

        }
    }
    public int getControlCapacity(){
        return controlCapacity;
    }
}
